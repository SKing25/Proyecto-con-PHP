from antlr4 import *
from PHPLexer import PHPLexer

def main():
    code = '<?php $total = 10 + 20; echo "hola"; ?>'
    input_stream = InputStream(code)
    lexer = PHPLexer(input_stream)
    
    token = lexer.nextToken()
    while token.type != Token.EOF:
        print(f"Token: {lexer.symbolicNames[token.type]} | Valor: '{token.text}'")
        token = lexer.nextToken()

if __name__ == '__main__':
    main()