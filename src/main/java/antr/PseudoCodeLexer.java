// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.8
package antr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TRUE=2, FALSE=3, MINUS=4, PLUS=5, MULTY=6, DEV=7, MOD=8, LESS_SIGH=9, 
		MORE_SIGN=10, LESS_EQUAL_SIGN=11, MORE_EQUAL_SIGN=12, EQUAL_SIGH=13, NOT_EQUAL_SIGN=14, 
		OR=15, AND=16, PLUS_PLUS=17, MINUS_MINUS=18, ASSIGN_SIGN=19, NEW_LINE=20, 
		INT32=21, INT64=22, FLOAT=23, STRING=24, BOOLEAN=25, AUTO=26, LEFT_SQUARE_BRACKET=27, 
		RIGHT_SQUARE_BRACKET=28, LEFT_ROUND_BRACKET=29, RIGHT_ROUND_BRACKET=30, 
		IF=31, THEN=32, ELSE=33, ENDIF=34, WHILE=35, ENDWHILE=36, FOR=37, TO=38, 
		ENDFOR=39, FOREACH=40, IN=41, ENDFOREACH=42, FUNCTION=43, VOID=44, BEGIN=45, 
		END_FUNCTION=46, RETURN=47, MAP=48, COMMA=49, COLON_SIGH=50, NEGATIVE=51, 
		POSITIVE=52, FLOAT_NUMBER=53, STRING_VALUE=54, ID=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "TRUE", "FALSE", "MINUS", "PLUS", "MULTY", "DEV", "MOD", "LESS_SIGH", 
			"MORE_SIGN", "LESS_EQUAL_SIGN", "MORE_EQUAL_SIGN", "EQUAL_SIGH", "NOT_EQUAL_SIGN", 
			"OR", "AND", "PLUS_PLUS", "MINUS_MINUS", "ASSIGN_SIGN", "NEW_LINE", "INT32", 
			"INT64", "FLOAT", "STRING", "BOOLEAN", "AUTO", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "LEFT_ROUND_BRACKET", "RIGHT_ROUND_BRACKET", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "FOR", "TO", "ENDFOR", 
			"FOREACH", "IN", "ENDFOREACH", "FUNCTION", "VOID", "BEGIN", "END_FUNCTION", 
			"RETURN", "MAP", "COMMA", "COLON_SIGH", "NEGATIVE", "POSITIVE", "FLOAT_NUMBER", 
			"STRING_VALUE", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'true'", "'false'", "'-'", "'+'", "'*'", "'/'", "'%'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'OR'", "'AND'", "'++'", "'--'", 
			"'<-'", "'\n'", "'int32'", "'int64'", "'float'", "'String'", "'bool'", 
			"'auto'", "'['", "']'", "'('", "')'", "'IF'", "'THEN'", "'ELSE'", "'ENDIF'", 
			"'WHILE'", "'ENDWHILE'", "'FOR'", "'TO'", "'ENDFOR'", "'FOREACH'", "'IN'", 
			"'ENDFOREACH'", "'FUNCTION'", "'VOID'", "'BEGIN'", "'END_FUNCTION'", 
			"'RETURN'", "'Map'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "TRUE", "FALSE", "MINUS", "PLUS", "MULTY", "DEV", "MOD", 
			"LESS_SIGH", "MORE_SIGN", "LESS_EQUAL_SIGN", "MORE_EQUAL_SIGN", "EQUAL_SIGH", 
			"NOT_EQUAL_SIGN", "OR", "AND", "PLUS_PLUS", "MINUS_MINUS", "ASSIGN_SIGN", 
			"NEW_LINE", "INT32", "INT64", "FLOAT", "STRING", "BOOLEAN", "AUTO", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "LEFT_ROUND_BRACKET", "RIGHT_ROUND_BRACKET", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "FOR", "TO", "ENDFOR", 
			"FOREACH", "IN", "ENDFOREACH", "FUNCTION", "VOID", "BEGIN", "END_FUNCTION", 
			"RETURN", "MAP", "COMMA", "COLON_SIGH", "NEGATIVE", "POSITIVE", "FLOAT_NUMBER", 
			"STRING_VALUE", "ID"
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


	public PseudoCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseudoCode.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u018b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\6\64\u0150\n\64\r\64\16\64\u0151\3\64\7\64\u0155\n\64\f"+
		"\64\16\64\u0158\13\64\3\65\6\65\u015b\n\65\r\65\16\65\u015c\3\65\7\65"+
		"\u0160\n\65\f\65\16\65\u0163\13\65\3\66\5\66\u0166\n\66\3\66\7\66\u0169"+
		"\n\66\f\66\16\66\u016c\13\66\3\66\5\66\u016f\n\66\3\66\6\66\u0172\n\66"+
		"\r\66\16\66\u0173\3\67\3\67\7\67\u0178\n\67\f\67\16\67\u017b\13\67\3\67"+
		"\3\67\38\38\78\u0181\n8\f8\168\u0184\138\38\78\u0187\n8\f8\168\u018a\13"+
		"8\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9\3\2\6\4\2\13\13\"\"\4\2--//\3\2$$\4\2C\\c|\2\u0195\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\3q\3\2\2\2\5u\3\2\2\2\7z\3\2\2\2\t\u0080\3\2\2\2\13\u0082\3\2\2\2\r"+
		"\u0084\3\2\2\2\17\u0086\3\2\2\2\21\u0088\3\2\2\2\23\u008a\3\2\2\2\25\u008c"+
		"\3\2\2\2\27\u008e\3\2\2\2\31\u0091\3\2\2\2\33\u0094\3\2\2\2\35\u0097\3"+
		"\2\2\2\37\u009a\3\2\2\2!\u009d\3\2\2\2#\u00a1\3\2\2\2%\u00a4\3\2\2\2\'"+
		"\u00a7\3\2\2\2)\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00b2\3\2\2\2/\u00b8\3\2"+
		"\2\2\61\u00be\3\2\2\2\63\u00c5\3\2\2\2\65\u00ca\3\2\2\2\67\u00cf\3\2\2"+
		"\29\u00d1\3\2\2\2;\u00d3\3\2\2\2=\u00d5\3\2\2\2?\u00d7\3\2\2\2A\u00da"+
		"\3\2\2\2C\u00df\3\2\2\2E\u00e4\3\2\2\2G\u00ea\3\2\2\2I\u00f0\3\2\2\2K"+
		"\u00f9\3\2\2\2M\u00fd\3\2\2\2O\u0100\3\2\2\2Q\u0107\3\2\2\2S\u010f\3\2"+
		"\2\2U\u0112\3\2\2\2W\u011d\3\2\2\2Y\u0126\3\2\2\2[\u012b\3\2\2\2]\u0131"+
		"\3\2\2\2_\u013e\3\2\2\2a\u0145\3\2\2\2c\u0149\3\2\2\2e\u014b\3\2\2\2g"+
		"\u014d\3\2\2\2i\u015a\3\2\2\2k\u0165\3\2\2\2m\u0175\3\2\2\2o\u017e\3\2"+
		"\2\2qr\t\2\2\2rs\3\2\2\2st\b\2\2\2t\4\3\2\2\2uv\7v\2\2vw\7t\2\2wx\7w\2"+
		"\2xy\7g\2\2y\6\3\2\2\2z{\7h\2\2{|\7c\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2"+
		"\177\b\3\2\2\2\u0080\u0081\7/\2\2\u0081\n\3\2\2\2\u0082\u0083\7-\2\2\u0083"+
		"\f\3\2\2\2\u0084\u0085\7,\2\2\u0085\16\3\2\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\20\3\2\2\2\u0088\u0089\7\'\2\2\u0089\22\3\2\2\2\u008a\u008b\7>\2\2\u008b"+
		"\24\3\2\2\2\u008c\u008d\7@\2\2\u008d\26\3\2\2\2\u008e\u008f\7>\2\2\u008f"+
		"\u0090\7?\2\2\u0090\30\3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u0093"+
		"\32\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096\34\3\2\2\2\u0097"+
		"\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099\36\3\2\2\2\u009a\u009b\7Q\2\2\u009b"+
		"\u009c\7T\2\2\u009c \3\2\2\2\u009d\u009e\7C\2\2\u009e\u009f\7P\2\2\u009f"+
		"\u00a0\7F\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3\7-\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7/\2\2\u00a6&\3\2\2\2\u00a7\u00a8"+
		"\7>\2\2\u00a8\u00a9\7/\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7\f\2\2\u00ab*\3"+
		"\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\u00b0\7\65\2\2\u00b0\u00b1\7\64\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\78\2\2\u00b6\u00b7"+
		"\7\66\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\60\3\2\2\2\u00be\u00bf"+
		"\7U\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7i\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6"+
		"\u00c7\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7n\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7q\2\2"+
		"\u00ce\66\3\2\2\2\u00cf\u00d0\7]\2\2\u00d08\3\2\2\2\u00d1\u00d2\7_\2\2"+
		"\u00d2:\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6"+
		">\3\2\2\2\u00d7\u00d8\7K\2\2\u00d8\u00d9\7H\2\2\u00d9@\3\2\2\2\u00da\u00db"+
		"\7V\2\2\u00db\u00dc\7J\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7P\2\2\u00de"+
		"B\3\2\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7U\2\2\u00e2"+
		"\u00e3\7G\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6\7P\2\2\u00e6"+
		"\u00e7\7F\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7H\2\2\u00e9F\3\2\2\2\u00ea"+
		"\u00eb\7Y\2\2\u00eb\u00ec\7J\2\2\u00ec\u00ed\7K\2\2\u00ed\u00ee\7N\2\2"+
		"\u00ee\u00ef\7G\2\2\u00efH\3\2\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7P\2"+
		"\2\u00f2\u00f3\7F\2\2\u00f3\u00f4\7Y\2\2\u00f4\u00f5\7J\2\2\u00f5\u00f6"+
		"\7K\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8\7G\2\2\u00f8J\3\2\2\2\u00f9\u00fa"+
		"\7H\2\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7T\2\2\u00fcL\3\2\2\2\u00fd\u00fe"+
		"\7V\2\2\u00fe\u00ff\7Q\2\2\u00ffN\3\2\2\2\u0100\u0101\7G\2\2\u0101\u0102"+
		"\7P\2\2\u0102\u0103\7F\2\2\u0103\u0104\7H\2\2\u0104\u0105\7Q\2\2\u0105"+
		"\u0106\7T\2\2\u0106P\3\2\2\2\u0107\u0108\7H\2\2\u0108\u0109\7Q\2\2\u0109"+
		"\u010a\7T\2\2\u010a\u010b\7G\2\2\u010b\u010c\7C\2\2\u010c\u010d\7E\2\2"+
		"\u010d\u010e\7J\2\2\u010eR\3\2\2\2\u010f\u0110\7K\2\2\u0110\u0111\7P\2"+
		"\2\u0111T\3\2\2\2\u0112\u0113\7G\2\2\u0113\u0114\7P\2\2\u0114\u0115\7"+
		"F\2\2\u0115\u0116\7H\2\2\u0116\u0117\7Q\2\2\u0117\u0118\7T\2\2\u0118\u0119"+
		"\7G\2\2\u0119\u011a\7C\2\2\u011a\u011b\7E\2\2\u011b\u011c\7J\2\2\u011c"+
		"V\3\2\2\2\u011d\u011e\7H\2\2\u011e\u011f\7W\2\2\u011f\u0120\7P\2\2\u0120"+
		"\u0121\7E\2\2\u0121\u0122\7V\2\2\u0122\u0123\7K\2\2\u0123\u0124\7Q\2\2"+
		"\u0124\u0125\7P\2\2\u0125X\3\2\2\2\u0126\u0127\7X\2\2\u0127\u0128\7Q\2"+
		"\2\u0128\u0129\7K\2\2\u0129\u012a\7F\2\2\u012aZ\3\2\2\2\u012b\u012c\7"+
		"D\2\2\u012c\u012d\7G\2\2\u012d\u012e\7I\2\2\u012e\u012f\7K\2\2\u012f\u0130"+
		"\7P\2\2\u0130\\\3\2\2\2\u0131\u0132\7G\2\2\u0132\u0133\7P\2\2\u0133\u0134"+
		"\7F\2\2\u0134\u0135\7a\2\2\u0135\u0136\7H\2\2\u0136\u0137\7W\2\2\u0137"+
		"\u0138\7P\2\2\u0138\u0139\7E\2\2\u0139\u013a\7V\2\2\u013a\u013b\7K\2\2"+
		"\u013b\u013c\7Q\2\2\u013c\u013d\7P\2\2\u013d^\3\2\2\2\u013e\u013f\7T\2"+
		"\2\u013f\u0140\7G\2\2\u0140\u0141\7V\2\2\u0141\u0142\7W\2\2\u0142\u0143"+
		"\7T\2\2\u0143\u0144\7P\2\2\u0144`\3\2\2\2\u0145\u0146\7O\2\2\u0146\u0147"+
		"\7c\2\2\u0147\u0148\7r\2\2\u0148b\3\2\2\2\u0149\u014a\7.\2\2\u014ad\3"+
		"\2\2\2\u014b\u014c\7<\2\2\u014cf\3\2\2\2\u014d\u014f\7/\2\2\u014e\u0150"+
		"\4\63;\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0155\4\62;\2\u0154\u0153\3\2"+
		"\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"h\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\4\63;\2\u015a\u0159\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161"+
		"\3\2\2\2\u015e\u0160\4\62;\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162j\3\2\2\2\u0163\u0161\3\2\2\2"+
		"\u0164\u0166\t\3\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016e"+
		"\3\2\2\2\u0167\u0169\4\62;\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016f\7\60\2\2\u016e\u016a\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0171\3\2\2\2\u0170\u0172\4\62;\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174l\3\2\2\2\u0175\u0179"+
		"\7$\2\2\u0176\u0178\n\4\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017c\u017d\7$\2\2\u017dn\3\2\2\2\u017e\u0182\t\5\2\2\u017f\u0181"+
		"\t\5\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0188\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\4\62"+
		";\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189p\3\2\2\2\u018a\u0188\3\2\2\2\16\2\u0151\u0156\u015c"+
		"\u0161\u0165\u016a\u016e\u0173\u0179\u0182\u0188\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}