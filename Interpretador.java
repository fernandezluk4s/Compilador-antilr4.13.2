
public class Interpretador {
    TabelaSimbolos tabela = new TabelaSimbolos();

    // Método para rodar o programa mantendo o escopo final para impressão
    public void executeGlobal(Node node) {
        if (node instanceof Block) {
            for (Stmt s : ((Block)node).stmts) {
                execute(s);
            }
        } else {
            execute(node);
        }
    }

    public void execute(Node node) {
        if (node instanceof Block) visitBlock((Block) node);
        else if (node instanceof VarDecl) visitVarDecl((VarDecl) node);
        else if (node instanceof Assign) visitAssign((Assign) node);
        else if (node instanceof IfStmt) visitIf((IfStmt) node);
        else if (node instanceof WhileStmt) visitWhile((WhileStmt) node);
        else if (node instanceof PrintStmt) {
            System.out.println(eval(((PrintStmt)node).expr));
        }
    }

    void visitBlock(Block b) {
        tabela.entrarEscopo();
        for (Stmt s : b.stmts) execute(s);
        tabela.sairEscopo();
    }

    void visitVarDecl(VarDecl v) {
        tabela.declarar(v.id, v.type, v.isConst, v.isArray, v.size);
        if (v.init != null) {
            Object val = eval(v.init);
            tabela.buscar(v.id).valor = val;
        }
    }

    void visitAssign(Assign a) {
        Simbolo s = tabela.buscar(a.id);
        if (s.constante) throw new RuntimeException("Erro: Não pode alterar constante '" + a.id + "'");
        
        Object val = eval(a.value);
        if (a.index != null) { // Atribuição de vetor
            int idx = ((Number) eval(a.index)).intValue();
            ((Object[])s.valor)[idx] = val;
        } else {
            s.valor = val;
        }
    }

    void visitIf(IfStmt s) {
        if (asBool(eval(s.cond))) execute(s.thenBlock);
        else if (s.elseBlock != null) execute(s.elseBlock);
    }

    void visitWhile(WhileStmt s) {
        while (asBool(eval(s.cond))) execute(s.body);
    }

    Object eval(Expr e) {
        // 1. Valores Primitivos
        if (e instanceof ValInt) return ((ValInt)e).val;
        if (e instanceof ValFloat) return ((ValFloat)e).val;
        if (e instanceof ValBool) return ((ValBool)e).val;
        if (e instanceof VarUse) return tabela.buscar(((VarUse)e).id).valor;
        
        // 2. Acesso a Vetor
        if (e instanceof ArrayAccess) {
            ArrayAccess a = (ArrayAccess)e;
            Object[] arr = (Object[]) tabela.buscar(a.id).valor;
            int idx = ((Number)eval(a.index)).intValue();
            return arr[idx];
        }
        
        // 3. Operadores Unários (! e -)
        if (e instanceof UnaryOp) {
            UnaryOp u = (UnaryOp)e;
            Object val = eval(u.expr);
            if (u.op.equals("-")) return -((Number)val).doubleValue();
            if (u.op.equals("!")) return !asBool(val);
        }
        
        // 4. Operadores Binários
        if (e instanceof BinOp) {
            BinOp b = (BinOp)e;
            Object l = eval(b.left);
            Object r = eval(b.right);
            
            // Matemáticos
            if (b.op.equals("+")) {
                if (l instanceof Integer && r instanceof Integer) return (Integer)l + (Integer)r;
                return ((Number)l).doubleValue() + ((Number)r).doubleValue();
            }
            if (b.op.equals("-")) return ((Number)l).doubleValue() - ((Number)r).doubleValue();
            if (b.op.equals("*")) return ((Number)l).doubleValue() * ((Number)r).doubleValue();
            if (b.op.equals("/")) return ((Number)l).doubleValue() / ((Number)r).doubleValue();
            if (b.op.equals("%")) return ((Number)l).intValue() % ((Number)r).intValue();
            if (b.op.equals("^")) return Math.pow(((Number)l).doubleValue(), ((Number)r).doubleValue());
            
            // Relacionais
            if (b.op.equals("<")) return ((Number)l).doubleValue() < ((Number)r).doubleValue();
            if (b.op.equals(">")) return ((Number)l).doubleValue() > ((Number)r).doubleValue();
            if (b.op.equals("<=")) return ((Number)l).doubleValue() <= ((Number)r).doubleValue();
            if (b.op.equals(">=")) return ((Number)l).doubleValue() >= ((Number)r).doubleValue();
            if (b.op.equals("==")) return l.equals(r);
            if (b.op.equals("!=")) return !l.equals(r);
            
            // Lógicos (&&, ||)
            if (b.op.equals("&&")) return asBool(l) && asBool(r);
            if (b.op.equals("||")) return asBool(l) || asBool(r);
        }
        return 0;
    }
    
    // Auxiliar para converter qualquer coisa para boolean (estilo C: 0 é false)
    boolean asBool(Object o) {
        if (o instanceof Boolean) return (Boolean)o;
        if (o instanceof Number) {
            double val = ((Number)o).doubleValue();
            return val != 0.0; // Retorna true se for diferente de zero
        }
        return false;
    }
}