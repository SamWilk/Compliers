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
		T__0=1, WS=2, KEYWORD=3, STRING=4, FUNCTION=5, IF=6, ELSE=7, ENDIF=8, 
		END=9, RETURN=10, VOID=11, WRITE=12, READ=13, WHILE=14, ENDWHILE=15, LETTERS=16, 
		INT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "KEYWORD", "STRING", "FUNCTION", "IF", "ELSE", "ENDIF", 
			"END", "RETURN", "VOID", "WRITE", "READ", "WHILE", "ENDWHILE", "LETTERS", 
			"INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Little'", null, null, "'STRING'", "'FUNCTION'", "'IF'", "'ELSE'", 
			"'ENDIF'", "'END'", "'RETURN'", "'VOID'", "'WRITE'", "'READ'", "'WHILE'", 
			"'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "KEYWORD", "STRING", "FUNCTION", "IF", "ELSE", "ENDIF", 
			"END", "RETURN", "VOID", "WRITE", "READ", "WHILE", "ENDWHILE", "LETTERS", 
			"INT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\6\21\u008b\n\21\r\21\16\21\u008c\3\22\6\22\u0090"+
		"\n\22\r\22\16\22\u0091\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\5\2\13\f\17\17\"\"\3"+
		"\2c|\3\2\62;\2\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5-\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13"+
		"H\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21Y\3\2\2\2\23_\3\2\2\2\25c\3\2\2\2\27"+
		"j\3\2\2\2\31o\3\2\2\2\33u\3\2\2\2\35z\3\2\2\2\37\u0080\3\2\2\2!\u008a"+
		"\3\2\2\2#\u008f\3\2\2\2%&\7N\2\2&\'\7k\2\2\'(\7v\2\2()\7v\2\2)*\7n\2\2"+
		"*+\7g\2\2+\4\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\b\3\2\2\62\6\3\2\2\2\63\64\7R\2\2\64\65\7T\2\2"+
		"\65\66\7Q\2\2\66\67\7I\2\2\678\7T\2\289\7C\2\29@\7O\2\2:;\7D\2\2;<\7G"+
		"\2\2<=\7I\2\2=>\7K\2\2>@\7P\2\2?\63\3\2\2\2?:\3\2\2\2@\b\3\2\2\2AB\7U"+
		"\2\2BC\7V\2\2CD\7T\2\2DE\7K\2\2EF\7P\2\2FG\7I\2\2G\n\3\2\2\2HI\7H\2\2"+
		"IJ\7W\2\2JK\7P\2\2KL\7E\2\2LM\7V\2\2MN\7K\2\2NO\7Q\2\2OP\7P\2\2P\f\3\2"+
		"\2\2QR\7K\2\2RS\7H\2\2S\16\3\2\2\2TU\7G\2\2UV\7N\2\2VW\7U\2\2WX\7G\2\2"+
		"X\20\3\2\2\2YZ\7G\2\2Z[\7P\2\2[\\\7F\2\2\\]\7K\2\2]^\7H\2\2^\22\3\2\2"+
		"\2_`\7G\2\2`a\7P\2\2ab\7F\2\2b\24\3\2\2\2cd\7T\2\2de\7G\2\2ef\7V\2\2f"+
		"g\7W\2\2gh\7T\2\2hi\7P\2\2i\26\3\2\2\2jk\7X\2\2kl\7Q\2\2lm\7K\2\2mn\7"+
		"F\2\2n\30\3\2\2\2op\7Y\2\2pq\7T\2\2qr\7K\2\2rs\7V\2\2st\7G\2\2t\32\3\2"+
		"\2\2uv\7T\2\2vw\7G\2\2wx\7C\2\2xy\7F\2\2y\34\3\2\2\2z{\7Y\2\2{|\7J\2\2"+
		"|}\7K\2\2}~\7N\2\2~\177\7G\2\2\177\36\3\2\2\2\u0080\u0081\7G\2\2\u0081"+
		"\u0082\7P\2\2\u0082\u0083\7F\2\2\u0083\u0084\7Y\2\2\u0084\u0085\7J\2\2"+
		"\u0085\u0086\7K\2\2\u0086\u0087\7N\2\2\u0087\u0088\7G\2\2\u0088 \3\2\2"+
		"\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\"\3\2\2\2\u008e\u0090\t\4\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092$\3\2\2\2\7\2/?\u008c\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}