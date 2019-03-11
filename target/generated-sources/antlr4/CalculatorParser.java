// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PLUS=2, MINUS=3, MULT=4, DIV=5, MOD=6, LBRACKET=7, RBRACKET=8, 
		WHITESPACE=9;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "WHITESPACE"
	};
	public static final int
		RULE_startRule = 0, RULE_operation1 = 1, RULE_operation2 = 2, RULE_addOrMinus = 3, 
		RULE_multDivOrMod = 4, RULE_expression = 5;
	public static final String[] ruleNames = {
		"startRule", "operation1", "operation2", "addOrMinus", "multDivOrMod", 
		"expression"
	};

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public List<Operation1Context> operation1() {
			return getRuleContexts(Operation1Context.class);
		}
		public Operation1Context operation1(int i) {
			return getRuleContext(Operation1Context.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); operation1();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << MINUS) | (1L << LBRACKET))) != 0) );
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

	public static class Operation1Context extends ParserRuleContext {
		public AddOrMinusContext addOrMinus() {
			return getRuleContext(AddOrMinusContext.class,0);
		}
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public Operation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperation1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperation1(this);
		}
	}

	public final Operation1Context operation1() throws RecognitionException {
		Operation1Context _localctx = new Operation1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation1);
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17); operation2();
				setState(18); addOrMinus();
				setState(19); operation1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); operation2();
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

	public static class Operation2Context extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(CalculatorParser.RBRACKET, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public MultDivOrModContext multDivOrMod() {
			return getRuleContext(MultDivOrModContext.class,0);
		}
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(CalculatorParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Operation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperation2(this);
		}
	}

	public final Operation2Context operation2() throws RecognitionException {
		Operation2Context _localctx = new Operation2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation2);
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); expression();
				setState(25); multDivOrMod();
				setState(26); operation2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); match(LBRACKET);
				setState(29); operation1();
				setState(30); match(RBRACKET);
				setState(31); multDivOrMod();
				setState(32); operation2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34); expression();
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

	public static class AddOrMinusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public AddOrMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAddOrMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAddOrMinus(this);
		}
	}

	public final AddOrMinusContext addOrMinus() throws RecognitionException {
		AddOrMinusContext _localctx = new AddOrMinusContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addOrMinus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MultDivOrModContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(CalculatorParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public MultDivOrModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivOrMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMultDivOrMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMultDivOrMod(this);
		}
	}

	public final MultDivOrModContext multDivOrMod() throws RecognitionException {
		MultDivOrModContext _localctx = new MultDivOrModContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multDivOrMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(INT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(MINUS);
				setState(43); match(INT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4&\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7/\n\7\3\7\2\2\b\2\4\6\b\n\f\2"+
		"\4\3\2\4\5\3\2\6\b/\2\17\3\2\2\2\4\30\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n"+
		")\3\2\2\2\f.\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\5\b\5\2\25\26\5"+
		"\4\3\2\26\31\3\2\2\2\27\31\5\6\4\2\30\23\3\2\2\2\30\27\3\2\2\2\31\5\3"+
		"\2\2\2\32\33\5\f\7\2\33\34\5\n\6\2\34\35\5\6\4\2\35&\3\2\2\2\36\37\7\t"+
		"\2\2\37 \5\4\3\2 !\7\n\2\2!\"\5\n\6\2\"#\5\6\4\2#&\3\2\2\2$&\5\f\7\2%"+
		"\32\3\2\2\2%\36\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\'(\t\2\2\2(\t\3\2\2\2)*\t"+
		"\3\2\2*\13\3\2\2\2+/\7\3\2\2,-\7\5\2\2-/\7\3\2\2.+\3\2\2\2.,\3\2\2\2/"+
		"\r\3\2\2\2\6\21\30%.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}