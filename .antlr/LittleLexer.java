// Generated from /Users/samwilk/Documents/SchoolWork/Compliers/Project1/Compliers/Little.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, KEYWORD=3, OPERATOR=4, IDENTIFIERS=5, STRINGLETERAL=6, INTLITERAL=7, 
		FLOATLITERAL=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "KEYWORD", "OPERATOR", "IDENTIFIERS", "STRINGLETERAL", 
			"INTLITERAL", "FLOATLITERAL"
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
			null, null, "WS", "KEYWORD", "OPERATOR", "IDENTIFIERS", "STRINGLETERAL", 
			"INTLITERAL", "FLOATLITERAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5}\n\5\3\6\6\6\u0080\n\6\r\6\16\6\u0081\3\7\3\7\7\7\u0086\n\7\f\7\16"+
		"\7\u0089\13\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\7\3\7\3\b\5\b\u0094"+
		"\n\b\3\b\6\b\u0097\n\b\r\b\16\b\u0098\3\t\5\t\u009c\n\t\3\t\3\t\3\t\7"+
		"\t\u00a1\n\t\f\t\16\t\u00a4\13\t\5\t\u00a6\n\t\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\3\2\7\5\2\13\f\17\17\"\"\4\2*+=@\5\2-/]]__\4\2C\\c|\3"+
		"\2\62;\2\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\33\3\2\2\2"+
		"\7t\3\2\2\2\t|\3\2\2\2\13\177\3\2\2\2\r\u0083\3\2\2\2\17\u0093\3\2\2\2"+
		"\21\u009b\3\2\2\2\23\24\7N\2\2\24\25\7k\2\2\25\26\7v\2\2\26\27\7v\2\2"+
		"\27\30\7n\2\2\30\31\7g\2\2\31\4\3\2\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \b\3\2\2 \6\3"+
		"\2\2\2!\"\7R\2\2\"#\7T\2\2#$\7Q\2\2$%\7I\2\2%&\7T\2\2&\'\7C\2\2\'u\7O"+
		"\2\2()\7D\2\2)*\7G\2\2*+\7I\2\2+,\7K\2\2,u\7P\2\2-.\7U\2\2./\7V\2\2/\60"+
		"\7T\2\2\60\61\7K\2\2\61\62\7P\2\2\62u\7I\2\2\63\64\7H\2\2\64\65\7W\2\2"+
		"\65\66\7P\2\2\66\67\7E\2\2\678\7V\2\289\7K\2\29:\7Q\2\2:u\7P\2\2;<\7K"+
		"\2\2<=\7P\2\2=u\7V\2\2>?\7K\2\2?u\7H\2\2@A\7G\2\2AB\7N\2\2BC\7U\2\2Cu"+
		"\7G\2\2DE\7G\2\2EF\7P\2\2FG\7F\2\2GH\7K\2\2Hu\7H\2\2IJ\7G\2\2JK\7P\2\2"+
		"Ku\7F\2\2LM\7T\2\2MN\7G\2\2NO\7V\2\2OP\7W\2\2PQ\7T\2\2Qu\7P\2\2RS\7X\2"+
		"\2ST\7Q\2\2TU\7K\2\2Uu\7F\2\2VW\7Y\2\2WX\7T\2\2XY\7K\2\2YZ\7V\2\2Zu\7"+
		"G\2\2[\\\7T\2\2\\]\7G\2\2]^\7C\2\2^u\7F\2\2_`\7Y\2\2`a\7J\2\2ab\7K\2\2"+
		"bc\7N\2\2cu\7G\2\2de\7G\2\2ef\7P\2\2fg\7F\2\2gh\7Y\2\2hi\7J\2\2ij\7K\2"+
		"\2jk\7N\2\2ku\7G\2\2lm\7G\2\2mn\7P\2\2nu\7F\2\2op\7H\2\2pq\7N\2\2qr\7"+
		"Q\2\2rs\7C\2\2su\7V\2\2t!\3\2\2\2t(\3\2\2\2t-\3\2\2\2t\63\3\2\2\2t;\3"+
		"\2\2\2t>\3\2\2\2t@\3\2\2\2tD\3\2\2\2tI\3\2\2\2tL\3\2\2\2tR\3\2\2\2tV\3"+
		"\2\2\2t[\3\2\2\2t_\3\2\2\2td\3\2\2\2tl\3\2\2\2to\3\2\2\2u\b\3\2\2\2vw"+
		"\7<\2\2w}\7?\2\2x}\t\3\2\2yz\7#\2\2z}\7?\2\2{}\t\4\2\2|v\3\2\2\2|x\3\2"+
		"\2\2|y\3\2\2\2|{\3\2\2\2}\n\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\f\3\2\2\2\u0083"+
		"\u0087\7$\2\2\u0084\u0086\5\13\6\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\7\"\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091\16\3\2\2\2\u0092\u0094\7/\2\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097"+
		"\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\20\3\2\2\2\u009a\u009c\7/\2\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a5\t\6\2\2\u009e\u00a2"+
		"\7\60\2\2\u009f\u00a1\t\6\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\22\3\2\2\2\16\2"+
		"\35t|\u0081\u0087\u008d\u0093\u0098\u009b\u00a2\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}