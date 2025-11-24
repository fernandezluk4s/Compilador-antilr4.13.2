import java.util.List;
import java.util.ArrayList;

// A classe base e suas filhas não têm 'public' para poderem ficar todas juntas neste arquivo.
abstract class Node { }

// --- Expressões ---
abstract class Expr extends Node { }

class ValInt extends Expr { 
    int val; 
    ValInt(int v){val=v;} 
    public String toString(){return ""+val;} 
}

class ValFloat extends Expr { 
    double val; 
    ValFloat(double v){val=v;} 
    public String toString(){return ""+val;} 
}

class ValBool extends Expr { 
    boolean val; 
    ValBool(boolean v){val=v;} 
    public String toString(){return ""+val;} 
}

class VarUse extends Expr { 
    String id; 
    VarUse(String s){id=s;} 
    public String toString(){return id;} 
}

class ArrayAccess extends Expr { 
    String id; 
    Expr index; 
    ArrayAccess(String i, Expr idx){id=i; index=idx;} 
}

class BinOp extends Expr {
    Expr left, right; 
    String op;
    BinOp(Expr l, String o, Expr r) { left=l; op=o; right=r; }
    public String toString(){return "(" + left + " " + op + " " + right + ")";}
}

class UnaryOp extends Expr {
    String op;
    Expr expr;
    UnaryOp(String o, Expr e) { op=o; expr=e; }
}

// --- Comandos ---
abstract class Stmt extends Node { }

class Block extends Stmt { 
    List<Stmt> stmts = new ArrayList<>(); 
    void add(Stmt s){stmts.add(s);} 
}

class VarDecl extends Stmt { 
    String id, type; 
    Expr init; 
    boolean isConst; 
    boolean isArray; 
    int size; 
    // Construtor para Variável/Constante
    VarDecl(String i, String t, Expr ini, boolean c) { id=i; type=t; init=ini; isConst=c; isArray=false;}
    // Construtor para Array
    VarDecl(String i, String t, int sz) { id=i; type=t; size=sz; isArray=true; isConst=false;}
}

class Assign extends Stmt { 
    String id; 
    Expr value; 
    Expr index; 
    Assign(String i, Expr v) { id=i; value=v; }
    Assign(String i, Expr idx, Expr v) { id=i; index=idx; value=v; }
}

class IfStmt extends Stmt { 
    Expr cond; 
    Stmt thenBlock, elseBlock; 
    IfStmt(Expr c, Stmt t, Stmt e) { cond=c; thenBlock=t; elseBlock=e; } 
}

class WhileStmt extends Stmt { 
    Expr cond; 
    Stmt body; 
    WhileStmt(Expr c, Stmt b) { cond=c; body=b; } 
}

class PrintStmt extends Stmt { 
    Expr expr; 
    PrintStmt(Expr e){expr=e;} 
}