## 📄 LinguagemA com antilr4.13.2

### 🚀 Visão Geral

Este repositório contém a especificação da gramática para a linguagem de programação **LinguagemA**, criada usando a ferramenta de geração de *parsers* **ANTLR4** (ANother Tool for Language Recognition). A LinguagemA é uma linguagem simples com suporte para estruturas de controle básicas, declaração de variáveis e constantes, arrays, e expressões aritméticas e lógicas.

---

## 💻 Definição da Linguagem - LinguagemA

A linguagem **LinguagemA** é uma linguagem de programação estruturada que suporta:

* [cite_start]**Declaração de Variáveis e Constantes:** Incluindo tipos primitivos e arrays[cite: 3, 4, 5].
* [cite_start]**Comandos de Saída:** Função `print`.
* [cite_start]**Estruturas de Controle de Fluxo:** `if/then/else` [cite: 1][cite_start], `while` [cite: 2][cite_start], e `for`.
* [cite_start]**Blocos de Código:** Delimitados por chaves `{}`.
* [cite_start]**Expressões:** Abrangendo operações aritméticas, lógicas, relacionais, acesso a arrays e literais[cite: 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25].

### 📜 Gramática (EBNF)

A seguir, a gramática da **LinguagemA** no formato EBNF, derivada do arquivo `LinguagemA.g4`.

```ebnf
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
```


