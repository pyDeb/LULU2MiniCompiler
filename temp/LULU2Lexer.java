// Generated from E:\FinalProject (2)\temp\LULU2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LULU2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, ID=66, WS=67, 
		INT_CONST=68, DIGIT=69, VALID_CHAR=70, CHAR_CONST=71, STRING_CONST=72, 
		BOOL_CONST=73, REAL_CONST=74, COMMENT=75, LINE_COMMENT=76;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"ID", "WS", "INT_CONST", "DIGIT", "VALID_CHAR", "CHAR_CONST", "STRING_CONST", 
		"BOOL_CONST", "REAL_CONST", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declare'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", "']'", 
		"','", "'int'", "'bool'", "'float'", "'long'", "'char'", "'double'", "'string'", 
		"'const'", "'allocate'", "'type'", "':'", "'private'", "'public'", "'protected'", 
		"'function'", "'return'", "'break'", "'continue'", "'destruct'", "'new'", 
		"'this'", "'super'", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", "'&'", 
		"'^'", "'|'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", 
		"'nil'", "'sizeof'", "'read'", "'write'", "'if'", "'else'", "'switch'", 
		"'of'", "'case'", "'int_const'", "'default'", "'for'", "'while'", "'goto'", 
		"'!'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "WS", "INT_CONST", "DIGIT", 
		"VALID_CHAR", "CHAR_CONST", "STRING_CONST", "BOOL_CONST", "REAL_CONST", 
		"COMMENT", "LINE_COMMENT"
	};
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


	public LULU2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LULU2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u0250\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\7C\u01bf"+
		"\nC\fC\16C\u01c2\13C\3D\3D\3D\3D\3E\6E\u01c9\nE\rE\16E\u01ca\3E\3E\3E"+
		"\3E\6E\u01d1\nE\rE\16E\u01d2\5E\u01d5\nE\3F\3F\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u01ea\nG\5G\u01ec\nG\3H\3H\3H\3H\3I\3"+
		"I\7I\u01f4\nI\fI\16I\u01f7\13I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0204"+
		"\nJ\3K\6K\u0207\nK\rK\16K\u0208\3K\5K\u020c\nK\3K\7K\u020f\nK\fK\16K\u0212"+
		"\13K\3K\3K\3K\6K\u0217\nK\rK\16K\u0218\3K\5K\u021c\nK\3K\7K\u021f\nK\f"+
		"K\16K\u0222\13K\3K\3K\6K\u0226\nK\rK\16K\u0227\3K\3K\3K\6K\u022d\nK\r"+
		"K\16K\u022e\3K\5K\u0232\nK\5K\u0234\nK\3L\3L\3L\3L\7L\u023a\nL\fL\16L"+
		"\u023d\13L\3L\3L\3L\3L\3L\3M\3M\3M\3M\7M\u0248\nM\fM\16M\u024b\13M\3M"+
		"\3M\3M\3M\4\u023b\u0249\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\3\2\f"+
		"\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2"+
		"\13\f\17\17\4\2\62;CH\3\2\639\4\2GGgg\4\2--//\2\u026a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\3\u009b\3\2\2\2\5\u00a3\3\2\2\2\7\u00a5\3\2\2\2\t\u00a7\3\2\2"+
		"\2\13\u00a9\3\2\2\2\r\u00ab\3\2\2\2\17\u00ad\3\2\2\2\21\u00af\3\2\2\2"+
		"\23\u00b1\3\2\2\2\25\u00b3\3\2\2\2\27\u00b5\3\2\2\2\31\u00b9\3\2\2\2\33"+
		"\u00be\3\2\2\2\35\u00c4\3\2\2\2\37\u00c9\3\2\2\2!\u00ce\3\2\2\2#\u00d5"+
		"\3\2\2\2%\u00dc\3\2\2\2\'\u00e2\3\2\2\2)\u00eb\3\2\2\2+\u00f0\3\2\2\2"+
		"-\u00f2\3\2\2\2/\u00fa\3\2\2\2\61\u0101\3\2\2\2\63\u010b\3\2\2\2\65\u0114"+
		"\3\2\2\2\67\u011b\3\2\2\29\u0121\3\2\2\2;\u012a\3\2\2\2=\u0133\3\2\2\2"+
		"?\u0137\3\2\2\2A\u013c\3\2\2\2C\u0142\3\2\2\2E\u0144\3\2\2\2G\u0146\3"+
		"\2\2\2I\u0148\3\2\2\2K\u014a\3\2\2\2M\u014c\3\2\2\2O\u014e\3\2\2\2Q\u0150"+
		"\3\2\2\2S\u0152\3\2\2\2U\u0154\3\2\2\2W\u0157\3\2\2\2Y\u015a\3\2\2\2["+
		"\u015c\3\2\2\2]\u015e\3\2\2\2_\u0161\3\2\2\2a\u0164\3\2\2\2c\u0167\3\2"+
		"\2\2e\u016a\3\2\2\2g\u016e\3\2\2\2i\u0175\3\2\2\2k\u017a\3\2\2\2m\u0180"+
		"\3\2\2\2o\u0183\3\2\2\2q\u0188\3\2\2\2s\u018f\3\2\2\2u\u0192\3\2\2\2w"+
		"\u0197\3\2\2\2y\u01a1\3\2\2\2{\u01a9\3\2\2\2}\u01ad\3\2\2\2\177\u01b3"+
		"\3\2\2\2\u0081\u01b8\3\2\2\2\u0083\u01ba\3\2\2\2\u0085\u01bc\3\2\2\2\u0087"+
		"\u01c3\3\2\2\2\u0089\u01d4\3\2\2\2\u008b\u01d6\3\2\2\2\u008d\u01eb\3\2"+
		"\2\2\u008f\u01ed\3\2\2\2\u0091\u01f1\3\2\2\2\u0093\u0203\3\2\2\2\u0095"+
		"\u0233\3\2\2\2\u0097\u0235\3\2\2\2\u0099\u0243\3\2\2\2\u009b\u009c\7f"+
		"\2\2\u009c\u009d\7g\2\2\u009d\u009e\7e\2\2\u009e\u009f\7n\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\4\3\2\2\2\u00a3\u00a4"+
		"\7}\2\2\u00a4\6\3\2\2\2\u00a5\u00a6\7\177\2\2\u00a6\b\3\2\2\2\u00a7\u00a8"+
		"\7*\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\f\3\2\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\16\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\20\3\2\2\2\u00af\u00b0"+
		"\7]\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7_\2\2\u00b2\24\3\2\2\2\u00b3\u00b4"+
		"\7.\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7n\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\34\3\2\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7i\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7j\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7t\2\2\u00cd \3\2\2\2\u00ce\u00cf\7f\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7n\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v"+
		"\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db"+
		"\7i\2\2\u00db$\3\2\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1&\3\2\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7e\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea(\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7{\2\2\u00ed\u00ee\7r\2"+
		"\2\u00ee\u00ef\7g\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1,\3\2\2\2"+
		"\u00f2\u00f3\7r\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6"+
		"\7x\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2\u00f9"+
		".\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7d\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7e\2\2\u0100\60\3\2\2\2\u0101"+
		"\u0102\7r\2\2\u0102\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104\u0105\7v\2\2"+
		"\u0105\u0106\7g\2\2\u0106\u0107\7e\2\2\u0107\u0108\7v\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7f\2\2\u010a\62\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d"+
		"\7w\2\2\u010d\u010e\7p\2\2\u010e\u010f\7e\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7q\2\2\u0112\u0113\7p\2\2\u0113\64\3\2\2\2\u0114"+
		"\u0115\7t\2\2\u0115\u0116\7g\2\2\u0116\u0117\7v\2\2\u0117\u0118\7w\2\2"+
		"\u0118\u0119\7t\2\2\u0119\u011a\7p\2\2\u011a\66\3\2\2\2\u011b\u011c\7"+
		"d\2\2\u011c\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7c\2\2\u011f\u0120"+
		"\7m\2\2\u01208\3\2\2\2\u0121\u0122\7e\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7p\2\2\u0124\u0125\7v\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127"+
		"\u0128\7w\2\2\u0128\u0129\7g\2\2\u0129:\3\2\2\2\u012a\u012b\7f\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012e\u012f\7t\2\2"+
		"\u012f\u0130\7w\2\2\u0130\u0131\7e\2\2\u0131\u0132\7v\2\2\u0132<\3\2\2"+
		"\2\u0133\u0134\7p\2\2\u0134\u0135\7g\2\2\u0135\u0136\7y\2\2\u0136>\3\2"+
		"\2\2\u0137\u0138\7v\2\2\u0138\u0139\7j\2\2\u0139\u013a\7k\2\2\u013a\u013b"+
		"\7u\2\2\u013b@\3\2\2\2\u013c\u013d\7u\2\2\u013d\u013e\7w\2\2\u013e\u013f"+
		"\7r\2\2\u013f\u0140\7g\2\2\u0140\u0141\7t\2\2\u0141B\3\2\2\2\u0142\u0143"+
		"\7\60\2\2\u0143D\3\2\2\2\u0144\u0145\7,\2\2\u0145F\3\2\2\2\u0146\u0147"+
		"\7\61\2\2\u0147H\3\2\2\2\u0148\u0149\7\'\2\2\u0149J\3\2\2\2\u014a\u014b"+
		"\7-\2\2\u014bL\3\2\2\2\u014c\u014d\7/\2\2\u014dN\3\2\2\2\u014e\u014f\7"+
		"(\2\2\u014fP\3\2\2\2\u0150\u0151\7`\2\2\u0151R\3\2\2\2\u0152\u0153\7~"+
		"\2\2\u0153T\3\2\2\2\u0154\u0155\7>\2\2\u0155\u0156\7?\2\2\u0156V\3\2\2"+
		"\2\u0157\u0158\7@\2\2\u0158\u0159\7?\2\2\u0159X\3\2\2\2\u015a\u015b\7"+
		">\2\2\u015bZ\3\2\2\2\u015c\u015d\7@\2\2\u015d\\\3\2\2\2\u015e\u015f\7"+
		"?\2\2\u015f\u0160\7?\2\2\u0160^\3\2\2\2\u0161\u0162\7#\2\2\u0162\u0163"+
		"\7?\2\2\u0163`\3\2\2\2\u0164\u0165\7(\2\2\u0165\u0166\7(\2\2\u0166b\3"+
		"\2\2\2\u0167\u0168\7~\2\2\u0168\u0169\7~\2\2\u0169d\3\2\2\2\u016a\u016b"+
		"\7p\2\2\u016b\u016c\7k\2\2\u016c\u016d\7n\2\2\u016df\3\2\2\2\u016e\u016f"+
		"\7u\2\2\u016f\u0170\7k\2\2\u0170\u0171\7|\2\2\u0171\u0172\7g\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7h\2\2\u0174h\3\2\2\2\u0175\u0176\7t\2\2\u0176"+
		"\u0177\7g\2\2\u0177\u0178\7c\2\2\u0178\u0179\7f\2\2\u0179j\3\2\2\2\u017a"+
		"\u017b\7y\2\2\u017b\u017c\7t\2\2\u017c\u017d\7k\2\2\u017d\u017e\7v\2\2"+
		"\u017e\u017f\7g\2\2\u017fl\3\2\2\2\u0180\u0181\7k\2\2\u0181\u0182\7h\2"+
		"\2\u0182n\3\2\2\2\u0183\u0184\7g\2\2\u0184\u0185\7n\2\2\u0185\u0186\7"+
		"u\2\2\u0186\u0187\7g\2\2\u0187p\3\2\2\2\u0188\u0189\7u\2\2\u0189\u018a"+
		"\7y\2\2\u018a\u018b\7k\2\2\u018b\u018c\7v\2\2\u018c\u018d\7e\2\2\u018d"+
		"\u018e\7j\2\2\u018er\3\2\2\2\u018f\u0190\7q\2\2\u0190\u0191\7h\2\2\u0191"+
		"t\3\2\2\2\u0192\u0193\7e\2\2\u0193\u0194\7c\2\2\u0194\u0195\7u\2\2\u0195"+
		"\u0196\7g\2\2\u0196v\3\2\2\2\u0197\u0198\7k\2\2\u0198\u0199\7p\2\2\u0199"+
		"\u019a\7v\2\2\u019a\u019b\7a\2\2\u019b\u019c\7e\2\2\u019c\u019d\7q\2\2"+
		"\u019d\u019e\7p\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7v\2\2\u01a0x\3\2\2"+
		"\2\u01a1\u01a2\7f\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7h\2\2\u01a4\u01a5"+
		"\7c\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7n\2\2\u01a7\u01a8\7v\2\2\u01a8"+
		"z\3\2\2\2\u01a9\u01aa\7h\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7t\2\2\u01ac"+
		"|\3\2\2\2\u01ad\u01ae\7y\2\2\u01ae\u01af\7j\2\2\u01af\u01b0\7k\2\2\u01b0"+
		"\u01b1\7n\2\2\u01b1\u01b2\7g\2\2\u01b2~\3\2\2\2\u01b3\u01b4\7i\2\2\u01b4"+
		"\u01b5\7q\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7q\2\2\u01b7\u0080\3\2\2"+
		"\2\u01b8\u01b9\7#\2\2\u01b9\u0082\3\2\2\2\u01ba\u01bb\7\u0080\2\2\u01bb"+
		"\u0084\3\2\2\2\u01bc\u01c0\t\2\2\2\u01bd\u01bf\t\3\2\2\u01be\u01bd\3\2"+
		"\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u0086\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\t\4\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\bD\2\2\u01c6\u0088\3\2\2\2\u01c7\u01c9\5\u008bF\2\u01c8"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01d5\3\2\2\2\u01cc\u01cd\7\62\2\2\u01cd\u01ce\7z\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01d1\t\5\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01c8\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d5\u008a\3\2\2\2\u01d6\u01d7\t\6"+
		"\2\2\u01d7\u008c\3\2\2\2\u01d8\u01ec\n\7\2\2\u01d9\u01da\7^\2\2\u01da"+
		"\u01ec\7p\2\2\u01db\u01dc\7^\2\2\u01dc\u01ec\7t\2\2\u01dd\u01de\7^\2\2"+
		"\u01de\u01ec\7v\2\2\u01df\u01e0\7^\2\2\u01e0\u01ec\7^\2\2\u01e1\u01e2"+
		"\7^\2\2\u01e2\u01ec\7\62\2\2\u01e3\u01e4\7^\2\2\u01e4\u01e5\7Z\2\2\u01e5"+
		"\u01e9\3\2\2\2\u01e6\u01ea\t\b\2\2\u01e7\u01e8\t\t\2\2\u01e8\u01ea\t\b"+
		"\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01d8\3\2\2\2\u01eb\u01d9\3\2\2\2\u01eb\u01db\3\2\2\2\u01eb\u01dd\3\2"+
		"\2\2\u01eb\u01df\3\2\2\2\u01eb\u01e1\3\2\2\2\u01eb\u01e3\3\2\2\2\u01ec"+
		"\u008e\3\2\2\2\u01ed\u01ee\7)\2\2\u01ee\u01ef\5\u008dG\2\u01ef\u01f0\7"+
		")\2\2\u01f0\u0090\3\2\2\2\u01f1\u01f5\7$\2\2\u01f2\u01f4\5\u008dG\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7$\2\2\u01f9"+
		"\u0092\3\2\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd\7w\2"+
		"\2\u01fd\u0204\7g\2\2\u01fe\u01ff\7h\2\2\u01ff\u0200\7c\2\2\u0200\u0201"+
		"\7n\2\2\u0201\u0202\7u\2\2\u0202\u0204\7g\2\2\u0203\u01fa\3\2\2\2\u0203"+
		"\u01fe\3\2\2\2\u0204\u0094\3\2\2\2\u0205\u0207\5\u008bF\2\u0206\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u020c\7\60\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3"+
		"\2\2\2\u020c\u0210\3\2\2\2\u020d\u020f\5\u008bF\2\u020e\u020d\3\2\2\2"+
		"\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u021b"+
		"\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\t\n\2\2\u0214\u0216\t\13\2\2"+
		"\u0215\u0217\5\u008bF\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u021c\t\n"+
		"\2\2\u021b\u0213\3\2\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u0234\3\2\2\2\u021d\u021f\5\u008bF\2\u021e\u021d\3\2\2\2\u021f\u0222"+
		"\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0225\7\60\2\2\u0224\u0226\5\u008bF\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0231\3\2\2\2\u0229\u022a\t\n\2\2\u022a\u022c\t\13\2\2\u022b\u022d\5"+
		"\u008bF\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2"+
		"\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0232\t\n\2\2\u0231\u0229"+
		"\3\2\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0206\3\2\2\2\u0233\u0220\3\2\2\2\u0234\u0096\3\2\2\2\u0235\u0236\7\'"+
		"\2\2\u0236\u0237\7B\2\2\u0237\u023b\3\2\2\2\u0238\u023a\13\2\2\2\u0239"+
		"\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u023c\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7B\2\2\u023f"+
		"\u0240\7\'\2\2\u0240\u0241\3\2\2\2\u0241\u0242\bL\2\2\u0242\u0098\3\2"+
		"\2\2\u0243\u0244\7\'\2\2\u0244\u0245\7\'\2\2\u0245\u0249\3\2\2\2\u0246"+
		"\u0248\13\2\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u024a\3"+
		"\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024d\7\f\2\2\u024d\u024e\3\2\2\2\u024e\u024f\bM\2\2\u024f\u009a\3\2"+
		"\2\2\27\2\u01c0\u01ca\u01d2\u01d4\u01e9\u01eb\u01f5\u0203\u0208\u020b"+
		"\u0210\u0218\u021b\u0220\u0227\u022e\u0231\u0233\u023b\u0249\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}