// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, NEG=2, PLUS=3, MINUS=4, MULT=5, DIV=6, MOD=7, LBRACKET=8, RBRACKET=9, 
		WHITESPACE=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'"
	};
	public static final String[] ruleNames = {
		"INT", "NEG", "DIGIT_ZERO", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LBRACKET", 
		"RBRACKET", "WHITESPACE"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f8\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\f\63\n\f\r\f\16\f"+
		"\64\3\f\3\f\2\2\r\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\3"+
		"\2\3\3\2\62;8\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\3\32\3\2\2\2\5\36\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2"+
		"\2\17)\3\2\2\2\21+\3\2\2\2\23-\3\2\2\2\25/\3\2\2\2\27\62\3\2\2\2\31\33"+
		"\5\7\4\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\4"+
		"\3\2\2\2\36\37\5\13\6\2\37 \5\3\2\2 \6\3\2\2\2!\"\t\2\2\2\"\b\3\2\2\2"+
		"#$\7-\2\2$\n\3\2\2\2%&\7/\2\2&\f\3\2\2\2\'(\7,\2\2(\16\3\2\2\2)*\7\61"+
		"\2\2*\20\3\2\2\2+,\7\'\2\2,\22\3\2\2\2-.\7*\2\2.\24\3\2\2\2/\60\7+\2\2"+
		"\60\26\3\2\2\2\61\63\7\"\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\66\3\2\2\2\66\67\b\f\2\2\67\30\3\2\2\2\5\2\34\64\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}