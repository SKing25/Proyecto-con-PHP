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
		BREAK=9, MATCH=10, WHILE=11, FOR=12, FOREACH=13, DO=14, CONTINUE=15, FUNCTION=16, 
		RETURN=17, CLASS=18, NEW=19, EXTENDS=20, IMPLEMENTS=21, INTERFACE=22, 
		TRAIT=23, NAMESPACE=24, USE=25, PUBLIC=26, PRIVATE=27, PROTECTED=28, STATIC=29, 
		CONST=30, FINAL=31, ABSTRACT=32, TRY=33, CATCH=34, FINALLY=35, THROW=36, 
		INCLUDE=37, REQUIRE=38, INCLUDE_ONCE=39, REQUIRE_ONCE=40, ECHO=41, PRINT=42, 
		TRUE=43, FALSE=44, NULL=45, ARRAY=46, LIST=47, GLOBAL=48, ISSET=49, UNSET=50, 
		EMPTY=51, INSTANCEOF=52, AND_WORD=53, OR_WORD=54, XOR_WORD=55, VARIABLE=56, 
		ID=57, INT_HEX=58, INT_BIN=59, INT_OCT=60, FLOAT=61, INT=62, STRING=63, 
		STRING_SQ=64, POWER_ASSIGN=65, NULL_COALESCE_ASSIGN=66, IDENTICAL=67, 
		NOT_IDENTICAL=68, SPACESHIP=69, ADD_ASSIGN=70, SUB_ASSIGN=71, MUL_ASSIGN=72, 
		DIV_ASSIGN=73, MOD_ASSIGN=74, CONCAT_ASSIGN=75, AND_ASSIGN=76, OR_ASSIGN=77, 
		XOR_ASSIGN=78, LSHIFT_ASSIGN=79, RSHIFT_ASSIGN=80, POWER=81, INCREMENT=82, 
		DECREMENT=83, EQUAL=84, NOT_EQUAL=85, LTE=86, GTE=87, AND=88, OR=89, LSHIFT=90, 
		RSHIFT=91, ARROW=92, DOUBLE_ARROW=93, DOUBLE_COLON=94, NULL_COALESCE=95, 
		ELLIPSIS=96, PLUS=97, MINUS=98, MUL=99, DIV=100, MOD=101, LT=102, GT=103, 
		ASSIGN=104, NOT=105, BIT_AND=106, BIT_OR=107, BIT_XOR=108, BIT_NOT=109, 
		CONCAT=110, QUESTION=111, COLON=112, AT=113, BACKSLASH=114, LPAREN=115, 
		RPAREN=116, LBRACE=117, RBRACE=118, LBRACKET=119, RBRACKET=120, SEMICOLON=121, 
		COMMA=122, LINE_COMMENT=123, HASH_COMMENT=124, BLOCK_COMMENT=125, WS=126, 
		ERROR_CHAR=127;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_blockStatement = 2, RULE_ifStatement = 3, 
		RULE_whileStatement = 4, RULE_forStatement = 5, RULE_echoStatement = 6, 
		RULE_echoList = 7, RULE_returnStatement = 8, RULE_expressionStatement = 9, 
		RULE_primary = 10, RULE_literal = 11, RULE_functionCall = 12, RULE_argumentList = 13, 
		RULE_unaryExpr = 14, RULE_multiplicativeExpr = 15, RULE_additiveExpr = 16, 
		RULE_powerExpr = 17, RULE_comparisonExpr = 18, RULE_logicalExpr = 19, 
		RULE_logicalWordExpr = 20, RULE_assignmentExpr = 21, RULE_assignmentOperator = 22, 
		RULE_expr = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "blockStatement", "ifStatement", "whileStatement", 
			"forStatement", "echoStatement", "echoList", "returnStatement", "expressionStatement", 
			"primary", "literal", "functionCall", "argumentList", "unaryExpr", "multiplicativeExpr", 
			"additiveExpr", "powerExpr", "comparisonExpr", "logicalExpr", "logicalWordExpr", 
			"assignmentExpr", "assignmentOperator", "expr"
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
			null, null, null, null, null, null, "'**='", "'??='", "'==='", "'!=='", 
			"'<=>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'.='", "'&='", "'|='", 
			"'^='", "'<<='", "'>>='", "'**'", "'++'", "'--'", "'=='", "'!='", "'<='", 
			"'>='", "'&&'", "'||'", "'<<'", "'>>'", "'->'", "'=>'", "'::'", "'??'", 
			"'...'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'='", "'!'", 
			"'&'", "'|'", "'^'", "'~'", "'.'", "'?'", "':'", "'@'", "'\\'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PHP_OPEN", "PHP_CLOSE", "IF", "ELSE", "ELSEIF", "SWITCH", "CASE", 
			"DEFAULT", "BREAK", "MATCH", "WHILE", "FOR", "FOREACH", "DO", "CONTINUE", 
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
			setState(48);
			match(PHP_OPEN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72055395014535160L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 11261223862272001L) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PHP_CLOSE) {
				{
				setState(55);
				match(PHP_CLOSE);
				}
			}

			setState(58);
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
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
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
			setState(67);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				expressionStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				returnStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				blockStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				forStatement();
				}
				break;
			case ECHO:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				echoStatement();
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
		enterRule(_localctx, 4, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LBRACE);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72055395014535160L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 11261223862272001L) != 0)) {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			match(LPAREN);
			setState(80);
			expr();
			setState(81);
			match(RPAREN);
			setState(82);
			statement();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				match(ELSE);
				setState(84);
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
		enterRule(_localctx, 8, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(WHILE);
			setState(88);
			match(LPAREN);
			setState(89);
			expr();
			setState(90);
			match(RPAREN);
			setState(91);
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
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FOR);
			setState(94);
			match(LPAREN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299527938559L) != 0)) {
				{
				setState(95);
				expr();
				}
			}

			setState(98);
			match(SEMICOLON);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299527938559L) != 0)) {
				{
				setState(99);
				expr();
				}
			}

			setState(102);
			match(SEMICOLON);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299527938559L) != 0)) {
				{
				setState(103);
				expr();
				}
			}

			setState(106);
			match(RPAREN);
			setState(107);
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
		enterRule(_localctx, 12, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ECHO);
			setState(110);
			echoList();
			setState(111);
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
		enterRule(_localctx, 14, RULE_echoList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expr();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(114);
				match(CONCAT);
				setState(115);
				expr();
				}
				}
				setState(120);
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
		enterRule(_localctx, 16, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(RETURN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299527938559L) != 0)) {
				{
				setState(122);
				expr();
				}
			}

			setState(125);
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
		enterRule(_localctx, 18, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			expr();
			setState(128);
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
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
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
				setState(131);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				functionCall();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(LPAREN);
				setState(134);
				expr();
				setState(135);
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
		enterRule(_localctx, 22, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 127L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(LPAREN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299527938559L) != 0)) {
				{
				setState(143);
				argumentList();
				}
			}

			setState(146);
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
		enterRule(_localctx, 26, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				expr();
				}
				}
				setState(155);
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
		enterRule(_localctx, 28, RULE_unaryExpr);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 259L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(INCREMENT);
				setState(159);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(DECREMENT);
				setState(161);
				match(VARIABLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(VARIABLE);
				setState(163);
				match(INCREMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(VARIABLE);
				setState(165);
				match(DECREMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
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
		enterRule(_localctx, 30, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			unaryExpr();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0)) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				unaryExpr();
				}
				}
				setState(176);
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
		enterRule(_localctx, 32, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			multiplicativeExpr();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				multiplicativeExpr();
				}
				}
				setState(184);
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
		enterRule(_localctx, 34, RULE_powerExpr);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				unaryExpr();
				setState(187);
				match(POWER);
				setState(188);
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
		enterRule(_localctx, 36, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			additiveExpr();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 103081181191L) != 0)) {
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 103081181191L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
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
		enterRule(_localctx, 38, RULE_logicalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			comparisonExpr();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				comparisonExpr();
				}
				}
				setState(204);
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
		enterRule(_localctx, 40, RULE_logicalWordExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			logicalExpr();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0)) {
				{
				{
				setState(206);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				logicalExpr();
				}
				}
				setState(212);
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
		enterRule(_localctx, 42, RULE_assignmentExpr);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(VARIABLE);
				setState(214);
				assignmentOperator();
				setState(215);
				assignmentExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
		enterRule(_localctx, 44, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 549755879395L) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		"\u0004\u0001\u007f\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001"+
		"\u0000\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0003"+
		"\u00009\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005e\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007"+
		"\n\u0007\f\u0007x\t\u0007\u0001\b\u0001\b\u0003\b|\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u008a\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0091\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u0098"+
		"\b\r\n\r\f\r\u009b\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00ad\b\u000f\n\u000f\f\u000f\u00b0\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00b5\b\u0010\n\u0010\f\u0010\u00b8\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00bf\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c4\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c9\b\u0013\n"+
		"\u0013\f\u0013\u00cc\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00d1\b\u0014\n\u0014\f\u0014\u00d4\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00db\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.\u0000\b\u0001\u0000:@\u0002\u0000abii\u0001\u0000ce\u0001"+
		"\u0000ab\u0003\u0000CETWfg\u0001\u0000XY\u0001\u000057\u0003\u0000ABF"+
		"Phh\u00e8\u00000\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000"+
		"\u0004E\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bW\u0001"+
		"\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000"+
		"\u000eq\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012\u007f"+
		"\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u008b"+
		"\u0001\u0000\u0000\u0000\u0018\u008d\u0001\u0000\u0000\u0000\u001a\u0094"+
		"\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00a9"+
		"\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00be\u0001"+
		"\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00c5\u0001\u0000\u0000"+
		"\u0000(\u00cd\u0001\u0000\u0000\u0000*\u00da\u0001\u0000\u0000\u0000,"+
		"\u00dc\u0001\u0000\u0000\u0000.\u00de\u0001\u0000\u0000\u000004\u0005"+
		"\u0001\u0000\u000013\u0003\u0002\u0001\u000021\u0001\u0000\u0000\u0000"+
		"36\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000079\u0005\u0002"+
		"\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001;\u0001\u0001\u0000\u0000"+
		"\u0000<D\u0003\u0012\t\u0000=D\u0003\u0006\u0003\u0000>D\u0003\b\u0004"+
		"\u0000?D\u0003\u0010\b\u0000@D\u0003\u0004\u0002\u0000AD\u0003\n\u0005"+
		"\u0000BD\u0003\f\u0006\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000"+
		"\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0003"+
		"\u0001\u0000\u0000\u0000EI\u0005u\u0000\u0000FH\u0003\u0002\u0001\u0000"+
		"GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0005v\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0005"+
		"\u0003\u0000\u0000OP\u0005s\u0000\u0000PQ\u0003.\u0017\u0000QR\u0005t"+
		"\u0000\u0000RU\u0003\u0002\u0001\u0000ST\u0005\u0004\u0000\u0000TV\u0003"+
		"\u0002\u0001\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u0007\u0001\u0000\u0000\u0000WX\u0005\u000b\u0000\u0000XY\u0005s\u0000"+
		"\u0000YZ\u0003.\u0017\u0000Z[\u0005t\u0000\u0000[\\\u0003\u0002\u0001"+
		"\u0000\\\t\u0001\u0000\u0000\u0000]^\u0005\f\u0000\u0000^`\u0005s\u0000"+
		"\u0000_a\u0003.\u0017\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0005y\u0000\u0000ce\u0003.\u0017\u0000"+
		"dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0005y\u0000\u0000gi\u0003.\u0017\u0000hg\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005t\u0000\u0000"+
		"kl\u0003\u0002\u0001\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005)\u0000"+
		"\u0000no\u0003\u000e\u0007\u0000op\u0005y\u0000\u0000p\r\u0001\u0000\u0000"+
		"\u0000qv\u0003.\u0017\u0000rs\u0005n\u0000\u0000su\u0003.\u0017\u0000"+
		"tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w\u000f\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000y{\u0005\u0011\u0000\u0000z|\u0003.\u0017\u0000{z\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0005y\u0000\u0000~\u0011\u0001\u0000\u0000\u0000\u007f\u0080\u0003"+
		".\u0017\u0000\u0080\u0081\u0005y\u0000\u0000\u0081\u0013\u0001\u0000\u0000"+
		"\u0000\u0082\u008a\u00058\u0000\u0000\u0083\u008a\u0003\u0016\u000b\u0000"+
		"\u0084\u008a\u0003\u0018\f\u0000\u0085\u0086\u0005s\u0000\u0000\u0086"+
		"\u0087\u0003.\u0017\u0000\u0087\u0088\u0005t\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001"+
		"\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001"+
		"\u0000\u0000\u0000\u008a\u0015\u0001\u0000\u0000\u0000\u008b\u008c\u0007"+
		"\u0000\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"9\u0000\u0000\u008e\u0090\u0005s\u0000\u0000\u008f\u0091\u0003\u001a\r"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005t\u0000\u0000"+
		"\u0093\u0019\u0001\u0000\u0000\u0000\u0094\u0099\u0003.\u0017\u0000\u0095"+
		"\u0096\u0005z\u0000\u0000\u0096\u0098\u0003.\u0017\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u001b\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0007"+
		"\u0001\u0000\u0000\u009d\u00a8\u0003\u001c\u000e\u0000\u009e\u009f\u0005"+
		"R\u0000\u0000\u009f\u00a8\u00058\u0000\u0000\u00a0\u00a1\u0005S\u0000"+
		"\u0000\u00a1\u00a8\u00058\u0000\u0000\u00a2\u00a3\u00058\u0000\u0000\u00a3"+
		"\u00a8\u0005R\u0000\u0000\u00a4\u00a5\u00058\u0000\u0000\u00a5\u00a8\u0005"+
		"S\u0000\u0000\u00a6\u00a8\u0003\u0014\n\u0000\u00a7\u009c\u0001\u0000"+
		"\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u001d\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ae\u0003\u001c\u000e\u0000\u00aa\u00ab\u0007\u0002"+
		"\u0000\u0000\u00ab\u00ad\u0003\u001c\u000e\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u001f\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003\u001e"+
		"\u000f\u0000\u00b2\u00b3\u0007\u0003\u0000\u0000\u00b3\u00b5\u0003\u001e"+
		"\u000f\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7!\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bf\u0003\u001c\u000e\u0000\u00ba\u00bb\u0003\u001c\u000e"+
		"\u0000\u00bb\u00bc\u0005Q\u0000\u0000\u00bc\u00bd\u0003\"\u0011\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000"+
		"\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0003 \u0010\u0000\u00c1\u00c2\u0007\u0004\u0000\u0000\u00c2\u00c4"+
		"\u0003 \u0010\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4%\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003$\u0012"+
		"\u0000\u00c6\u00c7\u0007\u0005\u0000\u0000\u00c7\u00c9\u0003$\u0012\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\'\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d2\u0003&\u0013\u0000\u00ce\u00cf\u0007\u0006\u0000\u0000\u00cf\u00d1"+
		"\u0003&\u0013\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3)\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u00058\u0000\u0000\u00d6\u00d7\u0003,\u0016\u0000"+
		"\u00d7\u00d8\u0003*\u0015\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0003(\u0014\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00dd\u0007"+
		"\u0007\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000\u00de\u00df\u0003*\u0015"+
		"\u0000\u00df/\u0001\u0000\u0000\u0000\u001548CIU`dhv{\u0089\u0090\u0099"+
		"\u00a7\u00ae\u00b6\u00be\u00c3\u00ca\u00d2\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}