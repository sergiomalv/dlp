// Generated from C:/Universidad/2do trimestre/Desarrollo de Lenguajes de Programaci�n/Laboratorio/workspace/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, INT_CONSTANT=2, IDENTIFIER=3, REAL_CONSTANT=4, CHAR_CONSTANT=5, 
		COMMENT_ONE_LINE=6, COMMENT_MULTI_LINE=7, NEW_LINE=8, TABULADOR=9, CARRIAGE=10, 
		SPACE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "NON_ZERO", "SOMETHING", "MARK", "SLASH", "ZERO", 
			"INT_CONSTANT", "IDENTIFIER", "EXPONENT", "REAL_CONSTANT_BASIC", "REAL_CONSTANT_MAYBE_NON_LEFT", 
			"REAL_CONSTANT_LEFT_EXPONENT", "REAL_CONSTANT_RIGHT_EXPONENT", "REAL_CONSTANT", 
			"CHAR_CONSTANT_NUMBER", "CHAR_CONSTANT_LETTER", "CHAR_CONSTANT", "COMMENT_ONE_LINE", 
			"COMMENT_MULTI_LINE", "NEW_LINE", "TABULADOR", "CARRIAGE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'\n'", "'\t'", "'\r'", 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZERO", "INT_CONSTANT", "IDENTIFIER", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"COMMENT_ONE_LINE", "COMMENT_MULTI_LINE", "NEW_LINE", "TABULADOR", "CARRIAGE", 
			"SPACE"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\n\3\n\5\nO\n\n\3\n\3\n\3\n\7"+
		"\nT\n\n\f\n\16\nW\13\n\3\13\3\13\3\f\3\f\3\f\7\f^\n\f\f\f\16\fa\13\f\3"+
		"\r\3\r\5\re\n\r\3\r\3\r\6\ri\n\r\r\r\16\rj\3\16\3\16\3\16\7\16p\n\16\f"+
		"\16\16\16s\13\16\3\17\3\17\3\17\3\17\3\17\5\17z\n\17\3\20\3\20\3\20\3"+
		"\20\5\20\u0080\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\5\23\u008d\n\23\3\24\3\24\3\24\5\24\u0092\n\24\3\24\5\24\u0095\n"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3<\2\32\3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\2\27\2\31"+
		"\2\33\2\35\2\37\6!\2#\2%\7\'\b)\t+\n-\13/\f\61\r\3\2\b\5\2C\\c|~~\3\2"+
		"\62;\3\2\63;\3\2\62\62\4\2GGgg\3\3\f\f\2\u00b6\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67"+
		"\3\2\2\2\t<\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23"+
		"N\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31d\3\2\2\2\33l\3\2\2\2\35t\3\2\2\2"+
		"\37\177\3\2\2\2!\u0081\3\2\2\2#\u0086\3\2\2\2%\u008c\3\2\2\2\'\u008e\3"+
		"\2\2\2)\u0098\3\2\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00ab\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\64\t\2\2\2\64\4\3\2\2\2\65\66\t\3\2\2\66\6\3\2\2\2\67"+
		"8\t\4\2\28\b\3\2\2\29;\13\2\2\2:9\3\2\2\2;>\3\2\2\2<=\3\2\2\2<:\3\2\2"+
		"\2=\n\3\2\2\2><\3\2\2\2?@\7)\2\2@\f\3\2\2\2AB\7^\2\2B\16\3\2\2\2CD\t\5"+
		"\2\2D\20\3\2\2\2EI\5\7\4\2FH\5\5\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2J\22\3\2\2\2KI\3\2\2\2LO\5\3\2\2MO\7a\2\2NL\3\2\2\2NM\3\2\2\2OU"+
		"\3\2\2\2PT\5\3\2\2QT\7a\2\2RT\5\5\3\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TW"+
		"\3\2\2\2US\3\2\2\2UV\3\2\2\2V\24\3\2\2\2WU\3\2\2\2XY\t\6\2\2Y\26\3\2\2"+
		"\2Z[\5\21\t\2[_\7\60\2\2\\^\5\5\3\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`\30\3\2\2\2a_\3\2\2\2be\7\62\2\2ce\5\21\t\2db\3\2\2\2dc\3\2\2\2"+
		"de\3\2\2\2ef\3\2\2\2fh\7\60\2\2gi\5\5\3\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2k\32\3\2\2\2lm\5\21\t\2mq\5\25\13\2np\5\21\t\2on\3\2\2\2p"+
		"s\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\34\3\2\2\2sq\3\2\2\2tu\5\31\r\2uv\5\25"+
		"\13\2vy\7/\2\2wz\7\62\2\2xz\5\21\t\2yw\3\2\2\2yx\3\2\2\2z\36\3\2\2\2{"+
		"\u0080\5\27\f\2|\u0080\5\31\r\2}\u0080\5\33\16\2~\u0080\5\35\17\2\177"+
		"{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080 \3\2\2\2\u0081"+
		"\u0082\5\13\6\2\u0082\u0083\5\r\7\2\u0083\u0084\5\21\t\2\u0084\u0085\5"+
		"\13\6\2\u0085\"\3\2\2\2\u0086\u0087\5\13\6\2\u0087\u0088\5\3\2\2\u0088"+
		"\u0089\5\13\6\2\u0089$\3\2\2\2\u008a\u008d\5#\22\2\u008b\u008d\5!\21\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d&\3\2\2\2\u008e\u008f\7"+
		"%\2\2\u008f\u0091\5\t\5\2\u0090\u0092\7\17\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\t\7\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\24\2\2\u0097(\3\2\2\2\u0098\u0099"+
		"\7$\2\2\u0099\u009a\7$\2\2\u009a\u009b\7$\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\5\t\5\2\u009d\u009e\7$\2\2\u009e\u009f\7$\2\2\u009f\u00a0\7$\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\25\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7\f\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\26\2\2\u00a6,\3\2\2\2\u00a7"+
		"\u00a8\7\13\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\27\2\2\u00aa.\3\2\2"+
		"\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\30\2\2\u00ae"+
		"\60\3\2\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\31\2"+
		"\2\u00b2\62\3\2\2\2\21\2<INSU_djqy\177\u008c\u0091\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}