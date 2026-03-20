<?php
// Ejemplo de código PHP para verificar el lexer
$nombre = "Santiago";
$edad = 25;
$salario = 2500.50;
$error = "error";

// Caracteres que causarán error léxico
$x = 5 ~ 3;      // Error: ~ no está definido
$y = a | b;      // Error: | solo no está definido
$z = `comando`;  // Error: backtick no está definido
?>
