// Generated from Little.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, KEYWORD=3, OPERATOR=4, IDENTIFIER=5, STRINGLITERAL=6, INTLITERAL=7, 
		FLOATLITERAL=8, Comment=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", "STRINGLITERAL", "INTLITERAL", 
			"FLOATLITERAL", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Little'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", "STRINGLITERAL", 
			"INTLITERAL", "FLOATLITERAL", "Comment"
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u008d\n\5\3\6\6\6\u0090\n\6\r\6\16\6\u0091\3\7\3\7\7\7\u0096\n\7\f"+
		"\7\16\7\u0099\13\7\3\7\3\7\3\b\5\b\u009e\n\b\3\b\6\b\u00a1\n\b\r\b\16"+
		"\b\u00a2\3\t\5\t\u00a6\n\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13"+
		"\t\5\t\u00b0\n\t\3\n\3\n\6\n\u00b4\n\n\r\n\16\n\u00b5\3\n\3\n\2\2\13\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\b\5\2\13\f\17\17\"\"\4\2*"+
		"+=@\4\2,/\61\61\4\2C\\c|\3\2$$\3\2\62;\2\u00d7\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\35\3\2\2\2\7\u0080\3\2\2\2\t\u008c"+
		"\3\2\2\2\13\u008f\3\2\2\2\r\u0093\3\2\2\2\17\u009d\3\2\2\2\21\u00a5\3"+
		"\2\2\2\23\u00b3\3\2\2\2\25\26\7N\2\2\26\27\7k\2\2\27\30\7v\2\2\30\31\7"+
		"v\2\2\31\32\7n\2\2\32\33\7g\2\2\33\4\3\2\2\2\34\36\t\2\2\2\35\34\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\3\2\2\"\6\3"+
		"\2\2\2#$\7R\2\2$%\7T\2\2%&\7Q\2\2&\'\7I\2\2\'(\7T\2\2()\7C\2\2)\u0081"+
		"\7O\2\2*+\7D\2\2+,\7G\2\2,-\7I\2\2-.\7K\2\2.\u0081\7P\2\2/\60\7U\2\2\60"+
		"\61\7V\2\2\61\62\7T\2\2\62\63\7K\2\2\63\64\7P\2\2\64\u0081\7I\2\2\65\66"+
		"\7H\2\2\66\67\7W\2\2\678\7P\2\289\7E\2\29:\7V\2\2:;\7K\2\2;<\7Q\2\2<\u0081"+
		"\7P\2\2=>\7K\2\2>?\7P\2\2?\u0081\7V\2\2@A\7K\2\2A\u0081\7H\2\2BC\7G\2"+
		"\2CD\7N\2\2DE\7U\2\2E\u0081\7G\2\2FG\7G\2\2GH\7P\2\2HI\7F\2\2IJ\7K\2\2"+
		"J\u0081\7H\2\2KL\7G\2\2LM\7P\2\2M\u0081\7F\2\2NO\7T\2\2OP\7G\2\2PQ\7V"+
		"\2\2QR\7W\2\2RS\7T\2\2S\u0081\7P\2\2TU\7X\2\2UV\7Q\2\2VW\7K\2\2W\u0081"+
		"\7F\2\2XY\7Y\2\2YZ\7T\2\2Z[\7K\2\2[\\\7V\2\2\\\u0081\7G\2\2]^\7T\2\2^"+
		"_\7G\2\2_`\7C\2\2`\u0081\7F\2\2ab\7Y\2\2bc\7J\2\2cd\7K\2\2de\7N\2\2e\u0081"+
		"\7G\2\2fg\7G\2\2gh\7P\2\2hi\7F\2\2ij\7Y\2\2jk\7J\2\2kl\7K\2\2lm\7N\2\2"+
		"m\u0081\7G\2\2no\7H\2\2op\7N\2\2pq\7Q\2\2qr\7C\2\2r\u0081\7V\2\2st\7E"+
		"\2\2tu\7Q\2\2uv\7P\2\2vw\7V\2\2wx\7K\2\2xy\7P\2\2yz\7W\2\2z\u0081\7G\2"+
		"\2{|\7D\2\2|}\7T\2\2}~\7G\2\2~\177\7C\2\2\177\u0081\7M\2\2\u0080#\3\2"+
		"\2\2\u0080*\3\2\2\2\u0080/\3\2\2\2\u0080\65\3\2\2\2\u0080=\3\2\2\2\u0080"+
		"@\3\2\2\2\u0080B\3\2\2\2\u0080F\3\2\2\2\u0080K\3\2\2\2\u0080N\3\2\2\2"+
		"\u0080T\3\2\2\2\u0080X\3\2\2\2\u0080]\3\2\2\2\u0080a\3\2\2\2\u0080f\3"+
		"\2\2\2\u0080n\3\2\2\2\u0080s\3\2\2\2\u0080{\3\2\2\2\u0081\b\3\2\2\2\u0082"+
		"\u0083\7<\2\2\u0083\u008d\7?\2\2\u0084\u008d\t\3\2\2\u0085\u0086\7#\2"+
		"\2\u0086\u008d\7?\2\2\u0087\u008d\t\4\2\2\u0088\u0089\7>\2\2\u0089\u008d"+
		"\7?\2\2\u008a\u008b\7@\2\2\u008b\u008d\7?\2\2\u008c\u0082\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\n\3\2\2\2\u008e\u0090\t\5\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\f\3\2\2\2\u0093\u0097\7$\2\2\u0094\u0096\n\6\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7$\2\2\u009b\16\3\2\2\2\u009c"+
		"\u009e\7/\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u00a1\t\7\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\20\3\2\2\2\u00a4\u00a6\7/\2\2"+
		"\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00af"+
		"\t\7\2\2\u00a8\u00ac\7\60\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\22\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b4\7/\2\2\u00b3\u00b1\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\b\n\2\2\u00b8\24\3\2\2\2\16\2\37\u0080\u008c\u0091"+
		"\u0097\u009d\u00a2\u00a5\u00ac\u00af\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}