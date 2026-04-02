lexer grammar PHPLexer;

// ============================================================================
// 1. DELIMITADORES DE BLOQUE PHP
// ============================================================================
PHP_OPEN  : '<?php' ;
PHP_CLOSE : '?>' ;

// ============================================================================
// 2. PALABRAS CLAVE (Keywords) - Case Insensitive
// IMPORTANTE: Deben ir ANTES que ID para que ANTLR les dé prioridad.
// ============================================================================

// Control de flujo
IF        : [iI][fF] ;
ELSE      : [eE][lL][sS][eE] ;
ELSEIF    : [eE][lL][sS][eE][iI][fF] ;
SWITCH    : [sS][wW][iI][tT][cC][hH] ;
CASE      : [cC][aA][sS][eE] ;
DEFAULT   : [dD][eE][fF][aA][uU][lL][tT] ;
BREAK     : [bB][rR][eE][aA][kK] ;
MATCH     : [mM][aA][tT][cC][hH] ;         // PHP 8+

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
INCLUDE      : [iI][nN][cC][lL][uU][dD][eE] ;
REQUIRE      : [rR][eE][qQ][uU][iI][rR][eE] ;
INCLUDE_ONCE : [iI][nN][cC][lL][uU][dD][eE]'_'[oO][nN][cC][eE] ;
REQUIRE_ONCE : [rR][eE][qQ][uU][iI][rR][eE]'_'[oO][nN][cC][eE] ;

// Entrada / Salida
ECHO      : [eE][cC][hH][oO] ;
PRINT     : [pP][rR][iI][nN][tT] ;

// Tipos y valores especiales
TRUE      : [tT][rR][uU][eE] ;
FALSE     : [fF][aA][lL][sS][eE] ;
NULL      : [nN][uU][lL][lL] ;
ARRAY     : [aA][rR][rR][aA][yY] ;
LIST      : [lL][iI][sS][tT] ;
GLOBAL    : [gG][lL][oO][bB][aA][lL] ;
ISSET     : [iI][sS][sS][eE][tT] ;
UNSET     : [uU][nN][sS][eE][tT] ;
EMPTY     : [eE][mM][pP][tT][yY] ;
INSTANCEOF: [iI][nN][sS][tT][aA][nN][cC][eE][oO][fF] ;

// Operadores lógicos como palabras (menor precedencia que && y ||)
AND_WORD  : [aA][nN][dD] ;
OR_WORD   : [oO][rR] ;
XOR_WORD  : [xX][oO][rR] ;

// ============================================================================
// 3. VARIABLES E IDENTIFICADORES
// VARIABLE debe ir antes que ID para capturar $nombre completo.
// ============================================================================
VARIABLE  : '$' [a-zA-Z_\u0080-\u00ff] [a-zA-Z0-9_\u0080-\u00ff]* ;
ID        : [a-zA-Z_\u0080-\u00ff] [a-zA-Z0-9_\u0080-\u00ff]* ;

// ============================================================================
// 4. LITERALES NUMÉRICOS
// Orden importante: más específicos primero para aprovechar longest match.
// ============================================================================

// Hexadecimal: 0x1A3F
INT_HEX   : '0' [xX] [0-9a-fA-F]+ ;

// Binario: 0b1010
INT_BIN   : '0' [bB] [01]+ ;

// Octal: 0755
INT_OCT   : '0' [0-7]+ ;

// Float: 3.14 | .5 | 3. | 1e10 | 1.5e-3
// Debe ir ANTES que INT para que 3.14 no se tokenice como INT(3) CONCAT FLOAT(.14)
FLOAT     : [0-9]* '.' [0-9]+ ( [eE] [+-]? [0-9]+ )?
          | [0-9]+             ( [eE] [+-]? [0-9]+ )
          ;

// Entero decimal (va al final de los numéricos)
INT       : [0-9]+ ;

// ============================================================================
// 5. LITERALES DE CADENA
// ============================================================================

