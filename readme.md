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

## Uso

1.  **Generar el Lexer:**
    Si realizas cambios en `PHPLexer.g4`, regenera los archivos de Python:
    ```bash
    antlr4 -Dlanguage=Python3 PHPLexer.g4
    ```
    (tener en cuenta q hice un alias para el comando de antlr4):
    ```bash
    export CLASSPATH=".:/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH"
    alias antlr4='java -jar /usr/local/lib/antlr-4.13.1-complete.jar'
    alias grun='java org.antlr.v4.gui.TestRig'
    ```

2.  **Ejecutar la prueba:**
    ```bash
    python3 prueba.py
    ```

---

## Ejemplo de Salida
Si el código de entrada es `<?php echo $pago; ?>`, el analizador devolverá:
* `PHP_OPEN`: `<?php`
* `ECHO`: `echo`
* `VARIABLE`: `$pago`
* `SEMICOLON`: `;`
* `PHP_CLOSE`: `?>`
