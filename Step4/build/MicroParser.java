// Generated from Micro.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, KEYWORD=34, IDENTIFIER=35, OPERATOR=36, STRINGLITERAL=37, 
		INTLITERAL=38, FLOATLITERAL=39, COMMENT=40, SPACE=41;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'*'", "'-'", "'PROGRAM'", "'('", "'<'", "'READ'", 
		"'CONTINUE;'", "'END'", "'!='", "'<='", "'ELSE'", "'ENDIF'", "'VOID'", 
		"'STRING'", "'IF'", "'BREAK;'", "'WRITE'", "')'", "'+'", "'WHILE'", "'='", 
		"';'", "'FUNCTION'", "'>'", "'FLOAT'", "':='", "'RETURN'", "'/'", "'BEGIN'", 
		"'>='", "'INT'", "'ENDWHILE'", "KEYWORD", "IDENTIFIER", "OPERATOR", "STRINGLITERAL", 
		"INTLITERAL", "FLOATLITERAL", "COMMENT", "SPACE"
	};
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl = 4, 
		RULE_str = 5, RULE_var_decl = 6, RULE_var_type = 7, RULE_any_type = 8, 
		RULE_id_list = 9, RULE_id_tail = 10, RULE_param_decl_list = 11, RULE_param_decl = 12, 
		RULE_param_decl_tail = 13, RULE_func_declarations = 14, RULE_func_decl = 15, 
		RULE_func_body = 16, RULE_stmt_list = 17, RULE_stmt = 18, RULE_base_stmt = 19, 
		RULE_assign_stmt = 20, RULE_assign_expr = 21, RULE_read_stmt = 22, RULE_write_stmt = 23, 
		RULE_return_stmt = 24, RULE_expr = 25, RULE_expr_prefix = 26, RULE_factor = 27, 
		RULE_factor_prefix = 28, RULE_postfix_expr = 29, RULE_call_expr = 30, 
		RULE_expr_list = 31, RULE_expr_list_tail = 32, RULE_primary_prefix = 33, 
		RULE_primary = 34, RULE_addop = 35, RULE_mulop = 36, RULE_if_stmt = 37, 
		RULE_else_part = 38, RULE_cond = 39, RULE_compop = 40, RULE_while_stmt = 41, 
		RULE_aug_stmt_list = 42, RULE_aug_stmt = 43, RULE_aug_if_stmt = 44, RULE_aug_else_part = 45;
	public static final String[] ruleNames = {
		"program", "id", "pgm_body", "decl", "string_decl", "str", "var_decl", 
		"var_type", "any_type", "id_list", "id_tail", "param_decl_list", "param_decl", 
		"param_decl_tail", "func_declarations", "func_decl", "func_body", "stmt_list", 
		"stmt", "base_stmt", "assign_stmt", "assign_expr", "read_stmt", "write_stmt", 
		"return_stmt", "expr", "expr_prefix", "factor", "factor_prefix", "postfix_expr", 
		"call_expr", "expr_list", "expr_list_tail", "primary_prefix", "primary", 
		"addop", "mulop", "if_stmt", "else_part", "cond", "compop", "while_stmt", 
		"aug_stmt_list", "aug_stmt", "aug_if_stmt", "aug_else_part"
	};

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public SymbolTableTree tree = new SymbolTableTree();

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(T__29);
			setState(93); id();
			setState(94); match(T__3);
			setState(95); pgm_body();
			setState(96); match(T__24);
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

	public static class IdContext extends ParserRuleContext {
		public String idname;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(MicroParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); ((IdContext)_localctx).IDENTIFIER = match(IDENTIFIER);

					((IdContext)_localctx).idname =  (String)(((IdContext)_localctx).IDENTIFIER!=null?((IdContext)_localctx).IDENTIFIER.getText():null);
			 	
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

	public static class Pgm_bodyContext extends ParserRuleContext {
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPgm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPgm_body(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); decl();
			setState(102); func_declarations();
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

	public static class DeclContext extends ParserRuleContext {
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); string_decl();
				setState(105); decl();
				}
				break;
			case T__7:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); var_decl();
				setState(108); decl();
				}
				break;
			case T__26:
			case T__25:
			case T__24:
			case T__21:
			case T__20:
			case T__17:
			case T__16:
			case T__15:
			case T__12:
			case T__9:
			case T__5:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class String_declContext extends ParserRuleContext {
		public IdContext id;
		public StrContext str;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitString_decl(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__18);
			setState(114); ((String_declContext)_localctx).id = id();
			setState(115); match(T__6);
			setState(116); ((String_declContext)_localctx).str = str();
			setState(117); match(T__10);

					tree.insertVariable((((String_declContext)_localctx).id!=null?_input.getText(((String_declContext)_localctx).id.start,((String_declContext)_localctx).id.stop):null), "STRING", (((String_declContext)_localctx).str!=null?_input.getText(((String_declContext)_localctx).str.start,((String_declContext)_localctx).str.stop):null));
				
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(MicroParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(STRINGLITERAL);
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public Id_listContext id_list;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((Var_declContext)_localctx).var_type = var_type();
			setState(123); ((Var_declContext)_localctx).id_list = id_list();
			setState(124); match(T__10);

					tree.insertVariables(((Var_declContext)_localctx).id_list.ids, (((Var_declContext)_localctx).var_type!=null?_input.getText(((Var_declContext)_localctx).var_type.start,((Var_declContext)_localctx).var_type.stop):null));
				
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

	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_any_type);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case T__7:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); var_type();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(T__19);
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

	public static class Id_listContext extends ParserRuleContext {
		public List<String> ids;
		public IdContext id;
		public Id_tailContext id_tail;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); ((Id_listContext)_localctx).id = id();
			setState(134); ((Id_listContext)_localctx).id_tail = id_tail();

					((Id_listContext)_localctx).ids =  ((Id_listContext)_localctx).id_tail.ids_list;
					_localctx.ids.add(0, (((Id_listContext)_localctx).id!=null?_input.getText(((Id_listContext)_localctx).id.start,((Id_listContext)_localctx).id.stop):null));
				
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

	public static class Id_tailContext extends ParserRuleContext {
		public List<String> ids_list;
		public IdContext id;
		public Id_tailContext tmp;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId_tail(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_tail);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(T__32);
				setState(138); ((Id_tailContext)_localctx).id = id();
				setState(139); ((Id_tailContext)_localctx).tmp = id_tail();

						((Id_tailContext)_localctx).ids_list =  ((Id_tailContext)_localctx).tmp.ids_list;
						_localctx.ids_list.add(0, (((Id_tailContext)_localctx).id!=null?_input.getText(((Id_tailContext)_localctx).id.start,((Id_tailContext)_localctx).id.stop):null));
					
				}
				break;
			case T__14:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{

						((Id_tailContext)_localctx).ids_list =  new ArrayList<String>();
					
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

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl_list(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param_decl_list);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case T__7:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); param_decl();
				setState(146); param_decl_tail();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); ((Param_declContext)_localctx).var_type = var_type();
			setState(152); ((Param_declContext)_localctx).id = id();
				
					tree.insertVariable((((Param_declContext)_localctx).id!=null?_input.getText(((Param_declContext)_localctx).id.start,((Param_declContext)_localctx).id.stop):null), (((Param_declContext)_localctx).var_type!=null?_input.getText(((Param_declContext)_localctx).var_type.start,((Param_declContext)_localctx).var_type.stop):null), null);
				
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

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl_tail(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_tail);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(T__32);
				setState(156); param_decl();
				setState(157); param_decl_tail();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_declarations(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_declarations);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); func_decl();
				setState(163); func_declarations();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declContext extends ParserRuleContext {
		public IdContext id;
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(T__9);
			setState(169); any_type();
			setState(170); ((Func_declContext)_localctx).id = id();

					tree.enterScope((((Func_declContext)_localctx).id!=null?_input.getText(((Func_declContext)_localctx).id.start,((Func_declContext)_localctx).id.stop):null));
				
			setState(172); match(T__28);
			setState(173); param_decl_list();
			setState(174); match(T__14);
			setState(175); match(T__3);
			setState(176); func_body();
			setState(177); match(T__24);

					tree.exitScope();
				
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

	public static class Func_bodyContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); decl();
			setState(181); stmt_list();
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

	public static class Stmt_listContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_list);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__26:
			case T__17:
			case T__15:
			case T__12:
			case T__5:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); stmt();
				setState(184); stmt_list();
				}
				break;
			case T__24:
			case T__21:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StmtContext extends ParserRuleContext {
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case T__26:
			case T__15:
			case T__5:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); base_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); if_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); while_stmt();
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

	public static class Base_stmtContext extends ParserRuleContext {
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBase_stmt(this);
		}
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_base_stmt);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); assign_stmt();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); read_stmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); write_stmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(197); return_stmt();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); assign_expr();
			setState(201); match(T__10);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); id();
			setState(204); match(T__6);
			setState(205); expr();
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

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(T__26);
			setState(208); match(T__28);
			setState(209); id_list();
			setState(210); match(T__14);
			setState(211); match(T__10);
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

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitWrite_stmt(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__15);
			setState(214); match(T__28);
			setState(215); id_list();
			setState(216); match(T__14);
			setState(217); match(T__10);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(T__5);
			setState(220); expr();
			setState(221); match(T__10);
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
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); expr_prefix(0);
			setState(224); factor();
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

	public static class Expr_prefixContext extends ParserRuleContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_prefix(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		return expr_prefix(0);
	}

	private Expr_prefixContext expr_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, _parentState);
		Expr_prefixContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_prefix);
					setState(227);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(228); factor();
					setState(229); addop();
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); factor_prefix(0);
			setState(237); postfix_expr();
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

	public static class Factor_prefixContext extends ParserRuleContext {
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public Factor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFactor_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFactor_prefix(this);
		}
	}

	public final Factor_prefixContext factor_prefix() throws RecognitionException {
		return factor_prefix(0);
	}

	private Factor_prefixContext factor_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_prefixContext _localctx = new Factor_prefixContext(_ctx, _parentState);
		Factor_prefixContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_factor_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Factor_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_factor_prefix);
					setState(240);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(241); postfix_expr();
					setState(242); mulop();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Postfix_exprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPostfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPostfix_expr(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_postfix_expr);
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); call_expr();
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

	public static class Call_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); id();
			setState(254); match(T__28);
			setState(255); expr_list();
			setState(256); match(T__14);
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

	public static class Expr_listContext extends ParserRuleContext {
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_list);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); expr();
				setState(259); expr_list_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_list_tail);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); match(T__32);
				setState(265); expr();
				setState(266); expr_list_tail();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Primary_prefixContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPrimary_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPrimary_prefix(this);
		}
	}

	public final Primary_prefixContext primary_prefix() throws RecognitionException {
		Primary_prefixContext _localctx = new Primary_prefixContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(T__28);
			setState(272); expr();
			setState(273); match(T__14);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode FLOATLITERAL() { return getToken(MicroParser.FLOATLITERAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(MicroParser.INTLITERAL, 0); }
		public Primary_prefixContext primary_prefix() {
			return getRuleContext(Primary_prefixContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primary);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); primary_prefix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); id();
				}
				break;
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(277); match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); match(FLOATLITERAL);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class If_stmtContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(T__17);

					tree.enterScope();
				
			setState(287); match(T__28);
			setState(288); cond();
			setState(289); match(T__14);
			setState(290); decl();
			setState(291); stmt_list();

					tree.exitScope();
				
			setState(293); else_part();
			setState(294); match(T__20);
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

	public static class Else_partContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_else_part);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(296); match(T__21);

						tree.enterScope();
					
				setState(298); decl();
				setState(299); stmt_list();

						tree.exitScope();		
					
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CondContext extends ParserRuleContext {
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); expr();
			setState(306); compop();
			setState(307); expr();
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

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__11) | (1L << T__8) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class While_stmtContext extends ParserRuleContext {
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(T__12);

					tree.enterScope();
				
			setState(313); match(T__28);
			setState(314); cond();
			setState(315); match(T__14);
			setState(316); decl();
			setState(317); aug_stmt_list();
			setState(318); match(T__0);

					tree.exitScope();
				
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

	public static class Aug_stmt_listContext extends ParserRuleContext {
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public Aug_stmtContext aug_stmt() {
			return getRuleContext(Aug_stmtContext.class,0);
		}
		public Aug_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAug_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAug_stmt_list(this);
		}
	}

	public final Aug_stmt_listContext aug_stmt_list() throws RecognitionException {
		Aug_stmt_listContext _localctx = new Aug_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aug_stmt_list);
		try {
			setState(325);
			switch (_input.LA(1)) {
			case T__26:
			case T__25:
			case T__17:
			case T__16:
			case T__15:
			case T__12:
			case T__5:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); aug_stmt();
				setState(322); aug_stmt_list();
				}
				break;
			case T__21:
			case T__20:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Aug_stmtContext extends ParserRuleContext {
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public Aug_if_stmtContext aug_if_stmt() {
			return getRuleContext(Aug_if_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Aug_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAug_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAug_stmt(this);
		}
	}

	public final Aug_stmtContext aug_stmt() throws RecognitionException {
		Aug_stmtContext _localctx = new Aug_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aug_stmt);
		try {
			setState(332);
			switch (_input.LA(1)) {
			case T__26:
			case T__15:
			case T__5:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); base_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); aug_if_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(329); while_stmt();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(330); match(T__25);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(331); match(T__16);
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

	public static class Aug_if_stmtContext extends ParserRuleContext {
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Aug_else_partContext aug_else_part() {
			return getRuleContext(Aug_else_partContext.class,0);
		}
		public Aug_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAug_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAug_if_stmt(this);
		}
	}

	public final Aug_if_stmtContext aug_if_stmt() throws RecognitionException {
		Aug_if_stmtContext _localctx = new Aug_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_aug_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(T__17);

					tree.enterScope();
				
			setState(336); match(T__28);
			setState(337); cond();
			setState(338); match(T__14);
			setState(339); decl();
			setState(340); aug_stmt_list();
			setState(341); aug_else_part();
			setState(342); match(T__20);

					tree.exitScope();	
				
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

	public static class Aug_else_partContext extends ParserRuleContext {
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Aug_else_partContext aug_else_part() {
			return getRuleContext(Aug_else_partContext.class,0);
		}
		public Aug_else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAug_else_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAug_else_part(this);
		}
	}

	public final Aug_else_partContext aug_else_part() throws RecognitionException {
		Aug_else_partContext _localctx = new Aug_else_partContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_aug_else_part);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(345); match(T__21);

						tree.enterScope();

					
				setState(347); decl();
				setState(348); aug_stmt_list();
				setState(349); aug_else_part();

						tree.exitScope();
					
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26: return expr_prefix_sempred((Expr_prefixContext)_localctx, predIndex);
		case 28: return factor_prefix_sempred((Factor_prefixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_prefix_sempred(Factor_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_prefix_sempred(Expr_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u0086\n\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\5\r\u0098"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00be\n\23"+
		"\3\24\3\24\3\24\5\24\u00c3\n\24\3\25\3\25\3\25\3\25\5\25\u00c9\n\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\7\34\u00ea\n\34\f\34\16\34\u00ed\13\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\7\36\u00f7\n\36\f\36\16\36\u00fa\13\36\3\37\3"+
		"\37\5\37\u00fe\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u0109\n!\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0110\n\"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u011a\n$\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u0132\n(\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\5,\u0148\n,\3-\3-\3-\3-\3-\5-\u014f\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0164\n/\3/\2\4\66:\60\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\4\2"+
		"\34\34\"\"\4\2\5\5\26\26\4\2\4\4\37\37\7\2\b\b\f\r\30\30\33\33!!\u0153"+
		"\2^\3\2\2\2\4d\3\2\2\2\6g\3\2\2\2\bq\3\2\2\2\ns\3\2\2\2\fz\3\2\2\2\16"+
		"|\3\2\2\2\20\u0081\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u0091"+
		"\3\2\2\2\30\u0097\3\2\2\2\32\u0099\3\2\2\2\34\u00a2\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00aa\3\2\2\2\"\u00b6\3\2\2\2$\u00bd\3\2\2\2&\u00c2\3\2\2\2(\u00c8"+
		"\3\2\2\2*\u00ca\3\2\2\2,\u00cd\3\2\2\2.\u00d1\3\2\2\2\60\u00d7\3\2\2\2"+
		"\62\u00dd\3\2\2\2\64\u00e1\3\2\2\2\66\u00e4\3\2\2\28\u00ee\3\2\2\2:\u00f1"+
		"\3\2\2\2<\u00fd\3\2\2\2>\u00ff\3\2\2\2@\u0108\3\2\2\2B\u010f\3\2\2\2D"+
		"\u0111\3\2\2\2F\u0119\3\2\2\2H\u011b\3\2\2\2J\u011d\3\2\2\2L\u011f\3\2"+
		"\2\2N\u0131\3\2\2\2P\u0133\3\2\2\2R\u0137\3\2\2\2T\u0139\3\2\2\2V\u0147"+
		"\3\2\2\2X\u014e\3\2\2\2Z\u0150\3\2\2\2\\\u0163\3\2\2\2^_\7\6\2\2_`\5\4"+
		"\3\2`a\7 \2\2ab\5\6\4\2bc\7\13\2\2c\3\3\2\2\2de\7%\2\2ef\b\3\1\2f\5\3"+
		"\2\2\2gh\5\b\5\2hi\5\36\20\2i\7\3\2\2\2jk\5\n\6\2kl\5\b\5\2lr\3\2\2\2"+
		"mn\5\16\b\2no\5\b\5\2or\3\2\2\2pr\3\2\2\2qj\3\2\2\2qm\3\2\2\2qp\3\2\2"+
		"\2r\t\3\2\2\2st\7\21\2\2tu\5\4\3\2uv\7\35\2\2vw\5\f\7\2wx\7\31\2\2xy\b"+
		"\6\1\2y\13\3\2\2\2z{\7\'\2\2{\r\3\2\2\2|}\5\20\t\2}~\5\24\13\2~\177\7"+
		"\31\2\2\177\u0080\b\b\1\2\u0080\17\3\2\2\2\u0081\u0082\t\2\2\2\u0082\21"+
		"\3\2\2\2\u0083\u0086\5\20\t\2\u0084\u0086\7\20\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\5\4\3\2\u0088\u0089"+
		"\5\26\f\2\u0089\u008a\b\13\1\2\u008a\25\3\2\2\2\u008b\u008c\7\3\2\2\u008c"+
		"\u008d\5\4\3\2\u008d\u008e\5\26\f\2\u008e\u008f\b\f\1\2\u008f\u0092\3"+
		"\2\2\2\u0090\u0092\b\f\1\2\u0091\u008b\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\27\3\2\2\2\u0093\u0094\5\32\16\2\u0094\u0095\5\34\17\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\31\3\2\2\2\u0099\u009a\5\20\t\2\u009a\u009b\5\4\3\2\u009b\u009c\b\16"+
		"\1\2\u009c\33\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u009f\5\32\16\2\u009f"+
		"\u00a0\5\34\17\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3"+
		"\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\5 \21\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\b\21\1\2\u00ae\u00af\7"+
		"\7\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\7 \2\2\u00b2"+
		"\u00b3\5\"\22\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\b\21\1\2\u00b5!\3\2\2"+
		"\2\u00b6\u00b7\5\b\5\2\u00b7\u00b8\5$\23\2\u00b8#\3\2\2\2\u00b9\u00ba"+
		"\5&\24\2\u00ba\u00bb\5$\23\2\u00bb\u00be\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be%\3\2\2\2\u00bf\u00c3\5(\25\2"+
		"\u00c0\u00c3\5L\'\2\u00c1\u00c3\5T+\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\'\3\2\2\2\u00c4\u00c9\5*\26\2\u00c5"+
		"\u00c9\5.\30\2\u00c6\u00c9\5\60\31\2\u00c7\u00c9\5\62\32\2\u00c8\u00c4"+
		"\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		")\3\2\2\2\u00ca\u00cb\5,\27\2\u00cb\u00cc\7\31\2\2\u00cc+\3\2\2\2\u00cd"+
		"\u00ce\5\4\3\2\u00ce\u00cf\7\35\2\2\u00cf\u00d0\5\64\33\2\u00d0-\3\2\2"+
		"\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\5\24\13\2\u00d4"+
		"\u00d5\7\25\2\2\u00d5\u00d6\7\31\2\2\u00d6/\3\2\2\2\u00d7\u00d8\7\24\2"+
		"\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\24\13\2\u00da\u00db\7\25\2\2\u00db"+
		"\u00dc\7\31\2\2\u00dc\61\3\2\2\2\u00dd\u00de\7\36\2\2\u00de\u00df\5\64"+
		"\33\2\u00df\u00e0\7\31\2\2\u00e0\63\3\2\2\2\u00e1\u00e2\5\66\34\2\u00e2"+
		"\u00e3\58\35\2\u00e3\65\3\2\2\2\u00e4\u00eb\b\34\1\2\u00e5\u00e6\f\4\2"+
		"\2\u00e6\u00e7\58\35\2\u00e7\u00e8\5H%\2\u00e8\u00ea\3\2\2\2\u00e9\u00e5"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\67\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5:\36\2\u00ef\u00f0\5<\37"+
		"\2\u00f09\3\2\2\2\u00f1\u00f8\b\36\1\2\u00f2\u00f3\f\4\2\2\u00f3\u00f4"+
		"\5<\37\2\u00f4\u00f5\5J&\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9;\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fb\u00fe\5F$\2\u00fc\u00fe\5> \2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fc\3\2\2\2\u00fe=\3\2\2\2\u00ff\u0100\5\4\3\2\u0100\u0101"+
		"\7\7\2\2\u0101\u0102\5@!\2\u0102\u0103\7\25\2\2\u0103?\3\2\2\2\u0104\u0105"+
		"\5\64\33\2\u0105\u0106\5B\"\2\u0106\u0109\3\2\2\2\u0107\u0109\3\2\2\2"+
		"\u0108\u0104\3\2\2\2\u0108\u0107\3\2\2\2\u0109A\3\2\2\2\u010a\u010b\7"+
		"\3\2\2\u010b\u010c\5\64\33\2\u010c\u010d\5B\"\2\u010d\u0110\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110C\3\2\2\2"+
		"\u0111\u0112\7\7\2\2\u0112\u0113\5\64\33\2\u0113\u0114\7\25\2\2\u0114"+
		"E\3\2\2\2\u0115\u011a\5D#\2\u0116\u011a\5\4\3\2\u0117\u011a\7(\2\2\u0118"+
		"\u011a\7)\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u0118\3\2\2\2\u011aG\3\2\2\2\u011b\u011c\t\3\2\2\u011cI\3\2"+
		"\2\2\u011d\u011e\t\4\2\2\u011eK\3\2\2\2\u011f\u0120\7\22\2\2\u0120\u0121"+
		"\b\'\1\2\u0121\u0122\7\7\2\2\u0122\u0123\5P)\2\u0123\u0124\7\25\2\2\u0124"+
		"\u0125\5\b\5\2\u0125\u0126\5$\23\2\u0126\u0127\b\'\1\2\u0127\u0128\5N"+
		"(\2\u0128\u0129\7\17\2\2\u0129M\3\2\2\2\u012a\u012b\7\16\2\2\u012b\u012c"+
		"\b(\1\2\u012c\u012d\5\b\5\2\u012d\u012e\5$\23\2\u012e\u012f\b(\1\2\u012f"+
		"\u0132\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012a\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132O\3\2\2\2\u0133\u0134\5\64\33\2\u0134\u0135\5R*\2\u0135\u0136"+
		"\5\64\33\2\u0136Q\3\2\2\2\u0137\u0138\t\5\2\2\u0138S\3\2\2\2\u0139\u013a"+
		"\7\27\2\2\u013a\u013b\b+\1\2\u013b\u013c\7\7\2\2\u013c\u013d\5P)\2\u013d"+
		"\u013e\7\25\2\2\u013e\u013f\5\b\5\2\u013f\u0140\5V,\2\u0140\u0141\7#\2"+
		"\2\u0141\u0142\b+\1\2\u0142U\3\2\2\2\u0143\u0144\5X-\2\u0144\u0145\5V"+
		",\2\u0145\u0148\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0143\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148W\3\2\2\2\u0149\u014f\5(\25\2\u014a\u014f\5Z.\2\u014b"+
		"\u014f\5T+\2\u014c\u014f\7\n\2\2\u014d\u014f\7\23\2\2\u014e\u0149\3\2"+
		"\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014fY\3\2\2\2\u0150\u0151\7\22\2\2\u0151\u0152\b.\1\2"+
		"\u0152\u0153\7\7\2\2\u0153\u0154\5P)\2\u0154\u0155\7\25\2\2\u0155\u0156"+
		"\5\b\5\2\u0156\u0157\5V,\2\u0157\u0158\5\\/\2\u0158\u0159\7\17\2\2\u0159"+
		"\u015a\b.\1\2\u015a[\3\2\2\2\u015b\u015c\7\16\2\2\u015c\u015d\b/\1\2\u015d"+
		"\u015e\5\b\5\2\u015e\u015f\5V,\2\u015f\u0160\5\\/\2\u0160\u0161\b/\1\2"+
		"\u0161\u0164\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u0162"+
		"\3\2\2\2\u0164]\3\2\2\2\25q\u0085\u0091\u0097\u00a2\u00a8\u00bd\u00c2"+
		"\u00c8\u00eb\u00f8\u00fd\u0108\u010f\u0119\u0131\u0147\u014e\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}