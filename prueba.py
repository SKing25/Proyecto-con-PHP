from antlr4 import *
from PHPLexer import PHPLexer
import sys

def analizar_codigo(codigo):
    """Analiza código PHP y muestra los tokens"""
    input_stream = InputStream(codigo)
    lexer = PHPLexer(input_stream)
    
    tokens = lexer.getAllTokens()
    
    print("=" * 70)
    print("ANÁLISIS LÉXICO DE PHP")
    print("=" * 70)
    
    if not tokens:
        print("No se encontraron tokens.")
        return
    
    for token in tokens:
        token_type = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else "UNKNOWN"
        print(f"Token: {token_type:20} | Valor: '{token.text}'")
    
    print("=" * 70)

def main():
    if len(sys.argv) > 1:
        # Leer desde archivo
        archivo = sys.argv[1]
        try:
            with open(archivo, 'r', encoding='utf-8') as f:
                codigo = f.read()
            print(f"Analizando archivo: {archivo}\n")
            analizar_codigo(codigo)
        except FileNotFoundError:
            print(f"Error: El archivo '{archivo}' no existe.")
            sys.exit(1)
    else:
        # Código de prueba por defecto
        codigo = '<?php $total = 10 + 20; echo "hola"; ?>'
        print(f"Analizando código por defecto:\n{codigo}\n")
        analizar_codigo(codigo)

if __name__ == '__main__':
    main()