## 📄 LinguagemA com antilr4.13.2

### 🚀 Visão Geral

Este repositório contém a especificação da gramática para a linguagem de programação **LinguagemA**, criada usando a ferramenta de geração de *parsers* **ANTLR4** (ANother Tool for Language Recognition). A LinguagemA é uma linguagem simples com suporte para estruturas de controle básicas, declaração de variáveis e constantes, arrays, e expressões aritméticas e lógicas.

---

### 📜 Gramática da LinguagemA (EBNF)

A gramática a seguir define a sintaxe formal da LinguagemA em Notação de Backus-Naur Estendida (EBNF), refletindo a estrutura do arquivo `LinguagemA.g4`.

* **Símbolos Usados no EBNF:**
    * `::=` : Define a regra (é definido como)
    * `|` : Alternativa (OU)
    * `[ ... ]` : Opcional (zero ou uma vez)
    * `{ ... }` : Repetição (zero ou mais vezes)
    * `( ... )` : Agrupamento
    * `'token'` : Símbolo Terminal (literal)

#### Regras de Programa e Declarações

```ebnf
prog          ::= { stat } [cite: 1]

stat          ::= 'if' '(' expr ')' 'then' stat [ 'else' stat ]             (* #IfStat *) [cite: 1, 2]
                | 'while' '(' expr ')' 'do' stat                            (* #WhileStat *) [cite: 2]
                | 'for' '(' [ assignment ] ';' [ expr ] ';' [ assignment ] ')' stat (* #ForStat *) [cite: 3]
                | 'const' type ID '=' expr ';'                              (* #ConstDecl *) [cite: 3, 4]
                | type ID [ '=' expr ] ';'                                  (* #VarDecl *) 
                | type ID '[' INT ']' ';'                                   (* #ArrayDecl *) [cite: 5]
                | assignment ';'                                            (* #AssignStat *) [cite: 5]
                | 'print' '(' expr ')' ';'                                  (* #Print *) 
                | '{' { stat } '}'                                          (* #Block *) [cite: 7]
                ;

assignment    ::= ID [ '[' expr ']' ] '=' expr 

type          ::= 'int' | 'float' | 'bool' | 'string' [cite: 26]

---

**Lucas De Almeida Silva Sigolo Fernandes**
**lukasigolo@gmail.com**
**https://github.com/fernandezluk4s**

