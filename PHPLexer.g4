lexer grammar PHPLexer;

// ============================================================================
// 1. DELIMITADORES DE BLOQUE PHP
// ============================================================================
PHP_OPEN  : '<?php' ;
PHP_CLOSE : '?>' ;

// ============================================================================
// 2. PALABRAS CLAVE (Keywords) - Case Insensitive
// ============================================================================
// Control de flujo
IF        : [iI][fF] ;
ELSE      : [eE][lL][sS][eE] ;
ELSEIF    : [eE][lL][sS][eE][iI][fF] ;
SWITCH    : [sS][wW][iI][tT][cC][hH] ;
CASE      : [cC][aA][sS][eE] ;
DEFAULT   : [dD][eE][fF][aA][uU][lL][tT] ;
BREAK     : [bB][rR][eE][aA][kK] ;

// Bucles
WHILE     : [wW][hH][iI][lL][eE] ;
FOR       : [fF][oO][rR] ;
FOREACH   : [fF][oO][rR][eE][aA][cC][hH] ;
DO        : [dD][oO] ;
CONTINUE  : [cC][oO][nN][tT][iI][nN][uU][eE] ;

// Funciones y Clases
FUNCTION  : [fF][uU][nN][cC][tT][iI][oO][nN] ;
RETURN    : [rR][eE][tT][uU][rR][nN] ;
CLASS     : [cC][lL][aA][sS][sS] ;
NEW       : [nN][eE][wW] ;
EXTENDS   : [eE][xX][tT][eE][nN][dD][sS] ;
IMPLEMENTS: [iI][mM][pP][lL][eE][mM][eE][nN][tT][sS] ;
INTERFACE : [iI][nN][tT][eE][rR][fF][aA][cC][eE] ;
TRAIT     : [tT][rR][aA][iI][tT] ;
NAMESPACE : [nN][aA][mM][eE][sS][pP][aA][cC][eE] ;
USE       : [uU][sS][eE] ;

// Modificadores de acceso
PUBLIC    : [pP][uU][bB][lL][iI][cC] ;
PRIVATE   : [pP][rR][iI][vV][aA][tT][eE] ;
PROTECTED : [pP][rR][oO][tT][eE][cC][tT][eE][dD] ;
STATIC    : [sS][tT][aA][tT][iI][cC] ;
CONST     : [cC][oO][nN][sS][tT] ;
FINAL     : [fF][iI][nN][aA][lL] ;
ABSTRACT  : [aA][bB][sS][tT][rR][aA][cC][tT] ;

// Manejo de errores
TRY       : [tT][rR][yY] ;
CATCH     : [cC][aA][tT][cC][hH] ;
FINALLY   : [fF][iI][nN][aA][lL][lL][yY] ;
THROW     : [tT][hH][rR][oO][wW] ;

// Inclusión de archivos
INCLUDE   : [iI][nN][cC][lL][uU][dD][eE] ;
REQUIRE   : [rR][eE][qQ][uU][iI][rR][eE] ;
INCLUDE_ONCE : [iI][nN][cC][lL][uU][dD][eE]'_'[oO][nN][cC][eE] ;
REQUIRE_ONCE : [rR][eE][qQ][uU][iI][rR][eE]'_'[oO][nN][cC][eE] ;

// Entrada/Salida
ECHO      : [eE][cC][hH][oO] ;
PRINT     : [pP][rR][iI][nN][tT] ;

// Tipos y valores especiales
TRUE      : [tT][rR][uU][eE] ;
FALSE     : [fF][aA][lL][sS][eE] ;
NULL      : [nN][uU][lL][lL] ;
ARRAY     : [aA][rR][rR][aA][yY] ;
GLOBAL    : [gG][lL][oO][bB][aA][lL] ;
ISSET     : [iI][sS][sS][eE][tT] ;
UNSET     : [uU][nN][sS][eE][tT] ;
EMPTY     : [eE][mM][pP][tT][yY] ;

// ============================================================================
// 3. VARIABLES E IDENTIFICADORES
// ============================================================================
VARIABLE  : '$' [a-zA-Z_\u0080-\u00ff] [a-zA-Z0-9_\u0080-\u00ff]* ;
ID        : [a-zA-Z_\u0080-\u00ff] [a-zA-Z0-9_\u0080-\u00ff]* ;

// ============================================================================
// 4. LITERALES (Números y Strings)
// ============================================================================
// Números decimales (debe estar antes de INT para longest match)
FLOAT     : [0-9]+ '.' [0-9]+ ;
INT       : [0-9]+ ;

// Strings
STRING    : '"' ( '\\"' | . )*? '"' ;
STRING_SQ : '\'' ( '\\\'' | . )*? '\'' ;

// ============================================================================
// 5. OPERADORES ARITMÉTICOS
// ============================================================================
PLUS      : '+' ;
MINUS     : '-' ;
MUL       : '*' ;
DIV       : '/' ;
MOD       : '%' ;
POWER     : '**' ;

// ============================================================================
// 6. OPERADORES DE ASIGNACIÓN
// ============================================================================
ASSIGN    : '=' ;
ADD_ASSIGN    : '+=' ;
SUB_ASSIGN    : '-=' ;
MUL_ASSIGN    : '*=' ;
DIV_ASSIGN    : '/=' ;
MOD_ASSIGN    : '%=' ;
CONCAT_ASSIGN : '.=' ;
POWER_ASSIGN  : '**=' ;

// ============================================================================
// 7. OPERADORES DE COMPARACIÓN
// ============================================================================
IDENTICAL     : '===' ;
NOT_IDENTICAL : '!==' ;
EQUAL         : '==' ;
NOT_EQUAL     : '!=' ;
LT            : '<' ;
GT            : '>' ;
LTE           : '<=' ;
GTE           : '>=' ;
SPACESHIP     : '<=>' ;

// ============================================================================
// 8. OPERADORES LÓGICOS
// ============================================================================
AND       : '&&' ;
OR        : '||' ;
XOR       : 'xor' ;
NOT       : '!' ;
AND_WORD  : [aA][nN][dD] ;
OR_WORD   : [oO][rR] ;

// ============================================================================
// 9. OPERADORES DE INCREMENTO/DECREMENTO
// ============================================================================
INCREMENT : '++' ;
DECREMENT : '--' ;

// ============================================================================
// 10. OPERADORES ESPECIALES
// ============================================================================
CONCAT    : '.' ;
ARROW     : '->' ;
DOUBLE_ARROW : '=>' ;
DOUBLE_COLON : '::' ;
QUESTION  : '?' ;
COLON     : ':' ;

// ============================================================================
// 11. CARACTERES ESPECIALES / PUNTUACIÓN
// ============================================================================
LPAREN    : '(' ;
RPAREN    : ')' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
LBRACKET  : '[' ;
RBRACKET  : ']' ;
SEMICOLON : ';' ;
COMMA     : ',' ;
AT        : '@' ;
DOLLAR    : '$' ;

// ============================================================================
// 12. COMENTARIOS (HIDDEN - Se ignoran pero se procesan)
// ============================================================================
LINE_COMMENT   : '//' ~[\r\n]* ;
HASH_COMMENT   : '#' ~[\r\n]* ;
BLOCK_COMMENT  : '/*' .*? '*/' ;

// ============================================================================
// 13. ESPACIOS EN BLANCO (Se ignoran)
// ============================================================================
WS        : [ \t\r\n]+ -> skip ;