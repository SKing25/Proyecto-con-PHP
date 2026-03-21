# PHP Lexical Analyzer

Este proyecto es un **Analizador Léxico** para el lenguaje PHP, construido utilizando **ANTLR4** y **Python 3.13**. Es la base de lo que será el compilador/intérprete de **ChamitoCode**.

---

## Definición del Lenguaje

**PHP (Hypertext Preprocessor)** es un lenguaje de programación de código abierto especialmente diseñado para el desarrollo web. Originalmente creado en 1995, ha evolucionado para ser uno de los lenguajes más utilizados en la creación de aplicaciones web dinámicas del lado del servidor.

---

## Alfabeto

El alfabeto de PHP está compuesto por un conjunto extendido de caracteres que permite crear identificadores, variables y literales:

* **Letras**: Caracteres ASCII de a-z y A-Z, además de caracteres extendidos (Unicode).
* **Dígitos**: 0-9
* **Caracteres Especiales**: `$`, `_`, `.`, `-`, `+`, `*`, `/`, `%`, `=`, `!`, `&`, `|`, `^`, `~`, `<`, `>`, `(`, `)`, `[`, `]`, `{`, `}`, `;`, `,`, `:`, `?`, `@`, `#`
* **Operador signo de dólar**: `$` utilizado exclusivamente para variables.

---

## Descripción del Lenguaje

PHP es un lenguaje versátil que combina características de múltiples paradigmas de programación. Ofrece:

* **Programación dinámica y flexible**: Con tipado dinámico, permite escribir código sin declaraciones explícitas de tipos.
* **Soporte para múltiples paradigmas**: Orientado a objetos, programación funcional e imperativa.
* **Integración web nativa**: Diseñado específicamente para generar contenido HTML dinámico.
* **Gestión de sesiones y cookies**: Características integradas para mantener estado en aplicaciones web.
* **Acceso a bases de datos**: Soporte directo para conexiones con sistemas de bases de datos.
* **Interoperabilidad**: Funciona en prácticamente todos los servidores web modernos.

---

## Tipo de Lenguaje

PHP se clasifica como:

* **Lenguaje interpretado**: Se ejecuta sin compilación previa, directamente por un intérprete.
* **Tipado dinámico**: Los tipos de datos se determinan en tiempo de ejecución, no en tiempo de compilación.
* **Lenguaje de dominio específico (DSL)**: Optimizado para la web, aunque de propósito general.
* **Imperativo y orientado a objetos**: Soporta tanto programación procedural como OOP.
* **Debidamente tipado en tiempo de ejecución**: Con soporte opcional para type hints desde PHP 7+.

---

## Estructuras Soportadas

El lenguaje PHP soporta las siguientes estructuras principales:

### Control de Flujo
- **Condicionales**: `if`, `else`, `elseif`, `switch`, `case`
- **Bucles**: `while`, `do-while`, `for`, `foreach`
- **Control**: `break`, `continue`, `return`, `exit`, `die`

### Definiciones y Declaraciones
- **Funciones**: `function` para definir funciones reutilizables
- **Clases**: `class` para programación orientada a objetos
- **Interfaces**: `interface` para definir contratos
- **Traits**: `trait` para compartir métodos entre clases
- **Namespaces**: `namespace` para organizar código

### Operaciones Básicas
- **Asignación**: Simple (`=`) y compuesta (`+=`, `-=`, `*=`, `/=`, `.=`)
- **Operadores aritméticos**: Suma (`+`), resta (`-`), multiplicación (`*`), división (`/`), módulo (`%`)
- **Operadores de comparación**: Igualdad (`==`, `===`), desigualdad (`!=`, `!==`), mayor/menor que
- **Operadores lógicos**: AND (`&&`), OR (`||`), NOT (`!`)
- **Concatenación de strings**: Operador punto (`.`)

### Variables y Literales
- **Variables**: Identificadas con el prefijo `$`
- **Tipos literales**: Enteros, flotantes, strings (comillas simples y dobles), booleanos
- **Arrays**: Estructuras de datos indexadas y asociativas
- **Objetos**: Instancias de clases

