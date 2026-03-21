from fastapi import FastAPI, Request
from fastapi.responses import HTMLResponse, JSONResponse
from fastapi.staticfiles import StaticFiles
from antlr4 import *
from PHPLexer import PHPLexer
import json

app = FastAPI(title="PHP Lexical Analyzer", version="1.0.0")

# Montar archivos estáticos
app.mount("/static", StaticFiles(directory="static"), name="static")

def analizar_codigo(codigo: str) -> dict:
    """Analiza código PHP y retorna los tokens"""
    try:
        input_stream = InputStream(codigo)
        lexer = PHPLexer(input_stream)
        
        tokens = lexer.getAllTokens()
        
        resultado = {
            "exito": True,
            "tokens": [],
            "total": len(tokens)
        }
        
        for token in tokens:
            token_type = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else "UNKNOWN"
            resultado["tokens"].append({
                "tipo": token_type,
                "valor": token.text,
                "linea": token.line,
                "columna": token.column
            })
        
        return resultado
    except Exception as e:
        return {
            "exito": False,
            "error": str(e),
            "tokens": [],
            "total": 0
        }

@app.get("/", response_class=HTMLResponse)
async def read_root():
    """Sirve la página principal"""
    with open("templates/index.html", "r", encoding="utf-8") as f:
        return f.read()

@app.post("/api/analizar")
async def analizar(request: Request):
    """Endpoint para analizar código PHP"""
    try:
        data = await request.json()
        codigo = data.get("codigo", "")
        
        if not codigo.strip():
            return JSONResponse({
                "exito": False,
                "error": "El código no puede estar vacío",
                "tokens": [],
                "total": 0
            })
        
        resultado = analizar_codigo(codigo)
        return JSONResponse(resultado)
    except Exception as e:
        return JSONResponse({
            "exito": False,
            "error": f"Error al procesar la solicitud: {str(e)}",
            "tokens": [],
            "total": 0
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
