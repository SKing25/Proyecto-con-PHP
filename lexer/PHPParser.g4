parser grammar PHPParser;
// Organizacion de expresiones por precedencia
options { tokenVocab=PHPLexer; }


// Regla raiz del programa ya con las expresiones


program
    : PHP_OPEN statement* PHP_CLOSE? EOF
    ;

// Sentencia que me dieron con el case sensitive

statement
    : expressionStatement
    | ifStatement
    | whileStatement
    | returnStatement
    | blockStatement
    | forStatement       
    | echoStatement    
    ;
//Bloques de sentencias

blockStatement
    : LBRACE statement* RBRACE
    ;

//Sentencia del if

ifStatement
    : IF LPAREN expr RPAREN statement
      (ELSE statement)?
    ;

//Sentencia del while

whileStatement
    : WHILE LPAREN expr RPAREN statement
    ;

// For
forStatement
    : FOR LPAREN expr? SEMICOLON expr? SEMICOLON expr? RPAREN statement
    ;

// Echo
echoStatement
    : ECHO echoList SEMICOLON
    ;

echoList
    : expr (CONCAT expr)*
    ;

//Return

returnStatement
    : RETURN expr? SEMICOLON
    ;


//La expreison ya colocada como una sentencia


expressionStatement
    : expr SEMICOLON
    ;

//Elementos primarios: Elementos atomicos del lenguaje que no se pueden descomponer 
primary
    : VARIABLE
    | literal
    | functionCall
    | LPAREN expr RPAREN
    ;
literal
    : INT
    | FLOAT
    | INT_HEX
    | INT_BIN
    | INT_OCT
    | STRING
    | STRING_SQ
    ;
functionCall
    : ID LPAREN argumentList? RPAREN
    ;
argumentList
    : expr (COMMA expr)*
    ;
//Expresiones unarias
unaryExpr
    : (PLUS | MINUS | NOT) unaryExpr
    | INCREMENT VARIABLE    
    | DECREMENT VARIABLE    
    | VARIABLE INCREMENT    
    | VARIABLE DECREMENT    
    | primary
    ;
multiplicativeExpr
    : unaryExpr ((MUL | DIV | MOD) unaryExpr)*
    ;
additiveExpr
    : multiplicativeExpr ((PLUS | MINUS) multiplicativeExpr)*
    ;
powerExpr
    : unaryExpr
    | unaryExpr POWER powerExpr
    ;
comparisonExpr
    : additiveExpr
      (
          (
              LT
            | GT
            | LTE
            | GTE
            | EQUAL
            | NOT_EQUAL
            | IDENTICAL
            | NOT_IDENTICAL
            | SPACESHIP
          )
          additiveExpr
      )?
    ;
logicalExpr
    : comparisonExpr
      (
          (AND | OR)
          comparisonExpr
      )*
    ;
logicalWordExpr
    : logicalExpr
      (
          (AND_WORD | OR_WORD | XOR_WORD)
          logicalExpr
      )*
    ;

assignmentExpr
    : VARIABLE assignmentOperator assignmentExpr
    | logicalWordExpr
    ;

assignmentOperator
    : ASSIGN
    | ADD_ASSIGN
    | SUB_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    | MOD_ASSIGN
    | CONCAT_ASSIGN
    | POWER_ASSIGN
    | AND_ASSIGN
    | OR_ASSIGN
    | XOR_ASSIGN
    | LSHIFT_ASSIGN
    | RSHIFT_ASSIGN
    | NULL_COALESCE_ASSIGN
    ;

expr
    : assignmentExpr
    ;