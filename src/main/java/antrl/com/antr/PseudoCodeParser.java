// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.8
package com.antr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, FUNCTION=48, NEGATIVE=49, POSITIVE=50, TRUE=51, FALSE=52, 
		FLOAT=53, STRING=54, ID=55, SPACE=56, VOID=57;
	public static final int
		RULE_program = 0, RULE_source_element = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_integer = 4, RULE_literal = 5, RULE_boolean_literal = 6, RULE_numeric_literal = 7, 
		RULE_string_literal = 8, RULE_identifier = 9, RULE_call_id = 10, RULE_simple_obj = 11, 
		RULE_multiplicative = 12, RULE_additive = 13, RULE_relational = 14, RULE_equality = 15, 
		RULE_logical = 16, RULE_postfix = 17, RULE_assignment_expr = 18, RULE_expr = 19, 
		RULE_expr_statement = 20, RULE_empty_statement = 21, RULE_types_simple = 22, 
		RULE_array = 23, RULE_array_in_function = 24, RULE_types = 25, RULE_varible = 26, 
		RULE_varible_in_function = 27, RULE_variable_declaration = 28, RULE_variable_statement = 29, 
		RULE_if_statement = 30, RULE_iteration_statements = 31, RULE_iteration_statement_while = 32, 
		RULE_iteration_statement_for = 33, RULE_iteration_statement_for_each = 34, 
		RULE_return_statement = 35, RULE_function_declaration = 36, RULE_return_types = 37, 
		RULE_formal_parameter_list = 38, RULE_function_call = 39, RULE_function_params = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source_element", "statements", "statement", "integer", "literal", 
			"boolean_literal", "numeric_literal", "string_literal", "identifier", 
			"call_id", "simple_obj", "multiplicative", "additive", "relational", 
			"equality", "logical", "postfix", "assignment_expr", "expr", "expr_statement", 
			"empty_statement", "types_simple", "array", "array_in_function", "types", 
			"varible", "varible_in_function", "variable_declaration", "variable_statement", 
			"if_statement", "iteration_statements", "iteration_statement_while", 
			"iteration_statement_for", "iteration_statement_for_each", "return_statement", 
			"function_declaration", "return_types", "formal_parameter_list", "function_call", 
			"function_params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'-'", "'('", "')'", "'*'", "'/'", "'%'", "'+'", 
			"'<'", "'>'", "'>='", "'<='", "'=='", "'!='", "'OR'", "'AND'", "'++'", 
			"'--'", "'<-'", "'\n'", "'int32'", "'int64'", "'String'", "'bool'", "'float'", 
			"'[]'", "'Map'", "','", "'auto'", "'IF'", "'THEN'", "'ENDIF'", "'ELSE'", 
			"'WHILE'", "'ENDWHILE'", "'FOR'", "'TO'", "'ENDFOR'", "'FOR EACH'", "'IN'", 
			"'ENDFOREACH'", "'RETURN'", "':'", "'BEGIN'", "'END_FUNCTION'", "'()'", 
			"'FUNCTION'", null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"FUNCTION", "NEGATIVE", "POSITIVE", "TRUE", "FALSE", "FLOAT", "STRING", 
			"ID", "SPACE", "VOID"
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

	@Override
	public String getGrammarFileName() { return "PseudoCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudoCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Source_elementContext> source_element() {
			return getRuleContexts(Source_elementContext.class);
		}
		public Source_elementContext source_element(int i) {
			return getRuleContext(Source_elementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				source_element();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << FUNCTION) | (1L << ID))) != 0) );
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

	public static class Source_elementContext extends ParserRuleContext {
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Source_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSource_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSource_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSource_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_elementContext source_element() throws RecognitionException {
		Source_elementContext _localctx = new Source_elementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source_element);
		try {
			int _alt;
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						function_declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__29:
			case T__30:
			case T__34:
			case T__36:
			case T__39:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public Variable_statementContext variable_statement() {
			return getRuleContext(Variable_statementContext.class,0);
		}
		public Empty_statementContext empty_statement() {
			return getRuleContext(Empty_statementContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Iteration_statementsContext iteration_statements() {
			return getRuleContext(Iteration_statementsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variable_statement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				empty_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				expr_statement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				if_statement();
				}
				break;
			case T__34:
			case T__36:
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				iteration_statements();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode POSITIVE() { return getToken(PseudoCodeParser.POSITIVE, 0); }
		public TerminalNode NEGATIVE() { return getToken(PseudoCodeParser.NEGATIVE, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==NEGATIVE || _la==POSITIVE) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				boolean_literal();
				}
				break;
			case NEGATIVE:
			case POSITIVE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				numeric_literal();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				string_literal();
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PseudoCodeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PseudoCodeParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(PseudoCodeParser.FLOAT, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric_literal);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATIVE:
			case POSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				integer();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(FLOAT);
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PseudoCodeParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(STRING);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseudoCodeParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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

	public static class Call_idContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public TerminalNode POSITIVE() { return getToken(PseudoCodeParser.POSITIVE, 0); }
		public Call_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCall_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCall_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCall_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_idContext call_id() throws RecognitionException {
		Call_idContext _localctx = new Call_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call_id);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				identifier();
				setState(126);
				match(T__0);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(127);
					additive();
					}
					break;
				case 2:
					{
					setState(128);
					match(POSITIVE);
					}
					break;
				case 3:
					{
					setState(129);
					identifier();
					}
					break;
				}
				setState(132);
				match(T__1);
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

	public static class Simple_objContext extends ParserRuleContext {
		public Call_idContext call_id() {
			return getRuleContext(Call_idContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Simple_objContext simple_obj() {
			return getRuleContext(Simple_objContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Simple_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSimple_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSimple_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSimple_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_objContext simple_obj() throws RecognitionException {
		Simple_objContext _localctx = new Simple_objContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_obj);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				call_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__2);
				setState(139);
				simple_obj();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__3);
				setState(141);
				simple_obj();
				setState(142);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				function_call();
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

	public static class MultiplicativeContext extends ParserRuleContext {
		public List<Simple_objContext> simple_obj() {
			return getRuleContexts(Simple_objContext.class);
		}
		public Simple_objContext simple_obj(int i) {
			return getRuleContext(Simple_objContext.class,i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			simple_obj();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				simple_obj();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AdditiveContext extends ParserRuleContext {
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			multiplicative();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__8) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				multiplicative();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelationalContext extends ParserRuleContext {
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			additive();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				additive();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EqualityContext extends ParserRuleContext {
		public List<RelationalContext> relational() {
			return getRuleContexts(RelationalContext.class);
		}
		public RelationalContext relational(int i) {
			return getRuleContext(RelationalContext.class,i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			relational();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				relational();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LogicalContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			equality();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__16) {
				{
				{
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				equality();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PostfixContext extends ParserRuleContext {
		public Call_idContext call_id() {
			return getRuleContext(Call_idContext.class,0);
		}
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_postfix);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				call_id();
				setState(188);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				call_id();
				setState(191);
				match(T__18);
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

	public static class Assignment_exprContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAssignment_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAssignment_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAssignment_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_exprContext assignment_expr() throws RecognitionException {
		Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__19);
			setState(196);
			logical();
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
		public Call_idContext call_id() {
			return getRuleContext(Call_idContext.class,0);
		}
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			call_id();
			setState(199);
			assignment_expr();
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

	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpr_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpr_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				expr();
				setState(202);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				postfix();
				setState(205);
				match(T__20);
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

	public static class Empty_statementContext extends ParserRuleContext {
		public Empty_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEmpty_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEmpty_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_statementContext empty_statement() throws RecognitionException {
		Empty_statementContext _localctx = new Empty_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__20);
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

	public static class Types_simpleContext extends ParserRuleContext {
		public Types_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypes_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypes_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypes_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Types_simpleContext types_simple() throws RecognitionException {
		Types_simpleContext _localctx = new Types_simpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_types_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public Types_simpleContext types_simple() {
			return getRuleContext(Types_simpleContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode POSITIVE() { return getToken(PseudoCodeParser.POSITIVE, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			types_simple();
			setState(214);
			match(T__0);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITIVE:
				{
				setState(215);
				match(POSITIVE);
				}
				break;
			case ID:
				{
				setState(216);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(T__1);
			setState(220);
			identifier();
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

	public static class Array_in_functionContext extends ParserRuleContext {
		public Types_simpleContext types_simple() {
			return getRuleContext(Types_simpleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Array_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_in_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArray_in_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArray_in_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArray_in_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_in_functionContext array_in_function() throws RecognitionException {
		Array_in_functionContext _localctx = new Array_in_functionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_array_in_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			types_simple();
			setState(223);
			match(T__26);
			setState(224);
			identifier();
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

	public static class TypesContext extends ParserRuleContext {
		public List<Types_simpleContext> types_simple() {
			return getRuleContexts(Types_simpleContext.class);
		}
		public Types_simpleContext types_simple(int i) {
			return getRuleContext(Types_simpleContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_types);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__27);
				setState(227);
				match(T__3);
				setState(228);
				types_simple();
				setState(229);
				match(T__28);
				setState(230);
				types_simple();
				setState(231);
				match(T__4);
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				types_simple();
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

	public static class VaribleContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VaribleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVarible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVarible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVarible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaribleContext varible() throws RecognitionException {
		VaribleContext _localctx = new VaribleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varible);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				types();
				setState(237);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				array();
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

	public static class Varible_in_functionContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Array_in_functionContext array_in_function() {
			return getRuleContext(Array_in_functionContext.class,0);
		}
		public Varible_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible_in_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVarible_in_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVarible_in_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVarible_in_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varible_in_functionContext varible_in_function() throws RecognitionException {
		Varible_in_functionContext _localctx = new Varible_in_functionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_varible_in_function);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				types();
				setState(243);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				array_in_function();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public VaribleContext varible() {
			return getRuleContext(VaribleContext.class,0);
		}
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable_declaration);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				varible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				varible();
				setState(250);
				assignment_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(T__29);
				setState(253);
				identifier();
				setState(254);
				assignment_expr();
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

	public static class Variable_statementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_statementContext variable_statement() throws RecognitionException {
		Variable_statementContext _localctx = new Variable_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			variable_declaration();
			setState(259);
			match(T__20);
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

	public static class If_statementContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_statement);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__30);
				setState(262);
				match(T__3);
				setState(263);
				logical();
				setState(264);
				match(T__4);
				setState(265);
				match(T__31);
				setState(266);
				match(T__20);
				setState(267);
				statements();
				setState(268);
				match(T__32);
				setState(269);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__30);
				setState(272);
				match(T__3);
				setState(273);
				logical();
				setState(274);
				match(T__4);
				setState(275);
				match(T__31);
				setState(276);
				match(T__20);
				setState(277);
				statements();
				setState(278);
				match(T__33);
				setState(279);
				match(T__20);
				setState(280);
				statements();
				setState(281);
				match(T__32);
				setState(282);
				match(T__20);
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

	public static class Iteration_statementsContext extends ParserRuleContext {
		public Iteration_statement_whileContext iteration_statement_while() {
			return getRuleContext(Iteration_statement_whileContext.class,0);
		}
		public Iteration_statement_forContext iteration_statement_for() {
			return getRuleContext(Iteration_statement_forContext.class,0);
		}
		public Iteration_statement_for_eachContext iteration_statement_for_each() {
			return getRuleContext(Iteration_statement_for_eachContext.class,0);
		}
		public Iteration_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIteration_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIteration_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIteration_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementsContext iteration_statements() throws RecognitionException {
		Iteration_statementsContext _localctx = new Iteration_statementsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_iteration_statements);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				iteration_statement_while();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				iteration_statement_for();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				iteration_statement_for_each();
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

	public static class Iteration_statement_whileContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Iteration_statement_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIteration_statement_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIteration_statement_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIteration_statement_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statement_whileContext iteration_statement_while() throws RecognitionException {
		Iteration_statement_whileContext _localctx = new Iteration_statement_whileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_iteration_statement_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__34);
			setState(292);
			match(T__3);
			setState(293);
			logical();
			setState(294);
			match(T__4);
			setState(295);
			match(T__20);
			setState(296);
			statements();
			setState(297);
			match(T__35);
			setState(298);
			match(T__20);
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

	public static class Iteration_statement_forContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Call_idContext call_id() {
			return getRuleContext(Call_idContext.class,0);
		}
		public Iteration_statement_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIteration_statement_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIteration_statement_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIteration_statement_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statement_forContext iteration_statement_for() throws RecognitionException {
		Iteration_statement_forContext _localctx = new Iteration_statement_forContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_iteration_statement_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__36);
			setState(301);
			identifier();
			setState(302);
			assignment_expr();
			setState(303);
			match(T__37);
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATIVE:
			case POSITIVE:
				{
				setState(304);
				integer();
				}
				break;
			case ID:
				{
				setState(305);
				call_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(308);
			match(T__20);
			setState(309);
			statements();
			setState(310);
			match(T__38);
			setState(311);
			match(T__20);
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

	public static class Iteration_statement_for_eachContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Iteration_statement_for_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIteration_statement_for_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIteration_statement_for_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIteration_statement_for_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statement_for_eachContext iteration_statement_for_each() throws RecognitionException {
		Iteration_statement_for_eachContext _localctx = new Iteration_statement_for_eachContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_iteration_statement_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__39);
			setState(314);
			identifier();
			setState(315);
			match(T__40);
			setState(316);
			identifier();
			setState(317);
			match(T__20);
			setState(318);
			statements();
			setState(319);
			match(T__41);
			setState(320);
			match(T__20);
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

	public static class Return_statementContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return_statement);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(T__42);
				setState(323);
				logical();
				setState(324);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__42);
				setState(327);
				match(T__20);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PseudoCodeParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_declaration);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(FUNCTION);
				setState(331);
				identifier();
				setState(332);
				match(T__3);
				setState(333);
				match(T__4);
				setState(334);
				match(T__43);
				setState(335);
				return_types();
				setState(336);
				match(T__44);
				setState(337);
				match(T__20);
				setState(338);
				statements();
				setState(339);
				return_statement();
				setState(340);
				match(T__45);
				setState(341);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(FUNCTION);
				setState(344);
				identifier();
				setState(345);
				match(T__3);
				setState(346);
				formal_parameter_list();
				setState(347);
				match(T__4);
				setState(348);
				match(T__43);
				setState(349);
				return_types();
				setState(350);
				match(T__44);
				setState(351);
				match(T__20);
				setState(352);
				statements();
				setState(353);
				return_statement();
				setState(354);
				match(T__45);
				setState(355);
				match(T__20);
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

	public static class Return_typesContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public Types_simpleContext types_simple() {
			return getRuleContext(Types_simpleContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PseudoCodeParser.VOID, 0); }
		public Return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterReturn_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitReturn_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitReturn_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typesContext return_types() throws RecognitionException {
		Return_typesContext _localctx = new Return_typesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_return_types);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				types();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				types_simple();
				setState(361);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(VOID);
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

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public List<Varible_in_functionContext> varible_in_function() {
			return getRuleContexts(Varible_in_functionContext.class);
		}
		public Varible_in_functionContext varible_in_function(int i) {
			return getRuleContext(Varible_in_functionContext.class,i);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFormal_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFormal_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_formal_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			varible_in_function();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(367);
				match(T__28);
				setState(368);
				varible_in_function();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_call);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				identifier();
				setState(375);
				match(T__3);
				setState(376);
				function_params();
				setState(377);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				identifier();
				setState(380);
				match(T__46);
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

	public static class Function_paramsContext extends ParserRuleContext {
		public List<Call_idContext> call_id() {
			return getRuleContexts(Call_idContext.class);
		}
		public Call_idContext call_id(int i) {
			return getRuleContext(Call_idContext.class,i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunction_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunction_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			call_id();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(385);
				match(T__28);
				setState(386);
				call_id();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\6\2"+
		"V\n\2\r\2\16\2W\3\3\6\3[\n\3\r\3\16\3\\\3\3\5\3`\n\3\3\4\6\4c\n\4\r\4"+
		"\16\4d\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\7\3\7\3\7\5\7s\n\7\3\b\3"+
		"\b\3\t\3\t\5\ty\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0085"+
		"\n\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0094"+
		"\n\r\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\17\3\17\3"+
		"\17\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20\7\20\u00a9\n"+
		"\20\f\20\16\20\u00ac\13\20\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4"+
		"\13\21\3\22\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00c4\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00d2\n\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u00dc\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ed\n\33\3\34\3\34\3\34\3\34\5\34"+
		"\u00f3\n\34\3\35\3\35\3\35\3\35\5\35\u00f9\n\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0103\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u011f\n \3!\3!\3"+
		"!\5!\u0124\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5"+
		"#\u0135\n#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\5%\u014b\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0168\n&\3\'\3\'\3\'\3\'\3\'\5\'\u016f\n"+
		"\'\3(\3(\3(\7(\u0174\n(\f(\16(\u0177\13(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0181"+
		"\n)\3*\3*\3*\7*\u0186\n*\f*\16*\u0189\13*\3*\2\2+\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\n\3\2\63\64\3"+
		"\2\65\66\3\2\b\n\4\2\5\5\13\13\3\2\f\17\3\2\20\21\3\2\22\23\3\2\30\34"+
		"\2\u018b\2U\3\2\2\2\4_\3\2\2\2\6b\3\2\2\2\bk\3\2\2\2\nm\3\2\2\2\fr\3\2"+
		"\2\2\16t\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26\u0088\3\2\2\2"+
		"\30\u0093\3\2\2\2\32\u0095\3\2\2\2\34\u009d\3\2\2\2\36\u00a5\3\2\2\2 "+
		"\u00ad\3\2\2\2\"\u00b5\3\2\2\2$\u00c3\3\2\2\2&\u00c5\3\2\2\2(\u00c8\3"+
		"\2\2\2*\u00d1\3\2\2\2,\u00d3\3\2\2\2.\u00d5\3\2\2\2\60\u00d7\3\2\2\2\62"+
		"\u00e0\3\2\2\2\64\u00ec\3\2\2\2\66\u00f2\3\2\2\28\u00f8\3\2\2\2:\u0102"+
		"\3\2\2\2<\u0104\3\2\2\2>\u011e\3\2\2\2@\u0123\3\2\2\2B\u0125\3\2\2\2D"+
		"\u012e\3\2\2\2F\u013b\3\2\2\2H\u014a\3\2\2\2J\u0167\3\2\2\2L\u016e\3\2"+
		"\2\2N\u0170\3\2\2\2P\u0180\3\2\2\2R\u0182\3\2\2\2TV\5\4\3\2UT\3\2\2\2"+
		"VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\3\3\2\2\2Y[\5J&\2ZY\3\2\2\2[\\\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^`\5\6\4\2_Z\3\2\2\2_^\3\2\2\2`\5\3\2"+
		"\2\2ac\5\b\5\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\7\3\2\2\2fl\5"+
		"<\37\2gl\5,\27\2hl\5*\26\2il\5> \2jl\5@!\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2"+
		"\2ki\3\2\2\2kj\3\2\2\2l\t\3\2\2\2mn\t\2\2\2n\13\3\2\2\2os\5\16\b\2ps\5"+
		"\20\t\2qs\5\22\n\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\r\3\2\2\2tu\t\3\2\2"+
		"u\17\3\2\2\2vy\5\n\6\2wy\7\67\2\2xv\3\2\2\2xw\3\2\2\2y\21\3\2\2\2z{\7"+
		"8\2\2{\23\3\2\2\2|}\79\2\2}\25\3\2\2\2~\u0089\5\24\13\2\177\u0080\5\24"+
		"\13\2\u0080\u0084\7\3\2\2\u0081\u0085\5\34\17\2\u0082\u0085\7\64\2\2\u0083"+
		"\u0085\5\24\13\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\4\2\2\u0087\u0089\3\2\2\2\u0088"+
		"~\3\2\2\2\u0088\177\3\2\2\2\u0089\27\3\2\2\2\u008a\u0094\5\26\f\2\u008b"+
		"\u0094\5\f\7\2\u008c\u008d\7\5\2\2\u008d\u0094\5\30\r\2\u008e\u008f\7"+
		"\6\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\7\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0094\5P)\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2"+
		"\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094\31\3\2\2\2\u0095\u009a"+
		"\5\30\r\2\u0096\u0097\t\4\2\2\u0097\u0099\5\30\r\2\u0098\u0096\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a2\5\32\16\2\u009e\u009f\t\5\2\2"+
		"\u009f\u00a1\5\32\16\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00aa\5\34\17\2\u00a6\u00a7\t\6\2\2\u00a7\u00a9\5\34\17\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\37\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\5\36\20\2\u00ae\u00af\t\7"+
		"\2\2\u00af\u00b1\5\36\20\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00ba\5 \21\2\u00b6\u00b7\t\b\2\2\u00b7\u00b9\5 \21\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"#\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\24\2"+
		"\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7\25\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4%\3\2\2\2"+
		"\u00c5\u00c6\7\26\2\2\u00c6\u00c7\5\"\22\2\u00c7\'\3\2\2\2\u00c8\u00c9"+
		"\5\26\f\2\u00c9\u00ca\5&\24\2\u00ca)\3\2\2\2\u00cb\u00cc\5(\25\2\u00cc"+
		"\u00cd\7\27\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\7"+
		"\27\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"+\3\2\2\2\u00d3\u00d4\7\27\2\2\u00d4-\3\2\2\2\u00d5\u00d6\t\t\2\2\u00d6"+
		"/\3\2\2\2\u00d7\u00d8\5.\30\2\u00d8\u00db\7\3\2\2\u00d9\u00dc\7\64\2\2"+
		"\u00da\u00dc\5\24\13\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\7\4\2\2\u00de\u00df\5\24\13\2\u00df\61\3\2\2\2\u00e0"+
		"\u00e1\5.\30\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3\5\24\13\2\u00e3\63\3\2"+
		"\2\2\u00e4\u00e5\7\36\2\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\5.\30\2\u00e7"+
		"\u00e8\7\37\2\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\7\7\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00ed\5.\30\2\u00ec\u00e4\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\65\3\2\2\2\u00ee\u00ef\5\64\33\2\u00ef\u00f0\5\24\13\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00f3\5\60\31\2\u00f2\u00ee\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\67\3\2\2\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6\5\24\13\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f9\5\62\32\2\u00f8\u00f4\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"9\3\2\2\2\u00fa\u0103\5\66\34\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\5&\24"+
		"\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\7 \2\2\u00ff\u0100\5\24\13\2\u0100"+
		"\u0101\5&\24\2\u0101\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2"+
		"\2\2\u0102\u00fe\3\2\2\2\u0103;\3\2\2\2\u0104\u0105\5:\36\2\u0105\u0106"+
		"\7\27\2\2\u0106=\3\2\2\2\u0107\u0108\7!\2\2\u0108\u0109\7\6\2\2\u0109"+
		"\u010a\5\"\22\2\u010a\u010b\7\7\2\2\u010b\u010c\7\"\2\2\u010c\u010d\7"+
		"\27\2\2\u010d\u010e\5\6\4\2\u010e\u010f\7#\2\2\u010f\u0110\7\27\2\2\u0110"+
		"\u011f\3\2\2\2\u0111\u0112\7!\2\2\u0112\u0113\7\6\2\2\u0113\u0114\5\""+
		"\22\2\u0114\u0115\7\7\2\2\u0115\u0116\7\"\2\2\u0116\u0117\7\27\2\2\u0117"+
		"\u0118\5\6\4\2\u0118\u0119\7$\2\2\u0119\u011a\7\27\2\2\u011a\u011b\5\6"+
		"\4\2\u011b\u011c\7#\2\2\u011c\u011d\7\27\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u0107\3\2\2\2\u011e\u0111\3\2\2\2\u011f?\3\2\2\2\u0120\u0124\5B\"\2\u0121"+
		"\u0124\5D#\2\u0122\u0124\5F$\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0122\3\2\2\2\u0124A\3\2\2\2\u0125\u0126\7%\2\2\u0126\u0127\7\6"+
		"\2\2\u0127\u0128\5\"\22\2\u0128\u0129\7\7\2\2\u0129\u012a\7\27\2\2\u012a"+
		"\u012b\5\6\4\2\u012b\u012c\7&\2\2\u012c\u012d\7\27\2\2\u012dC\3\2\2\2"+
		"\u012e\u012f\7\'\2\2\u012f\u0130\5\24\13\2\u0130\u0131\5&\24\2\u0131\u0134"+
		"\7(\2\2\u0132\u0135\5\n\6\2\u0133\u0135\5\26\f\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\27\2\2\u0137\u0138\5"+
		"\6\4\2\u0138\u0139\7)\2\2\u0139\u013a\7\27\2\2\u013aE\3\2\2\2\u013b\u013c"+
		"\7*\2\2\u013c\u013d\5\24\13\2\u013d\u013e\7+\2\2\u013e\u013f\5\24\13\2"+
		"\u013f\u0140\7\27\2\2\u0140\u0141\5\6\4\2\u0141\u0142\7,\2\2\u0142\u0143"+
		"\7\27\2\2\u0143G\3\2\2\2\u0144\u0145\7-\2\2\u0145\u0146\5\"\22\2\u0146"+
		"\u0147\7\27\2\2\u0147\u014b\3\2\2\2\u0148\u0149\7-\2\2\u0149\u014b\7\27"+
		"\2\2\u014a\u0144\3\2\2\2\u014a\u0148\3\2\2\2\u014bI\3\2\2\2\u014c\u014d"+
		"\7\62\2\2\u014d\u014e\5\24\13\2\u014e\u014f\7\6\2\2\u014f\u0150\7\7\2"+
		"\2\u0150\u0151\7.\2\2\u0151\u0152\5L\'\2\u0152\u0153\7/\2\2\u0153\u0154"+
		"\7\27\2\2\u0154\u0155\5\6\4\2\u0155\u0156\5H%\2\u0156\u0157\7\60\2\2\u0157"+
		"\u0158\7\27\2\2\u0158\u0168\3\2\2\2\u0159\u015a\7\62\2\2\u015a\u015b\5"+
		"\24\13\2\u015b\u015c\7\6\2\2\u015c\u015d\5N(\2\u015d\u015e\7\7\2\2\u015e"+
		"\u015f\7.\2\2\u015f\u0160\5L\'\2\u0160\u0161\7/\2\2\u0161\u0162\7\27\2"+
		"\2\u0162\u0163\5\6\4\2\u0163\u0164\5H%\2\u0164\u0165\7\60\2\2\u0165\u0166"+
		"\7\27\2\2\u0166\u0168\3\2\2\2\u0167\u014c\3\2\2\2\u0167\u0159\3\2\2\2"+
		"\u0168K\3\2\2\2\u0169\u016f\5\64\33\2\u016a\u016b\5.\30\2\u016b\u016c"+
		"\7\35\2\2\u016c\u016f\3\2\2\2\u016d\u016f\7;\2\2\u016e\u0169\3\2\2\2\u016e"+
		"\u016a\3\2\2\2\u016e\u016d\3\2\2\2\u016fM\3\2\2\2\u0170\u0175\58\35\2"+
		"\u0171\u0172\7\37\2\2\u0172\u0174\58\35\2\u0173\u0171\3\2\2\2\u0174\u0177"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176O\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u0179\5\24\13\2\u0179\u017a\7\6\2\2\u017a\u017b\5"+
		"R*\2\u017b\u017c\7\7\2\2\u017c\u0181\3\2\2\2\u017d\u017e\5\24\13\2\u017e"+
		"\u017f\7\61\2\2\u017f\u0181\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u017d\3"+
		"\2\2\2\u0181Q\3\2\2\2\u0182\u0187\5\26\f\2\u0183\u0184\7\37\2\2\u0184"+
		"\u0186\5\26\f\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188S\3\2\2\2\u0189\u0187\3\2\2\2!W\\_dkr"+
		"x\u0084\u0088\u0093\u009a\u00a2\u00aa\u00b2\u00ba\u00c3\u00d1\u00db\u00ec"+
		"\u00f2\u00f8\u0102\u011e\u0123\u0134\u014a\u0167\u016e\u0175\u0180\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}