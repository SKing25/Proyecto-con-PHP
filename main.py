from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from lexer import PHPLexer
from lexer import PHPParser
from fastapi import FastAPI, Request
from fastapi.responses import HTMLResponse, JSONResponse
from fastapi.staticfiles import StaticFiles
import json

app = FastAPI(title="PHP Lexical Analyzer", version="1.0.0")

# Montar archivos estáticos
app.mount("/static", StaticFiles(directory="static"), name="static")


# ── Capturador de errores sintácticos
class ErroresParser(ErrorListener):
    def __init__(self):
        self.errores = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errores.append(f" Error sintáctico en línea {line}, columna {column}: {msg}")


# ── Árbol sintáctico a HTML ───────────────────────────────────
def arbol_a_html(nodo, parser):
    if nodo.getChildCount() == 0:
        texto = nodo.getText().replace("<", "&lt;").replace(">", "&gt;")
        return f"<li><span class='token'>{texto}</span></li>"
    nombre = parser.ruleNames[nodo.getRuleIndex()]
    hijos = "".join(arbol_a_html(nodo.getChild(i), parser)
                    for i in range(nodo.getChildCount()))
    return f"<li><span class='regla' onclick='toggleHijos(this)'>{nombre}</span><ul>{hijos}</ul></li>"



def analizar_codigo(codigo: str) -> dict:
    try:
        # 1. LEXER
        input_stream = InputStream(codigo)
        lexer = PHPLexer(input_stream)

        try:
            tokens = lexer.getAllTokens()
        except Exception as lex_error:
            return {
                "exito": False,
                "error": f"Error léxico: {str(lex_error)}",
                "tokens": [],
                "total": 0,
                "errores_parser": [],
                "arbol_html": None
            }

        lista_tokens = []
        for token in tokens:
            try:
                token_type = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else "UNKNOWN"
                lista_tokens.append({
                    "tipo": token_type,
                    "valor": token.text,
                    "linea": token.line,
                    "columna": token.column
                })
            except:
                continue

        # 2. PARSER
        lexer.reset()  # reiniciamos el lexer para el parser
        stream = CommonTokenStream(lexer)
        parser = PHPParser(stream)

        # Capturamos errores del parser
        capturador = ErroresParser()
        parser.removeErrorListeners()
        parser.addErrorListener(capturador)

        tree = parser.program()

        # 3. Si hay errores sintácticos, los retornamos sin árbol
        if capturador.errores:
            return {
                "exito": True,
                "tokens": lista_tokens,
                "total": len(lista_tokens),
                "errores_parser": capturador.errores,
                "arbol_html": None
            }

        # 4. Sin errores: generamos el árbol HTML
        arbol_html = arbol_a_html(tree, parser)

        return {
            "exito": True,
            "tokens": lista_tokens,
            "total": len(lista_tokens),
            "errores_parser": [],
            "arbol_html": arbol_html
        }

    except Exception as e:
        return {
            "exito": False,
            "error": str(e),
            "tokens": [],
            "total": 0,
            "errores_parser": [],
            "arbol_html": None
        }

@app.get("/", response_class=HTMLResponse)
async def read_root():
    """Sirve la página principal"""
    with open("templates/index.html", "r", encoding="utf-8") as f:
        return f.read()

@app.post("/api/analizar")
async def analizar(request: Request):
    try:
        data = await request.json()
        codigo = data.get("codigo", "")
        if not codigo.strip():
            return JSONResponse({
                "exito": False,
                "error": "El código no puede estar vacío",
                "tokens": [],
                "total": 0,
                "errores_parser": [],
                "arbol_html": None
            })
        resultado = analizar_codigo(codigo)
        return JSONResponse(resultado)
    except Exception as e:
        return JSONResponse({
            "exito": False,
            "error": str(e),
            "tokens": [],
            "total": 0,
            "errores_parser": [],
            "arbol_html": None
        })

@app.get("/api/info")
async def get_info():
    """Obtiene información del analizador"""
    return JSONResponse({
        "nombre": "PHP Lexical Analyzer",
        "version": "1.0.0",
        "descripcion": "Analizador léxico para PHP usando ANTLR4",
        "autor": "ChamitoCode"
    })

if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="0.0.0.0", port=3000)
