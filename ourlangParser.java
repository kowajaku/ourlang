// Generated from C:/Users/godle/Desktop/ourlang\ourlang.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ourlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AS=5, EQ=6, NEQ=7, GR=8, LR=9, GRE=10, 
		LRE=11, ADD=12, SUB=13, MUL=14, DIV=15, LB=16, RB=17, LSB=18, RSB=19, 
		OR=20, AND=21, PRINT=22, IF=23, RET=24, FOR=25, WHILE=26, BOL=27, NUM=28, 
		NAME=29, STR=30, EOL=31;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_block = 2, RULE_print = 3, RULE_assign = 4, 
		RULE_ifSt = 5, RULE_forSt = 6, RULE_whileSt = 7, RULE_expression = 8, 
		RULE_indexes = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "block", "print", "assign", "ifSt", "forSt", "whileSt", 
			"expression", "indexes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "':'", "'='", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", 
			"'||'", "'&&'", "'print'", "'if'", "'return'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AS", "EQ", "NEQ", "GR", "LR", "GRE", "LRE", 
			"ADD", "SUB", "MUL", "DIV", "LB", "RB", "LSB", "RSB", "OR", "AND", "PRINT", 
			"IF", "RET", "FOR", "WHILE", "BOL", "NUM", "NAME", "STR", "EOL"
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
	public String getGrammarFileName() { return "ourlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ourlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ourlangParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			block();
			setState(21);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfStContext ifSt() {
			return getRuleContext(IfStContext.class,0);
		}
		public ForStContext forSt() {
			return getRuleContext(ForStContext.class,0);
		}
		public WhileStContext whileSt() {
			return getRuleContext(WhileStContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				assign();
				setState(24);
				match(T__0);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				print();
				setState(27);
				match(T__0);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				ifSt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				forSt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				whileSt();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RET() { return getToken(ourlangParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET) {
				{
				setState(40);
				match(RET);
				setState(41);
				expression(0);
				setState(42);
				match(T__0);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ourlangParser.PRINT, 0); }
		public TerminalNode LB() { return getToken(ourlangParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(ourlangParser.RB, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(PRINT);
			setState(47);
			match(LB);
			setState(48);
			expression(0);
			setState(49);
			match(RB);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ourlangParser.NAME, 0); }
		public TerminalNode AS() { return getToken(ourlangParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(NAME);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(52);
				indexes();
				}
			}

			setState(55);
			match(AS);
			setState(56);
			expression(0);
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

	public static class IfStContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ourlangParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterIfSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitIfSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitIfSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStContext ifSt() throws RecognitionException {
		IfStContext _localctx = new IfStContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IF);
			setState(59);
			expression(0);
			setState(60);
			match(T__1);
			setState(61);
			block();
			setState(62);
			match(T__2);
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

	public static class ForStContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ourlangParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(ourlangParser.NAME, 0); }
		public TerminalNode AS() { return getToken(ourlangParser.AS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterForSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitForSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitForSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStContext forSt() throws RecognitionException {
		ForStContext _localctx = new ForStContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FOR);
			setState(65);
			match(NAME);
			setState(66);
			match(AS);
			setState(67);
			expression(0);
			setState(68);
			match(T__3);
			setState(69);
			expression(0);
			setState(70);
			match(T__1);
			setState(71);
			block();
			setState(72);
			match(T__2);
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

	public static class WhileStContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ourlangParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterWhileSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitWhileSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitWhileSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStContext whileSt() throws RecognitionException {
		WhileStContext _localctx = new WhileStContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(WHILE);
			setState(75);
			expression(0);
			setState(76);
			match(T__1);
			setState(77);
			block();
			setState(78);
			match(T__2);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrExprContext extends ExpressionContext {
		public TerminalNode STR() { return getToken(ourlangParser.STR, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public StrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprExprContext extends ExpressionContext {
		public TerminalNode LB() { return getToken(ourlangParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(ourlangParser.RB, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExprExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterExprExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitExprExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitExprExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinExprContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(ourlangParser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterMinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitMinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitMinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ourlangParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BolExprContext extends ExpressionContext {
		public TerminalNode BOL() { return getToken(ourlangParser.BOL, 0); }
		public BolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterBolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitBolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitBolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(ourlangParser.NUM, 0); }
		public NumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameExprContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(ourlangParser.NAME, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public NameExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GRE() { return getToken(ourlangParser.GRE, 0); }
		public TerminalNode LRE() { return getToken(ourlangParser.LRE, 0); }
		public TerminalNode GR() { return getToken(ourlangParser.GR, 0); }
		public TerminalNode LR() { return getToken(ourlangParser.LR, 0); }
		public CmpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterCmpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitCmpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitCmpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ourlangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ourlangParser.NEQ, 0); }
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ourlangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ourlangParser.SUB, 0); }
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ourlangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ourlangParser.DIV, 0); }
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends ExpressionContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public PrintExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ourlangParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new MinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(81);
				match(SUB);
				setState(82);
				expression(13);
				}
				break;
			case PRINT:
				{
				_localctx = new PrintExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				print();
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					indexes();
					}
					break;
				}
				}
				break;
			case LB:
				{
				_localctx = new ExprExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(LB);
				setState(88);
				expression(0);
				setState(89);
				match(RB);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(90);
					indexes();
					}
					break;
				}
				}
				break;
			case NUM:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(NUM);
				}
				break;
			case BOL:
				{
				_localctx = new BolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(BOL);
				}
				break;
			case NAME:
				{
				_localctx = new NameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(NAME);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(96);
					indexes();
					}
					break;
				}
				}
				break;
			case STR:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(STR);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(100);
					indexes();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(106);
						((MulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(112);
						((CmpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << LR) | (1L << GRE) | (1L << LRE))) != 0)) ) {
							((CmpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(115);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(118);
						match(AND);
						setState(119);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(121);
						match(OR);
						setState(122);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IndexesContext extends ParserRuleContext {
		public List<TerminalNode> LSB() { return getTokens(ourlangParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(ourlangParser.LSB, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RSB() { return getTokens(ourlangParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(ourlangParser.RSB, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourlangListener ) ((ourlangListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourlangVisitor ) return ((ourlangVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(128);
					match(LSB);
					setState(129);
					expression(0);
					setState(130);
					match(RSB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u008b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\7\4&"+
		"\n\4\f\4\16\4)\13\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\5\68\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nX\n"+
		"\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\n\3\n\3\n\3\n\5\nd\n\n\3\n\3\n\5\nh\n\n"+
		"\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n\3\13\3\13\3\13\3\13\6\13\u0087"+
		"\n\13\r\13\16\13\u0088\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\20"+
		"\21\3\2\16\17\3\2\n\r\3\2\b\t\2\u0098\2\26\3\2\2\2\4\"\3\2\2\2\6\'\3\2"+
		"\2\2\b\60\3\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16B\3\2\2\2\20L\3\2\2\2\22i"+
		"\3\2\2\2\24\u0086\3\2\2\2\26\27\5\6\4\2\27\30\7\2\2\3\30\3\3\2\2\2\31"+
		"\32\5\n\6\2\32\33\7\3\2\2\33#\3\2\2\2\34\35\5\b\5\2\35\36\7\3\2\2\36#"+
		"\3\2\2\2\37#\5\f\7\2 #\5\16\b\2!#\5\20\t\2\"\31\3\2\2\2\"\34\3\2\2\2\""+
		"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2"+
		"\2\2\'%\3\2\2\2\'(\3\2\2\2(.\3\2\2\2)\'\3\2\2\2*+\7\32\2\2+,\5\22\n\2"+
		",-\7\3\2\2-/\3\2\2\2.*\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60\61\7\30\2\2\61"+
		"\62\7\22\2\2\62\63\5\22\n\2\63\64\7\23\2\2\64\t\3\2\2\2\65\67\7\37\2\2"+
		"\668\5\24\13\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\7\2\2:;\5\22\n"+
		"\2;\13\3\2\2\2<=\7\31\2\2=>\5\22\n\2>?\7\4\2\2?@\5\6\4\2@A\7\5\2\2A\r"+
		"\3\2\2\2BC\7\33\2\2CD\7\37\2\2DE\7\7\2\2EF\5\22\n\2FG\7\6\2\2GH\5\22\n"+
		"\2HI\7\4\2\2IJ\5\6\4\2JK\7\5\2\2K\17\3\2\2\2LM\7\34\2\2MN\5\22\n\2NO\7"+
		"\4\2\2OP\5\6\4\2PQ\7\5\2\2Q\21\3\2\2\2RS\b\n\1\2ST\7\17\2\2Tj\5\22\n\17"+
		"UW\5\b\5\2VX\5\24\13\2WV\3\2\2\2WX\3\2\2\2Xj\3\2\2\2YZ\7\22\2\2Z[\5\22"+
		"\n\2[]\7\23\2\2\\^\5\24\13\2]\\\3\2\2\2]^\3\2\2\2^j\3\2\2\2_j\7\36\2\2"+
		"`j\7\35\2\2ac\7\37\2\2bd\5\24\13\2cb\3\2\2\2cd\3\2\2\2dj\3\2\2\2eg\7 "+
		"\2\2fh\5\24\13\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2iR\3\2\2\2iU\3\2\2\2iY\3"+
		"\2\2\2i_\3\2\2\2i`\3\2\2\2ia\3\2\2\2ie\3\2\2\2j\177\3\2\2\2kl\f\16\2\2"+
		"lm\t\2\2\2m~\5\22\n\17no\f\r\2\2op\t\3\2\2p~\5\22\n\16qr\f\f\2\2rs\t\4"+
		"\2\2s~\5\22\n\rtu\f\13\2\2uv\t\5\2\2v~\5\22\n\fwx\f\n\2\2xy\7\27\2\2y"+
		"~\5\22\n\13z{\f\t\2\2{|\7\26\2\2|~\5\22\n\n}k\3\2\2\2}n\3\2\2\2}q\3\2"+
		"\2\2}t\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\23\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\24\2\2\u0083"+
		"\u0084\5\22\n\2\u0084\u0085\7\25\2\2\u0085\u0087\3\2\2\2\u0086\u0082\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\25\3\2\2\2\16\"\'.\67W]cgi}\177\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}