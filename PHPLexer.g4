lexer grammar PHPLexer;

// Etiquetas
PHP_OPEN  : '<?php' ;
PHP_CLOSE : '?>' ;

// Palabras clave
ECHO      : [eE][cC][hH][oO] ;
IF        : [iI][fF] ;

// Variables y IDs
VARIABLE  : '$' [a-zA-Z_\u0080-\u00ff] [a-zA-Z0-9_\u0080-\u00ff]* ;
ID        : [a-zA-Z_\u0080-\u00ff] [a-zA-Z0-9_\u0080-\u00ff]* ;

// Literales
INT       : [0-9]+ ;
STRING    : '"' ( '\\"' | . )*? '"' ;

// Operadores
ASSIGN    : '=' ;
PLUS      : '+' ;
SEMICOLON : ';' ;

// Ignorar espacios
WS        : [ \t\r\n]+ -> skip ;