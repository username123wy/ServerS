// Generated from E:/Users/zongz/Desktop/little1/ServerS/src/main/java/cn/edu/nuaa/little1/grammer\SS.g4 by ANTLR 4.8
package cn.edu.nuaa.little1.gen.ss;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, LEFT_BRACKETS=3, RIGHT_BRACKETS=4, EQUAL=5, NOT_EQUAL=6, 
		CASE_EQUAL=7, CONTAIN=8, SEMICOLON=9, WS=10, COMMENT=11, STRING=12, COLUMN_ID=13, 
		ALL_COLUMNS=14;
	public static final int
		RULE_ss = 0, RULE_query_list = 1, RULE_simple_query = 2, RULE_operator = 3, 
		RULE_equal_query = 4, RULE_not_equal_query = 5, RULE_case_insensitive_equal_query = 6, 
		RULE_contain_query = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"ss", "query_list", "simple_query", "operator", "equal_query", "not_equal_query", 
			"case_insensitive_equal_query", "contain_query"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'('", "')'", "'=='", "'!='", "'$='", "'&='", 
			"';'", null, null, null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "LEFT_BRACKETS", "RIGHT_BRACKETS", "EQUAL", "NOT_EQUAL", 
			"CASE_EQUAL", "CONTAIN", "SEMICOLON", "WS", "COMMENT", "STRING", "COLUMN_ID", 
			"ALL_COLUMNS"
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
	public String getGrammarFileName() { return "SS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SsContext extends ParserRuleContext {
		public List<Query_listContext> query_list() {
			return getRuleContexts(Query_listContext.class);
		}
		public Query_listContext query_list(int i) {
			return getRuleContext(Query_listContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SSParser.SEMICOLON, i);
		}
		public SsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterSs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitSs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitSs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SsContext ss() throws RecognitionException {
		SsContext _localctx = new SsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKETS) | (1L << COLUMN_ID) | (1L << ALL_COLUMNS))) != 0)) {
				{
				{
				setState(16);
				query_list();
				setState(17);
				match(SEMICOLON);
				}
				}
				setState(23);
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

	public static class Query_listContext extends ParserRuleContext {
		public Simple_queryContext simple_query() {
			return getRuleContext(Simple_queryContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<Query_listContext> query_list() {
			return getRuleContexts(Query_listContext.class);
		}
		public Query_listContext query_list(int i) {
			return getRuleContext(Query_listContext.class,i);
		}
		public TerminalNode LEFT_BRACKETS() { return getToken(SSParser.LEFT_BRACKETS, 0); }
		public TerminalNode RIGHT_BRACKETS() { return getToken(SSParser.RIGHT_BRACKETS, 0); }
		public Query_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterQuery_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitQuery_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitQuery_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_listContext query_list() throws RecognitionException {
		Query_listContext _localctx = new Query_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query_list);
		int _la;
		try {
			int _alt;
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN_ID:
			case ALL_COLUMNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				simple_query();
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(25);
						operator();
						setState(26);
						query_list();
						}
						} 
					}
					setState(32);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case LEFT_BRACKETS:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(LEFT_BRACKETS);
				setState(34);
				simple_query();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(35);
					operator();
					setState(36);
					query_list();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(RIGHT_BRACKETS);
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

	public static class Simple_queryContext extends ParserRuleContext {
		public TerminalNode COLUMN_ID() { return getToken(SSParser.COLUMN_ID, 0); }
		public TerminalNode ALL_COLUMNS() { return getToken(SSParser.ALL_COLUMNS, 0); }
		public Equal_queryContext equal_query() {
			return getRuleContext(Equal_queryContext.class,0);
		}
		public Not_equal_queryContext not_equal_query() {
			return getRuleContext(Not_equal_queryContext.class,0);
		}
		public Case_insensitive_equal_queryContext case_insensitive_equal_query() {
			return getRuleContext(Case_insensitive_equal_queryContext.class,0);
		}
		public Contain_queryContext contain_query() {
			return getRuleContext(Contain_queryContext.class,0);
		}
		public Simple_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterSimple_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitSimple_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitSimple_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_queryContext simple_query() throws RecognitionException {
		Simple_queryContext _localctx = new Simple_queryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==COLUMN_ID || _la==ALL_COLUMNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				{
				setState(48);
				equal_query();
				}
				break;
			case NOT_EQUAL:
				{
				setState(49);
				not_equal_query();
				}
				break;
			case CASE_EQUAL:
				{
				setState(50);
				case_insensitive_equal_query();
				}
				break;
			case CONTAIN:
				{
				setState(51);
				contain_query();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SSParser.AND, 0); }
		public TerminalNode OR() { return getToken(SSParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class Equal_queryContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SSParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SSParser.STRING, 0); }
		public Equal_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterEqual_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitEqual_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitEqual_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_queryContext equal_query() throws RecognitionException {
		Equal_queryContext _localctx = new Equal_queryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equal_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(EQUAL);
			setState(57);
			match(STRING);
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

	public static class Not_equal_queryContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL() { return getToken(SSParser.NOT_EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SSParser.STRING, 0); }
		public Not_equal_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterNot_equal_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitNot_equal_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitNot_equal_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_equal_queryContext not_equal_query() throws RecognitionException {
		Not_equal_queryContext _localctx = new Not_equal_queryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_not_equal_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(NOT_EQUAL);
			setState(60);
			match(STRING);
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

	public static class Case_insensitive_equal_queryContext extends ParserRuleContext {
		public TerminalNode CASE_EQUAL() { return getToken(SSParser.CASE_EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SSParser.STRING, 0); }
		public Case_insensitive_equal_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_insensitive_equal_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterCase_insensitive_equal_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitCase_insensitive_equal_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitCase_insensitive_equal_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_insensitive_equal_queryContext case_insensitive_equal_query() throws RecognitionException {
		Case_insensitive_equal_queryContext _localctx = new Case_insensitive_equal_queryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_case_insensitive_equal_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CASE_EQUAL);
			setState(63);
			match(STRING);
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

	public static class Contain_queryContext extends ParserRuleContext {
		public TerminalNode CONTAIN() { return getToken(SSParser.CONTAIN, 0); }
		public TerminalNode STRING() { return getToken(SSParser.STRING, 0); }
		public Contain_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contain_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).enterContain_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSListener ) ((SSListener)listener).exitContain_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSVisitor ) return ((SSVisitor<? extends T>)visitor).visitContain_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contain_queryContext contain_query() throws RecognitionException {
		Contain_queryContext _localctx = new Contain_queryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contain_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(CONTAIN);
			setState(66);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\17\20\3\2\3\4\2E\2\27\3\2\2"+
		"\2\4/\3\2\2\2\6\61\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\f=\3\2\2\2\16@\3\2\2"+
		"\2\20C\3\2\2\2\22\23\5\4\3\2\23\24\7\13\2\2\24\26\3\2\2\2\25\22\3\2\2"+
		"\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2"+
		"\2\32 \5\6\4\2\33\34\5\b\5\2\34\35\5\4\3\2\35\37\3\2\2\2\36\33\3\2\2\2"+
		"\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\60\3\2\2\2\" \3\2\2\2#$\7\5\2\2$"+
		"*\5\6\4\2%&\5\b\5\2&\'\5\4\3\2\')\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\6\2\2.\60\3\2\2\2/\32\3\2\2\2/#\3"+
		"\2\2\2\60\5\3\2\2\2\61\66\t\2\2\2\62\67\5\n\6\2\63\67\5\f\7\2\64\67\5"+
		"\16\b\2\65\67\5\20\t\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65"+
		"\3\2\2\2\67\7\3\2\2\289\t\3\2\29\t\3\2\2\2:;\7\7\2\2;<\7\16\2\2<\13\3"+
		"\2\2\2=>\7\b\2\2>?\7\16\2\2?\r\3\2\2\2@A\7\t\2\2AB\7\16\2\2B\17\3\2\2"+
		"\2CD\7\n\2\2DE\7\16\2\2E\21\3\2\2\2\7\27 */\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}