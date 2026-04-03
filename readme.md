# Analizador Léxico para PHP

Analizador léxico (*lexer*) funcional para el lenguaje PHP, construido con **ANTLR4** y **Python 3.13**, expuesto como servicio web mediante **FastAPI**. Transforma código fuente PHP en una secuencia de tokens clasificados, con soporte para manejo de errores léxicos e interfaz web interactiva.

---

## 📋 Tabla de Contenidos

- [¿Qué es un analizador léxico?](#qué-es-un-analizador-léxico)
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Estructura del proyecto](#estructura-del-proyecto)
- [Requisitos](#requisitos)
- [Instalación y ejecución](#instalación-y-ejecución)
- [Tokens soportados](#tokens-soportados)
- [Ejemplos de uso](#ejemplos-de-uso)
- [Limitaciones conocidas](#limitaciones-conocidas)
- [Referencias](#referencias)

---

## ¿Qué es un analizador léxico?

Un **analizador léxico** (o *lexer*) es el primer componente de un compilador. Lee el código fuente carácter a carácter y agrupa las secuencias en unidades con significado llamadas **tokens**, que luego sirven de entrada al analizador sintáctico.

```
Código fuente PHP  →  [Lexer]  →  Secuencia de tokens  →  Parser
```

El lexer se encarga de:
- Reconocer palabras reservadas, variables, operadores y literales.
- Descartar espacios en blanco y comentarios.
- Reportar caracteres no reconocidos como errores léxicos.

---

## Características

- ✅ **110 tokens** definidos y clasificados para PHP
- ✅ Palabras reservadas **case-insensitive** (`if`, `IF`, `If` son equivalentes)
- ✅ Variables con prefijo `$` (`$nombre`, `$_contador`)
- ✅ Literales numéricos en decimal, hexadecimal (`0x`), binario (`0b`), octal y flotantes
- ✅ Cadenas con comillas simples y dobles, con soporte de secuencias de escape
- ✅ Operadores de hasta 3 caracteres (`**=`, `===`, `<=>`)
- ✅ Comentarios de línea (`//`, `#`) y de bloque (`/* */`) enviados al canal oculto
- ✅ Manejo de errores léxicos con token `ERROR_CHAR`
- ✅ Principio de **Longest Match** para resolución de conflictos entre reglas
- ✅ API REST con FastAPI para probar el analizador desde el navegador

---

## Tecnologías

| Herramienta | Versión | Rol |
|---|---|---|
| [ANTLR4](https://www.antlr.org/) | 4.x | Generador del analizador léxico a partir de la gramática `.g4` |
| [Python](https://www.python.org/) | 3.13+ | Lenguaje de implementación y runtime |
| [antlr4-python3-runtime](https://pypi.org/project/antlr4-python3-runtime/) | 4.x | Runtime ANTLR4 para Python |
| [FastAPI](https://fastapi.tiangolo.com/) | latest | Servidor web REST |
| [Uvicorn](https://www.uvicorn.org/) | latest | Servidor ASGI para FastAPI |
| Java JRE/JDK | 11+ | Necesario para ejecutar la herramienta ANTLR4 |

---

## Estructura del proyecto

```
php-lexer/
│
├── .venv/                  # Entorno virtual de Python
│
├── lexer/
│   ├── __pycache__/
│   ├── __init__.py
│   ├── PHPLexer.g4         # Gramática ANTLR4 — fuente de verdad del lexer
│   ├── PHPLexer.interp     # Archivo de interpretación generado por ANTLR4
│   ├── PHPLexer.py         # Clase del lexer generada automáticamente por ANTLR4
│   └── PHPLexer.tokens     # Tabla de tokens generada por ANTLR4
│
├── static/
│   ├── script.js           # Lógica del frontend
│   └── style.css           # Estilos de la interfaz web
│
├── templates/
│   └── index.html          # Interfaz web para probar el analizador
│
├── codigo_test.php         # Archivo PHP de prueba
├── main.py                 # Servidor FastAPI con endpoint /api/analizar
├── .gitignore
└── README.md
```

> **Nota:** Los archivos `PHPLexer.interp`, `PHPLexer.py` y `PHPLexer.tokens` son generados automáticamente por ANTLR4. No deben editarse manualmente.

---

## Requisitos

- Python **3.13** o superior
- Java **JRE/JDK 11** o superior (para ejecutar ANTLR4)
- `pip` (gestor de paquetes de Python)

### Verificar versiones

```bash
python --version    # debe ser 3.13+
java -version       # debe ser 11+
pip --version
```

---

## Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/<usuario>/php-lexer.git
cd php-lexer
```

### 2. Crear y activar el entorno virtual

```bash
python -m venv .venv

# Linux / macOS
source .venv/bin/activate

# Windows
.venv\Scripts\activate
```

### 3. Instalar dependencias

```bash
pip install antlr4-python3-runtime fastapi uvicorn
```

### 4. Generar el lexer a partir de la gramática

> Solo es necesario si se modifica `PHPLexer.g4`. Si los archivos generados ya están en el repositorio, omitir este paso.

```bash
# Descargar ANTLR4 (si no está instalado)
curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar

# Generar el lexer para Python3
java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 lexer/PHPLexer.g4 -o lexer/
```

### 5. Ejecutar el servidor

```bash
python main.py
```

### 6. Abrir en el navegador

```
http://localhost:3000
```

Desde la interfaz web puedes pegar código PHP y obtener la lista de tokens clasificados en tiempo real.

---

## Uso de la API

El servidor expone un endpoint REST para integración programática:

**`POST /api/analizar`**

```bash
curl -X POST http://localhost:3000/api/analizar \
  -H "Content-Type: application/json" \
  -d '{"codigo": "<?php echo $saludo; ?>"}'
```

**Respuesta:**

```json
{
  "tokens": [
    { "tipo": "PHP_OPEN",   "valor": "<?php",    "linea": 1, "columna": 0 },
    { "tipo": "ECHO",       "valor": "echo",     "linea": 1, "columna": 6 },
    { "tipo": "VARIABLE",   "valor": "$saludo",  "linea": 1, "columna": 11 },
    { "tipo": "SEMICOLON",  "valor": ";",        "linea": 1, "columna": 18 },
    { "tipo": "PHP_CLOSE",  "valor": "?>",       "linea": 1, "columna": 20 }
  ],
  "errores": [],
  "total_tokens": 5
}
```

---

## Tokens soportados

El lexer reconoce **110 tokens** organizados en las siguientes categorías:

### Delimitadores de bloque (2)
| Token | Patrón |
|---|---|
| `PHP_OPEN` | `<?php` |
| `PHP_CLOSE` | `?>` |

### Palabras reservadas (53)
Case-insensitive. Ejemplos: `if/IF/If`, `while/WHILE`, `class/CLASS`.

Control de flujo: `IF` `ELSE` `ELSEIF` `SWITCH` `CASE` `DEFAULT` `BREAK` `MATCH` `WHILE` `FOR` `FOREACH` `DO` `CONTINUE`

Funciones y clases: `FUNCTION` `RETURN` `CLASS` `NEW` `EXTENDS` `IMPLEMENTS` `INTERFACE` `TRAIT` `NAMESPACE` `USE`

Modificadores OOP: `PUBLIC` `PRIVATE` `PROTECTED` `STATIC` `CONST` `FINAL` `ABSTRACT`

Excepciones: `TRY` `CATCH` `FINALLY` `THROW`

Inclusión: `INCLUDE` `REQUIRE` `INCLUDE_ONCE` `REQUIRE_ONCE`

I/O: `ECHO` `PRINT`

Valores especiales: `TRUE` `FALSE` `NULL` `ARRAY` `LIST` `GLOBAL` `ISSET` `UNSET` `EMPTY` `INSTANCEOF`

Operadores lógicos de baja precedencia: `AND_WORD` `OR_WORD` `XOR_WORD`

### Identificadores y variables (2)
| Token | Patrón | Ejemplo |
|---|---|---|
| `VARIABLE` | `$[a-zA-Z_\u0080-\u00ff][a-zA-Z0-9_\u0080-\u00ff]*` | `$nombre`, `$_id` |
| `ID` | `[a-zA-Z_\u0080-\u00ff][a-zA-Z0-9_\u0080-\u00ff]*` | `miFuncion`, `Cliente` |

### Literales numéricos (5)
| Token | Patrón | Ejemplo |
|---|---|---|
| `INT_HEX` | `0[xX][0-9a-fA-F]+` | `0x1A3F`, `0XFF` |
| `INT_BIN` | `0[bB][01]+` | `0b1010`, `0B1111` |
| `INT_OCT` | `0[0-7]+` | `0755`, `0123` |
| `FLOAT` | `[0-9]*\.[0-9]+([eE][+-]?[0-9]+)?` &#124; `[0-9]+[eE][+-]?[0-9]+` | `3.1416`, `.5`, `1e10` |
| `INT` | `[0-9]+` | `42`, `1000` |

### Operadores (33)
Ordenados por longitud para garantizar el principio de *Longest Match*:

**3 caracteres:** `**=` `??=` `===` `!==` `<=>`

**2 caracteres:** `+=` `-=` `*=` `/=` `%=` `.=` `&=` `|=` `^=` `<<=` `>>=` `**` `++` `--` `==` `!=` `<=` `>=` `&&` `||` `<<` `>>` `->` `=>` `::` `??` `...`

**1 carácter:** `+` `-` `*` `/` `%` `<` `>` `=` `!` `&` `|` `^` `~` `.` `?` `:` `@` `\`

### Puntuación (8)
`(` `)` `{` `}` `[` `]` `;` `,`

### Elementos ignorados (4)
| Token | Mecanismo | Descripción |
|---|---|---|
| `WS` | `-> skip` | Espacios, tabs, saltos de línea — descartados completamente |
| `LINE_COMMENT` | `-> channel(HIDDEN)` | Comentarios `// ...` |
| `HASH_COMMENT` | `-> channel(HIDDEN)` | Comentarios `# ...` |
| `BLOCK_COMMENT` | `-> channel(HIDDEN)` | Comentarios `/* ... */` |

### Token de error (1)
| Token | Descripción |
|---|---|
| `ERROR_CHAR` | Captura cualquier carácter no reconocido por ninguna otra regla |

---

## Ejemplos de uso

### Condicional simple

**Entrada:**
```php
<?php
if ( x > 0) {
    x ++;
}
?>
```

**Salida:**
```
Token: PHP_OPEN    | Valor: '<?php'
Token: IF          | Valor: 'if'
Token: LPAREN      | Valor: '('
Token: ID          | Valor: 'x'
Token: GT          | Valor: '>'
Token: INT         | Valor: '0'
Token: RPAREN      | Valor: ')'
Token: LBRACE      | Valor: '{'
Token: ID          | Valor: 'x'
Token: INCREMENT   | Valor: '++'
Token: SEMICOLON   | Valor: ';'
Token: RBRACE      | Valor: '}'
Token: PHP_CLOSE   | Valor: '?>'
```

### Números en distintas bases

**Entrada:**
```php
<?php
$decimal = 42;
$hex     = 0x2A;
$bin     = 0b101010;
$oct     = 052;
$float   = 3.14159;
?>
```

**Salida (parcial):**
```
Token: INT      | Valor: '42'
Token: INT_HEX  | Valor: '0x2A'
Token: INT_BIN  | Valor: '0b101010'
Token: INT_OCT  | Valor: '052'
Token: FLOAT    | Valor: '3.14159'
```

### Operadores compuestos

**Entrada:**
```php
<?php
$x = 5;
$x += 3;
$x **= 2;
?>
```

**Salida (parcial):**
```
Token: ASSIGN        | Valor: '='
Token: ADD_ASSIGN    | Valor: '+='
Token: POWER_ASSIGN  | Valor: '**='
```

---

## Limitaciones conocidas

- **`<?=`** (short echo tag) no está implementado.
- **`<%` / `%>`** (ASP-style tags, obsoletos en PHP 7+) no están implementados.
- **Heredoc** (`<<<EOT`) y **Nowdoc** (`<<<'EOT'`) no están implementados.
- **`#[`** (atributos de PHP 8.0+) no está implementado.
- **`<?php`** solo se reconoce en minúsculas (no es case-insensitive como las demás palabras reservadas).
- **Identificadores que comienzan con keyword corta** (ej. `format`, `android`, `usage`) pueden tokenizarse incorrectamente debido a que los tokens de palabras reservadas tienen prioridad sobre `ID` en ANTLR4. Se recomienda que el código PHP de entrada use espacios o puntuación como delimitadores.
- El token `ERROR_CHAR` reporta el carácter inválido pero no intenta recuperación avanzada; el análisis continúa desde el siguiente carácter.

---