// Generated from c:/Users/juand/OneDrive/Documentos/GitHub/Proyecto-con-PHP/lexer/PHPParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PHPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PHP_OPEN=1, PHP_CLOSE=2, IF=3, ELSE=4, ELSEIF=5, SWITCH=6, CASE=7, DEFAULT=8, 
		BREAK=9, MATCH=10, WHILE=11, FOR=12, FOREACH=13, AS=14, DO=15, CONTINUE=16, 
		FUNCTION=17, RETURN=18, CLASS=19, NEW=20, EXTENDS=21, IMPLEMENTS=22, INTERFACE=23, 
		TRAIT=24, NAMESPACE=25, USE=26, PUBLIC=27, PRIVATE=28, PROTECTED=29, STATIC=30, 
		CONST=31, FINAL=32, ABSTRACT=33, TRY=34, CATCH=35, FINALLY=36, THROW=37, 
		INCLUDE=38, REQUIRE=39, INCLUDE_ONCE=40, REQUIRE_ONCE=41, ECHO=42, PRINT=43, 
		TRUE=44, FALSE=45, NULL=46, ARRAY=47, LIST=48, GLOBAL=49, ISSET=50, UNSET=51, 
		EMPTY=52, INSTANCEOF=53, AND_WORD=54, OR_WORD=55, XOR_WORD=56, VARIABLE=57, 
		ID=58, INT_HEX=59, INT_BIN=60, INT_OCT=61, FLOAT=62, INT=63, STRING=64, 
		STRING_SQ=65, POWER_ASSIGN=66, NULL_COALESCE_ASSIGN=67, IDENTICAL=68, 
		NOT_IDENTICAL=69, SPACESHIP=70, ADD_ASSIGN=71, SUB_ASSIGN=72, MUL_ASSIGN=73, 
		DIV_ASSIGN=74, MOD_ASSIGN=75, CONCAT_ASSIGN=76, AND_ASSIGN=77, OR_ASSIGN=78, 
		XOR_ASSIGN=79, LSHIFT_ASSIGN=80, RSHIFT_ASSIGN=81, POWER=82, INCREMENT=83, 
		DECREMENT=84, EQUAL=85, NOT_EQUAL=86, LTE=87, GTE=88, AND=89, OR=90, LSHIFT=91, 
		RSHIFT=92, ARROW=93, DOUBLE_ARROW=94, DOUBLE_COLON=95, NULL_COALESCE=96, 
		ELLIPSIS=97, PLUS=98, MINUS=99, MUL=100, DIV=101, MOD=102, LT=103, GT=104, 
		ASSIGN=105, NOT=106, BIT_AND=107, BIT_OR=108, BIT_XOR=109, BIT_NOT=110, 
		CONCAT=111, QUESTION=112, COLON=113, AT=114, BACKSLASH=115, LPAREN=116, 
		RPAREN=117, LBRACE=118, RBRACE=119, LBRACKET=120, RBRACKET=121, SEMICOLON=122, 
		COMMA=123, LINE_COMMENT=124, HASH_COMMENT=125, BLOCK_COMMENT=126, WS=127, 
		ERROR_CHAR=128;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_foreachStatement = 2, RULE_classDeclaration = 3, 
		RULE_classMember = 4, RULE_propertyDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_accessModifier = 7, RULE_functionDeclaration = 8, RULE_paramList = 9, 
		RULE_param = 10, RULE_blockStatement = 11, RULE_ifStatement = 12, RULE_whileStatement = 13, 
		RULE_forStatement = 14, RULE_echoStatement = 15, RULE_echoList = 16, RULE_returnStatement = 17, 
		RULE_expressionStatement = 18, RULE_primary = 19, RULE_arrayLiteral = 20, 
		RULE_arrayElements = 21, RULE_arrayElement = 22, RULE_literal = 23, RULE_functionCall = 24, 
		RULE_argumentList = 25, RULE_unaryExpr = 26, RULE_multiplicativeExpr = 27, 
		RULE_additiveExpr = 28, RULE_powerExpr = 29, RULE_comparisonExpr = 30, 
		RULE_logicalExpr = 31, RULE_logicalWordExpr = 32, RULE_assignmentExpr = 33, 
		RULE_assignmentOperator = 34, RULE_expr = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "foreachStatement", "classDeclaration", "classMember", 
			"propertyDeclaration", "methodDeclaration", "accessModifier", "functionDeclaration", 
			"paramList", "param", "blockStatement", "ifStatement", "whileStatement", 
			"forStatement", "echoStatement", "echoList", "returnStatement", "expressionStatement", 
			"primary", "arrayLiteral", "arrayElements", "arrayElement", "literal", 
			"functionCall", "argumentList", "unaryExpr", "multiplicativeExpr", "additiveExpr", 
			"powerExpr", "comparisonExpr", "logicalExpr", "logicalWordExpr", "assignmentExpr", 
			"assignmentOperator", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<?php'", "'?>'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'**='", "'??='", "'==='", 
			"'!=='", "'<=>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'.='", "'&='", 
			"'|='", "'^='", "'<<='", "'>>='", "'**'", "'++'", "'--'", "'=='", "'!='", 
			"'<='", "'>='", "'&&'", "'||'", "'<<'", "'>>'", "'->'", "'=>'", "'::'", 
			"'??'", "'...'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'='", 
			"'!'", "'&'", "'|'", "'^'", "'~'", "'.'", "'?'", "':'", "'@'", "'\\'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PHP_OPEN", "PHP_CLOSE", "IF", "ELSE", "ELSEIF", "SWITCH", "CASE", 
			"DEFAULT", "BREAK", "MATCH", "WHILE", "FOR", "FOREACH", "AS", "DO", "CONTINUE", 
			"FUNCTION", "RETURN", "CLASS", "NEW", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
			"TRAIT", "NAMESPACE", "USE", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", 
			"CONST", "FINAL", "ABSTRACT", "TRY", "CATCH", "FINALLY", "THROW", "INCLUDE", 
			"REQUIRE", "INCLUDE_ONCE", "REQUIRE_ONCE", "ECHO", "PRINT", "TRUE", "FALSE", 
			"NULL", "ARRAY", "LIST", "GLOBAL", "ISSET", "UNSET", "EMPTY", "INSTANCEOF", 
			"AND_WORD", "OR_WORD", "XOR_WORD", "VARIABLE", "ID", "INT_HEX", "INT_BIN", 
			"INT_OCT", "FLOAT", "INT", "STRING", "STRING_SQ", "POWER_ASSIGN", "NULL_COALESCE_ASSIGN", 
			"IDENTICAL", "NOT_IDENTICAL", "SPACESHIP", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "CONCAT_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "POWER", 
			"INCREMENT", "DECREMENT", "EQUAL", "NOT_EQUAL", "LTE", "GTE", "AND", 
			"OR", "LSHIFT", "RSHIFT", "ARROW", "DOUBLE_ARROW", "DOUBLE_COLON", "NULL_COALESCE", 
			"ELLIPSIS", "PLUS", "MINUS", "MUL", "DIV", "MOD", "LT", "GT", "ASSIGN", 
			"NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "CONCAT", "QUESTION", 
			"COLON", "AT", "BACKSLASH", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "COMMA", "LINE_COMMENT", "HASH_COMMENT", "BLOCK_COMMENT", 
			"WS", "ERROR_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PHPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PHPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PHP_OPEN() { return getToken(PHPParser.PHP_OPEN, 0); }
		public TerminalNode EOF() { return getToken(PHPParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode PHP_CLOSE() { return getToken(PHPParser.PHP_CLOSE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PHP_OPEN);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144110790028412920L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 94580041762471939L) != 0)) {
				{
				{
				setState(73);
				statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PHP_CLOSE) {
				{
				setState(79);
				match(PHP_CLOSE);
				}
			}

			setState(82);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ID:
			case INT_HEX:
			case INT_BIN:
			case INT_OCT:
			case FLOAT:
			case INT:
			case STRING:
			case STRING_SQ:
			case INCREMENT:
			case DECREMENT:
			case PLUS:
			case MINUS:
			case NOT:
			case LPAREN:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				expressionStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				returnStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				blockStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				forStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				foreachStatement();
				}
				break;
			case ECHO:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				echoStatement();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				functionDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(PHPParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PHPParser.AS, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(PHPParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(PHPParser.VARIABLE, i);
		}
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DOUBLE_ARROW() { return getToken(PHPParser.DOUBLE_ARROW, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FOREACH);
			setState(97);
			match(LPAREN);
			setState(98);
			expr();
			setState(99);
			match(AS);
			setState(100);
			match(VARIABLE);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_ARROW) {
				{
				setState(101);
				match(DOUBLE_ARROW);
				setState(102);
				match(VARIABLE);
				}
			}

			setState(105);
			match(RPAREN);
			setState(106);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PHPParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(PHPParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(PHPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PHPParser.RBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CLASS);
			setState(109);
			match(ID);
			setState(110);
			match(LBRACE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115189015511040L) != 0)) {
				{
				{
				setState(111);
				classMember();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classMember);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PHPParser.VARIABLE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PHPParser.SEMICOLON, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				setState(123);
				accessModifier();
				}
			}

			setState(126);
			match(VARIABLE);
			setState(127);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PHPParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(PHPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				setState(129);
				accessModifier();
				}
			}

			setState(132);
			match(FUNCTION);
			setState(133);
			match(ID);
			setState(134);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(135);
				paramList();
				}
			}

			setState(138);
			match(RPAREN);
			setState(139);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(PHPParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(PHPParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(PHPParser.PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PHPParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(PHPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FUNCTION);
			setState(144);
			match(ID);
			setState(145);
			match(LPAREN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(146);
				paramList();
				}
			}

			setState(149);
			match(RPAREN);
			setState(150);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PHPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PHPParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			param();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				param();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PHPParser.VARIABLE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PHPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PHPParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LBRACE);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144110790028412920L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 94580041762471939L) != 0)) {
				{
				{
				setState(163);
				statement();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PHPParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PHPParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
			setState(172);
			match(LPAREN);
			setState(173);
			expr();
			setState(174);
			match(RPAREN);
			setState(175);
			statement();
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(176);
				match(ELSE);
				setState(177);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PHPParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			match(LPAREN);
			setState(182);
			expr();
			setState(183);
			match(RPAREN);
			setState(184);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PHPParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PHPParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PHPParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(FOR);
			setState(187);
			match(LPAREN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & -8646341737326837249L) != 0)) {
				{
				setState(188);
				expr();
				}
			}

			setState(191);
			match(SEMICOLON);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & -8646341737326837249L) != 0)) {
				{
				setState(192);
				expr();
				}
			}

			setState(195);
			match(SEMICOLON);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & -8646341737326837249L) != 0)) {
				{
				setState(196);
				expr();
				}
			}

			setState(199);
			match(RPAREN);
			setState(200);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode ECHO() { return getToken(PHPParser.ECHO, 0); }
		public EchoListContext echoList() {
			return getRuleContext(EchoListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PHPParser.SEMICOLON, 0); }
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ECHO);
			setState(203);
			echoList();
			setState(204);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EchoListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(PHPParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(PHPParser.CONCAT, i);
		}
		public EchoListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoList; }
	}

	public final EchoListContext echoList() throws RecognitionException {
		EchoListContext _localctx = new EchoListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_echoList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expr();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(207);
				match(CONCAT);
				setState(208);
				expr();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PHPParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PHPParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RETURN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & -8646341737326837249L) != 0)) {
				{
				setState(215);
				expr();
				}
			}

			setState(218);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PHPParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expr();
			setState(221);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PHPParser.VARIABLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(VARIABLE);
				}
				break;
			case INT_HEX:
			case INT_BIN:
			case INT_OCT:
			case FLOAT:
			case INT:
			case STRING:
			case STRING_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				functionCall();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				arrayLiteral();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(LPAREN);
				setState(228);
				expr();
				setState(229);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PHPParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PHPParser.RBRACKET, 0); }
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LBRACKET);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & -8646341737326837249L) != 0)) {
				{
				setState(234);
				arrayElements();
				}
			}

			setState(237);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PHPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PHPParser.COMMA, i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			arrayElement();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				arrayElement();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOUBLE_ARROW() { return getToken(PHPParser.DOUBLE_ARROW, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayElement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				expr();
				setState(248);
				match(DOUBLE_ARROW);
				setState(249);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PHPParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PHPParser.FLOAT, 0); }
		public TerminalNode INT_HEX() { return getToken(PHPParser.INT_HEX, 0); }
		public TerminalNode INT_BIN() { return getToken(PHPParser.INT_BIN, 0); }
		public TerminalNode INT_OCT() { return getToken(PHPParser.INT_OCT, 0); }
		public TerminalNode STRING() { return getToken(PHPParser.STRING, 0); }
		public TerminalNode STRING_SQ() { return getToken(PHPParser.STRING_SQ, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 127L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PHPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PHPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PHPParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(LPAREN);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & -8646341737326837249L) != 0)) {
				{
				setState(258);
				argumentList();
				}
			}

			setState(261);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PHPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PHPParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expr();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				expr();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PHPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PHPParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(PHPParser.NOT, 0); }
		public TerminalNode INCREMENT() { return getToken(PHPParser.INCREMENT, 0); }
		public TerminalNode VARIABLE() { return getToken(PHPParser.VARIABLE, 0); }
		public TerminalNode DECREMENT() { return getToken(PHPParser.DECREMENT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExpr);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 259L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(INCREMENT);
				setState(274);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(DECREMENT);
				setState(276);
				match(VARIABLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(VARIABLE);
				setState(278);
				match(INCREMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				match(VARIABLE);
				setState(280);
				match(DECREMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(PHPParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(PHPParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PHPParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PHPParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(PHPParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(PHPParser.MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			unaryExpr();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 7L) != 0)) {
				{
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				unaryExpr();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PHPParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PHPParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PHPParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PHPParser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			multiplicativeExpr();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				multiplicativeExpr();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode POWER() { return getToken(PHPParser.POWER, 0); }
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public PowerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpr; }
	}

	public final PowerExprContext powerExpr() throws RecognitionException {
		PowerExprContext _localctx = new PowerExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_powerExpr);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				unaryExpr();
				setState(302);
				match(POWER);
				setState(303);
				powerExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(PHPParser.LT, 0); }
		public TerminalNode GT() { return getToken(PHPParser.GT, 0); }
		public TerminalNode LTE() { return getToken(PHPParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(PHPParser.GTE, 0); }
		public TerminalNode EQUAL() { return getToken(PHPParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PHPParser.NOT_EQUAL, 0); }
		public TerminalNode IDENTICAL() { return getToken(PHPParser.IDENTICAL, 0); }
		public TerminalNode NOT_IDENTICAL() { return getToken(PHPParser.NOT_IDENTICAL, 0); }
		public TerminalNode SPACESHIP() { return getToken(PHPParser.SPACESHIP, 0); }
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			additiveExpr();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 103081181191L) != 0)) {
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 103081181191L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				additiveExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExprContext extends ParserRuleContext {
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PHPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PHPParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(PHPParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PHPParser.OR, i);
		}
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logicalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			comparisonExpr();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				comparisonExpr();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalWordExprContext extends ParserRuleContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public List<TerminalNode> AND_WORD() { return getTokens(PHPParser.AND_WORD); }
		public TerminalNode AND_WORD(int i) {
			return getToken(PHPParser.AND_WORD, i);
		}
		public List<TerminalNode> OR_WORD() { return getTokens(PHPParser.OR_WORD); }
		public TerminalNode OR_WORD(int i) {
			return getToken(PHPParser.OR_WORD, i);
		}
		public List<TerminalNode> XOR_WORD() { return getTokens(PHPParser.XOR_WORD); }
		public TerminalNode XOR_WORD(int i) {
			return getToken(PHPParser.XOR_WORD, i);
		}
		public LogicalWordExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalWordExpr; }
	}

	public final LogicalWordExprContext logicalWordExpr() throws RecognitionException {
		LogicalWordExprContext _localctx = new LogicalWordExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logicalWordExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			logicalExpr();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0)) {
				{
				{
				setState(321);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				logicalExpr();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PHPParser.VARIABLE, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public LogicalWordExprContext logicalWordExpr() {
			return getRuleContext(LogicalWordExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignmentExpr);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(VARIABLE);
				setState(329);
				assignmentOperator();
				setState(330);
				assignmentExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				logicalWordExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PHPParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(PHPParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PHPParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(PHPParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PHPParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PHPParser.MOD_ASSIGN, 0); }
		public TerminalNode CONCAT_ASSIGN() { return getToken(PHPParser.CONCAT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(PHPParser.POWER_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(PHPParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(PHPParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(PHPParser.XOR_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(PHPParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(PHPParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode NULL_COALESCE_ASSIGN() { return getToken(PHPParser.NULL_COALESCE_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 549755879395L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			assignmentExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000"+
		"\f\u0000N\t\u0000\u0001\u0000\u0003\u0000Q\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003q\b\u0003"+
		"\n\u0003\f\u0003t\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004z\b\u0004\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0094\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u009c\b\t\n\t\f\t\u009f\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00a5\b\u000b\n\u000b\f\u000b\u00a8\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00b3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00be\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00c2\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c6\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d2"+
		"\b\u0010\n\u0010\f\u0010\u00d5\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00d9\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00ec\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00f3\b\u0015\n\u0015\f\u0015\u00f6\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fd"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0104\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u010b\b\u0019\n\u0019\f\u0019\u010e\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u011b\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0120\b\u001b\n\u001b"+
		"\f\u001b\u0123\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0128\b\u001c\n\u001c\f\u001c\u012b\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0132\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0137\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u013c\b\u001f\n\u001f\f\u001f\u013f\t\u001f\u0001 "+
		"\u0001 \u0001 \u0005 \u0144\b \n \f \u0147\t \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u014e\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0000\u0000"+
		"$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\t\u0001\u0000\u001b\u001d\u0001"+
		"\u0000;A\u0002\u0000bcjj\u0001\u0000df\u0001\u0000bc\u0003\u0000DFUXg"+
		"h\u0001\u0000YZ\u0001\u000068\u0003\u0000BCGQii\u015e\u0000H\u0001\u0000"+
		"\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000"+
		"\u0006l\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000\u0000\n|\u0001\u0000"+
		"\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000"+
		"\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000"+
		"\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000"+
		"\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000"+
		"\u0000\u001c\u00ba\u0001\u0000\u0000\u0000\u001e\u00ca\u0001\u0000\u0000"+
		"\u0000 \u00ce\u0001\u0000\u0000\u0000\"\u00d6\u0001\u0000\u0000\u0000"+
		"$\u00dc\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00e9"+
		"\u0001\u0000\u0000\u0000*\u00ef\u0001\u0000\u0000\u0000,\u00fc\u0001\u0000"+
		"\u0000\u0000.\u00fe\u0001\u0000\u0000\u00000\u0100\u0001\u0000\u0000\u0000"+
		"2\u0107\u0001\u0000\u0000\u00004\u011a\u0001\u0000\u0000\u00006\u011c"+
		"\u0001\u0000\u0000\u00008\u0124\u0001\u0000\u0000\u0000:\u0131\u0001\u0000"+
		"\u0000\u0000<\u0133\u0001\u0000\u0000\u0000>\u0138\u0001\u0000\u0000\u0000"+
		"@\u0140\u0001\u0000\u0000\u0000B\u014d\u0001\u0000\u0000\u0000D\u014f"+
		"\u0001\u0000\u0000\u0000F\u0151\u0001\u0000\u0000\u0000HL\u0005\u0001"+
		"\u0000\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0005\u0002\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000"+
		"T_\u0003$\u0012\u0000U_\u0003\u0018\f\u0000V_\u0003\u001a\r\u0000W_\u0003"+
		"\"\u0011\u0000X_\u0003\u0016\u000b\u0000Y_\u0003\u001c\u000e\u0000Z_\u0003"+
		"\u0004\u0002\u0000[_\u0003\u001e\u000f\u0000\\_\u0003\u0010\b\u0000]_"+
		"\u0003\u0006\u0003\u0000^T\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000"+
		"\u0000^V\u0001\u0000\u0000\u0000^W\u0001\u0000\u0000\u0000^X\u0001\u0000"+
		"\u0000\u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"_\u0003\u0001\u0000\u0000\u0000`a\u0005\r\u0000\u0000ab\u0005t\u0000\u0000"+
		"bc\u0003F#\u0000cd\u0005\u000e\u0000\u0000dg\u00059\u0000\u0000ef\u0005"+
		"^\u0000\u0000fh\u00059\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005u\u0000\u0000jk\u0003\u0002"+
		"\u0001\u0000k\u0005\u0001\u0000\u0000\u0000lm\u0005\u0013\u0000\u0000"+
		"mn\u0005:\u0000\u0000nr\u0005v\u0000\u0000oq\u0003\b\u0004\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uv\u0005w\u0000\u0000v\u0007\u0001\u0000\u0000\u0000wz\u0003\n\u0005"+
		"\u0000xz\u0003\f\u0006\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z\t\u0001\u0000\u0000\u0000{}\u0003\u000e\u0007\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u00059\u0000\u0000\u007f\u0080\u0005z\u0000\u0000\u0080\u000b\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0003\u000e\u0007\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086\u0005:\u0000"+
		"\u0000\u0086\u0088\u0005t\u0000\u0000\u0087\u0089\u0003\u0012\t\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005u\u0000\u0000\u008b"+
		"\u008c\u0003\u0016\u000b\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0007\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0011\u0000\u0000\u0090\u0091\u0005:\u0000\u0000\u0091\u0093\u0005"+
		"t\u0000\u0000\u0092\u0094\u0003\u0012\t\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005u\u0000\u0000\u0096\u0097\u0003\u0016\u000b"+
		"\u0000\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u009d\u0003\u0014\n\u0000"+
		"\u0099\u009a\u0005{\u0000\u0000\u009a\u009c\u0003\u0014\n\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u0013\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u00059\u0000\u0000\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a6"+
		"\u0005v\u0000\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"w\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0003"+
		"\u0000\u0000\u00ac\u00ad\u0005t\u0000\u0000\u00ad\u00ae\u0003F#\u0000"+
		"\u00ae\u00af\u0005u\u0000\u0000\u00af\u00b2\u0003\u0002\u0001\u0000\u00b0"+
		"\u00b1\u0005\u0004\u0000\u0000\u00b1\u00b3\u0003\u0002\u0001\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u0019\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u000b\u0000\u0000\u00b5"+
		"\u00b6\u0005t\u0000\u0000\u00b6\u00b7\u0003F#\u0000\u00b7\u00b8\u0005"+
		"u\u0000\u0000\u00b8\u00b9\u0003\u0002\u0001\u0000\u00b9\u001b\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\f\u0000\u0000\u00bb\u00bd\u0005t\u0000"+
		"\u0000\u00bc\u00be\u0003F#\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0005z\u0000\u0000\u00c0\u00c2\u0003F#\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0005z\u0000\u0000\u00c4\u00c6\u0003F#"+
		"\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005u\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0002\u0001\u0000\u00c9\u001d\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005*\u0000\u0000\u00cb\u00cc\u0003 \u0010\u0000\u00cc\u00cd"+
		"\u0005z\u0000\u0000\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce\u00d3\u0003"+
		"F#\u0000\u00cf\u00d0\u0005o\u0000\u0000\u00d0\u00d2\u0003F#\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"!\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0005\u0012\u0000\u0000\u00d7\u00d9\u0003F#\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005z\u0000\u0000\u00db#\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0003F#\u0000\u00dd\u00de\u0005z\u0000\u0000\u00de%\u0001"+
		"\u0000\u0000\u0000\u00df\u00e8\u00059\u0000\u0000\u00e0\u00e8\u0003.\u0017"+
		"\u0000\u00e1\u00e8\u00030\u0018\u0000\u00e2\u00e8\u0003(\u0014\u0000\u00e3"+
		"\u00e4\u0005t\u0000\u0000\u00e4\u00e5\u0003F#\u0000\u00e5\u00e6\u0005"+
		"u\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005x\u0000"+
		"\u0000\u00ea\u00ec\u0003*\u0015\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005y\u0000\u0000\u00ee)\u0001\u0000\u0000\u0000\u00ef\u00f4"+
		"\u0003,\u0016\u0000\u00f0\u00f1\u0005{\u0000\u0000\u00f1\u00f3\u0003,"+
		"\u0016\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5+\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0003F#\u0000\u00f8\u00f9\u0005^\u0000\u0000\u00f9"+
		"\u00fa\u0003F#\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00fd\u0003"+
		"F#\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd-\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0001\u0000\u0000"+
		"\u00ff/\u0001\u0000\u0000\u0000\u0100\u0101\u0005:\u0000\u0000\u0101\u0103"+
		"\u0005t\u0000\u0000\u0102\u0104\u00032\u0019\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005u\u0000\u0000\u01061\u0001\u0000\u0000\u0000"+
		"\u0107\u010c\u0003F#\u0000\u0108\u0109\u0005{\u0000\u0000\u0109\u010b"+
		"\u0003F#\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d3\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0007\u0002\u0000\u0000\u0110\u011b\u00034\u001a\u0000"+
		"\u0111\u0112\u0005S\u0000\u0000\u0112\u011b\u00059\u0000\u0000\u0113\u0114"+
		"\u0005T\u0000\u0000\u0114\u011b\u00059\u0000\u0000\u0115\u0116\u00059"+
		"\u0000\u0000\u0116\u011b\u0005S\u0000\u0000\u0117\u0118\u00059\u0000\u0000"+
		"\u0118\u011b\u0005T\u0000\u0000\u0119\u011b\u0003&\u0013\u0000\u011a\u010f"+
		"\u0001\u0000\u0000\u0000\u011a\u0111\u0001\u0000\u0000\u0000\u011a\u0113"+
		"\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b5\u0001"+
		"\u0000\u0000\u0000\u011c\u0121\u00034\u001a\u0000\u011d\u011e\u0007\u0003"+
		"\u0000\u0000\u011e\u0120\u00034\u001a\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u01227\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0129\u00036\u001b\u0000\u0125"+
		"\u0126\u0007\u0004\u0000\u0000\u0126\u0128\u00036\u001b\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a9\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u0132\u0003"+
		"4\u001a\u0000\u012d\u012e\u00034\u001a\u0000\u012e\u012f\u0005R\u0000"+
		"\u0000\u012f\u0130\u0003:\u001d\u0000\u0130\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u012c\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000"+
		"\u0132;\u0001\u0000\u0000\u0000\u0133\u0136\u00038\u001c\u0000\u0134\u0135"+
		"\u0007\u0005\u0000\u0000\u0135\u0137\u00038\u001c\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137=\u0001\u0000"+
		"\u0000\u0000\u0138\u013d\u0003<\u001e\u0000\u0139\u013a\u0007\u0006\u0000"+
		"\u0000\u013a\u013c\u0003<\u001e\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e?\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u0140\u0145\u0003>\u001f\u0000\u0141\u0142"+
		"\u0007\u0007\u0000\u0000\u0142\u0144\u0003>\u001f\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146A\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u00059\u0000"+
		"\u0000\u0149\u014a\u0003D\"\u0000\u014a\u014b\u0003B!\u0000\u014b\u014e"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0003@ \u0000\u014d\u0148\u0001\u0000"+
		"\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014eC\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0007\b\u0000\u0000\u0150E\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0003B!\u0000\u0152G\u0001\u0000\u0000\u0000 LP^gry|\u0082"+
		"\u0088\u0093\u009d\u00a6\u00b2\u00bd\u00c1\u00c5\u00d3\u00d8\u00e7\u00eb"+
		"\u00f4\u00fc\u0103\u010c\u011a\u0121\u0129\u0131\u0136\u013d\u0145\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}