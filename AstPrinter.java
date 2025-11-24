
public class AstPrinter {

    public void print(Node node) {
        printNode(node, "", true);
    }

    private void printNode(Node node, String prefix, boolean isLast) {
        if (node == null) return;

        // Desenho da linha da árvore
        System.out.print(prefix);
        System.out.print(isLast ? "└── " : "├── ");

        // Calculando o prefixo para os filhos
        String childPrefix = prefix + (isLast ? "    " : "│   ");

        // Lógica para cada tipo de nó
        if (node instanceof Block) {
            System.out.println("Block");
            Block b = (Block) node;
            for (int i = 0; i < b.stmts.size(); i++) {
                printNode(b.stmts.get(i), childPrefix, i == b.stmts.size() - 1);
            }

        } else if (node instanceof VarDecl) {
            VarDecl v = (VarDecl) node;
            String info = "VarDecl (" + v.type + " " + v.id + ")";
            if (v.isConst) info = "ConstDecl (" + v.type + " " + v.id + ")";
            if (v.isArray) info = "ArrayDecl (" + v.type + " " + v.id + "[" + v.size + "])";
            
            System.out.println(info);
            if (v.init != null) printNode(v.init, childPrefix, true);

        } else if (node instanceof Assign) {
            Assign a = (Assign) node;
            System.out.println("Assign (" + a.id + ")");
            if (a.index != null) {
                printNode(a.index, childPrefix, false); // Índice do vetor
                printNode(a.value, childPrefix, true);  // Valor atribuído
            } else {
                printNode(a.value, childPrefix, true);
            }

        } else if (node instanceof IfStmt) {
            IfStmt i = (IfStmt) node;
            System.out.println("If");
            printNode(i.cond, childPrefix, false);
            printNode(i.thenBlock, childPrefix, i.elseBlock == null);
            if (i.elseBlock != null) printNode(i.elseBlock, childPrefix, true);

        } else if (node instanceof WhileStmt) {
            WhileStmt w = (WhileStmt) node;
            System.out.println("While");
            printNode(w.cond, childPrefix, false);
            printNode(w.body, childPrefix, true);

        } else if (node instanceof PrintStmt) {
            System.out.println("Print");
            printNode(((PrintStmt) node).expr, childPrefix, true);

        } else if (node instanceof BinOp) {
            BinOp b = (BinOp) node;
            System.out.println("BinOp (" + b.op + ")");
            printNode(b.left, childPrefix, false);
            printNode(b.right, childPrefix, true);

        } else if (node instanceof UnaryOp) {
            UnaryOp u = (UnaryOp) node;
            System.out.println("UnaryOp (" + u.op + ")");
            printNode(u.expr, childPrefix, true);
        
        } else if (node instanceof ArrayAccess) {
            ArrayAccess a = (ArrayAccess) node;
            System.out.println("ArrayAccess (" + a.id + ")");
            printNode(a.index, childPrefix, true);

        } else {
            // Nós folhas (Valores, Variáveis)
            System.out.println(node.toString());
        }
    }
}