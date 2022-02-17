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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, WS=30, KEYWORD=31, OPERATOR=32, 
		IDENTIFIER=33, STRINGLITERAL=34, INTLITERAL=35, Comment=36;
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
			"T__25", "T__26", "T__27", "T__28", "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", 
			"STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Little'", "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", 
			"';'", "','", "'FUNCTION'", "'READ'", "'('", "')'", "'WRITE'", "'RETURN'", 
			"'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", "'<'", "'>'", 
			"'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", 
			"STRINGLITERAL", "INTLITERAL", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00c9\n\37\r\37\16\37\u00ca"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u012c\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0138\n!\3"+
		"\"\6\"\u013b\n\"\r\"\16\"\u013c\3\"\7\"\u0140\n\"\f\"\16\"\u0143\13\""+
		"\3#\3#\7#\u0147\n#\f#\16#\u014a\13#\3#\3#\3$\6$\u014f\n$\r$\16$\u0150"+
		"\3%\7%\u0154\n%\f%\16%\u0157\13%\3%\3%\6%\u015b\n%\r%\16%\u015c\5%\u015f"+
		"\n%\3&\3&\3&\3&\7&\u0165\n&\f&\16&\u0168\13&\3&\3&\2\2\'\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I\2K&\3\2\t\5\2\13\f\17\17\"\"\4\2*+=@\4\2,/\61\61\4\2C\\c|\3\2\62;\3"+
		"\2$$\4\2\f\f\17\17\2\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5T\3\2\2\2\7\\\3\2\2"+
		"\2\tb\3\2\2\2\13f\3\2\2\2\rm\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2"+
		"\2\25}\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u008c"+
		"\3\2\2\2\37\u0093\3\2\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2"+
		"\'\u009b\3\2\2\2)\u009e\3\2\2\2+\u00a4\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3"+
		"\2\2\2\61\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b2\3\2\2\2\67\u00b5\3\2"+
		"\2\29\u00b8\3\2\2\2;\u00be\3\2\2\2=\u00c8\3\2\2\2?\u012b\3\2\2\2A\u0137"+
		"\3\2\2\2C\u013a\3\2\2\2E\u0144\3\2\2\2G\u014e\3\2\2\2I\u0155\3\2\2\2K"+
		"\u0160\3\2\2\2MN\7N\2\2NO\7k\2\2OP\7v\2\2PQ\7v\2\2QR\7n\2\2RS\7g\2\2S"+
		"\4\3\2\2\2TU\7R\2\2UV\7T\2\2VW\7Q\2\2WX\7I\2\2XY\7T\2\2YZ\7C\2\2Z[\7O"+
		"\2\2[\6\3\2\2\2\\]\7D\2\2]^\7G\2\2^_\7I\2\2_`\7K\2\2`a\7P\2\2a\b\3\2\2"+
		"\2bc\7G\2\2cd\7P\2\2de\7F\2\2e\n\3\2\2\2fg\7U\2\2gh\7V\2\2hi\7T\2\2ij"+
		"\7K\2\2jk\7P\2\2kl\7I\2\2l\f\3\2\2\2mn\7<\2\2no\7?\2\2o\16\3\2\2\2pq\7"+
		"=\2\2q\20\3\2\2\2rs\7.\2\2s\22\3\2\2\2tu\7H\2\2uv\7W\2\2vw\7P\2\2wx\7"+
		"E\2\2xy\7V\2\2yz\7K\2\2z{\7Q\2\2{|\7P\2\2|\24\3\2\2\2}~\7T\2\2~\177\7"+
		"G\2\2\177\u0080\7C\2\2\u0080\u0081\7F\2\2\u0081\26\3\2\2\2\u0082\u0083"+
		"\7*\2\2\u0083\30\3\2\2\2\u0084\u0085\7+\2\2\u0085\32\3\2\2\2\u0086\u0087"+
		"\7Y\2\2\u0087\u0088\7T\2\2\u0088\u0089\7K\2\2\u0089\u008a\7V\2\2\u008a"+
		"\u008b\7G\2\2\u008b\34\3\2\2\2\u008c\u008d\7T\2\2\u008d\u008e\7G\2\2\u008e"+
		"\u008f\7V\2\2\u008f\u0090\7W\2\2\u0090\u0091\7T\2\2\u0091\u0092\7P\2\2"+
		"\u0092\36\3\2\2\2\u0093\u0094\7-\2\2\u0094 \3\2\2\2\u0095\u0096\7/\2\2"+
		"\u0096\"\3\2\2\2\u0097\u0098\7,\2\2\u0098$\3\2\2\2\u0099\u009a\7\61\2"+
		"\2\u009a&\3\2\2\2\u009b\u009c\7K\2\2\u009c\u009d\7H\2\2\u009d(\3\2\2\2"+
		"\u009e\u009f\7G\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7F\2\2\u00a1\u00a2"+
		"\7K\2\2\u00a2\u00a3\7H\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6"+
		"\7N\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7G\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7>\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\60\3\2\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7#\2\2\u00b0\u00b1\7?\2\2\u00b1\64"+
		"\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4\7?\2\2\u00b4\66\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b78\3\2\2\2\u00b8\u00b9\7Y\2\2\u00b9"+
		"\u00ba\7J\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7N\2\2\u00bc\u00bd\7G\2\2"+
		"\u00bd:\3\2\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7F\2"+
		"\2\u00c1\u00c2\7Y\2\2\u00c2\u00c3\7J\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5"+
		"\7N\2\2\u00c5\u00c6\7G\2\2\u00c6<\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\b\37\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7R\2\2"+
		"\u00cf\u00d0\7T\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7I\2\2\u00d2\u00d3"+
		"\7T\2\2\u00d3\u00d4\7C\2\2\u00d4\u012c\7O\2\2\u00d5\u00d6\7D\2\2\u00d6"+
		"\u00d7\7G\2\2\u00d7\u00d8\7I\2\2\u00d8\u00d9\7K\2\2\u00d9\u012c\7P\2\2"+
		"\u00da\u00db\7U\2\2\u00db\u00dc\7V\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de"+
		"\7K\2\2\u00de\u00df\7P\2\2\u00df\u012c\7I\2\2\u00e0\u00e1\7H\2\2\u00e1"+
		"\u00e2\7W\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7E\2\2\u00e4\u00e5\7V\2\2"+
		"\u00e5\u00e6\7K\2\2\u00e6\u00e7\7Q\2\2\u00e7\u012c\7P\2\2\u00e8\u00e9"+
		"\7K\2\2\u00e9\u00ea\7P\2\2\u00ea\u012c\7V\2\2\u00eb\u00ec\7K\2\2\u00ec"+
		"\u012c\7H\2\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\7N\2\2\u00ef\u00f0\7U\2\2"+
		"\u00f0\u012c\7G\2\2\u00f1\u00f2\7G\2\2\u00f2\u00f3\7P\2\2\u00f3\u00f4"+
		"\7F\2\2\u00f4\u00f5\7K\2\2\u00f5\u012c\7H\2\2\u00f6\u00f7\7G\2\2\u00f7"+
		"\u00f8\7P\2\2\u00f8\u012c\7F\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7G\2\2"+
		"\u00fb\u00fc\7V\2\2\u00fc\u00fd\7W\2\2\u00fd\u00fe\7T\2\2\u00fe\u012c"+
		"\7P\2\2\u00ff\u0100\7X\2\2\u0100\u0101\7Q\2\2\u0101\u0102\7K\2\2\u0102"+
		"\u012c\7F\2\2\u0103\u0104\7Y\2\2\u0104\u0105\7T\2\2\u0105\u0106\7K\2\2"+
		"\u0106\u0107\7V\2\2\u0107\u012c\7G\2\2\u0108\u0109\7T\2\2\u0109\u010a"+
		"\7G\2\2\u010a\u010b\7C\2\2\u010b\u012c\7F\2\2\u010c\u010d\7Y\2\2\u010d"+
		"\u010e\7J\2\2\u010e\u010f\7K\2\2\u010f\u0110\7N\2\2\u0110\u012c\7G\2\2"+
		"\u0111\u0112\7G\2\2\u0112\u0113\7P\2\2\u0113\u0114\7F\2\2\u0114\u0115"+
		"\7Y\2\2\u0115\u0116\7J\2\2\u0116\u0117\7K\2\2\u0117\u0118\7N\2\2\u0118"+
		"\u012c\7G\2\2\u0119\u011a\7H\2\2\u011a\u011b\7N\2\2\u011b\u011c\7Q\2\2"+
		"\u011c\u011d\7C\2\2\u011d\u012c\7V\2\2\u011e\u011f\7E\2\2\u011f\u0120"+
		"\7Q\2\2\u0120\u0121\7P\2\2\u0121\u0122\7V\2\2\u0122\u0123\7K\2\2\u0123"+
		"\u0124\7P\2\2\u0124\u0125\7W\2\2\u0125\u012c\7G\2\2\u0126\u0127\7D\2\2"+
		"\u0127\u0128\7T\2\2\u0128\u0129\7G\2\2\u0129\u012a\7C\2\2\u012a\u012c"+
		"\7M\2\2\u012b\u00ce\3\2\2\2\u012b\u00d5\3\2\2\2\u012b\u00da\3\2\2\2\u012b"+
		"\u00e0\3\2\2\2\u012b\u00e8\3\2\2\2\u012b\u00eb\3\2\2\2\u012b\u00ed\3\2"+
		"\2\2\u012b\u00f1\3\2\2\2\u012b\u00f6\3\2\2\2\u012b\u00f9\3\2\2\2\u012b"+
		"\u00ff\3\2\2\2\u012b\u0103\3\2\2\2\u012b\u0108\3\2\2\2\u012b\u010c\3\2"+
		"\2\2\u012b\u0111\3\2\2\2\u012b\u0119\3\2\2\2\u012b\u011e\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012c@\3\2\2\2\u012d\u012e\7<\2\2\u012e\u0138\7?\2\2\u012f"+
		"\u0138\t\3\2\2\u0130\u0131\7#\2\2\u0131\u0138\7?\2\2\u0132\u0138\t\4\2"+
		"\2\u0133\u0134\7>\2\2\u0134\u0138\7?\2\2\u0135\u0136\7@\2\2\u0136\u0138"+
		"\7?\2\2\u0137\u012d\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137"+
		"\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138B\3\2\2\2"+
		"\u0139\u013b\t\5\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u0140\t\6\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142D\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0148\7$\2\2\u0145\u0147"+
		"\n\7\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7$"+
		"\2\2\u014cF\3\2\2\2\u014d\u014f\t\6\2\2\u014e\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151H\3\2\2\2\u0152"+
		"\u0154\t\6\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u015e\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015a\7\60\2\2\u0159\u015b\t\6\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0158\3\2\2\2\u015e\u015f\3\2\2\2\u015fJ\3\2\2\2\u0160\u0161\7/\2\2\u0161"+
		"\u0162\7/\2\2\u0162\u0166\3\2\2\2\u0163\u0165\n\b\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\b&\2\2\u016aL\3\2\2\2\16"+
		"\2\u00ca\u012b\u0137\u013c\u0141\u0148\u0150\u0155\u015c\u015e\u0166\3"+
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