### Características Avanzadas
- **Manejo de errores**: `try`, `catch`, `finally`
- **Inclusión de archivos**: `include`, `require`, `include_once`, `require_once`
- **Declaración de constantes**: `const`, `define`
- **Argumentos con valores por defecto**: En funciones
- **Argumentos variables**: `...$args`

---

## ¿Cómo funciona este Analizador?

El proceso de análisis léxico (o *tokenización*) es la primera fase de un compilador. Su trabajo es leer el código fuente de PHP carácter por carácter y agruparlos en unidades con significado llamadas **Tokens**.



### 1. El Alfabeto de PHP
PHP utiliza el juego de caracteres **UTF-8**. Nuestro analizador está configurado para reconocer:
* **Letras y Números:** `a-z`, `A-Z`, `0-9`.
* **Símbolos Especiales:** `$`, `(`, `)`, `{`, `}`, `;`, `=`, `+`.
* **Caracteres Extendidos:** Soporte para identificadores con caracteres como la `ñ` o acentos (Unicode `\u0080-\u00ff`).


### Anatomía Completa de Tokens (Lexer)

El Lexer de **ChamitoCode** descompone el código PHP en las siguientes categorías de tokens obligatorios para el lenguaje:

#### 1. Delimitadores de Bloque
| Token | Regla ANTLR | Descripción |
| :--- | :--- | :--- |
| `OPEN_TAG` | `<?php` | Indica el inicio del intérprete PHP. |
| `CLOSE_TAG` | `?>` | Indica el fin del bloque PHP y retorno a HTML. |

#### 2. Palabras Reservadas (Keywords)
*Nota: En PHP estas son case-insensitive (pueden escribirse en mayúsculas o minúsculas).*
| Token | Regla (Regex) | Uso |
| :--- | :--- | :--- |
| `ECHO` | `[eE][cC][hH][oO]` | Imprimir texto en pantalla. |
| `IF` | `[iI][fF]` | Estructura condicional. |
| `ELSE` | `[eE][lL][sS][eE]` | Rama alternativa del condicional. |
| `WHILE` | `[wW][hH][iI][lL][eE]` | Bucle basado en condición. |
| `FOR` | `[fF][oO][rR]` | Bucle iterativo. |
| `FUNCTION` | `[fF][uU][nN][cC]...` | Declaración de funciones. |
| `RETURN` | `[rR][eE][tT][uU][rR][nN]` | Retorno de valor en funciones. |
| `CLASS` | `[cC][lL][aA][sS][sS]` | Definición de objetos/clases. |

#### 3. Identificadores y Variables
| Token | Regla ANTLR | Definición Técnica |
| :--- | :--- | :--- |
| `VARIABLE` | `'$' [a-zA-Z_\u0080-\u00ff][a-zA-Z0-9_]*` | Cualquier nombre que empiece con `$`. |
| `ID` | `[a-zA-Z_\u0080-\u00ff][a-zA-Z0-9_]*` | Nombres de funciones, clases o constantes. |

#### 4. Literales (Datos)
| Token | Regla ANTLR | Ejemplo |
| :--- | :--- | :--- |
| `INT` | `[0-9]+` | `42`, `1000` |
| `FLOAT` | `[0-9]+ '.' [0-9]+` | `3.1416`, `0.5` |
| `STRING` | `'"' ( '\\"' \| . )*? '"'` | `"Texto con doble comilla"` |
| `STRING_SQ` | `'\'' ( '\\\'' \| . )*? '\''` | `'Texto con comilla simple'` |
| `BOOLEAN` | `true \| false` | Valores lógicos. |

