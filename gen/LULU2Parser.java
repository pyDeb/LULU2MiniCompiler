// Generated from E:/FinalProject (2)/temp\LULU2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LULU2Parser extends Parser {
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
		T__59=60, T__60=61, T__61=62, T__62=63, ID=64, WS=65, INT_CONST=66, DIGIT=67, 
		VALID_CHAR=68, CHAR_CONST=69, STRING_CONST=70, BOOL_CONST=71, REAL_CONST=72, 
		COMMENT=73, LINE_COMMENT=74, KORSH_OPEN=75, KORSH_CLOSE=76;
	public static final int
		RULE_program = 0, RULE_ft_dcl = 1, RULE_func_dcl = 2, RULE_args = 3, RULE_args_var = 4, 
		RULE_type = 5, RULE_type_dcl = 6, RULE_var_def = 7, RULE_var_val = 8, 
		RULE_list = 9, RULE_ft_def = 10, RULE_type_def = 11, RULE_component = 12, 
		RULE_access_modifier = 13, RULE_fun_def = 14, RULE_block = 15, RULE_stmt = 16, 
		RULE_assign = 17, RULE_var = 18, RULE_ref = 19, RULE_expr = 20, RULE_func_call = 21, 
		RULE_params = 22, RULE_cond_stmt = 23, RULE_loop_stmt = 24, RULE_goto_ = 25, 
		RULE_label = 26, RULE_const_val = 27, RULE_unary_op = 28;
	public static final String[] ruleNames = {
		"program", "ft_dcl", "func_dcl", "args", "args_var", "type", "type_dcl", 
		"var_def", "var_val", "list", "ft_def", "type_def", "component", "access_modifier", 
		"fun_def", "block", "stmt", "assign", "var", "ref", "expr", "func_call", 
		"params", "cond_stmt", "loop_stmt", "goto_", "label", "const_val", "unary_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declare'", "'{'", "'}'", "'('", "')'", "'='", "';'", "','", "'int'", 
		"'bool'", "'float'", "'long'", "'char'", "'double'", "'string'", "'const'", 
		"'allocate'", "'type'", "':'", "'private'", "'public'", "'protected'", 
		"'function'", "'return'", "'break'", "'continue'", "'destruct'", "'new'", 
		"'this'", "'super'", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", "'&'", 
		"'^'", "'|'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", 
		"'nil'", "'sizeof'", "'read'", "'write'", "'if'", "'else'", "'switch'", 
		"'of'", "'case'", "'int_const'", "'default'", "'for'", "'while'", "'goto'", 
		"'!'", "'~'", null, null, null, null, null, null, null, null, null, null, 
		null, "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "WS", "INT_CONST", "DIGIT", "VALID_CHAR", 
		"CHAR_CONST", "STRING_CONST", "BOOL_CONST", "REAL_CONST", "COMMENT", "LINE_COMMENT", 
		"KORSH_OPEN", "KORSH_CLOSE"
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

	@Override
	public String getGrammarFileName() { return "LULU2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LULU2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LULU2Parser.EOF, 0); }
		public Ft_dclContext ft_dcl() {
			return getRuleContext(Ft_dclContext.class,0);
		}
		public List<Ft_defContext> ft_def() {
			return getRuleContexts(Ft_defContext.class);
		}
		public Ft_defContext ft_def(int i) {
			return getRuleContext(Ft_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(58);
				ft_dcl();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__17) | (1L << T__22))) != 0)) {
				{
				{
				setState(61);
				ft_def();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ft_dclContext extends ParserRuleContext {
		public List<Func_dclContext> func_dcl() {
			return getRuleContexts(Func_dclContext.class);
		}
		public Func_dclContext func_dcl(int i) {
			return getRuleContext(Func_dclContext.class,i);
		}
		public List<Type_dclContext> type_dcl() {
			return getRuleContexts(Type_dclContext.class);
		}
		public Type_dclContext type_dcl(int i) {
			return getRuleContext(Type_dclContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public Ft_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterFt_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitFt_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitFt_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_dclContext ft_dcl() throws RecognitionException {
		Ft_dclContext _localctx = new Ft_dclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ft_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(T__1);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(71);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(72);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(73);
					var_def();
					}
					break;
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (T__9 - 4)) | (1L << (T__10 - 4)) | (1L << (T__11 - 4)) | (1L << (T__12 - 4)) | (1L << (T__13 - 4)) | (1L << (T__14 - 4)) | (1L << (T__15 - 4)) | (1L << (ID - 4)))) != 0) );
			setState(78);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Func_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterFunc_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitFunc_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitFunc_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_dclContext func_dcl() throws RecognitionException {
		Func_dclContext _localctx = new Func_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(80);
				match(T__3);
				setState(81);
				args(0);
				setState(82);
				match(T__4);
				setState(83);
				match(T__5);
				}
			}

			setState(87);
			match(ID);
			setState(88);
			match(T__3);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(89);
				args(0);
				}
				break;
			case 2:
				{
				setState(90);
				args_var(0);
				}
				break;
			}
			setState(93);
			match(T__4);
			setState(94);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> KORSH_OPEN() { return getTokens(LULU2Parser.KORSH_OPEN); }
		public TerminalNode KORSH_OPEN(int i) {
			return getToken(LULU2Parser.KORSH_OPEN, i);
		}
		public List<TerminalNode> KORSH_CLOSE() { return getTokens(LULU2Parser.KORSH_CLOSE); }
		public TerminalNode KORSH_CLOSE(int i) {
			return getToken(LULU2Parser.KORSH_CLOSE, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(97);
			type();
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(KORSH_OPEN);
					setState(99);
					match(KORSH_CLOSE);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(105);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(106);
					match(T__7);
					setState(107);
					type();
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(108);
							match(KORSH_OPEN);
							setState(109);
							match(KORSH_CLOSE);
							}
							} 
						}
						setState(114);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Args_varContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public List<TerminalNode> KORSH_OPEN() { return getTokens(LULU2Parser.KORSH_OPEN); }
		public TerminalNode KORSH_OPEN(int i) {
			return getToken(LULU2Parser.KORSH_OPEN, i);
		}
		public List<TerminalNode> KORSH_CLOSE() { return getTokens(LULU2Parser.KORSH_CLOSE); }
		public TerminalNode KORSH_CLOSE(int i) {
			return getToken(LULU2Parser.KORSH_CLOSE, i);
		}
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Args_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterArgs_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitArgs_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitArgs_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_varContext args_var() throws RecognitionException {
		return args_var(0);
	}

	private Args_varContext args_var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_varContext _localctx = new Args_varContext(_ctx, _parentState);
		Args_varContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			type();
			setState(122);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(KORSH_OPEN);
					setState(124);
					match(KORSH_CLOSE);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_varContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_var);
					setState(130);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(131);
					match(T__7);
					setState(132);
					type();
					setState(133);
					match(ID);
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(134);
							match(KORSH_OPEN);
							setState(135);
							match(KORSH_CLOSE);
							}
							} 
						}
						setState(140);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__9 - 9)) | (1L << (T__10 - 9)) | (1L << (T__11 - 9)) | (1L << (T__12 - 9)) | (1L << (T__13 - 9)) | (1L << (T__14 - 9)) | (1L << (ID - 9)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public Type_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterType_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitType_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitType_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dclContext type_dcl() throws RecognitionException {
		Type_dclContext _localctx = new Type_dclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(149);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_valContext> var_val() {
			return getRuleContexts(Var_valContext.class);
		}
		public Var_valContext var_val(int i) {
			return getRuleContext(Var_valContext.class,i);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(151);
				match(T__15);
				}
			}

			setState(154);
			type();
			setState(155);
			var_val();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(156);
				match(T__7);
				setState(157);
				var_val();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_valContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LULU2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LULU2Parser.ID, i);
		}
		public List<TerminalNode> KORSH_OPEN() { return getTokens(LULU2Parser.KORSH_OPEN); }
		public TerminalNode KORSH_OPEN(int i) {
			return getToken(LULU2Parser.KORSH_OPEN, i);
		}
		public List<TerminalNode> INT_CONST() { return getTokens(LULU2Parser.INT_CONST); }
		public TerminalNode INT_CONST(int i) {
			return getToken(LULU2Parser.INT_CONST, i);
		}
		public List<TerminalNode> KORSH_CLOSE() { return getTokens(LULU2Parser.KORSH_CLOSE); }
		public TerminalNode KORSH_CLOSE(int i) {
			return getToken(LULU2Parser.KORSH_CLOSE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Var_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterVar_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitVar_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitVar_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valContext var_val() throws RecognitionException {
		Var_valContext _localctx = new Var_valContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KORSH_OPEN) {
				{
				{
				setState(166);
				match(KORSH_OPEN);
				setState(167);
				match(INT_CONST);
				setState(168);
				match(KORSH_CLOSE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(174);
				match(T__5);
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__28:
				case T__29:
				case T__35:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__61:
				case T__62:
				case ID:
				case INT_CONST:
				case CHAR_CONST:
				case STRING_CONST:
				case BOOL_CONST:
				case REAL_CONST:
					{
					setState(175);
					expr(0);
					}
					break;
				case KORSH_OPEN:
					{
					setState(176);
					list();
					}
					break;
				case T__16:
					{
					setState(177);
					match(T__16);
					setState(178);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode KORSH_OPEN() { return getToken(LULU2Parser.KORSH_OPEN, 0); }
		public TerminalNode KORSH_CLOSE() { return getToken(LULU2Parser.KORSH_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(KORSH_OPEN);
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__28:
			case T__29:
			case T__35:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__61:
			case T__62:
			case ID:
			case INT_CONST:
			case CHAR_CONST:
			case STRING_CONST:
			case BOOL_CONST:
			case REAL_CONST:
				{
				setState(184);
				expr(0);
				}
				break;
			case KORSH_OPEN:
				{
				setState(185);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(188);
				match(T__7);
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__28:
				case T__29:
				case T__35:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__61:
				case T__62:
				case ID:
				case INT_CONST:
				case CHAR_CONST:
				case STRING_CONST:
				case BOOL_CONST:
				case REAL_CONST:
					{
					setState(189);
					expr(0);
					}
					break;
				case KORSH_OPEN:
					{
					setState(190);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(KORSH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ft_defContext extends ParserRuleContext {
		public List<Type_defContext> type_def() {
			return getRuleContexts(Type_defContext.class);
		}
		public Type_defContext type_def(int i) {
			return getRuleContext(Type_defContext.class,i);
		}
		public List<Fun_defContext> fun_def() {
			return getRuleContexts(Fun_defContext.class);
		}
		public Fun_defContext fun_def(int i) {
			return getRuleContext(Fun_defContext.class,i);
		}
		public Ft_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterFt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitFt_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitFt_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_defContext ft_def() throws RecognitionException {
		Ft_defContext _localctx = new Ft_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ft_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(202);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(200);
						type_def();
						}
						break;
					case T__3:
					case T__22:
						{
						setState(201);
						fun_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_defContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LULU2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LULU2Parser.ID, i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__17);
			setState(207);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(208);
				match(T__18);
				setState(209);
				match(ID);
				}
			}

			setState(212);
			match(T__1);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				component();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (T__9 - 4)) | (1L << (T__10 - 4)) | (1L << (T__11 - 4)) | (1L << (T__12 - 4)) | (1L << (T__13 - 4)) | (1L << (T__14 - 4)) | (1L << (T__15 - 4)) | (1L << (T__19 - 4)) | (1L << (T__20 - 4)) | (1L << (T__21 - 4)) | (1L << (T__22 - 4)) | (1L << (ID - 4)))) != 0) );
			setState(218);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(220);
				access_modifier();
				}
			}

			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case ID:
				{
				setState(223);
				var_def();
				}
				break;
			case T__3:
			case T__22:
				{
				setState(224);
				fun_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Args_varContext> args_var() {
			return getRuleContexts(Args_varContext.class);
		}
		public Args_varContext args_var(int i) {
			return getRuleContext(Args_varContext.class,i);
		}
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitFun_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitFun_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(229);
				match(T__3);
				setState(230);
				args_var(0);
				setState(231);
				match(T__4);
				setState(232);
				match(T__5);
				}
			}

			setState(236);
			match(T__22);
			setState(237);
			match(ID);
			setState(238);
			match(T__3);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__9 - 9)) | (1L << (T__10 - 9)) | (1L << (T__11 - 9)) | (1L << (T__12 - 9)) | (1L << (T__13 - 9)) | (1L << (T__14 - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(239);
				args_var(0);
				}
			}

			setState(242);
			match(T__4);
			setState(243);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__1);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ID - 64)) | (1L << (INT_CONST - 64)) | (1L << (CHAR_CONST - 64)) | (1L << (STRING_CONST - 64)) | (1L << (BOOL_CONST - 64)) | (1L << (REAL_CONST - 64)))) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(246);
					var_def();
					}
					break;
				case 2:
					{
					setState(247);
					stmt();
					}
					break;
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Goto_Context goto_() {
			return getRuleContext(Goto_Context.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public List<TerminalNode> KORSH_OPEN() { return getTokens(LULU2Parser.KORSH_OPEN); }
		public TerminalNode KORSH_OPEN(int i) {
			return getToken(LULU2Parser.KORSH_OPEN, i);
		}
		public List<TerminalNode> KORSH_CLOSE() { return getTokens(LULU2Parser.KORSH_CLOSE); }
		public TerminalNode KORSH_CLOSE(int i) {
			return getToken(LULU2Parser.KORSH_CLOSE, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmt);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				assign();
				setState(256);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				func_call();
				setState(259);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(T__23);
				setState(264);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				goto_();
				setState(266);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				expr(0);
				setState(270);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				match(T__24);
				setState(273);
				match(T__6);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(274);
				match(T__25);
				setState(275);
				match(T__6);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(276);
				match(T__26);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KORSH_OPEN) {
					{
					{
					setState(277);
					match(KORSH_OPEN);
					setState(278);
					match(KORSH_CLOSE);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(ID);
				setState(285);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				var();
				setState(289);
				match(T__5);
				setState(290);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				var();
				setState(293);
				match(T__5);
				setState(294);
				match(T__27);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(T__3);
				setState(297);
				var();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(298);
					match(T__7);
					setState(299);
					var();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__4);
				setState(306);
				match(T__5);
				setState(307);
				func_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29) {
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				match(T__30);
				}
			}

			setState(315);
			ref();
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					match(T__30);
					setState(317);
					ref();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public List<TerminalNode> KORSH_OPEN() { return getTokens(LULU2Parser.KORSH_OPEN); }
		public TerminalNode KORSH_OPEN(int i) {
			return getToken(LULU2Parser.KORSH_OPEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> KORSH_CLOSE() { return getTokens(LULU2Parser.KORSH_CLOSE); }
		public TerminalNode KORSH_CLOSE(int i) {
			return getToken(LULU2Parser.KORSH_CLOSE, i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ID);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					match(KORSH_OPEN);
					setState(325);
					expr(0);
					setState(326);
					match(KORSH_CLOSE);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Const_valContext const_val() {
			return getRuleContext(Const_valContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(334);
				match(T__3);
				setState(335);
				expr(0);
				setState(336);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(338);
				const_val();
				}
				break;
			case 3:
				{
				setState(339);
				unary_op();
				setState(340);
				expr(4);
				}
				break;
			case 4:
				{
				setState(342);
				func_call();
				}
				break;
			case 5:
				{
				setState(343);
				var();
				}
				break;
			case 6:
				{
				setState(344);
				match(T__47);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(395);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						{
						setState(348);
						match(T__31);
						}
						setState(349);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						{
						setState(351);
						match(T__32);
						}
						setState(352);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						{
						setState(354);
						match(T__33);
						}
						setState(355);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(356);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						{
						setState(357);
						match(T__34);
						}
						setState(358);
						expr(20);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						{
						setState(360);
						match(T__35);
						}
						setState(361);
						expr(19);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						{
						setState(363);
						match(T__36);
						}
						setState(364);
						expr(18);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						{
						setState(366);
						match(T__37);
						}
						setState(367);
						expr(17);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(368);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(369);
						match(T__38);
						}
						setState(370);
						expr(16);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(371);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						{
						setState(372);
						match(T__39);
						}
						setState(373);
						expr(15);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(374);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(375);
						match(T__40);
						}
						setState(376);
						expr(14);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(377);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						{
						setState(378);
						match(T__41);
						}
						setState(379);
						expr(13);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(380);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						{
						setState(381);
						match(T__42);
						}
						setState(382);
						expr(12);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(384);
						match(T__43);
						}
						setState(385);
						expr(11);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(386);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(387);
						match(T__44);
						}
						setState(388);
						expr(10);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(389);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(390);
						match(T__45);
						}
						setState(391);
						expr(9);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(392);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(393);
						match(T__46);
						}
						setState(394);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_call);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(400);
					var();
					setState(401);
					match(T__30);
					}
					break;
				}
				setState(405);
				match(ID);
				setState(406);
				match(T__3);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ID - 64)) | (1L << (INT_CONST - 64)) | (1L << (CHAR_CONST - 64)) | (1L << (STRING_CONST - 64)) | (1L << (BOOL_CONST - 64)) | (1L << (REAL_CONST - 64)))) != 0)) {
					{
					setState(407);
					params();
					}
				}

				setState(410);
				match(T__4);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T__48);
				setState(412);
				match(T__3);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(413);
					type();
					}
					break;
				case 2:
					{
					setState(414);
					var();
					}
					break;
				}
				setState(417);
				match(T__4);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(T__49);
				setState(420);
				match(T__3);
				setState(421);
				var();
				setState(422);
				match(T__4);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(T__50);
				setState(425);
				match(T__3);
				setState(426);
				var();
				setState(427);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_params);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				expr(0);
				setState(433);
				match(T__7);
				setState(434);
				params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond_stmt);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T__51);
				setState(439);
				match(T__3);
				setState(440);
				expr(0);
				setState(441);
				match(T__4);
				setState(442);
				block();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(443);
					match(T__52);
					setState(444);
					block();
					}
				}

				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__53);
				setState(448);
				match(T__3);
				setState(449);
				var();
				setState(450);
				match(T__4);
				setState(451);
				match(T__54);
				setState(452);
				match(T__18);
				setState(453);
				match(T__1);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(454);
					match(T__55);
					setState(455);
					match(T__56);
					setState(456);
					match(T__18);
					setState(457);
					block();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(T__57);
				setState(464);
				match(T__18);
				setState(465);
				block();
				setState(466);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitLoop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitLoop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop_stmt);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(T__58);
				setState(471);
				match(T__3);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__9 - 9)) | (1L << (T__10 - 9)) | (1L << (T__11 - 9)) | (1L << (T__12 - 9)) | (1L << (T__13 - 9)) | (1L << (T__14 - 9)) | (1L << (T__15 - 9)) | (1L << (ID - 9)))) != 0)) {
					{
					setState(472);
					var_def();
					}
				}

				setState(475);
				match(T__6);
				setState(476);
				expr(0);
				setState(477);
				match(T__6);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__28 - 4)) | (1L << (T__29 - 4)) | (1L << (ID - 4)))) != 0)) {
					{
					setState(478);
					assign();
					}
				}

				setState(481);
				match(T__4);
				setState(482);
				block();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(T__59);
				setState(485);
				match(T__3);
				setState(486);
				expr(0);
				setState(487);
				match(T__4);
				setState(488);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Goto_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public Goto_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterGoto_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitGoto_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitGoto_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_Context goto_() throws RecognitionException {
		Goto_Context _localctx = new Goto_Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_goto_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__60);
			setState(493);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LULU2Parser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(ID);
			setState(496);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_valContext extends ParserRuleContext {
		public TerminalNode INT_CONST() { return getToken(LULU2Parser.INT_CONST, 0); }
		public TerminalNode REAL_CONST() { return getToken(LULU2Parser.REAL_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(LULU2Parser.CHAR_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(LULU2Parser.BOOL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(LULU2Parser.STRING_CONST, 0); }
		public Const_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterConst_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitConst_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitConst_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valContext const_val() throws RecognitionException {
		Const_valContext _localctx = new Const_valContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_CONST - 66)) | (1L << (CHAR_CONST - 66)) | (1L << (STRING_CONST - 66)) | (1L << (BOOL_CONST - 66)) | (1L << (REAL_CONST - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LULU2Listener ) ((LULU2Listener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LULU2Visitor ) return ((LULU2Visitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__61) | (1L << T__62))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 4:
			return args_var_sempred((Args_varContext)_localctx, predIndex);
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_var_sempred(Args_varContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u01f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3M\n\3\r\3\16\3N"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\5\3\5\3\5\7\5q"+
		"\n\5\f\5\16\5t\13\5\7\5v\n\5\f\5\16\5y\13\5\3\6\3\6\3\6\3\6\3\6\7\6\u0080"+
		"\n\6\f\6\16\6\u0083\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16"+
		"\6\u008e\13\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\5\t\u009b\n\t\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16\n\u00af\13\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00b6\n\n\5\n\u00b8\n\n\3\13\3\13\3\13\5\13\u00bd\n\13\3\13\3"+
		"\13\3\13\5\13\u00c2\n\13\7\13\u00c4\n\13\f\13\16\13\u00c7\13\13\3\13\3"+
		"\13\3\f\3\f\6\f\u00cd\n\f\r\f\16\f\u00ce\3\r\3\r\3\r\3\r\5\r\u00d5\n\r"+
		"\3\r\3\r\6\r\u00d9\n\r\r\r\16\r\u00da\3\r\3\r\3\16\5\16\u00e0\n\16\3\16"+
		"\3\16\5\16\u00e4\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00ed\n"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00f3\n\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u00fb\n\21\f\21\16\21\u00fe\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011a\n\22\f\22\16\22\u011d\13\22"+
		"\3\22\3\22\5\22\u0121\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u012f\n\23\f\23\16\23\u0132\13\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0138\n\23\3\24\3\24\5\24\u013c\n\24\3\24\3\24\3\24\7\24\u0141"+
		"\n\24\f\24\16\24\u0144\13\24\3\25\3\25\3\25\3\25\3\25\7\25\u014b\n\25"+
		"\f\25\16\25\u014e\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u015c\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u018e"+
		"\n\26\f\26\16\26\u0191\13\26\3\27\3\27\3\27\5\27\u0196\n\27\3\27\3\27"+
		"\3\27\5\27\u019b\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01a2\n\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01b0\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01b7\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u01c0\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u01cd\n\31\f\31\16\31\u01d0\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01d7\n\31\3\32\3\32\3\32\5\32\u01dc\n\32\3\32\3\32\3\32\3\32\5"+
		"\32\u01e2\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ed"+
		"\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\2\5\b\n*"+
		"\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7"+
		"\4\2\13\21BB\3\2\26\30\3\2\37 \4\2DDGJ\4\2&&@A\2\u022f\2=\3\2\2\2\4G\3"+
		"\2\2\2\6W\3\2\2\2\bb\3\2\2\2\nz\3\2\2\2\f\u0094\3\2\2\2\16\u0096\3\2\2"+
		"\2\20\u009a\3\2\2\2\22\u00a7\3\2\2\2\24\u00b9\3\2\2\2\26\u00cc\3\2\2\2"+
		"\30\u00d0\3\2\2\2\32\u00df\3\2\2\2\34\u00e5\3\2\2\2\36\u00ec\3\2\2\2 "+
		"\u00f7\3\2\2\2\"\u0120\3\2\2\2$\u0137\3\2\2\2&\u013b\3\2\2\2(\u0145\3"+
		"\2\2\2*\u015b\3\2\2\2,\u01af\3\2\2\2.\u01b6\3\2\2\2\60\u01d6\3\2\2\2\62"+
		"\u01ec\3\2\2\2\64\u01ee\3\2\2\2\66\u01f1\3\2\2\28\u01f4\3\2\2\2:\u01f6"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>B\3\2\2\2?A\5\26\f\2@?\3\2\2\2"+
		"AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\2\2\3F\3\3\2\2"+
		"\2GH\7\3\2\2HL\7\4\2\2IM\5\6\4\2JM\5\16\b\2KM\5\20\t\2LI\3\2\2\2LJ\3\2"+
		"\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\5\2\2Q\5\3"+
		"\2\2\2RS\7\6\2\2ST\5\b\5\2TU\7\7\2\2UV\7\b\2\2VX\3\2\2\2WR\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2YZ\7B\2\2Z]\7\6\2\2[^\5\b\5\2\\^\5\n\6\2][\3\2\2\2]\\"+
		"\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\7\2\2`a\7\t\2\2a\7\3\2\2\2bc\b\5\1\2"+
		"ch\5\f\7\2de\7M\2\2eg\7N\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i"+
		"w\3\2\2\2jh\3\2\2\2kl\f\3\2\2lm\7\n\2\2mr\5\f\7\2no\7M\2\2oq\7N\2\2pn"+
		"\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uk\3\2\2\2v"+
		"y\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z{\b\6\1\2{|\5\f\7\2"+
		"|\u0081\7B\2\2}~\7M\2\2~\u0080\7N\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0091\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\f\3\2\2\u0085\u0086\7\n\2\2\u0086\u0087\5\f\7\2\u0087"+
		"\u008c\7B\2\2\u0088\u0089\7M\2\2\u0089\u008b\7N\2\2\u008a\u0088\3\2\2"+
		"\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0084\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\13\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0094\u0095\t\2\2\2\u0095\r\3\2\2\2\u0096\u0097\7B\2\2\u0097\u0098"+
		"\7\t\2\2\u0098\17\3\2\2\2\u0099\u009b\7\22\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\5\f\7\2\u009d\u00a2\5\22"+
		"\n\2\u009e\u009f\7\n\2\2\u009f\u00a1\5\22\n\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\t\2\2\u00a6\21\3\2\2\2\u00a7\u00ad"+
		"\7B\2\2\u00a8\u00a9\7M\2\2\u00a9\u00aa\7D\2\2\u00aa\u00ac\7N\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b7\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\7\b\2\2\u00b1"+
		"\u00b6\5*\26\2\u00b2\u00b6\5\24\13\2\u00b3\u00b4\7\23\2\2\u00b4\u00b6"+
		"\7B\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\23\3\2\2"+
		"\2\u00b9\u00bc\7M\2\2\u00ba\u00bd\5*\26\2\u00bb\u00bd\5\24\13\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c5\3\2\2\2\u00be\u00c1\7\n"+
		"\2\2\u00bf\u00c2\5*\26\2\u00c0\u00c2\5\24\13\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7N\2\2\u00c9\25\3\2\2\2\u00ca\u00cd\5\30\r"+
		"\2\u00cb\u00cd\5\36\20\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2"+
		"\2\u00d0\u00d1\7\24\2\2\u00d1\u00d4\7B\2\2\u00d2\u00d3\7\25\2\2\u00d3"+
		"\u00d5\7B\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\7\4\2\2\u00d7\u00d9\5\32\16\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\7\5\2\2\u00dd\31\3\2\2\2\u00de\u00e0\5\34\17\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00e4\5\20"+
		"\t\2\u00e2\u00e4\5\36\20\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\33\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6\35\3\2\2\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00e9\5\n\6\2\u00e9\u00ea\7\7\2\2\u00ea\u00eb\7\b\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7\31\2\2\u00ef\u00f0\7B\2\2\u00f0\u00f2\7\6\2\2\u00f1\u00f3\5\n"+
		"\6\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\7\7\2\2\u00f5\u00f6\5 \21\2\u00f6\37\3\2\2\2\u00f7\u00fc\7\4\2"+
		"\2\u00f8\u00fb\5\20\t\2\u00f9\u00fb\5\"\22\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\5\2\2\u0100"+
		"!\3\2\2\2\u0101\u0102\5$\23\2\u0102\u0103\7\t\2\2\u0103\u0121\3\2\2\2"+
		"\u0104\u0105\5,\27\2\u0105\u0106\7\t\2\2\u0106\u0121\3\2\2\2\u0107\u0121"+
		"\5\60\31\2\u0108\u0121\5\62\32\2\u0109\u010a\7\32\2\2\u010a\u0121\7\t"+
		"\2\2\u010b\u010c\5\64\33\2\u010c\u010d\7\t\2\2\u010d\u0121\3\2\2\2\u010e"+
		"\u0121\5\66\34\2\u010f\u0110\5*\26\2\u0110\u0111\7\t\2\2\u0111\u0121\3"+
		"\2\2\2\u0112\u0113\7\33\2\2\u0113\u0121\7\t\2\2\u0114\u0115\7\34\2\2\u0115"+
		"\u0121\7\t\2\2\u0116\u011b\7\35\2\2\u0117\u0118\7M\2\2\u0118\u011a\7N"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7B"+
		"\2\2\u011f\u0121\7\t\2\2\u0120\u0101\3\2\2\2\u0120\u0104\3\2\2\2\u0120"+
		"\u0107\3\2\2\2\u0120\u0108\3\2\2\2\u0120\u0109\3\2\2\2\u0120\u010b\3\2"+
		"\2\2\u0120\u010e\3\2\2\2\u0120\u010f\3\2\2\2\u0120\u0112\3\2\2\2\u0120"+
		"\u0114\3\2\2\2\u0120\u0116\3\2\2\2\u0121#\3\2\2\2\u0122\u0123\5&\24\2"+
		"\u0123\u0124\7\b\2\2\u0124\u0125\5*\26\2\u0125\u0138\3\2\2\2\u0126\u0127"+
		"\5&\24\2\u0127\u0128\7\b\2\2\u0128\u0129\7\36\2\2\u0129\u0138\3\2\2\2"+
		"\u012a\u012b\7\6\2\2\u012b\u0130\5&\24\2\u012c\u012d\7\n\2\2\u012d\u012f"+
		"\5&\24\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\7"+
		"\2\2\u0134\u0135\7\b\2\2\u0135\u0136\5,\27\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0122\3\2\2\2\u0137\u0126\3\2\2\2\u0137\u012a\3\2\2\2\u0138%\3\2\2\2"+
		"\u0139\u013a\t\4\2\2\u013a\u013c\7!\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142\5(\25\2\u013e\u013f\7!\2\2\u013f"+
		"\u0141\5(\25\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\'\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u014c"+
		"\7B\2\2\u0146\u0147\7M\2\2\u0147\u0148\5*\26\2\u0148\u0149\7N\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d)\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150"+
		"\b\26\1\2\u0150\u0151\7\6\2\2\u0151\u0152\5*\26\2\u0152\u0153\7\7\2\2"+
		"\u0153\u015c\3\2\2\2\u0154\u015c\58\35\2\u0155\u0156\5:\36\2\u0156\u0157"+
		"\5*\26\6\u0157\u015c\3\2\2\2\u0158\u015c\5,\27\2\u0159\u015c\5&\24\2\u015a"+
		"\u015c\7\62\2\2\u015b\u014f\3\2\2\2\u015b\u0154\3\2\2\2\u015b\u0155\3"+
		"\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u018f\3\2\2\2\u015d\u015e\f\30\2\2\u015e\u015f\7\"\2\2\u015f\u018e\5"+
		"*\26\31\u0160\u0161\f\27\2\2\u0161\u0162\7#\2\2\u0162\u018e\5*\26\30\u0163"+
		"\u0164\f\26\2\2\u0164\u0165\7$\2\2\u0165\u018e\5*\26\27\u0166\u0167\f"+
		"\25\2\2\u0167\u0168\7%\2\2\u0168\u018e\5*\26\26\u0169\u016a\f\24\2\2\u016a"+
		"\u016b\7&\2\2\u016b\u018e\5*\26\25\u016c\u016d\f\23\2\2\u016d\u016e\7"+
		"\'\2\2\u016e\u018e\5*\26\24\u016f\u0170\f\22\2\2\u0170\u0171\7(\2\2\u0171"+
		"\u018e\5*\26\23\u0172\u0173\f\21\2\2\u0173\u0174\7)\2\2\u0174\u018e\5"+
		"*\26\22\u0175\u0176\f\20\2\2\u0176\u0177\7*\2\2\u0177\u018e\5*\26\21\u0178"+
		"\u0179\f\17\2\2\u0179\u017a\7+\2\2\u017a\u018e\5*\26\20\u017b\u017c\f"+
		"\16\2\2\u017c\u017d\7,\2\2\u017d\u018e\5*\26\17\u017e\u017f\f\r\2\2\u017f"+
		"\u0180\7-\2\2\u0180\u018e\5*\26\16\u0181\u0182\f\f\2\2\u0182\u0183\7."+
		"\2\2\u0183\u018e\5*\26\r\u0184\u0185\f\13\2\2\u0185\u0186\7/\2\2\u0186"+
		"\u018e\5*\26\f\u0187\u0188\f\n\2\2\u0188\u0189\7\60\2\2\u0189\u018e\5"+
		"*\26\13\u018a\u018b\f\t\2\2\u018b\u018c\7\61\2\2\u018c\u018e\5*\26\n\u018d"+
		"\u015d\3\2\2\2\u018d\u0160\3\2\2\2\u018d\u0163\3\2\2\2\u018d\u0166\3\2"+
		"\2\2\u018d\u0169\3\2\2\2\u018d\u016c\3\2\2\2\u018d\u016f\3\2\2\2\u018d"+
		"\u0172\3\2\2\2\u018d\u0175\3\2\2\2\u018d\u0178\3\2\2\2\u018d\u017b\3\2"+
		"\2\2\u018d\u017e\3\2\2\2\u018d\u0181\3\2\2\2\u018d\u0184\3\2\2\2\u018d"+
		"\u0187\3\2\2\2\u018d\u018a\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190+\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193"+
		"\5&\24\2\u0193\u0194\7!\2\2\u0194\u0196\3\2\2\2\u0195\u0192\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7B\2\2\u0198\u019a\7\6"+
		"\2\2\u0199\u019b\5.\30\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u01b0\7\7\2\2\u019d\u019e\7\63\2\2\u019e\u01a1\7"+
		"\6\2\2\u019f\u01a2\5\f\7\2\u01a0\u01a2\5&\24\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\7\2\2\u01a4\u01b0\3\2"+
		"\2\2\u01a5\u01a6\7\64\2\2\u01a6\u01a7\7\6\2\2\u01a7\u01a8\5&\24\2\u01a8"+
		"\u01a9\7\7\2\2\u01a9\u01b0\3\2\2\2\u01aa\u01ab\7\65\2\2\u01ab\u01ac\7"+
		"\6\2\2\u01ac\u01ad\5&\24\2\u01ad\u01ae\7\7\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u0195\3\2\2\2\u01af\u019d\3\2\2\2\u01af\u01a5\3\2\2\2\u01af\u01aa\3\2"+
		"\2\2\u01b0-\3\2\2\2\u01b1\u01b7\5*\26\2\u01b2\u01b3\5*\26\2\u01b3\u01b4"+
		"\7\n\2\2\u01b4\u01b5\5.\30\2\u01b5\u01b7\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6"+
		"\u01b2\3\2\2\2\u01b7/\3\2\2\2\u01b8\u01b9\7\66\2\2\u01b9\u01ba\7\6\2\2"+
		"\u01ba\u01bb\5*\26\2\u01bb\u01bc\7\7\2\2\u01bc\u01bf\5 \21\2\u01bd\u01be"+
		"\7\67\2\2\u01be\u01c0\5 \21\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2"+
		"\u01c0\u01d7\3\2\2\2\u01c1\u01c2\78\2\2\u01c2\u01c3\7\6\2\2\u01c3\u01c4"+
		"\5&\24\2\u01c4\u01c5\7\7\2\2\u01c5\u01c6\79\2\2\u01c6\u01c7\7\25\2\2\u01c7"+
		"\u01ce\7\4\2\2\u01c8\u01c9\7:\2\2\u01c9\u01ca\7;\2\2\u01ca\u01cb\7\25"+
		"\2\2\u01cb\u01cd\5 \21\2\u01cc\u01c8\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d2\7<\2\2\u01d2\u01d3\7\25\2\2\u01d3\u01d4\5 \21\2\u01d4"+
		"\u01d5\7\5\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01b8\3\2\2\2\u01d6\u01c1\3\2"+
		"\2\2\u01d7\61\3\2\2\2\u01d8\u01d9\7=\2\2\u01d9\u01db\7\6\2\2\u01da\u01dc"+
		"\5\20\t\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2"+
		"\u01dd\u01de\7\t\2\2\u01de\u01df\5*\26\2\u01df\u01e1\7\t\2\2\u01e0\u01e2"+
		"\5$\23\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\7\7\2\2\u01e4\u01e5\5 \21\2\u01e5\u01ed\3\2\2\2\u01e6\u01e7\7>"+
		"\2\2\u01e7\u01e8\7\6\2\2\u01e8\u01e9\5*\26\2\u01e9\u01ea\7\7\2\2\u01ea"+
		"\u01eb\5 \21\2\u01eb\u01ed\3\2\2\2\u01ec\u01d8\3\2\2\2\u01ec\u01e6\3\2"+
		"\2\2\u01ed\63\3\2\2\2\u01ee\u01ef\7?\2\2\u01ef\u01f0\7B\2\2\u01f0\65\3"+
		"\2\2\2\u01f1\u01f2\7B\2\2\u01f2\u01f3\7\25\2\2\u01f3\67\3\2\2\2\u01f4"+
		"\u01f5\t\5\2\2\u01f59\3\2\2\2\u01f6\u01f7\t\6\2\2\u01f7;\3\2\2\2\65=B"+
		"LNW]hrw\u0081\u008c\u0091\u009a\u00a2\u00ad\u00b5\u00b7\u00bc\u00c1\u00c5"+
		"\u00cc\u00ce\u00d4\u00da\u00df\u00e3\u00ec\u00f2\u00fa\u00fc\u011b\u0120"+
		"\u0130\u0137\u013b\u0142\u014c\u015b\u018d\u018f\u0195\u019a\u01a1\u01af"+
		"\u01b6\u01bf\u01ce\u01d6\u01db\u01e1\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}