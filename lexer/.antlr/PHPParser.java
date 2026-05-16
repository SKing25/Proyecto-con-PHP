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
		RULE_whileStatement = 4, RULE_returnStatement = 5, RULE_expressionStatement = 6, 
		RULE_primary = 7, RULE_literal = 8, RULE_functionCall = 9, RULE_argumentList = 10, 
		RULE_unaryExpr = 11, RULE_multiplicativeExpr = 12, RULE_additiveExpr = 13, 
		RULE_powerExpr = 14, RULE_comparisonExpr = 15, RULE_logicalExpr = 16, 
		RULE_logicalWordExpr = 17, RULE_assignmentExpr = 18, RULE_assignmentOperator = 19, 
		RULE_expr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "blockStatement", "ifStatement", "whileStatement", 
			"returnStatement", "expressionStatement", "primary", "literal", "functionCall", 
			"argumentList", "unaryExpr", "multiplicativeExpr", "additiveExpr", "powerExpr", 
			"comparisonExpr", "logicalExpr", "logicalWordExpr", "assignmentExpr", 
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
		public TerminalNode EOF() { return getToken(PHPParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72057594037794808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 11261223861485569L) != 0)) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
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
			case PLUS:
			case MINUS:
			case NOT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				expressionStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				returnStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				blockStatement();
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
			setState(57);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72057594037794808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 11261223861485569L) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
			setState(66);
			match(IF);
			setState(67);
			match(LPAREN);
			setState(68);
			expr();
			setState(69);
			match(RPAREN);
			setState(70);
			statement();
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				match(ELSE);
				setState(72);
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
			setState(75);
			match(WHILE);
			setState(76);
			match(LPAREN);
			setState(77);
			expr();
			setState(78);
			match(RPAREN);
			setState(79);
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
		enterRule(_localctx, 10, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(RETURN);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299326611967L) != 0)) {
				{
				setState(82);
				expr();
				}
			}

			setState(85);
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
		enterRule(_localctx, 12, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expr();
			setState(88);
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
		enterRule(_localctx, 14, RULE_primary);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
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
				setState(91);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				functionCall();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(LPAREN);
				setState(94);
				expr();
				setState(95);
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
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			setState(102);
			match(LPAREN);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 577030299326611967L) != 0)) {
				{
				setState(103);
				argumentList();
				}
			}

			setState(106);
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
		enterRule(_localctx, 20, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expr();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				expr();
				}
				}
				setState(115);
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
		enterRule(_localctx, 22, RULE_unaryExpr);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 259L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				unaryExpr();
				}
				break;
			case VARIABLE:
			case ID:
			case INT_HEX:
			case INT_BIN:
			case INT_OCT:
			case FLOAT:
			case INT:
			case STRING:
			case STRING_SQ:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				primary();
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
		enterRule(_localctx, 24, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			unaryExpr();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0)) {
				{
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				unaryExpr();
				}
				}
				setState(128);
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
		enterRule(_localctx, 26, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			multiplicativeExpr();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				multiplicativeExpr();
				}
				}
				setState(136);
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
		enterRule(_localctx, 28, RULE_powerExpr);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				unaryExpr();
				setState(139);
				match(POWER);
				setState(140);
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
		enterRule(_localctx, 30, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			additiveExpr();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 103081181191L) != 0)) {
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 103081181191L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
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
		enterRule(_localctx, 32, RULE_logicalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			comparisonExpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				comparisonExpr();
				}
				}
				setState(156);
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
		enterRule(_localctx, 34, RULE_logicalWordExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			logicalExpr();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0)) {
				{
				{
				setState(158);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				logicalExpr();
				}
				}
				setState(164);
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
		enterRule(_localctx, 36, RULE_assignmentExpr);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(VARIABLE);
				setState(166);
				assignmentOperator();
				setState(167);
				assignmentExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
		enterRule(_localctx, 38, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		enterRule(_localctx, 40, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		"\u0004\u0001\u007f\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005"+
		"\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007b\b\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\ti\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\np\b\n\n\n\f\ns\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bx\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f}\b\f\n\f\f"+
		"\f\u0080\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0085\b\r\n\r\f\r\u0088\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u008f\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0094\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0099\b\u0010\n"+
		"\u0010\f\u0010\u009c\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00a1\b\u0011\n\u0011\f\u0011\u00a4\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ab\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(\u0000\b\u0001\u0000:@\u0002\u0000abii\u0001\u0000ce\u0001"+
		"\u0000ab\u0003\u0000CETWfg\u0001\u0000XY\u0001\u000057\u0003\u0000ABF"+
		"Phh\u00b0\u0000-\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bK\u0001"+
		"\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000"+
		"\u000ea\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012e"+
		"\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016w\u0001\u0000"+
		"\u0000\u0000\u0018y\u0001\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000"+
		"\u0000\u001c\u008e\u0001\u0000\u0000\u0000\u001e\u0090\u0001\u0000\u0000"+
		"\u0000 \u0095\u0001\u0000\u0000\u0000\"\u009d\u0001\u0000\u0000\u0000"+
		"$\u00aa\u0001\u0000\u0000\u0000&\u00ac\u0001\u0000\u0000\u0000(\u00ae"+
		"\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005"+
		"\u0000\u0000\u00011\u0001\u0001\u0000\u0000\u000028\u0003\f\u0006\u0000"+
		"38\u0003\u0006\u0003\u000048\u0003\b\u0004\u000058\u0003\n\u0005\u0000"+
		"68\u0003\u0004\u0002\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000"+
		"\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008\u0003\u0001\u0000\u0000\u00009=\u0005u\u0000\u0000:<\u0003"+
		"\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0005v\u0000\u0000A\u0005\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005s\u0000\u0000DE\u0003(\u0014"+
		"\u0000EF\u0005t\u0000\u0000FI\u0003\u0002\u0001\u0000GH\u0005\u0004\u0000"+
		"\u0000HJ\u0003\u0002\u0001\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005\u000b\u0000\u0000"+
		"LM\u0005s\u0000\u0000MN\u0003(\u0014\u0000NO\u0005t\u0000\u0000OP\u0003"+
		"\u0002\u0001\u0000P\t\u0001\u0000\u0000\u0000QS\u0005\u0011\u0000\u0000"+
		"RT\u0003(\u0014\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0005y\u0000\u0000V\u000b\u0001\u0000\u0000"+
		"\u0000WX\u0003(\u0014\u0000XY\u0005y\u0000\u0000Y\r\u0001\u0000\u0000"+
		"\u0000Zb\u00058\u0000\u0000[b\u0003\u0010\b\u0000\\b\u0003\u0012\t\u0000"+
		"]^\u0005s\u0000\u0000^_\u0003(\u0014\u0000_`\u0005t\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000"+
		"a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000b\u000f\u0001\u0000"+
		"\u0000\u0000cd\u0007\u0000\u0000\u0000d\u0011\u0001\u0000\u0000\u0000"+
		"ef\u00059\u0000\u0000fh\u0005s\u0000\u0000gi\u0003\u0014\n\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0005t\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lq\u0003(\u0014\u0000"+
		"mn\u0005z\u0000\u0000np\u0003(\u0014\u0000om\u0001\u0000\u0000\u0000p"+
		"s\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u0015\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0007"+
		"\u0001\u0000\u0000ux\u0003\u0016\u000b\u0000vx\u0003\u000e\u0007\u0000"+
		"wt\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0017\u0001\u0000"+
		"\u0000\u0000y~\u0003\u0016\u000b\u0000z{\u0007\u0002\u0000\u0000{}\u0003"+
		"\u0016\u000b\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0019\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0086"+
		"\u0003\u0018\f\u0000\u0082\u0083\u0007\u0003\u0000\u0000\u0083\u0085\u0003"+
		"\u0018\f\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u001b\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u008f\u0003\u0016\u000b\u0000\u008a\u008b\u0003\u0016"+
		"\u000b\u0000\u008b\u008c\u0005Q\u0000\u0000\u008c\u008d\u0003\u001c\u000e"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000"+
		"\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u001d\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0003\u001a\r\u0000\u0091\u0092\u0007\u0004\u0000\u0000"+
		"\u0092\u0094\u0003\u001a\r\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u001f\u0001\u0000\u0000\u0000\u0095"+
		"\u009a\u0003\u001e\u000f\u0000\u0096\u0097\u0007\u0005\u0000\u0000\u0097"+
		"\u0099\u0003\u001e\u000f\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b!\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u00a2\u0003 \u0010\u0000\u009e\u009f\u0007"+
		"\u0006\u0000\u0000\u009f\u00a1\u0003 \u0010\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3#\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u00058\u0000\u0000"+
		"\u00a6\u00a7\u0003&\u0013\u0000\u00a7\u00a8\u0003$\u0012\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\"\u0011\u0000\u00aa\u00a5\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab%\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0007\u0007\u0000\u0000\u00ad\'\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af)\u0001\u0000\u0000\u0000\u0010"+
		"-7=ISahqw~\u0086\u008e\u0093\u009a\u00a2\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}