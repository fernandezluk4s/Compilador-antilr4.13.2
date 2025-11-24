grammar LinguagemA;

prog:   stat+ ;

stat:   'if' '(' expr ')' 'then' stat ('else' stat)?  #IfStat
    |   'while' '(' expr ')' 'do' stat                 #WhileStat
    |   'for' '(' assignment? ';' expr? ';' assignment? ')' stat #ForStat
    |   'const' type ID '=' expr ';'                   #ConstDecl
    |   type ID ('=' expr)? ';'                        #VarDecl
    |   type ID '[' INT ']' ';'                        #ArrayDecl
    |   assignment ';'                                 #AssignStat
    |   'print' '(' expr ')' ';'                       #Print
    |   '{' stat* '}'                                  #Block
    ;

// MUDANÇA CRUCIAL AQUI:
// Unificamos em uma regra só para o Java conseguir ler a.ID() e a.expr()
assignment
    :   ID ('[' expr ']')? '=' expr
    ;

expr:   MINUS expr                              #Negation
    |   NOT expr                                #Not
    |   expr op=POW expr                        #Power
    |   expr op=(MUL|DIV|MOD) expr              #MulDivMod
    |   expr op=(PLUS|MINUS) expr               #AddSub
    |   expr op=(LE|GE|LT|GT) expr              #Relational
    |   expr op=(EQ|NEQ) expr                   #Equality
    |   expr op=AND expr                        #And
    |   expr op=OR expr                         #Or
    |   ID '[' expr ']'                         #ArrayAccess
    |   ID                                      #Id
    |   INT                                     #Int
    |   FLOAT                                   #Float
    |   TRUE                                    #BoolTrue
    |   FALSE                                   #BoolFalse
    |   'null'                                  #Null
    |   '(' expr ')'                            #Parens
    ;

type:   'int' | 'float' | 'bool' | 'string';

// Tokens
MUL : '*'; DIV : '/'; MOD : '%'; PLUS : '+'; MINUS : '-'; POW : '^';
EQ : '=='; NEQ : '!='; LE : '<='; GE : '>='; LT : '<'; GT : '>';
AND : '&&'; OR : '||'; NOT : '!';
TRUE : 'true'; FALSE : 'false';
ID  :   [a-zA-Z_][a-zA-Z0-9_]* ;
INT :   [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+ ;
WS  :   [ \t\r\n]+ -> skip ;
COMMENT : '//' .*? '\n' -> skip ;