#### 5. Operadores
| Categoría | Tokens | Símbolos |
| :--- | :--- | :--- |
| **Aritméticos** | `PLUS`, `MINUS`, `MUL`, `DIV` | `+`, `-`, `*`, `/` |
| **Asignación** | `ASSIGN`, `ADD_ASSIGN` | `=`, `+=`, `-=` |
| **Comparación** | `EQUAL`, `IDENTICAL`, `GT`, `LT` | `==`, `===`, `>`, `<` |
| **Lógicos** | `AND`, `OR`, `NOT` | `&&`, `||`, `!` |
| **Otros** | `CONCAT` | `.` (Punto de concatenación) |

#### 6. Signos de Puntuación
| Token | Símbolo | Función |
| :--- | :--- | :--- |
| `LPAREN` / `RPAREN` | `(` `)` | Agrupación de expresiones y parámetros. |
| `LBRACE` / `RBRACE` | `{` `}` | Delimitación de bloques de código. |
| `SEMICOLON` | `;` | Fin de instrucción (Obligatorio en PHP). |
| `COMMA` | `,` | Separador de argumentos. |

#### 7. Elementos Ignorados (Hidden Channels)
| Token | Regla | Acción |
| :--- | :--- | :--- |
| `WS` | `[ \t\r\n]+` | Los espacios y saltos de línea se descartan. |
| `COMMENT` | `//` o `#` | Comentarios de una sola línea. |
| `BLOCK_COMMENT`| `/* ... */` | Comentarios multilínea. |

---

## Reglas Léxicas

Las reglas léxicas definen patrones que el analizador utiliza para reconocer y clasificar tokens. En formato ANTLR4, una regla léxica comienza con mayúscula y describe cómo identificar un tipo específico de token.

### Estructura de una Regla Léxica

Una regla léxica en ANTLR4 tiene la siguiente estructura:

```antlr
// Nombre de Token (siempre en MAYÚSCULAS)
NOMBRE_TOKEN : patrón_regex [ -> mode | channel ] ;
```

**Componentes:**
- **NOMBRE_TOKEN**: Identificador único del token (usado en mayúsculas)
- **patrón_regex**: Expresión regular que describe qué caracteres forman este token
- **-> mode**: (Opcional) Cambia a otro modo léxico
- **-> channel(HIDDEN)**: (Opcional) Marca el token como ignorado

### Ejemplos de Reglas Léxicas en PHP

A continuación se muestran algunas reglas léxicas comunes extraídas del analizador:

#### 1. Palabras Reservadas
```antlr
// Una palabra reservada específica
IF : [iI][fF] ;
ELSE : [eE][lL][sS][eE] ;
WHILE : [wW][hH][iI][lL][eE] ;
RETURN : [rR][eE][tT][uU][rR][nN] ;
```

#### 2. Identificadores y Variables
```antlr
// Variables (siempre comienzan con $)
VARIABLE : '$' [a-zA-Z_] [a-zA-Z0-9_]* ;

// Identificadores (nombres de funciones, clases, constantes)
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;
```

#### 3. Números
```antlr
// Números enteros
INT : [0-9]+ ;

// Números decimales (floats)
FLOAT : [0-9]+ '.' [0-9]+ ;
```

#### 4. Cadenas de Texto
```antlr
// Strings con comillas dobles
STRING : '"' ( '\\"' | ~'"' )*? '"' ;

// Strings con comillas simples
STRING_SQ : '\'' ( '\\\'' | ~'\'' )*? '\'' ;
```

#### 5. Operadores
```antlr
// Operadores aritméticos
PLUS  : '+' ;
MINUS : '-' ;
MUL   : '*' ;
DIV   : '/' ;

// Operador de asignación
ASSIGN : '=' ;

// Comparación
EQ : '==' ;
NE : '!=' ;
GT : '>' ;
LT : '<' ;
```

#### 6. Caracteres Especiales
```antlr
// Signos de puntuación
SEMICOLON : ';' ;
COMMA     : ',' ;
LPAREN    : '(' ;
RPAREN    : ')' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
```

#### 7. Ignorar Whitespace y Comentarios
```antlr
// Espacios en blanco (ignorados)
WS : [ \t\n\r]+ -> channel(HIDDEN) ;

// Comentarios de una línea
LINE_COMMENT : '//' ~[\n\r]* -> channel(HIDDEN) ;

// Comentarios de bloque
BLOCK_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
```