// String con comillas dobles — permite \" escapado dentro
STRING    : '"' ( '\\"' | ~["\\\r\n] | '\\' . )* '"' ;

// String con comillas simples — permite \' escapado dentro
STRING_SQ : '\'' ( '\\\'' | ~['\\\r\n] | '\\' . )* '\'' ;

// ============================================================================
// 6. OPERADORES — orden de mayor a menor longitud para evitar conflictos
// ============================================================================

// --- Asignación compuesta (3 caracteres) ---
POWER_ASSIGN       : '**=' ;
NULL_COALESCE_ASSIGN: '??=' ;

// --- Comparación (3 caracteres) ---
IDENTICAL          : '===' ;
NOT_IDENTICAL      : '!==' ;
SPACESHIP          : '<=>' ;

// --- Asignación compuesta (2 caracteres) ---
ADD_ASSIGN         : '+=' ;
SUB_ASSIGN         : '-=' ;
MUL_ASSIGN         : '*=' ;
DIV_ASSIGN         : '/=' ;
MOD_ASSIGN         : '%=' ;
CONCAT_ASSIGN      : '.=' ;
AND_ASSIGN         : '&=' ;
OR_ASSIGN          : '|=' ;
XOR_ASSIGN         : '^=' ;
LSHIFT_ASSIGN      : '<<=' ;
RSHIFT_ASSIGN      : '>>=' ;

// --- Aritméticos (2 caracteres) ---
POWER              : '**' ;
INCREMENT          : '++' ;
DECREMENT          : '--' ;

// --- Comparación (2 caracteres) ---
EQUAL              : '==' ;
NOT_EQUAL          : '!=' ;
LTE                : '<=' ;
GTE                : '>=' ;

// --- Lógicos (2 caracteres) ---
AND                : '&&' ;
OR                 : '||' ;

// --- Bitwise desplazamiento (2 caracteres) ---
LSHIFT             : '<<' ;
RSHIFT             : '>>' ;

// --- Especiales (2 caracteres) ---
ARROW              : '->' ;
DOUBLE_ARROW       : '=>' ;
DOUBLE_COLON       : '::' ;
NULL_COALESCE      : '??' ;
ELLIPSIS           : '...' ;

// --- Aritméticos (1 carácter) ---
PLUS               : '+' ;
MINUS              : '-' ;
MUL                : '*' ;
DIV                : '/' ;
MOD                : '%' ;

// --- Comparación (1 carácter) ---
LT                 : '<' ;
GT                 : '>' ;

// --- Asignación simple (1 carácter) ---
ASSIGN             : '=' ;

// --- Lógico (1 carácter) ---
NOT                : '!' ;

// --- Bitwise (1 carácter) ---
BIT_AND            : '&' ;
BIT_OR             : '|' ;
BIT_XOR            : '^' ;
BIT_NOT            : '~' ;

// --- Concatenación de strings ---
CONCAT             : '.' ;

// --- Otros (1 carácter) ---
QUESTION           : '?' ;
COLON              : ':' ;
AT                 : '@' ;     // Supresión de errores: @funcion()
BACKSLASH          : '\\' ;    // Separador de namespaces

// ============================================================================
// 7. PUNTUACIÓN / DELIMITADORES
// ============================================================================
LPAREN    : '(' ;
RPAREN    : ')' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
LBRACKET  : '[' ;
RBRACKET  : ']' ;
SEMICOLON : ';' ;
COMMA     : ',' ;

// ============================================================================
// 8. COMENTARIOS — enviados al canal HIDDEN para que el parser los ignore
//    pero queden disponibles para herramientas de análisis estático.
// ============================================================================
LINE_COMMENT  : '//' ~[\r\n]*        -> channel(HIDDEN) ;
HASH_COMMENT  : '#'  ~[\r\n]*        -> channel(HIDDEN) ;
BLOCK_COMMENT : '/*' .*? '*/'        -> channel(HIDDEN) ;

// ============================================================================
// 9. ESPACIOS EN BLANCO — descartados completamente
// ============================================================================
WS : [ \t\r\n\f]+ -> skip ;

// ============================================================================
// 10. TOKEN DE ERROR — captura cualquier carácter no reconocido
//     Siempre debe ser la última regla.
// ============================================================================
ERROR_CHAR : . ;
