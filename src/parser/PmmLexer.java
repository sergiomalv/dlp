// Generated from C:/Universidad/2do trimestre/Desarrollo de Lenguajes de Programación/Laboratorio/workspace/src/parser\Pmm.g4 by ANTLR 4.9.2
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
		INT_CONSTANT=1, ID=2, REAL_CONSTANT=3, COMMENT_MULTI_LINE=4, COMMENT_ONE_LINE=5, 
		CHAR_CONSTANT=6, TRASH=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "NON_ZERO", "SOMETHING", "MARK", "SLASH", "ZERO", 
			"INT_CONSTANT", "ID", "EXPONENT", "REAL_CONSTANT_BASIC", "REAL_CONSTANT_MAYBE_NON_LEFT", 
			"REAL_CONSTANT_LEFT_EXPONENT", "REAL_CONSTANT_RIGHT_EXPONENT", "REAL_CONSTANT", 
			"COMMENT_MULTI_LINE", "COMMENT_ONE_LINE", "CHAR_CONSTANT_NUMBER", "CHAR_CONSTANT_LETTER", 
			"CHAR_CONSTANT", "TRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "ID", "REAL_CONSTANT", "COMMENT_MULTI_LINE", "COMMENT_ONE_LINE", 
			"CHAR_CONSTANT", "TRASH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\tC\n\t"+
		"\f\t\16\tF\13\t\5\tH\n\t\3\n\3\n\5\nL\n\n\3\n\3\n\3\n\7\nQ\n\n\f\n\16"+
		"\nT\13\n\3\13\3\13\3\f\3\f\3\f\7\f[\n\f\f\f\16\f^\13\f\3\r\3\r\5\rb\n"+
		"\r\3\r\3\r\6\rf\n\r\r\r\16\rg\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17s\n\17\3\20\3\20\3\20\3\20\5\20y\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0089\n\22\3\22"+
		"\5\22\u008c\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u0097"+
		"\n\24\f\24\16\24\u009a\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00a4\n\25\3\26\6\26\u00a7\n\26\r\26\16\26\u00a8\3\26\3\26\4\66\u0098"+
		"\2\27\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\3\23\4\25\2\27\2\31\2\33\2\35\2"+
		"\37\5!\6#\7%\2\'\2)\b+\t\3\2\t\5\2C\\c|~~\3\2\62;\3\2\63;\3\2\62\62\4"+
		"\2GGgg\3\3\f\f\5\2\13\f\17\17\"\"\2\u00b2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/"+
		"\3\2\2\2\7\61\3\2\2\2\t\66\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2"+
		"\21G\3\2\2\2\23K\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31a\3\2\2\2\33i\3\2\2"+
		"\2\35m\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#\u0085\3\2\2\2%\u008f\3\2\2\2\'\u0094"+
		"\3\2\2\2)\u00a3\3\2\2\2+\u00a6\3\2\2\2-.\t\2\2\2.\4\3\2\2\2/\60\t\3\2"+
		"\2\60\6\3\2\2\2\61\62\t\4\2\2\62\b\3\2\2\2\63\65\13\2\2\2\64\63\3\2\2"+
		"\2\658\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\67\n\3\2\2\28\66\3\2\2\29:"+
		"\7)\2\2:\f\3\2\2\2;<\7^\2\2<\16\3\2\2\2=>\t\5\2\2>\20\3\2\2\2?H\5\17\b"+
		"\2@D\5\7\4\2AC\5\5\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2"+
		"\2FD\3\2\2\2G?\3\2\2\2G@\3\2\2\2H\22\3\2\2\2IL\5\3\2\2JL\7a\2\2KI\3\2"+
		"\2\2KJ\3\2\2\2LR\3\2\2\2MQ\5\3\2\2NQ\7a\2\2OQ\5\5\3\2PM\3\2\2\2PN\3\2"+
		"\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\24\3\2\2\2TR\3\2\2\2UV\t"+
		"\6\2\2V\26\3\2\2\2WX\5\21\t\2X\\\7\60\2\2Y[\5\5\3\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\30\3\2\2\2^\\\3\2\2\2_b\7\62\2\2`b\5\21\t\2"+
		"a_\3\2\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\7\60\2\2df\5\5\3\2ed\3\2\2"+
		"\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\32\3\2\2\2ij\5\21\t\2jk\5\25\13\2kl"+
		"\5\21\t\2l\34\3\2\2\2mn\5\31\r\2no\5\25\13\2or\7/\2\2ps\7\62\2\2qs\5\21"+
		"\t\2rp\3\2\2\2rq\3\2\2\2s\36\3\2\2\2ty\5\27\f\2uy\5\31\r\2vy\5\33\16\2"+
		"wy\5\35\17\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y \3\2\2\2z{\7$\2"+
		"\2{|\7$\2\2|}\7$\2\2}~\3\2\2\2~\177\5\t\5\2\177\u0080\7$\2\2\u0080\u0081"+
		"\7$\2\2\u0081\u0082\7$\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\21\2\2\u0084"+
		"\"\3\2\2\2\u0085\u0086\7%\2\2\u0086\u0088\5\t\5\2\u0087\u0089\7\17\2\2"+
		"\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c"+
		"\t\7\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\22\2\2"+
		"\u008e$\3\2\2\2\u008f\u0090\5\13\6\2\u0090\u0091\5\r\7\2\u0091\u0092\5"+
		"\21\t\2\u0092\u0093\5\13\6\2\u0093&\3\2\2\2\u0094\u0098\5\13\6\2\u0095"+
		"\u0097\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\5\13\6\2\u009c(\3\2\2\2\u009d\u00a4\5\'\24\2\u009e\u00a4\5%\23"+
		"\2\u009f\u00a0\7^\2\2\u00a0\u00a4\7v\2\2\u00a1\u00a2\7^\2\2\u00a2\u00a4"+
		"\7p\2\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4*\3\2\2\2\u00a5\u00a7\t\b\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\b\26\2\2\u00ab,\3\2\2\2\23\2\66DGKPR\\agrx\u0088"+
		"\u008b\u0098\u00a3\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}