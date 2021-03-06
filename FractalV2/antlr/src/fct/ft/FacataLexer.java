// Generated from src/fct/ft/Facata.g4 by ANTLR 4.7

package fct.ft;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FacataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plus=1, Minus=2, Times=3, Divide=4, Comma=5, LeftParen=6, RightParen=7, 
		LeftBracket=8, RightBracket=9, Assign=10, Newline=11, Scale=12, Trans=13, 
		Width=14, Height=15, Auto=16, On=17, Off=18, Integer=19, Decimal=20, Whitespace=21, 
		Comment=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Plus", "Minus", "Times", "Divide", "Comma", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "Assign", "Newline", "Scale", "Trans", 
		"Width", "Height", "Auto", "On", "Off", "Integer", "Decimal", "Whitespace", 
		"Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "','", "'('", "')'", "'['", "']'", "'<-'", 
		null, "'Scale'", "'Trans'", "'Width'", "'Height'", "'Auto'", "'On'", "'Off'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Plus", "Minus", "Times", "Divide", "Comma", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "Assign", "Newline", "Scale", "Trans", 
		"Width", "Height", "Auto", "On", "Off", "Integer", "Decimal", "Whitespace", 
		"Comment"
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


	public FacataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Facata.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\5\24m\n\24\3\24"+
		"\3\24\3\24\7\24r\n\24\f\24\16\24u\13\24\5\24w\n\24\3\25\3\25\3\25\6\25"+
		"|\n\25\r\25\16\25}\5\25\u0080\n\25\3\26\6\26\u0083\n\26\r\26\16\26\u0084"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u008c\n\27\f\27\16\27\u008f\13\27\3\27"+
		"\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\t\3\2\f\f\3\2\62\62"+
		"\3\2\63;\3\2\62;\3\2\60\60\5\2\13\13\17\17\"\"\3\2\61\61\2\u0098\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61"+
		"\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2"+
		"\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33L\3\2"+
		"\2\2\35R\3\2\2\2\37X\3\2\2\2!_\3\2\2\2#d\3\2\2\2%g\3\2\2\2\'l\3\2\2\2"+
		")x\3\2\2\2+\u0082\3\2\2\2-\u0088\3\2\2\2/\60\7-\2\2\60\4\3\2\2\2\61\62"+
		"\7/\2\2\62\6\3\2\2\2\63\64\7,\2\2\64\b\3\2\2\2\65\66\7\61\2\2\66\n\3\2"+
		"\2\2\678\7.\2\28\f\3\2\2\29:\7*\2\2:\16\3\2\2\2;<\7+\2\2<\20\3\2\2\2="+
		">\7]\2\2>\22\3\2\2\2?@\7_\2\2@\24\3\2\2\2AB\7>\2\2BC\7/\2\2C\26\3\2\2"+
		"\2DE\t\2\2\2E\30\3\2\2\2FG\7U\2\2GH\7e\2\2HI\7c\2\2IJ\7n\2\2JK\7g\2\2"+
		"K\32\3\2\2\2LM\7V\2\2MN\7t\2\2NO\7c\2\2OP\7p\2\2PQ\7u\2\2Q\34\3\2\2\2"+
		"RS\7Y\2\2ST\7k\2\2TU\7f\2\2UV\7v\2\2VW\7j\2\2W\36\3\2\2\2XY\7J\2\2YZ\7"+
		"g\2\2Z[\7k\2\2[\\\7i\2\2\\]\7j\2\2]^\7v\2\2^ \3\2\2\2_`\7C\2\2`a\7w\2"+
		"\2ab\7v\2\2bc\7q\2\2c\"\3\2\2\2de\7Q\2\2ef\7p\2\2f$\3\2\2\2gh\7Q\2\2h"+
		"i\7h\2\2ij\7h\2\2j&\3\2\2\2km\5\5\3\2lk\3\2\2\2lm\3\2\2\2mv\3\2\2\2nw"+
		"\t\3\2\2os\t\4\2\2pr\t\5\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t"+
		"w\3\2\2\2us\3\2\2\2vn\3\2\2\2vo\3\2\2\2w(\3\2\2\2x\177\5\'\24\2y{\t\6"+
		"\2\2z|\t\5\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177y\3\2\2\2\177\u0080\3\2\2\2\u0080*\3\2\2\2\u0081\u0083\t\7\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\26\2\2\u0087,\3\2\2\2\u0088\u0089"+
		"\t\b\2\2\u0089\u008d\t\b\2\2\u008a\u008c\n\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0091\b\27\2\2\u0091.\3\2\2\2\n\2lsv}\177"+
		"\u0084\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}