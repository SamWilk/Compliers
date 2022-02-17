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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, WS=27, KEYWORD=28, OPERATOR=29, IDENTIFIER=30, STRINGLITERAL=31, 
		INTLITERAL=32, Comment=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", "STRINGLITERAL", 
			"INTLITERAL", "FLOATLITERAL", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Little'", "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", 
			"','", "'FUNCTION'", "'READ'", "'WRITE'", "'RETURN'", "'+'", "'-'", "'*'", 
			"'/'", "'IF'", "'ENDIF'", "'ELSE'", "'<'", "'>'", "'='", "'!='", "'<='", 
			"'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", "STRINGLITERAL", 
			"INTLITERAL", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u00bd\n\34"+
		"\r\34\16\34\u00be\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0120\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u012c\n\36\3\37\6\37\u012f\n\37\r\37\16\37\u0130\3\37\7\37\u0134"+
		"\n\37\f\37\16\37\u0137\13\37\3 \3 \7 \u013b\n \f \16 \u013e\13 \3 \3 "+
		"\3!\6!\u0143\n!\r!\16!\u0144\3\"\7\"\u0148\n\"\f\"\16\"\u014b\13\"\3\""+
		"\3\"\6\"\u014f\n\"\r\"\16\"\u0150\5\"\u0153\n\"\3#\3#\3#\3#\7#\u0159\n"+
		"#\f#\16#\u015c\13#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E#\3\2\t\5\2\13\f\17\17\"\"\4\2"+
		"*+=@\4\2,/\61\61\4\2C\\c|\3\2\62;\3\2$$\4\2\f\f\17\17\2\u017c\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5N\3\2\2\2\7V\3"+
		"\2\2\2\t\\\3\2\2\2\13`\3\2\2\2\rg\3\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23u"+
		"\3\2\2\2\25z\3\2\2\2\27\u0080\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2"+
		"\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0092\3\2\2\2%\u0098"+
		"\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2"+
		"/\u00a6\3\2\2\2\61\u00a9\3\2\2\2\63\u00ac\3\2\2\2\65\u00b2\3\2\2\2\67"+
		"\u00bc\3\2\2\29\u011f\3\2\2\2;\u012b\3\2\2\2=\u012e\3\2\2\2?\u0138\3\2"+
		"\2\2A\u0142\3\2\2\2C\u0149\3\2\2\2E\u0154\3\2\2\2GH\7N\2\2HI\7k\2\2IJ"+
		"\7v\2\2JK\7v\2\2KL\7n\2\2LM\7g\2\2M\4\3\2\2\2NO\7R\2\2OP\7T\2\2PQ\7Q\2"+
		"\2QR\7I\2\2RS\7T\2\2ST\7C\2\2TU\7O\2\2U\6\3\2\2\2VW\7D\2\2WX\7G\2\2XY"+
		"\7I\2\2YZ\7K\2\2Z[\7P\2\2[\b\3\2\2\2\\]\7G\2\2]^\7P\2\2^_\7F\2\2_\n\3"+
		"\2\2\2`a\7U\2\2ab\7V\2\2bc\7T\2\2cd\7K\2\2de\7P\2\2ef\7I\2\2f\f\3\2\2"+
		"\2gh\7<\2\2hi\7?\2\2i\16\3\2\2\2jk\7.\2\2k\20\3\2\2\2lm\7H\2\2mn\7W\2"+
		"\2no\7P\2\2op\7E\2\2pq\7V\2\2qr\7K\2\2rs\7Q\2\2st\7P\2\2t\22\3\2\2\2u"+
		"v\7T\2\2vw\7G\2\2wx\7C\2\2xy\7F\2\2y\24\3\2\2\2z{\7Y\2\2{|\7T\2\2|}\7"+
		"K\2\2}~\7V\2\2~\177\7G\2\2\177\26\3\2\2\2\u0080\u0081\7T\2\2\u0081\u0082"+
		"\7G\2\2\u0082\u0083\7V\2\2\u0083\u0084\7W\2\2\u0084\u0085\7T\2\2\u0085"+
		"\u0086\7P\2\2\u0086\30\3\2\2\2\u0087\u0088\7-\2\2\u0088\32\3\2\2\2\u0089"+
		"\u008a\7/\2\2\u008a\34\3\2\2\2\u008b\u008c\7,\2\2\u008c\36\3\2\2\2\u008d"+
		"\u008e\7\61\2\2\u008e \3\2\2\2\u008f\u0090\7K\2\2\u0090\u0091\7H\2\2\u0091"+
		"\"\3\2\2\2\u0092\u0093\7G\2\2\u0093\u0094\7P\2\2\u0094\u0095\7F\2\2\u0095"+
		"\u0096\7K\2\2\u0096\u0097\7H\2\2\u0097$\3\2\2\2\u0098\u0099\7G\2\2\u0099"+
		"\u009a\7N\2\2\u009a\u009b\7U\2\2\u009b\u009c\7G\2\2\u009c&\3\2\2\2\u009d"+
		"\u009e\7>\2\2\u009e(\3\2\2\2\u009f\u00a0\7@\2\2\u00a0*\3\2\2\2\u00a1\u00a2"+
		"\7?\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7?\2\2\u00a5.\3"+
		"\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7?\2\2\u00a8\60\3\2\2\2\u00a9\u00aa"+
		"\7@\2\2\u00aa\u00ab\7?\2\2\u00ab\62\3\2\2\2\u00ac\u00ad\7Y\2\2\u00ad\u00ae"+
		"\7J\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7N\2\2\u00b0\u00b1\7G\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7F\2\2\u00b5"+
		"\u00b6\7Y\2\2\u00b6\u00b7\7J\2\2\u00b7\u00b8\7K\2\2\u00b8\u00b9\7N\2\2"+
		"\u00b9\u00ba\7G\2\2\u00ba\66\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\b\34\2\2\u00c18\3\2\2\2\u00c2\u00c3\7R\2\2"+
		"\u00c3\u00c4\7T\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7I\2\2\u00c6\u00c7"+
		"\7T\2\2\u00c7\u00c8\7C\2\2\u00c8\u0120\7O\2\2\u00c9\u00ca\7D\2\2\u00ca"+
		"\u00cb\7G\2\2\u00cb\u00cc\7I\2\2\u00cc\u00cd\7K\2\2\u00cd\u0120\7P\2\2"+
		"\u00ce\u00cf\7U\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2"+
		"\7K\2\2\u00d2\u00d3\7P\2\2\u00d3\u0120\7I\2\2\u00d4\u00d5\7H\2\2\u00d5"+
		"\u00d6\7W\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7E\2\2\u00d8\u00d9\7V\2\2"+
		"\u00d9\u00da\7K\2\2\u00da\u00db\7Q\2\2\u00db\u0120\7P\2\2\u00dc\u00dd"+
		"\7K\2\2\u00dd\u00de\7P\2\2\u00de\u0120\7V\2\2\u00df\u00e0\7K\2\2\u00e0"+
		"\u0120\7H\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e3\7N\2\2\u00e3\u00e4\7U\2\2"+
		"\u00e4\u0120\7G\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8"+
		"\7F\2\2\u00e8\u00e9\7K\2\2\u00e9\u0120\7H\2\2\u00ea\u00eb\7G\2\2\u00eb"+
		"\u00ec\7P\2\2\u00ec\u0120\7F\2\2\u00ed\u00ee\7T\2\2\u00ee\u00ef\7G\2\2"+
		"\u00ef\u00f0\7V\2\2\u00f0\u00f1\7W\2\2\u00f1\u00f2\7T\2\2\u00f2\u0120"+
		"\7P\2\2\u00f3\u00f4\7X\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6\7K\2\2\u00f6"+
		"\u0120\7F\2\2\u00f7\u00f8\7Y\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fa\7K\2\2"+
		"\u00fa\u00fb\7V\2\2\u00fb\u0120\7G\2\2\u00fc\u00fd\7T\2\2\u00fd\u00fe"+
		"\7G\2\2\u00fe\u00ff\7C\2\2\u00ff\u0120\7F\2\2\u0100\u0101\7Y\2\2\u0101"+
		"\u0102\7J\2\2\u0102\u0103\7K\2\2\u0103\u0104\7N\2\2\u0104\u0120\7G\2\2"+
		"\u0105\u0106\7G\2\2\u0106\u0107\7P\2\2\u0107\u0108\7F\2\2\u0108\u0109"+
		"\7Y\2\2\u0109\u010a\7J\2\2\u010a\u010b\7K\2\2\u010b\u010c\7N\2\2\u010c"+
		"\u0120\7G\2\2\u010d\u010e\7H\2\2\u010e\u010f\7N\2\2\u010f\u0110\7Q\2\2"+
		"\u0110\u0111\7C\2\2\u0111\u0120\7V\2\2\u0112\u0113\7E\2\2\u0113\u0114"+
		"\7Q\2\2\u0114\u0115\7P\2\2\u0115\u0116\7V\2\2\u0116\u0117\7K\2\2\u0117"+
		"\u0118\7P\2\2\u0118\u0119\7W\2\2\u0119\u0120\7G\2\2\u011a\u011b\7D\2\2"+
		"\u011b\u011c\7T\2\2\u011c\u011d\7G\2\2\u011d\u011e\7C\2\2\u011e\u0120"+
		"\7M\2\2\u011f\u00c2\3\2\2\2\u011f\u00c9\3\2\2\2\u011f\u00ce\3\2\2\2\u011f"+
		"\u00d4\3\2\2\2\u011f\u00dc\3\2\2\2\u011f\u00df\3\2\2\2\u011f\u00e1\3\2"+
		"\2\2\u011f\u00e5\3\2\2\2\u011f\u00ea\3\2\2\2\u011f\u00ed\3\2\2\2\u011f"+
		"\u00f3\3\2\2\2\u011f\u00f7\3\2\2\2\u011f\u00fc\3\2\2\2\u011f\u0100\3\2"+
		"\2\2\u011f\u0105\3\2\2\2\u011f\u010d\3\2\2\2\u011f\u0112\3\2\2\2\u011f"+
		"\u011a\3\2\2\2\u0120:\3\2\2\2\u0121\u0122\7<\2\2\u0122\u012c\7?\2\2\u0123"+
		"\u012c\t\3\2\2\u0124\u0125\7#\2\2\u0125\u012c\7?\2\2\u0126\u012c\t\4\2"+
		"\2\u0127\u0128\7>\2\2\u0128\u012c\7?\2\2\u0129\u012a\7@\2\2\u012a\u012c"+
		"\7?\2\2\u012b\u0121\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0124\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c<\3\2\2\2"+
		"\u012d\u012f\t\5\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0135\3\2\2\2\u0132\u0134\t\6\2\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136>\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7$\2\2\u0139\u013b"+
		"\n\7\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7$"+
		"\2\2\u0140@\3\2\2\2\u0141\u0143\t\6\2\2\u0142\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145B\3\2\2\2\u0146"+
		"\u0148\t\6\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u0152\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\7\60\2\2\u014d\u014f\t\6\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014c\3\2\2\2\u0152\u0153\3\2\2\2\u0153D\3\2\2\2\u0154\u0155\7/\2\2\u0155"+
		"\u0156\7/\2\2\u0156\u015a\3\2\2\2\u0157\u0159\n\b\2\2\u0158\u0157\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\b#\2\2\u015eF\3\2\2\2\16"+
		"\2\u00be\u011f\u012b\u0130\u0135\u013c\u0144\u0149\u0150\u0152\u015a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}