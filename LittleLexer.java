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
		T__0=1, WS=2, NEWLINE=3, BEGIN=4, PROGRAM=5, KEYWORD=6, STRING=7, FUNCTION=8, 
		IF=9, ELSE=10, ENDIF=11, END=12, RETURN=13, VOID=14, WRITE=15, READ=16, 
		WHILE=17, ENDWHILE=18, LETTERS=19, INT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "NEWLINE", "BEGIN", "PROGRAM", "KEYWORD", "STRING", "FUNCTION", 
			"IF", "ELSE", "ENDIF", "END", "RETURN", "VOID", "WRITE", "READ", "WHILE", 
			"ENDWHILE", "LETTERS", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Little'", null, "'\n'", "'BEGIN'", "'PROGRAM'", null, "'STRING'", 
			"'FUNCTION'", "'IF'", "'ELSE'", "'ENDIF'", "'END'", "'RETURN'", "'VOID'", 
			"'WRITE'", "'READ'", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "NEWLINE", "BEGIN", "PROGRAM", "KEYWORD", "STRING", 
			"FUNCTION", "IF", "ELSE", "ENDIF", "END", "RETURN", "VOID", "WRITE", 
			"READ", "WHILE", "ENDWHILE", "LETTERS", "INT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6"+
		"\3\64\n\3\r\3\16\3\65\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\6\24\u0097\n\24\r\24\16\24\u0098\3\25\6\25"+
		"\u009c\n\25\r\25\16\25\u009d\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\5\5"+
		"\2\13\13\17\17\"\"\3\2c|\3\2\62;\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\3+\3\2\2\2\5\63\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13A\3\2\2\2\rK"+
		"\3\2\2\2\17M\3\2\2\2\21T\3\2\2\2\23]\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31"+
		"k\3\2\2\2\33o\3\2\2\2\35v\3\2\2\2\37{\3\2\2\2!\u0081\3\2\2\2#\u0086\3"+
		"\2\2\2%\u008c\3\2\2\2\'\u0096\3\2\2\2)\u009b\3\2\2\2+,\7N\2\2,-\7k\2\2"+
		"-.\7v\2\2./\7v\2\2/\60\7n\2\2\60\61\7g\2\2\61\4\3\2\2\2\62\64\t\2\2\2"+
		"\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2"+
		"\678\b\3\2\28\6\3\2\2\29:\7\f\2\2:\b\3\2\2\2;<\7D\2\2<=\7G\2\2=>\7I\2"+
		"\2>?\7K\2\2?@\7P\2\2@\n\3\2\2\2AB\7R\2\2BC\7T\2\2CD\7Q\2\2DE\7I\2\2EF"+
		"\7T\2\2FG\7C\2\2GH\7O\2\2H\f\3\2\2\2IL\5\13\6\2JL\5\t\5\2KI\3\2\2\2KJ"+
		"\3\2\2\2L\16\3\2\2\2MN\7U\2\2NO\7V\2\2OP\7T\2\2PQ\7K\2\2QR\7P\2\2RS\7"+
		"I\2\2S\20\3\2\2\2TU\7H\2\2UV\7W\2\2VW\7P\2\2WX\7E\2\2XY\7V\2\2YZ\7K\2"+
		"\2Z[\7Q\2\2[\\\7P\2\2\\\22\3\2\2\2]^\7K\2\2^_\7H\2\2_\24\3\2\2\2`a\7G"+
		"\2\2ab\7N\2\2bc\7U\2\2cd\7G\2\2d\26\3\2\2\2ef\7G\2\2fg\7P\2\2gh\7F\2\2"+
		"hi\7K\2\2ij\7H\2\2j\30\3\2\2\2kl\7G\2\2lm\7P\2\2mn\7F\2\2n\32\3\2\2\2"+
		"op\7T\2\2pq\7G\2\2qr\7V\2\2rs\7W\2\2st\7T\2\2tu\7P\2\2u\34\3\2\2\2vw\7"+
		"X\2\2wx\7Q\2\2xy\7K\2\2yz\7F\2\2z\36\3\2\2\2{|\7Y\2\2|}\7T\2\2}~\7K\2"+
		"\2~\177\7V\2\2\177\u0080\7G\2\2\u0080 \3\2\2\2\u0081\u0082\7T\2\2\u0082"+
		"\u0083\7G\2\2\u0083\u0084\7C\2\2\u0084\u0085\7F\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\7Y\2\2\u0087\u0088\7J\2\2\u0088\u0089\7K\2\2\u0089\u008a\7N\2\2"+
		"\u008a\u008b\7G\2\2\u008b$\3\2\2\2\u008c\u008d\7G\2\2\u008d\u008e\7P\2"+
		"\2\u008e\u008f\7F\2\2\u008f\u0090\7Y\2\2\u0090\u0091\7J\2\2\u0091\u0092"+
		"\7K\2\2\u0092\u0093\7N\2\2\u0093\u0094\7G\2\2\u0094&\3\2\2\2\u0095\u0097"+
		"\t\3\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099(\3\2\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e*\3"+
		"\2\2\2\7\2\65K\u0098\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}