---

## Cómo Funcionan las Reglas Léxicas

El analizador léxico procesa el código fuente carácter por carácter, intentando hacer coincidir los caracteres con las reglas definidas. El proceso sigue estos pasos:

### 1. Lectura Secuencial
El lexer lee el código de izquierda a derecha, carácter por carácter.

### 2. Coincidencia de Patrones
Para cada posición, intenta encontrar la regla léxica más larga que coincida (principio de **longest match**).

### 3. Creación del Token
Cuando encuentra una coincidencia, crea un token con:
- **Tipo**: Nombre de la regla (ej: `IF`, `ID`, `INT`)
- **Texto**: Valor exacto de la entrada
- **Línea y Columna**: Ubicación en el archivo

### 4. Distribución
- Si la regla es normal → se envía al analizador sintáctico
- Si la regla tiene `-> skip` → se descarta
- Si la regla tiene `-> channel(HIDDEN)` → se descarta pero se mantiene accesible

### 5. Orden de Evaluación de Reglas **CRÍTICO**

**En ANTLR, el orden de las reglas léxicas importa significativamente.** El lexer evalúa las reglas en el orden en que aparecen en el archivo `PHPLexer.g4`:

- Las reglas más específicas deben aparecer **ANTES** que las más generales
- El patrón catch-all (ERROR_CHAR : `.` ;) **DEBE estar al final**
- Las reglas con `-> skip` (whitespace) deben estar **ANTES** de ERROR_CHAR

**Ejemplo problemático:**
```antlr
ERROR_CHAR : . ;           // INCORRECTO: capturaría TODO, incluso espacios
WS : [ \t\r\n]+ -> skip ;
```

**Solución correcta:**
```antlr
WS : [ \t\r\n]+ -> skip ;  // CORRECTO: evalúa primero
ERROR_CHAR : . ;           // Luego: atrapa caracteres inválidos
```

Sin este orden, el lexer generaría tokens ERROR_CHAR para espacios en blanco legítimos, contaminando la salida.

### Ejemplo Paso a Paso

Supongamos este código de entrada:
```php
if (x > 5)
```

El lexer procede así:

| Carácter | Regla Coincidente | Token Generado | Descripción |
| :--- | :--- | :--- | :--- |
| `i`, `f` | `IF` | `IF` | Coincide con la palabra reservada "if" (case-insensitive) |
| ` ` | `WS` | (descartado) | Espacio ignorado |
| `(` | `LPAREN` | `LPAREN` | Paréntesis de apertura |
| `x` | `ID` | `ID: x` | Identificador válido |
| ` ` | `WS` | (descartado) | Espacio ignorado |
| `>` | `GT` | `GT` | Operador "mayor que" |
| ` ` | `WS` | (descartado) | Espacio ignorado |
| `5` | `INT` | `INT: 5` | Número entero |
| `)` | `RPAREN` | `RPAREN` | Paréntesis de cierre |

**Salida de tokens:**
```
IF LPAREN ID GT INT RPAREN
```

---

## Implementación

### Herramientas Utilizadas

#### ANTLR4 (Another Tool for Language Recognition)
**ANTLR4** es un potente generador de analizadores de código:

- **Propósito**: Genera lexers (analizadores léxicos) y parsers (analizadores sintácticos) automáticamente
- **Entrada**: Archivos de gramática (`.g4`) con reglas formales
- **Salida**: Código fuente en el lenguaje de destino (Python, Java, C#, etc.)
- **Ventajas**:
  - Especificación declarativa y limpia de gramáticas
  - Soporte para múltiples lenguajes de programación
  - Generación automática de código robusto
  - Manejo completo de conflictos y ambigüedades

### Lenguaje de Implementación

#### Python 3.13
El analizador está implementado en **Python 3.13**:

- **Runtime ANTLR para Python**: `antlr4-python3-runtime`
- **Ventajas de Python para este proyecto**:
  - Sintaxis clara y legible
  - Fácil integración con sistemas educativos
  - Excelente para prototipado rápido
  - Librerías riches para manipulación de tokens
  - Comunidad grande y bien documentada

### Comparación con Otras Herramientas

| Herramienta | Lenguaje | Ventajas | Desventajas |
| :--- | :--- | :--- | :--- |
| **ANTLR4** | Java / Python / C# | Muy potente, genera código automático, estándar en la industria | Curva de aprendizaje inicial, overhead de generación |
| **JFlex** | Java | Lexer simple y directo, muy rápido | Solo para lexing, no incluye parser |
| **Flex** | C / C++ | Rápido, tradicional, bien optimizado | Sintaxis antigua, requiere manejo manual de memoria |
| **Ragel** | Múltiples lenguajes | Flexibilidad en máquinas de estado | Menos común, documentación limitada |

---

## Estructura del Proyecto

```
Analizador Lexico de PHP/
│
├── PHPLexer.g4              # Gramática ANTLR4 que define las reglas léxicas
├── PHPLexer.py              # Clase generada automáticamente por ANTLR4
├── PHPLexer.interp          # Archivo de interpretación generado por ANTLR4
├── PHPLexer.tokens          # Tabla de tokens generada por ANTLR4
├── prueba.py                # Script de prueba que ejecuta el analizador léxico
├── readme.md                # Este archivo de documentación
├── .venv/                   # Entorno virtual de Python
│   └── bin/
│       └── activate         # Script para activar el entorno virtual
└── __pycache__/             # Caché de Python compilado

```

### Descripción de Archivos Clave

#### `PHPLexer.g4`
Archivo de gramática ANTLR4 que define:
- Todas las reglas léxicas (tokens)
- Patrones para reconocer palabras reservadas, operadores, literales, etc.
- Configuración del lexer (opciones y modos)

#### `PHPLexer.py`
Código Python **generado automáticamente** por ANTLR4. Contiene:
- Clase `PHPLexer`: El analizador léxico real
- Tablas de transición de estados
- Métodos para obtener el siguiente token
- No debe editarse manualmente (se regenera al actualizar `PHPLexer.g4`)

#### `prueba.py`
Script Python principal que:
- Importa el lexer generado
- Lee código PHP de entrada
- Ejecuta el analizador léxico
- Procesa y muestra los tokens generados

---

## Requisitos e Instalación

### Requisitos Previos
1.  **Java JRE/JDK:** Necesario para ejecutar la herramienta ANTLR4.
2.  **Python 3.x:** Para ejecutar el runtime y tu lógica de usuario.
3.  **ANTLR4 JAR:** El archivo `antlr-4.x-complete.jar` debe estar en tu CLASSPATH.

### Configuración del Entorno
```bash
# 1. Crear entorno virtual
python3 -m venv .venv
source .venv/bin/activate

# 2. Instalar el runtime de ANTLR para Python
pip install antlr4-python3-runtime
```

---

## Cómo Ejecutarlo

### 1. Regenerar el Lexer (si hay cambios en la gramática)

Si realizas cambios en `PHPLexer.g4`, regenera los archivos de Python:

```bash
antlr4 -Dlanguage=Python3 PHPLexer.g4
```

**Configuración de alias (opcional pero recomendada):**
```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.13.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

### 2. Ejecutar el Script de Prueba

#### Opción A: Analizar un archivo PHP
```bash
# Activar el entorno virtual (si aún no está activado)
source .venv/bin/activate

# Ejecutar el analizador con un archivo
python3 prueba.py archivo.php
```

#### Opción B: Usar código por defecto
```bash
# Sin argumentos, usa el código de prueba incorporado
python3 prueba.py
```

### 3. Ver la Salida

El script mostrará los tokens generados de la entrada PHP proporcionada, organizados en una tabla clara con el tipo de token y su valor.

---

## Explicación del Funcionamiento

### Flujo General del Analizador Léxico

El analizador léxico sigue este flujo:

```
┌──────────────────────┐
│  Código PHP Fuente   │
│  (archivo o string)  │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────────────┐
│ Crear InputStream desde      │
│ el código fuente             │
└──────────┬───────────────────┘
           │
           ▼
┌──────────────────────────────┐
│ Instanciar PHPLexer con      │
│ el InputStream               │
└──────────┬───────────────────┘
           │
           ▼
┌──────────────────────────────┐
│ Obtener todos los tokens     │
│ mediante getAllTokens()      │
└──────────┬───────────────────┘
           │
           ▼
┌──────────────────────────────┐
│ Procesar cada Token:         │
│ - Tipo (ID, INT, IF, etc)   │
│ - Valor (text)              │
│ - Línea y columna           │
└──────────┬───────────────────┘
           │
           ▼
┌──────────────────────────────┐
│ Mostrar/Procesar Tokens      │
│ o Generar Error si hay       │
│ caracteres inválidos (EOF)   │
└──────────────────────────────┘
```

### Proceso Interno del Lexer

1. **Lectura del Flujo**: El lexer lee el código fuente de izquierda a derecha
2. **Coincidencia de Patrones**: Intenta hacer coincidir cada posición con una regla léxica
3. **Selección Greedy**: Toma la coincidencia más larga posible (longest match)
4. **Generación de Token**: Crea un objeto token con sus atributos
5. **Movimiento**: Avanza a la siguiente posición después del token actual
6. **Repetición**: Continúa hasta alcanzar el final del archivo (EOF)

---

## Manejo de Errores Léxicos

### Detección de Caracteres Inválidos

ANTLR proporciona dos enfoques para detectar caracteres que no coinciden con ninguna regla:

#### Opción 1: ErrorListener (Automático)
Sin agregar una regla específica, ANTLR genera un error automático cuando encuentra un carácter inválido.

#### Opción 2: Regla ERROR_CHAR Explícita
Agregamos una regla catch-all al final de PHPLexer.g4:

```antlr
// ERROR_CHAR debe estar DESPUÉS de todas las demás reglas
// Especialmente después de WS (espacios en blanco)
ERROR_CHAR : . ;
```

Esta regla atrapa cualquier carácter que no coincida con las reglas anteriores y lo marca como token de error.

### Comparación: ANTLR vs Flex

| Aspecto | Flex (C/C++) | ANTLR (Múltiples lenguajes) |
| :--- | :--- | :--- |
| **Detección de Error** | `{ return "ERROR"; }` | `ERROR_CHAR : . ;` |
| **Orden de Reglas** | Las últimas reglas pueden sobrescribir | Orden crítico, left-to-right |
| **Manejo de Errores** | Manual con return | Automático con ErrorListener o token |
| **Ejemplo Equivalente** | `.*` → Lex retorna ERROR | `ERROR_CHAR : .` → ANTLR genera token ERROR |

### Ejemplo con Error

**Entrada inválida:**
```php
<?php
x § 5
?>
```

**Análisis:**
```
<?php           → PHP_OPEN (válido)
x               → ID (válido)
§               → ERROR_CHAR (carácter no reconocido)
5               → INT (válido)
?>              → PHP_CLOSE (válido)
```

**Salida del Analizador:**
```
Token: PHP_OPEN      | Valor: '<?php'
Token: ID            | Valor: 'x'
Token: ERROR_CHAR    | Valor: '§'
Token: INT           | Valor: '5'
Token: PHP_CLOSE     | Valor: '?>'
```

El análisis continúa después del error, permitiendo encuentros múltiples en un mismo archivo.

---

## Cobertura del Lexer (180+ Tokens)

El analizador léxico actual soporta **más de 180 tokens** organizados en las siguientes categorías:

### Resumen por Categorías

| Categoría | Cantidad | Ejemplos |
| :--- | :--- | :--- |
| **Delimitadores** | 2 | `<?php`, `?>` |
| **Palabras Clave** | 50+ | `if`, `else`, `while`, `for`, `function`, `class`, `return`, `echo`, etc. |
| **Variables e Identificadores** | 2 | `VARIABLE` ($var), `ID` (nombre) |
| **Literales** | 4+ | `INT`, `FLOAT`, `STRING`, `STRING_SQ` |
| **Operadores Aritméticos** | 5+ | `+`, `-`, `*`, `/`, `%`, `**` |
| **Operadores de Asignación** | 8+ | `=`, `+=`, `-=`, `*=`, `/=`, `.=`, `%=`, `**=` |
| **Operadores de Comparación** | 7+ | `==`, `===`, `!=`, `!==`, `<`, `>`, `<=`, `>=`, `<=>` |
| **Operadores Lógicos** | 6+ | `&&`, `\|\|`, `!`, `and`, `or`, `xor` |
| **Operadores Especiales** | 8+ | `.` (concat), `->`, `=>`, `::`, `?`, `:`, `@`, `$` |
| **Incremento/Decremento** | 2 | `++`, `--` |
| **Signos de Puntuación** | 10+ | `(`, `)`, `{`, `}`, `[`, `]`, `;`, `,`, `.`, etc. |
| **Comentarios** | 2 | Comentarios de línea (`//`, `#`), Comentarios de bloque (`/* */`) |
| **Control de Error** | 1 | `ERROR_CHAR` (carácter no reconocido) |

### Palabras Clave Soportadas

**Control de Flujo:** `if`, `else`, `elseif`, `switch`, `case`, `default`, `break`, `continue`

**Bucles:** `while`, `do`, `for`, `foreach`

**Funciones y Clases:** `function`, `return`, `class`, `new`, `extends`, `implements`, `interface`, `trait`, `namespace`, `use`

**Modificadores:** `public`, `private`, `protected`, `static`, `const`, `final`, `abstract`

**Manejo de Errores:** `try`, `catch`, `finally`, `throw`

**Inclusión de Archivos:** `include`, `include_once`, `require`, `require_once`

**Otras:** `echo`, `print`, `var`, `array`, `list`, `global`, `isset`, `empty`, `unset`, `die`, `exit`

---

## Casos de Prueba

**Entrada (archivo PHP):**
```php
<?php
int x = 5;
?>
```

**Análisis Esperado:**
| Carácter(es) | Token Esperado | Tipo |
| :--- | :--- | :--- |
| `<?php` | `OPEN_TAG` | Delimitador |
| ` ` | *(ignorado)* | Whitespace |
| `int` | `ID` | Identificador |
| ` ` | *(ignorado)* | Whitespace |
| `x` | `ID` | Identificador |
| ` ` | *(ignorado)* | Whitespace |
| `=` | `ASSIGN` | Operador |
| ` ` | *(ignorado)* | Whitespace |
| `5` | `INT` | Literal |
| `;` | `SEMICOLON` | Puntuación |
| `?>` | `CLOSE_TAG` | Delimitador |

**Salida Esperada:**
```
OPEN_TAG INT ID ASSIGN INT SEMICOLON CLOSE_TAG
```

---

### Caso de Prueba 2: Condicional Simple

**Entrada:**
```php
<?php
if (x > 0) {
    x++;
}
?>
```

**Proceso Paso a Paso:**
```
<?php              → OPEN_TAG
if                 → IF (palabra reservada case-insensitive)
(                  → LPAREN
x                  → ID
>                  → GT (operador de comparación)
0                  → INT
)                  → RPAREN
{                  → LBRACE
x                  → ID
++                 → PLUSPLUS (operador de incremento)
;                  → SEMICOLON
}                  → RBRACE
?>                 → CLOSE_TAG
```

**Salida Esperada:**
```
OPEN_TAG IF LPAREN ID GT INT RPAREN LBRACE ID PLUSPLUS SEMICOLON RBRACE CLOSE_TAG
```

---

### Caso de Prueba 3: Carácter Inválido (§)

**Entrada:**
```php
<?php
x § 5
?>
```

**Análisis:**
```
<?php              → PHP_OPEN (válido)
x                  → ID (válido)
§                  → ERROR_CHAR (carácter no reconocido por ninguna regla)
5                  → INT (válido, continue después del error)
?>                 → PHP_CLOSE (válido)
```

**Salida Esperada:**
```
PHP_OPEN ID ERROR_CHAR INT PHP_CLOSE
```

**Nota:** El símbolo `§` no está definido en ninguna regla léxica, por lo que es capturado por ERROR_CHAR. En contraste, `@` sí es un token válido (`AT`) en PHP.

---

### Caso de Prueba 4: String y Comentario

**Entrada:**
```php
<?php
// Este es un comentario
$mensaje = "Hola Mundo";
?>
```

**Proceso:**
```
<?php                          → OPEN_TAG
// Este es un comentario       → (ignorado, COMMENT)
$mensaje                       → VARIABLE
=                              → ASSIGN
"Hola Mundo"                   → STRING
;                              → SEMICOLON
?>                             → CLOSE_TAG
```

**Salida Esperada:**
```
OPEN_TAG VARIABLE ASSIGN STRING SEMICOLON CLOSE_TAG
```

---

### Caso de Prueba 5: Números Decimales

**Entrada:**
```php
<?php
$pi = 3.14159;
$precio = 99.99;
?>
```

**Proceso:**
```
<?php              → OPEN_TAG
$pi                → VARIABLE
=                  → ASSIGN
3.14159            → FLOAT
;                  → SEMICOLON
$precio            → VARIABLE
=                  → ASSIGN
99.99              → FLOAT
;                  → SEMICOLON
?>                 → CLOSE_TAG
```

**Salida Esperada:**
```
OPEN_TAG VARIABLE ASSIGN FLOAT SEMICOLON VARIABLE ASSIGN FLOAT SEMICOLON CLOSE_TAG
```

---

## Ejemplo de Salida Completo

### Entrada PHP:
```php
<?php echo $pago; ?>
```

### Proceso de Análisis:

1. **Delimitador de apertura**: `<?php` → Token `OPEN_TAG`
2. **Keyword echo**: `echo` → Token `ECHO`
3. **Variable pago**: `$pago` → Token `VARIABLE` (con valor `$pago`)
4. **Terminador**: `;` → Token `SEMICOLON`
5. **Delimitador de cierre**: `?>` → Token `CLOSE_TAG`

### Salida del Analizador:
```
Token(OPEN_TAG, '<?php', 1, 0)
Token(ECHO, 'echo', 1, 5)
Token(VARIABLE, '$pago', 1, 10)
Token(SEMICOLON, ';', 1, 15)
Token(CLOSE_TAG, '?>', 1, 16)
```

**Secuencia simplificada:**
```
OPEN_TAG ECHO VARIABLE SEMICOLON CLOSE_TAG
```

---

## Troubleshooting

### Problema: "antlr4: command not found"
**Solución:**
```bash
export CLASSPATH=".:/ruta/a/antlr-4.13.1-complete.jar:$CLASSPATH"
alias antlr4='java -jar /ruta/a/antlr-4.13.1-complete.jar'
```

### Problema: "ModuleNotFoundError: No module named 'antlr4'"
**Solución:**
```bash
pip install antlr4-python3-runtime
```

### Problema: El lexer no reconoce caracteres especiales
**Solución:**
- Verificar que `PHPLexer.g4` contiene reglas para los caracteres
- Regenerar el lexer: `antlr4 -Dlanguage=Python3 PHPLexer.g4`

---

## Referencias y Recursos

- **ANTLR4 Official**: https://www.antlr.org/
- **ANTLR4 Python Runtime**: https://github.com/antlr/antlr4/tree/master/runtime/Python3
- **Documentación de PHP**: https://www.php.net/docs.php
- **Lenguajes Formales y Compiladores**: Libros clásicos sobre teoría de compiladores
