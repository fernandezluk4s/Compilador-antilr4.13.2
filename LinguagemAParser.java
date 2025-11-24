// Generated from LinguagemA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LinguagemAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, MUL=22, DIV=23, MOD=24, PLUS=25, 
		MINUS=26, POW=27, EQ=28, NEQ=29, LE=30, GE=31, LT=32, GT=33, AND=34, OR=35, 
		NOT=36, TRUE=37, FALSE=38, ID=39, INT=40, FLOAT=41, WS=42, COMMENT=43;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expr = 3, RULE_type = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "assignment", "expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'('", "')'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"';'", "'const'", "'='", "'['", "']'", "'print'", "'{'", "'}'", "'null'", 
			"'int'", "'float'", "'bool'", "'string'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'^'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", 
			"'!'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "MUL", "DIV", 
			"MOD", "PLUS", "MINUS", "POW", "EQ", "NEQ", "LE", "GE", "LT", "GT", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "ID", "INT", "FLOAT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "LinguagemA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguagemAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 549759796546L) != 0) );
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatContext extends StatContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatContext extends StatContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemAParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstDeclContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemAParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends StatContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemAParser.ID, 0); }
		public TerminalNode INT() { return getToken(LinguagemAParser.INT, 0); }
		public ArrayDeclContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(T__0);
				setState(16);
				match(T__1);
				setState(17);
				expr(0);
				setState(18);
				match(T__2);
				setState(19);
				match(T__3);
				setState(20);
				stat();
				setState(23);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(21);
					match(T__4);
					setState(22);
					stat();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__5);
				setState(26);
				match(T__1);
				setState(27);
				expr(0);
				setState(28);
				match(T__2);
				setState(29);
				match(T__6);
				setState(30);
				stat();
				}
				break;
			case 3:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(T__7);
				setState(33);
				match(T__1);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(34);
					assignment();
					}
				}

				setState(37);
				match(T__8);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329394274308L) != 0)) {
					{
					setState(38);
					expr(0);
					}
				}

				setState(41);
				match(T__8);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(42);
					assignment();
					}
				}

				setState(45);
				match(T__2);
				setState(46);
				stat();
				}
				break;
			case 4:
				_localctx = new ConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__9);
				setState(48);
				type();
				setState(49);
				match(ID);
				setState(50);
				match(T__10);
				setState(51);
				expr(0);
				setState(52);
				match(T__8);
				}
				break;
			case 5:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				type();
				setState(55);
				match(ID);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(56);
					match(T__10);
					setState(57);
					expr(0);
					}
				}

				setState(60);
				match(T__8);
				}
				break;
			case 6:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				type();
				setState(63);
				match(ID);
				setState(64);
				match(T__11);
				setState(65);
				match(INT);
				setState(66);
				match(T__12);
				setState(67);
				match(T__8);
				}
				break;
			case 7:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				assignment();
				setState(70);
				match(T__8);
				}
				break;
			case 8:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(T__13);
				setState(73);
				match(T__1);
				setState(74);
				expr(0);
				setState(75);
				match(T__2);
				setState(76);
				match(T__8);
				}
				break;
			case 9:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				match(T__14);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549759796546L) != 0)) {
					{
					{
					setState(79);
					stat();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__15);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemAParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(89);
				match(T__11);
				setState(90);
				expr(0);
				setState(91);
				match(T__12);
				}
			}

			setState(95);
			match(T__10);
			setState(96);
			expr(0);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ExprContext {
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LinguagemAParser.OR, 0); }
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(LinguagemAParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LinguagemAParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LinguagemAParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(LinguagemAParser.LE, 0); }
		public TerminalNode GE() { return getToken(LinguagemAParser.GE, 0); }
		public TerminalNode LT() { return getToken(LinguagemAParser.LT, 0); }
		public TerminalNode GT() { return getToken(LinguagemAParser.GT, 0); }
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LinguagemAParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LinguagemAParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(LinguagemAParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(LinguagemAParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LinguagemAParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LinguagemAParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LinguagemAParser.MOD, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LinguagemAParser.AND, 0); }
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(LinguagemAParser.FALSE, 0); }
		public BoolFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LinguagemAParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LinguagemAParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LinguagemAParser.NEQ, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(LinguagemAParser.TRUE, 0); }
		public BoolTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(LinguagemAParser.POW, 0); }
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99);
				match(MINUS);
				setState(100);
				expr(17);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(NOT);
				setState(102);
				expr(16);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(ID);
				setState(104);
				match(T__11);
				setState(105);
				expr(0);
				setState(106);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(FLOAT);
				}
				break;
			case 7:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(FALSE);
				}
				break;
			case 9:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(T__16);
				}
				break;
			case 10:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(T__1);
				setState(115);
				expr(0);
				setState(116);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(121);
						((PowerContext)_localctx).op = match(POW);
						setState(122);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(124);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(127);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(130);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(133);
						((EqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(136);
						((AndContext)_localctx).op = match(AND);
						setState(137);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						((OrContext)_localctx).op = match(OR);
						setState(140);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAListener ) ((LinguagemAListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAVisitor ) return ((LinguagemAVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001$\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001;\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001Q\b\u0001\n\u0001\f\u0001T\t"+
		"\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003w\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008e\b\u0003\n\u0003\f\u0003"+
		"\u0091\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0001\u0006\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0005\u0001\u0000\u0016\u0018\u0001\u0000"+
		"\u0019\u001a\u0001\u0000\u001e!\u0001\u0000\u001c\u001d\u0001\u0000\u0012"+
		"\u0015\u00af\u0000\u000b\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000"+
		"\u0000\u0004X\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\b"+
		"\u0092\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0001\u0000\u0000\u0010\u0011\u0005\u0002\u0000\u0000"+
		"\u0011\u0012\u0003\u0006\u0003\u0000\u0012\u0013\u0005\u0003\u0000\u0000"+
		"\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0017\u0003\u0002\u0001\u0000"+
		"\u0015\u0016\u0005\u0005\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018W\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0006\u0000\u0000\u001a"+
		"\u001b\u0005\u0002\u0000\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c"+
		"\u001d\u0005\u0003\u0000\u0000\u001d\u001e\u0005\u0007\u0000\u0000\u001e"+
		"\u001f\u0003\u0002\u0001\u0000\u001fW\u0001\u0000\u0000\u0000 !\u0005"+
		"\b\u0000\u0000!#\u0005\u0002\u0000\u0000\"$\u0003\u0004\u0002\u0000#\""+
		"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%\'\u0005\t\u0000\u0000&(\u0003\u0006\u0003\u0000\'&\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0005"+
		"\t\u0000\u0000*,\u0003\u0004\u0002\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000"+
		".W\u0003\u0002\u0001\u0000/0\u0005\n\u0000\u000001\u0003\b\u0004\u0000"+
		"12\u0005\'\u0000\u000023\u0005\u000b\u0000\u000034\u0003\u0006\u0003\u0000"+
		"45\u0005\t\u0000\u00005W\u0001\u0000\u0000\u000067\u0003\b\u0004\u0000"+
		"7:\u0005\'\u0000\u000089\u0005\u000b\u0000\u00009;\u0003\u0006\u0003\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0005\t\u0000\u0000=W\u0001\u0000\u0000\u0000>?\u0003\b\u0004"+
		"\u0000?@\u0005\'\u0000\u0000@A\u0005\f\u0000\u0000AB\u0005(\u0000\u0000"+
		"BC\u0005\r\u0000\u0000CD\u0005\t\u0000\u0000DW\u0001\u0000\u0000\u0000"+
		"EF\u0003\u0004\u0002\u0000FG\u0005\t\u0000\u0000GW\u0001\u0000\u0000\u0000"+
		"HI\u0005\u000e\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0003\u0006\u0003"+
		"\u0000KL\u0005\u0003\u0000\u0000LM\u0005\t\u0000\u0000MW\u0001\u0000\u0000"+
		"\u0000NR\u0005\u000f\u0000\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"UW\u0005\u0010\u0000\u0000V\u000f\u0001\u0000\u0000\u0000V\u0019\u0001"+
		"\u0000\u0000\u0000V \u0001\u0000\u0000\u0000V/\u0001\u0000\u0000\u0000"+
		"V6\u0001\u0000\u0000\u0000V>\u0001\u0000\u0000\u0000VE\u0001\u0000\u0000"+
		"\u0000VH\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000W\u0003\u0001"+
		"\u0000\u0000\u0000X]\u0005\'\u0000\u0000YZ\u0005\f\u0000\u0000Z[\u0003"+
		"\u0006\u0003\u0000[\\\u0005\r\u0000\u0000\\^\u0001\u0000\u0000\u0000]"+
		"Y\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_`\u0005\u000b\u0000\u0000`a\u0003\u0006\u0003\u0000a\u0005\u0001"+
		"\u0000\u0000\u0000bc\u0006\u0003\uffff\uffff\u0000cd\u0005\u001a\u0000"+
		"\u0000dw\u0003\u0006\u0003\u0011ef\u0005$\u0000\u0000fw\u0003\u0006\u0003"+
		"\u0010gh\u0005\'\u0000\u0000hi\u0005\f\u0000\u0000ij\u0003\u0006\u0003"+
		"\u0000jk\u0005\r\u0000\u0000kw\u0001\u0000\u0000\u0000lw\u0005\'\u0000"+
		"\u0000mw\u0005(\u0000\u0000nw\u0005)\u0000\u0000ow\u0005%\u0000\u0000"+
		"pw\u0005&\u0000\u0000qw\u0005\u0011\u0000\u0000rs\u0005\u0002\u0000\u0000"+
		"st\u0003\u0006\u0003\u0000tu\u0005\u0003\u0000\u0000uw\u0001\u0000\u0000"+
		"\u0000vb\u0001\u0000\u0000\u0000ve\u0001\u0000\u0000\u0000vg\u0001\u0000"+
		"\u0000\u0000vl\u0001\u0000\u0000\u0000vm\u0001\u0000\u0000\u0000vn\u0001"+
		"\u0000\u0000\u0000vo\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000"+
		"vq\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000w\u008f\u0001\u0000"+
		"\u0000\u0000xy\n\u000f\u0000\u0000yz\u0005\u001b\u0000\u0000z\u008e\u0003"+
		"\u0006\u0003\u0010{|\n\u000e\u0000\u0000|}\u0007\u0000\u0000\u0000}\u008e"+
		"\u0003\u0006\u0003\u000f~\u007f\n\r\u0000\u0000\u007f\u0080\u0007\u0001"+
		"\u0000\u0000\u0080\u008e\u0003\u0006\u0003\u000e\u0081\u0082\n\f\u0000"+
		"\u0000\u0082\u0083\u0007\u0002\u0000\u0000\u0083\u008e\u0003\u0006\u0003"+
		"\r\u0084\u0085\n\u000b\u0000\u0000\u0085\u0086\u0007\u0003\u0000\u0000"+
		"\u0086\u008e\u0003\u0006\u0003\f\u0087\u0088\n\n\u0000\u0000\u0088\u0089"+
		"\u0005\"\u0000\u0000\u0089\u008e\u0003\u0006\u0003\u000b\u008a\u008b\n"+
		"\t\u0000\u0000\u008b\u008c\u0005#\u0000\u0000\u008c\u008e\u0003\u0006"+
		"\u0003\n\u008dx\u0001\u0000\u0000\u0000\u008d{\u0001\u0000\u0000\u0000"+
		"\u008d~\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000\u0000\u008d"+
		"\u0084\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d"+
		"\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0007\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0007\u0004\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000\f\r\u0017"+
		"#\'+:RV]v\u008d\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}