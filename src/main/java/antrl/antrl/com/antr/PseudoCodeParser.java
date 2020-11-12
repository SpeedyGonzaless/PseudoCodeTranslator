// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.8
package antrl.com.antr;
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
		SPACE=1, TRUE=2, FALSE=3, MINUS=4, PLUS=5, MULTY=6, DEV=7, MOD=8, LESS_SIGH=9, 
		MORE_SIGN=10, LESS_EQUAL_SIGN=11, MORE_EQUAL_SIGN=12, EQUAL_SIGH=13, NOT_EQUAL_SIGN=14, 
		OR=15, AND=16, PLUS_PLUS=17, MINUS_MINUS=18, ASSIGN_SIGN=19, NEW_LINE=20, 
		INT32=21, INT64=22, FLOAT=23, STRING=24, BOOLEAN=25, AUTO=26, LEFT_SQUARE_BRACKET=27, 
		RIGHT_SQUARE_BRACKET=28, LEFT_ROUND_BRACKET=29, RIGHT_ROUND_BRACKET=30, 
		IF=31, THEN=32, ELSE=33, ENDIF=34, WHILE=35, ENDWHILE=36, FOR=37, TO=38, 
		ENDFOR=39, FOREACH=40, IN=41, ENDFOREACH=42, FUNCTION=43, VOID=44, BEGIN=45, 
		END_FUNCTION=46, RETURN=47, MAP=48, COMMA=49, COLON_SIGH=50, NEGATIVE=51, 
		POSITIVE=52, FLOAT_NUMBER=53, STRING_VALUE=54, ID=55;
	public static final int
		RULE_program = 0, RULE_source_element = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_integer = 4, RULE_literal = 5, RULE_boolean_literal = 6, RULE_numeric_literal = 7, 
		RULE_string_literal = 8, RULE_call_id = 9, RULE_literal_true = 10, RULE_literal_false = 11, 
		RULE_literal_minus = 12, RULE_literal_plus = 13, RULE_literal_multy = 14, 
		RULE_literal_dev = 15, RULE_literal_mod = 16, RULE_literal_less_sign = 17, 
		RULE_literal_more_sign = 18, RULE_literal_less_equal_sign = 19, RULE_literal_more_equal_sign = 20, 
		RULE_literal_equal_sign = 21, RULE_literal_not_equal_sign = 22, RULE_literal_or = 23, 
		RULE_literal_and = 24, RULE_literal_plus_plus = 25, RULE_literal_minus_minis = 26, 
		RULE_literal_assign_sign = 27, RULE_literal_new_line = 28, RULE_literal_int_32 = 29, 
		RULE_literal_int_64 = 30, RULE_literal_float = 31, RULE_literal_string = 32, 
		RULE_literal_boolean = 33, RULE_literal_auto = 34, RULE_literal_left_square_bracket = 35, 
		RULE_literal_right_square_bracket = 36, RULE_literal_left_round_bracket = 37, 
		RULE_literal_right_round_bracket = 38, RULE_literal_if = 39, RULE_literal_then = 40, 
		RULE_literal_else = 41, RULE_literal_endif = 42, RULE_literal_while = 43, 
		RULE_literal_endwhile = 44, RULE_literal_for = 45, RULE_literal_to = 46, 
		RULE_literal_endfor = 47, RULE_literal_foreach = 48, RULE_literal_in = 49, 
		RULE_literal_endforeach = 50, RULE_literal_function = 51, RULE_literal_void = 52, 
		RULE_literal_begin = 53, RULE_literal_end_function = 54, RULE_literal_return = 55, 
		RULE_literal_map = 56, RULE_literal_comma = 57, RULE_literal_colon_sign = 58, 
		RULE_literal_negative = 59, RULE_literal_postitive = 60, RULE_literal_float_number = 61, 
		RULE_literal_string_value = 62, RULE_literal_identifier = 63, RULE_simple_obj = 64, 
		RULE_multiplicative = 65, RULE_additive = 66, RULE_relational = 67, RULE_equality = 68, 
		RULE_logical = 69, RULE_postfix = 70, RULE_assignment_expr = 71, RULE_expr = 72, 
		RULE_expr_statement = 73, RULE_empty_statement = 74, RULE_types_simple = 75, 
		RULE_array = 76, RULE_array_in_function = 77, RULE_types = 78, RULE_varible = 79, 
		RULE_varible_in_function = 80, RULE_variable_declaration = 81, RULE_variable_statement = 82, 
		RULE_if_statement = 83, RULE_iteration_statements = 84, RULE_iteration_statement_while = 85, 
		RULE_iteration_statement_for = 86, RULE_iteration_statement_for_each = 87, 
		RULE_return_statement = 88, RULE_function_declaration = 89, RULE_return_types = 90, 
		RULE_formal_parameter_list = 91, RULE_function_call = 92, RULE_function_params = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source_element", "statements", "statement", "integer", "literal", 
			"boolean_literal", "numeric_literal", "string_literal", "call_id", "literal_true", 
			"literal_false", "literal_minus", "literal_plus", "literal_multy", "literal_dev", 
			"literal_mod", "literal_less_sign", "literal_more_sign", "literal_less_equal_sign", 
			"literal_more_equal_sign", "literal_equal_sign", "literal_not_equal_sign", 
			"literal_or", "literal_and", "literal_plus_plus", "literal_minus_minis", 
			"literal_assign_sign", "literal_new_line", "literal_int_32", "literal_int_64", 
			"literal_float", "literal_string", "literal_boolean", "literal_auto", 
			"literal_left_square_bracket", "literal_right_square_bracket", "literal_left_round_bracket", 
			"literal_right_round_bracket", "literal_if", "literal_then", "literal_else", 
			"literal_endif", "literal_while", "literal_endwhile", "literal_for", 
			"literal_to", "literal_endfor", "literal_foreach", "literal_in", "literal_endforeach", 
			"literal_function", "literal_void", "literal_begin", "literal_end_function", 
			"literal_return", "literal_map", "literal_comma", "literal_colon_sign", 
			"literal_negative", "literal_postitive", "literal_float_number", "literal_string_value", 
			"literal_identifier", "simple_obj", "multiplicative", "additive", "relational", 
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
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				source_element();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NEW_LINE) | (1L << INT32) | (1L << INT64) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << AUTO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << FUNCTION) | (1L << MAP) | (1L << NEGATIVE) | (1L << POSITIVE) | (1L << FLOAT_NUMBER) | (1L << STRING_VALUE) | (1L << ID))) != 0) );
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(193);
						function_declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(196); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TRUE:
			case FALSE:
			case NEW_LINE:
			case INT32:
			case INT64:
			case FLOAT:
			case STRING:
			case BOOLEAN:
			case AUTO:
			case IF:
			case WHILE:
			case FOR:
			case FOREACH:
			case MAP:
			case NEGATIVE:
			case POSITIVE:
			case FLOAT_NUMBER:
			case STRING_VALUE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				variable_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				empty_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				expr_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				iteration_statements();
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

	public static class IntegerContext extends ParserRuleContext {
		public Literal_postitiveContext literal_postitive() {
			return getRuleContext(Literal_postitiveContext.class,0);
		}
		public Literal_negativeContext literal_negative() {
			return getRuleContext(Literal_negativeContext.class,0);
		}
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
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				literal_postitive();
				}
				break;
			case NEGATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				literal_negative();
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				boolean_literal();
				}
				break;
			case NEGATIVE:
			case POSITIVE:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				numeric_literal();
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
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
		public Literal_trueContext literal_true() {
			return getRuleContext(Literal_trueContext.class,0);
		}
		public Literal_falseContext literal_false() {
			return getRuleContext(Literal_falseContext.class,0);
		}
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
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				literal_true();
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				literal_false();
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Literal_float_numberContext literal_float_number() {
			return getRuleContext(Literal_float_numberContext.class,0);
		}
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATIVE:
			case POSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				integer();
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				literal_float_number();
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
		public Literal_string_valueContext literal_string_value() {
			return getRuleContext(Literal_string_valueContext.class,0);
		}
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
			setState(231);
			literal_string_value();
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
		public List<Literal_identifierContext> literal_identifier() {
			return getRuleContexts(Literal_identifierContext.class);
		}
		public Literal_identifierContext literal_identifier(int i) {
			return getRuleContext(Literal_identifierContext.class,i);
		}
		public Literal_left_square_bracketContext literal_left_square_bracket() {
			return getRuleContext(Literal_left_square_bracketContext.class,0);
		}
		public Literal_right_square_bracketContext literal_right_square_bracket() {
			return getRuleContext(Literal_right_square_bracketContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public Literal_postitiveContext literal_postitive() {
			return getRuleContext(Literal_postitiveContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_call_id);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				literal_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				literal_identifier();
				setState(235);
				literal_left_square_bracket();
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(236);
					additive();
					}
					break;
				case 2:
					{
					setState(237);
					literal_postitive();
					}
					break;
				case 3:
					{
					setState(238);
					literal_identifier();
					}
					break;
				}
				setState(241);
				literal_right_square_bracket();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				literal();
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

	public static class Literal_trueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PseudoCodeParser.TRUE, 0); }
		public Literal_trueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_true; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_true(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_true(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_true(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_trueContext literal_true() throws RecognitionException {
		Literal_trueContext _localctx = new Literal_trueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TRUE);
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

	public static class Literal_falseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(PseudoCodeParser.FALSE, 0); }
		public Literal_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_falseContext literal_false() throws RecognitionException {
		Literal_falseContext _localctx = new Literal_falseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FALSE);
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

	public static class Literal_minusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(PseudoCodeParser.MINUS, 0); }
		public Literal_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_minusContext literal_minus() throws RecognitionException {
		Literal_minusContext _localctx = new Literal_minusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(MINUS);
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

	public static class Literal_plusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PseudoCodeParser.PLUS, 0); }
		public Literal_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_plusContext literal_plus() throws RecognitionException {
		Literal_plusContext _localctx = new Literal_plusContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(PLUS);
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

	public static class Literal_multyContext extends ParserRuleContext {
		public TerminalNode MULTY() { return getToken(PseudoCodeParser.MULTY, 0); }
		public Literal_multyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_multy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_multy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_multy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_multy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_multyContext literal_multy() throws RecognitionException {
		Literal_multyContext _localctx = new Literal_multyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal_multy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(MULTY);
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

	public static class Literal_devContext extends ParserRuleContext {
		public TerminalNode DEV() { return getToken(PseudoCodeParser.DEV, 0); }
		public Literal_devContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_dev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_dev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_dev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_dev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_devContext literal_dev() throws RecognitionException {
		Literal_devContext _localctx = new Literal_devContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal_dev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(DEV);
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

	public static class Literal_modContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(PseudoCodeParser.MOD, 0); }
		public Literal_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_modContext literal_mod() throws RecognitionException {
		Literal_modContext _localctx = new Literal_modContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(MOD);
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

	public static class Literal_less_signContext extends ParserRuleContext {
		public TerminalNode LESS_SIGH() { return getToken(PseudoCodeParser.LESS_SIGH, 0); }
		public Literal_less_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_less_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_less_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_less_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_less_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_less_signContext literal_less_sign() throws RecognitionException {
		Literal_less_signContext _localctx = new Literal_less_signContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal_less_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(LESS_SIGH);
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

	public static class Literal_more_signContext extends ParserRuleContext {
		public TerminalNode MORE_SIGN() { return getToken(PseudoCodeParser.MORE_SIGN, 0); }
		public Literal_more_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_more_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_more_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_more_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_more_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_more_signContext literal_more_sign() throws RecognitionException {
		Literal_more_signContext _localctx = new Literal_more_signContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal_more_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(MORE_SIGN);
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

	public static class Literal_less_equal_signContext extends ParserRuleContext {
		public TerminalNode LESS_EQUAL_SIGN() { return getToken(PseudoCodeParser.LESS_EQUAL_SIGN, 0); }
		public Literal_less_equal_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_less_equal_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_less_equal_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_less_equal_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_less_equal_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_less_equal_signContext literal_less_equal_sign() throws RecognitionException {
		Literal_less_equal_signContext _localctx = new Literal_less_equal_signContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal_less_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LESS_EQUAL_SIGN);
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

	public static class Literal_more_equal_signContext extends ParserRuleContext {
		public TerminalNode MORE_EQUAL_SIGN() { return getToken(PseudoCodeParser.MORE_EQUAL_SIGN, 0); }
		public Literal_more_equal_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_more_equal_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_more_equal_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_more_equal_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_more_equal_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_more_equal_signContext literal_more_equal_sign() throws RecognitionException {
		Literal_more_equal_signContext _localctx = new Literal_more_equal_signContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal_more_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(MORE_EQUAL_SIGN);
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

	public static class Literal_equal_signContext extends ParserRuleContext {
		public TerminalNode EQUAL_SIGH() { return getToken(PseudoCodeParser.EQUAL_SIGH, 0); }
		public Literal_equal_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_equal_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_equal_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_equal_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_equal_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_equal_signContext literal_equal_sign() throws RecognitionException {
		Literal_equal_signContext _localctx = new Literal_equal_signContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(EQUAL_SIGH);
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

	public static class Literal_not_equal_signContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL_SIGN() { return getToken(PseudoCodeParser.NOT_EQUAL_SIGN, 0); }
		public Literal_not_equal_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_not_equal_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_not_equal_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_not_equal_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_not_equal_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_not_equal_signContext literal_not_equal_sign() throws RecognitionException {
		Literal_not_equal_signContext _localctx = new Literal_not_equal_signContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal_not_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(NOT_EQUAL_SIGN);
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

	public static class Literal_orContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PseudoCodeParser.OR, 0); }
		public Literal_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_orContext literal_or() throws RecognitionException {
		Literal_orContext _localctx = new Literal_orContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(OR);
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

	public static class Literal_andContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PseudoCodeParser.AND, 0); }
		public Literal_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_andContext literal_and() throws RecognitionException {
		Literal_andContext _localctx = new Literal_andContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(AND);
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

	public static class Literal_plus_plusContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(PseudoCodeParser.PLUS_PLUS, 0); }
		public Literal_plus_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_plus_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_plus_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_plus_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_plus_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_plus_plusContext literal_plus_plus() throws RecognitionException {
		Literal_plus_plusContext _localctx = new Literal_plus_plusContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal_plus_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(PLUS_PLUS);
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

	public static class Literal_minus_minisContext extends ParserRuleContext {
		public TerminalNode MINUS_MINUS() { return getToken(PseudoCodeParser.MINUS_MINUS, 0); }
		public Literal_minus_minisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_minus_minis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_minus_minis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_minus_minis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_minus_minis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_minus_minisContext literal_minus_minis() throws RecognitionException {
		Literal_minus_minisContext _localctx = new Literal_minus_minisContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal_minus_minis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(MINUS_MINUS);
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

	public static class Literal_assign_signContext extends ParserRuleContext {
		public TerminalNode ASSIGN_SIGN() { return getToken(PseudoCodeParser.ASSIGN_SIGN, 0); }
		public Literal_assign_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_assign_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_assign_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_assign_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_assign_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_assign_signContext literal_assign_sign() throws RecognitionException {
		Literal_assign_signContext _localctx = new Literal_assign_signContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal_assign_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ASSIGN_SIGN);
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

	public static class Literal_new_lineContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(PseudoCodeParser.NEW_LINE, 0); }
		public Literal_new_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_new_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_new_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_new_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_new_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_new_lineContext literal_new_line() throws RecognitionException {
		Literal_new_lineContext _localctx = new Literal_new_lineContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(NEW_LINE);
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

	public static class Literal_int_32Context extends ParserRuleContext {
		public TerminalNode INT32() { return getToken(PseudoCodeParser.INT32, 0); }
		public Literal_int_32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_int_32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_int_32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_int_32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_int_32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_int_32Context literal_int_32() throws RecognitionException {
		Literal_int_32Context _localctx = new Literal_int_32Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal_int_32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(INT32);
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

	public static class Literal_int_64Context extends ParserRuleContext {
		public TerminalNode INT64() { return getToken(PseudoCodeParser.INT64, 0); }
		public Literal_int_64Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_int_64; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_int_64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_int_64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_int_64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_int_64Context literal_int_64() throws RecognitionException {
		Literal_int_64Context _localctx = new Literal_int_64Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal_int_64);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(INT64);
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

	public static class Literal_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PseudoCodeParser.FLOAT, 0); }
		public Literal_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_floatContext literal_float() throws RecognitionException {
		Literal_floatContext _localctx = new Literal_floatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(FLOAT);
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

	public static class Literal_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PseudoCodeParser.STRING, 0); }
		public Literal_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_stringContext literal_string() throws RecognitionException {
		Literal_stringContext _localctx = new Literal_stringContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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

	public static class Literal_booleanContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PseudoCodeParser.BOOLEAN, 0); }
		public Literal_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_booleanContext literal_boolean() throws RecognitionException {
		Literal_booleanContext _localctx = new Literal_booleanContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(BOOLEAN);
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

	public static class Literal_autoContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(PseudoCodeParser.AUTO, 0); }
		public Literal_autoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_auto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_auto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_auto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_auto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_autoContext literal_auto() throws RecognitionException {
		Literal_autoContext _localctx = new Literal_autoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal_auto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(AUTO);
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

	public static class Literal_left_square_bracketContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(PseudoCodeParser.LEFT_SQUARE_BRACKET, 0); }
		public Literal_left_square_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_left_square_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_left_square_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_left_square_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_left_square_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_left_square_bracketContext literal_left_square_bracket() throws RecognitionException {
		Literal_left_square_bracketContext _localctx = new Literal_left_square_bracketContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal_left_square_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(LEFT_SQUARE_BRACKET);
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

	public static class Literal_right_square_bracketContext extends ParserRuleContext {
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(PseudoCodeParser.RIGHT_SQUARE_BRACKET, 0); }
		public Literal_right_square_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_right_square_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_right_square_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_right_square_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_right_square_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_right_square_bracketContext literal_right_square_bracket() throws RecognitionException {
		Literal_right_square_bracketContext _localctx = new Literal_right_square_bracketContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal_right_square_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(RIGHT_SQUARE_BRACKET);
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

	public static class Literal_left_round_bracketContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(PseudoCodeParser.LEFT_ROUND_BRACKET, 0); }
		public Literal_left_round_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_left_round_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_left_round_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_left_round_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_left_round_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_left_round_bracketContext literal_left_round_bracket() throws RecognitionException {
		Literal_left_round_bracketContext _localctx = new Literal_left_round_bracketContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal_left_round_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LEFT_ROUND_BRACKET);
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

	public static class Literal_right_round_bracketContext extends ParserRuleContext {
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(PseudoCodeParser.RIGHT_ROUND_BRACKET, 0); }
		public Literal_right_round_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_right_round_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_right_round_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_right_round_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_right_round_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_right_round_bracketContext literal_right_round_bracket() throws RecognitionException {
		Literal_right_round_bracketContext _localctx = new Literal_right_round_bracketContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal_right_round_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Literal_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PseudoCodeParser.IF, 0); }
		public Literal_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_ifContext literal_if() throws RecognitionException {
		Literal_ifContext _localctx = new Literal_ifContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IF);
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

	public static class Literal_thenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(PseudoCodeParser.THEN, 0); }
		public Literal_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_thenContext literal_then() throws RecognitionException {
		Literal_thenContext _localctx = new Literal_thenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(THEN);
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

	public static class Literal_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PseudoCodeParser.ELSE, 0); }
		public Literal_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_elseContext literal_else() throws RecognitionException {
		Literal_elseContext _localctx = new Literal_elseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ELSE);
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

	public static class Literal_endifContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(PseudoCodeParser.ENDIF, 0); }
		public Literal_endifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_endif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_endif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_endif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_endif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_endifContext literal_endif() throws RecognitionException {
		Literal_endifContext _localctx = new Literal_endifContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal_endif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ENDIF);
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

	public static class Literal_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PseudoCodeParser.WHILE, 0); }
		public Literal_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_whileContext literal_while() throws RecognitionException {
		Literal_whileContext _localctx = new Literal_whileContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(WHILE);
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

	public static class Literal_endwhileContext extends ParserRuleContext {
		public TerminalNode ENDWHILE() { return getToken(PseudoCodeParser.ENDWHILE, 0); }
		public Literal_endwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_endwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_endwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_endwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_endwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_endwhileContext literal_endwhile() throws RecognitionException {
		Literal_endwhileContext _localctx = new Literal_endwhileContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal_endwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ENDWHILE);
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

	public static class Literal_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PseudoCodeParser.FOR, 0); }
		public Literal_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_forContext literal_for() throws RecognitionException {
		Literal_forContext _localctx = new Literal_forContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(FOR);
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

	public static class Literal_toContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(PseudoCodeParser.TO, 0); }
		public Literal_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_to(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_toContext literal_to() throws RecognitionException {
		Literal_toContext _localctx = new Literal_toContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(TO);
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

	public static class Literal_endforContext extends ParserRuleContext {
		public TerminalNode ENDFOR() { return getToken(PseudoCodeParser.ENDFOR, 0); }
		public Literal_endforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_endfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_endfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_endfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_endfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_endforContext literal_endfor() throws RecognitionException {
		Literal_endforContext _localctx = new Literal_endforContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal_endfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ENDFOR);
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

	public static class Literal_foreachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(PseudoCodeParser.FOREACH, 0); }
		public Literal_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_foreach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_foreach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_foreach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_foreachContext literal_foreach() throws RecognitionException {
		Literal_foreachContext _localctx = new Literal_foreachContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FOREACH);
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

	public static class Literal_inContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PseudoCodeParser.IN, 0); }
		public Literal_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_inContext literal_in() throws RecognitionException {
		Literal_inContext _localctx = new Literal_inContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IN);
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

	public static class Literal_endforeachContext extends ParserRuleContext {
		public TerminalNode ENDFOREACH() { return getToken(PseudoCodeParser.ENDFOREACH, 0); }
		public Literal_endforeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_endforeach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_endforeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_endforeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_endforeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_endforeachContext literal_endforeach() throws RecognitionException {
		Literal_endforeachContext _localctx = new Literal_endforeachContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal_endforeach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ENDFOREACH);
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

	public static class Literal_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PseudoCodeParser.FUNCTION, 0); }
		public Literal_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_functionContext literal_function() throws RecognitionException {
		Literal_functionContext _localctx = new Literal_functionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(FUNCTION);
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

	public static class Literal_voidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(PseudoCodeParser.VOID, 0); }
		public Literal_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_void(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_voidContext literal_void() throws RecognitionException {
		Literal_voidContext _localctx = new Literal_voidContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(VOID);
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

	public static class Literal_beginContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PseudoCodeParser.BEGIN, 0); }
		public Literal_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_beginContext literal_begin() throws RecognitionException {
		Literal_beginContext _localctx = new Literal_beginContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(BEGIN);
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

	public static class Literal_end_functionContext extends ParserRuleContext {
		public TerminalNode END_FUNCTION() { return getToken(PseudoCodeParser.END_FUNCTION, 0); }
		public Literal_end_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_end_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_end_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_end_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_end_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_end_functionContext literal_end_function() throws RecognitionException {
		Literal_end_functionContext _localctx = new Literal_end_functionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_literal_end_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(END_FUNCTION);
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

	public static class Literal_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PseudoCodeParser.RETURN, 0); }
		public Literal_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_returnContext literal_return() throws RecognitionException {
		Literal_returnContext _localctx = new Literal_returnContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(RETURN);
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

	public static class Literal_mapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(PseudoCodeParser.MAP, 0); }
		public Literal_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_map(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_map(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_mapContext literal_map() throws RecognitionException {
		Literal_mapContext _localctx = new Literal_mapContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(MAP);
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

	public static class Literal_commaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PseudoCodeParser.COMMA, 0); }
		public Literal_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_commaContext literal_comma() throws RecognitionException {
		Literal_commaContext _localctx = new Literal_commaContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(COMMA);
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

	public static class Literal_colon_signContext extends ParserRuleContext {
		public TerminalNode COLON_SIGH() { return getToken(PseudoCodeParser.COLON_SIGH, 0); }
		public Literal_colon_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_colon_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_colon_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_colon_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_colon_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_colon_signContext literal_colon_sign() throws RecognitionException {
		Literal_colon_signContext _localctx = new Literal_colon_signContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal_colon_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(COLON_SIGH);
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

	public static class Literal_negativeContext extends ParserRuleContext {
		public TerminalNode NEGATIVE() { return getToken(PseudoCodeParser.NEGATIVE, 0); }
		public Literal_negativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_negative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_negative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_negative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_negative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_negativeContext literal_negative() throws RecognitionException {
		Literal_negativeContext _localctx = new Literal_negativeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_literal_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(NEGATIVE);
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

	public static class Literal_postitiveContext extends ParserRuleContext {
		public TerminalNode POSITIVE() { return getToken(PseudoCodeParser.POSITIVE, 0); }
		public Literal_postitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_postitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_postitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_postitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_postitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_postitiveContext literal_postitive() throws RecognitionException {
		Literal_postitiveContext _localctx = new Literal_postitiveContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal_postitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(POSITIVE);
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

	public static class Literal_float_numberContext extends ParserRuleContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(PseudoCodeParser.FLOAT_NUMBER, 0); }
		public Literal_float_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_float_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_float_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_float_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_float_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_float_numberContext literal_float_number() throws RecognitionException {
		Literal_float_numberContext _localctx = new Literal_float_numberContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literal_float_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(FLOAT_NUMBER);
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

	public static class Literal_string_valueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(PseudoCodeParser.STRING_VALUE, 0); }
		public Literal_string_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_string_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_string_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_string_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_string_valueContext literal_string_value() throws RecognitionException {
		Literal_string_valueContext _localctx = new Literal_string_valueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_literal_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(STRING_VALUE);
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

	public static class Literal_identifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseudoCodeParser.ID, 0); }
		public Literal_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_identifierContext literal_identifier() throws RecognitionException {
		Literal_identifierContext _localctx = new Literal_identifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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

	public static class Simple_objContext extends ParserRuleContext {
		public Call_idContext call_id() {
			return getRuleContext(Call_idContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_minusContext literal_minus() {
			return getRuleContext(Literal_minusContext.class,0);
		}
		public Simple_objContext simple_obj() {
			return getRuleContext(Simple_objContext.class,0);
		}
		public Literal_left_round_bracketContext literal_left_round_bracket() {
			return getRuleContext(Literal_left_round_bracketContext.class,0);
		}
		public Literal_right_round_bracketContext literal_right_round_bracket() {
			return getRuleContext(Literal_right_round_bracketContext.class,0);
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
		enterRule(_localctx, 128, RULE_simple_obj);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				call_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				literal_minus();
				setState(357);
				simple_obj();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				literal_left_round_bracket();
				setState(360);
				simple_obj();
				setState(361);
				literal_right_round_bracket();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
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
		public List<Literal_multyContext> literal_multy() {
			return getRuleContexts(Literal_multyContext.class);
		}
		public Literal_multyContext literal_multy(int i) {
			return getRuleContext(Literal_multyContext.class,i);
		}
		public List<Literal_devContext> literal_dev() {
			return getRuleContexts(Literal_devContext.class);
		}
		public Literal_devContext literal_dev(int i) {
			return getRuleContext(Literal_devContext.class,i);
		}
		public List<Literal_modContext> literal_mod() {
			return getRuleContexts(Literal_modContext.class);
		}
		public Literal_modContext literal_mod(int i) {
			return getRuleContext(Literal_modContext.class,i);
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
		enterRule(_localctx, 130, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			simple_obj();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTY) | (1L << DEV) | (1L << MOD))) != 0)) {
				{
				{
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTY:
					{
					setState(367);
					literal_multy();
					}
					break;
				case DEV:
					{
					setState(368);
					literal_dev();
					}
					break;
				case MOD:
					{
					setState(369);
					literal_mod();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372);
				simple_obj();
				}
				}
				setState(378);
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
		public List<Literal_plusContext> literal_plus() {
			return getRuleContexts(Literal_plusContext.class);
		}
		public Literal_plusContext literal_plus(int i) {
			return getRuleContext(Literal_plusContext.class,i);
		}
		public List<Literal_minusContext> literal_minus() {
			return getRuleContexts(Literal_minusContext.class);
		}
		public Literal_minusContext literal_minus(int i) {
			return getRuleContext(Literal_minusContext.class,i);
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
		enterRule(_localctx, 132, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			multiplicative();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(382);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(380);
					literal_plus();
					}
					break;
				case MINUS:
					{
					setState(381);
					literal_minus();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(384);
				multiplicative();
				}
				}
				setState(390);
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
		public List<Literal_less_signContext> literal_less_sign() {
			return getRuleContexts(Literal_less_signContext.class);
		}
		public Literal_less_signContext literal_less_sign(int i) {
			return getRuleContext(Literal_less_signContext.class,i);
		}
		public List<Literal_more_signContext> literal_more_sign() {
			return getRuleContexts(Literal_more_signContext.class);
		}
		public Literal_more_signContext literal_more_sign(int i) {
			return getRuleContext(Literal_more_signContext.class,i);
		}
		public List<Literal_more_equal_signContext> literal_more_equal_sign() {
			return getRuleContexts(Literal_more_equal_signContext.class);
		}
		public Literal_more_equal_signContext literal_more_equal_sign(int i) {
			return getRuleContext(Literal_more_equal_signContext.class,i);
		}
		public List<Literal_less_equal_signContext> literal_less_equal_sign() {
			return getRuleContexts(Literal_less_equal_signContext.class);
		}
		public Literal_less_equal_signContext literal_less_equal_sign(int i) {
			return getRuleContext(Literal_less_equal_signContext.class,i);
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
		enterRule(_localctx, 134, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			additive();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_SIGH) | (1L << MORE_SIGN) | (1L << LESS_EQUAL_SIGN) | (1L << MORE_EQUAL_SIGN))) != 0)) {
				{
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_SIGH:
					{
					setState(392);
					literal_less_sign();
					}
					break;
				case MORE_SIGN:
					{
					setState(393);
					literal_more_sign();
					}
					break;
				case MORE_EQUAL_SIGN:
					{
					setState(394);
					literal_more_equal_sign();
					}
					break;
				case LESS_EQUAL_SIGN:
					{
					setState(395);
					literal_less_equal_sign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398);
				additive();
				}
				}
				setState(404);
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
		public List<Literal_equal_signContext> literal_equal_sign() {
			return getRuleContexts(Literal_equal_signContext.class);
		}
		public Literal_equal_signContext literal_equal_sign(int i) {
			return getRuleContext(Literal_equal_signContext.class,i);
		}
		public List<Literal_not_equal_signContext> literal_not_equal_sign() {
			return getRuleContexts(Literal_not_equal_signContext.class);
		}
		public Literal_not_equal_signContext literal_not_equal_sign(int i) {
			return getRuleContext(Literal_not_equal_signContext.class,i);
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
		enterRule(_localctx, 136, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			relational();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL_SIGH || _la==NOT_EQUAL_SIGN) {
				{
				{
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL_SIGH:
					{
					setState(406);
					literal_equal_sign();
					}
					break;
				case NOT_EQUAL_SIGN:
					{
					setState(407);
					literal_not_equal_sign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410);
				relational();
				}
				}
				setState(416);
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
		public List<Literal_orContext> literal_or() {
			return getRuleContexts(Literal_orContext.class);
		}
		public Literal_orContext literal_or(int i) {
			return getRuleContext(Literal_orContext.class,i);
		}
		public List<Literal_andContext> literal_and() {
			return getRuleContexts(Literal_andContext.class);
		}
		public Literal_andContext literal_and(int i) {
			return getRuleContext(Literal_andContext.class,i);
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
		enterRule(_localctx, 138, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			equality();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OR:
					{
					setState(418);
					literal_or();
					}
					break;
				case AND:
					{
					setState(419);
					literal_and();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(422);
				equality();
				}
				}
				setState(428);
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
		public Literal_plus_plusContext literal_plus_plus() {
			return getRuleContext(Literal_plus_plusContext.class,0);
		}
		public Literal_minus_minisContext literal_minus_minis() {
			return getRuleContext(Literal_minus_minisContext.class,0);
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
		enterRule(_localctx, 140, RULE_postfix);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				call_id();
				setState(430);
				literal_plus_plus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				call_id();
				setState(433);
				literal_minus_minis();
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
		public Literal_assign_signContext literal_assign_sign() {
			return getRuleContext(Literal_assign_signContext.class,0);
		}
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
		enterRule(_localctx, 142, RULE_assignment_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			literal_assign_sign();
			setState(438);
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
		enterRule(_localctx, 144, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			call_id();
			setState(441);
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
		public Literal_new_lineContext literal_new_line() {
			return getRuleContext(Literal_new_lineContext.class,0);
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
		enterRule(_localctx, 146, RULE_expr_statement);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				expr();
				setState(444);
				literal_new_line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				postfix();
				setState(447);
				literal_new_line();
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
		public Literal_new_lineContext literal_new_line() {
			return getRuleContext(Literal_new_lineContext.class,0);
		}
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
		enterRule(_localctx, 148, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			literal_new_line();
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
		public Literal_int_32Context literal_int_32() {
			return getRuleContext(Literal_int_32Context.class,0);
		}
		public Literal_int_64Context literal_int_64() {
			return getRuleContext(Literal_int_64Context.class,0);
		}
		public Literal_stringContext literal_string() {
			return getRuleContext(Literal_stringContext.class,0);
		}
		public Literal_booleanContext literal_boolean() {
			return getRuleContext(Literal_booleanContext.class,0);
		}
		public Literal_floatContext literal_float() {
			return getRuleContext(Literal_floatContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_types_simple);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT32:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				literal_int_32();
				}
				break;
			case INT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				literal_int_64();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				literal_string();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				literal_boolean();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
				literal_float();
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

	public static class ArrayContext extends ParserRuleContext {
		public Types_simpleContext types_simple() {
			return getRuleContext(Types_simpleContext.class,0);
		}
		public Literal_left_square_bracketContext literal_left_square_bracket() {
			return getRuleContext(Literal_left_square_bracketContext.class,0);
		}
		public Literal_right_square_bracketContext literal_right_square_bracket() {
			return getRuleContext(Literal_right_square_bracketContext.class,0);
		}
		public List<Literal_identifierContext> literal_identifier() {
			return getRuleContexts(Literal_identifierContext.class);
		}
		public Literal_identifierContext literal_identifier(int i) {
			return getRuleContext(Literal_identifierContext.class,i);
		}
		public Literal_postitiveContext literal_postitive() {
			return getRuleContext(Literal_postitiveContext.class,0);
		}
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
		enterRule(_localctx, 152, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			types_simple();
			setState(461);
			literal_left_square_bracket();
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITIVE:
				{
				setState(462);
				literal_postitive();
				}
				break;
			case ID:
				{
				setState(463);
				literal_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			literal_right_square_bracket();
			setState(467);
			literal_identifier();
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
		public Literal_left_square_bracketContext literal_left_square_bracket() {
			return getRuleContext(Literal_left_square_bracketContext.class,0);
		}
		public Literal_right_square_bracketContext literal_right_square_bracket() {
			return getRuleContext(Literal_right_square_bracketContext.class,0);
		}
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
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
		enterRule(_localctx, 154, RULE_array_in_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			types_simple();
			setState(470);
			literal_left_square_bracket();
			setState(471);
			literal_right_square_bracket();
			setState(472);
			literal_identifier();
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
		public Literal_mapContext literal_map() {
			return getRuleContext(Literal_mapContext.class,0);
		}
		public Literal_left_round_bracketContext literal_left_round_bracket() {
			return getRuleContext(Literal_left_round_bracketContext.class,0);
		}
		public List<Types_simpleContext> types_simple() {
			return getRuleContexts(Types_simpleContext.class);
		}
		public Types_simpleContext types_simple(int i) {
			return getRuleContext(Types_simpleContext.class,i);
		}
		public Literal_commaContext literal_comma() {
			return getRuleContext(Literal_commaContext.class,0);
		}
		public Literal_right_round_bracketContext literal_right_round_bracket() {
			return getRuleContext(Literal_right_round_bracketContext.class,0);
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
		enterRule(_localctx, 156, RULE_types);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				literal_map();
				setState(475);
				literal_left_round_bracket();
				setState(476);
				types_simple();
				setState(477);
				literal_comma();
				setState(478);
				types_simple();
				setState(479);
				literal_right_round_bracket();
				}
				break;
			case INT32:
			case INT64:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
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
		enterRule(_localctx, 158, RULE_varible);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				types();
				setState(485);
				literal_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
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
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
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
		enterRule(_localctx, 160, RULE_varible_in_function);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				types();
				setState(491);
				literal_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
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
		public Literal_autoContext literal_auto() {
			return getRuleContext(Literal_autoContext.class,0);
		}
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
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
		enterRule(_localctx, 162, RULE_variable_declaration);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				varible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				varible();
				setState(498);
				assignment_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				literal_auto();
				setState(501);
				literal_identifier();
				setState(502);
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
		public Literal_new_lineContext literal_new_line() {
			return getRuleContext(Literal_new_lineContext.class,0);
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
		enterRule(_localctx, 164, RULE_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			variable_declaration();
			setState(507);
			literal_new_line();
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
		public Literal_ifContext literal_if() {
			return getRuleContext(Literal_ifContext.class,0);
		}
		public Literal_left_round_bracketContext literal_left_round_bracket() {
			return getRuleContext(Literal_left_round_bracketContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Literal_right_round_bracketContext literal_right_round_bracket() {
			return getRuleContext(Literal_right_round_bracketContext.class,0);
		}
		public Literal_thenContext literal_then() {
			return getRuleContext(Literal_thenContext.class,0);
		}
		public List<Literal_new_lineContext> literal_new_line() {
			return getRuleContexts(Literal_new_lineContext.class);
		}
		public Literal_new_lineContext literal_new_line(int i) {
			return getRuleContext(Literal_new_lineContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Literal_endifContext literal_endif() {
			return getRuleContext(Literal_endifContext.class,0);
		}
		public Literal_elseContext literal_else() {
			return getRuleContext(Literal_elseContext.class,0);
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
		enterRule(_localctx, 166, RULE_if_statement);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				literal_if();
				setState(510);
				literal_left_round_bracket();
				setState(511);
				logical();
				setState(512);
				literal_right_round_bracket();
				setState(513);
				literal_then();
				setState(514);
				literal_new_line();
				setState(515);
				statements();
				setState(516);
				literal_endif();
				setState(517);
				literal_new_line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				literal_if();
				setState(520);
				literal_left_round_bracket();
				setState(521);
				logical();
				setState(522);
				literal_right_round_bracket();
				setState(523);
				literal_then();
				setState(524);
				literal_new_line();
				setState(525);
				statements();
				setState(526);
				literal_else();
				setState(527);
				literal_new_line();
				setState(528);
				statements();
				setState(529);
				literal_endif();
				setState(530);
				literal_new_line();
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
		enterRule(_localctx, 168, RULE_iteration_statements);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				iteration_statement_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				iteration_statement_for();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
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
		public Literal_whileContext literal_while() {
			return getRuleContext(Literal_whileContext.class,0);
		}
		public Literal_left_round_bracketContext literal_left_round_bracket() {
			return getRuleContext(Literal_left_round_bracketContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Literal_right_round_bracketContext literal_right_round_bracket() {
			return getRuleContext(Literal_right_round_bracketContext.class,0);
		}
		public List<Literal_new_lineContext> literal_new_line() {
			return getRuleContexts(Literal_new_lineContext.class);
		}
		public Literal_new_lineContext literal_new_line(int i) {
			return getRuleContext(Literal_new_lineContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Literal_endwhileContext literal_endwhile() {
			return getRuleContext(Literal_endwhileContext.class,0);
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
		enterRule(_localctx, 170, RULE_iteration_statement_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			literal_while();
			setState(540);
			literal_left_round_bracket();
			setState(541);
			logical();
			setState(542);
			literal_right_round_bracket();
			setState(543);
			literal_new_line();
			setState(544);
			statements();
			setState(545);
			literal_endwhile();
			setState(546);
			literal_new_line();
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
		public Literal_forContext literal_for() {
			return getRuleContext(Literal_forContext.class,0);
		}
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
		}
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Literal_toContext literal_to() {
			return getRuleContext(Literal_toContext.class,0);
		}
		public List<Literal_new_lineContext> literal_new_line() {
			return getRuleContexts(Literal_new_lineContext.class);
		}
		public Literal_new_lineContext literal_new_line(int i) {
			return getRuleContext(Literal_new_lineContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Literal_endforContext literal_endfor() {
			return getRuleContext(Literal_endforContext.class,0);
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
		enterRule(_localctx, 172, RULE_iteration_statement_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			literal_for();
			setState(549);
			literal_identifier();
			setState(550);
			assignment_expr();
			setState(551);
			literal_to();
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(552);
				integer();
				}
				break;
			case 2:
				{
				setState(553);
				call_id();
				}
				break;
			}
			setState(556);
			literal_new_line();
			setState(557);
			statements();
			setState(558);
			literal_endfor();
			setState(559);
			literal_new_line();
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
		public Literal_foreachContext literal_foreach() {
			return getRuleContext(Literal_foreachContext.class,0);
		}
		public List<Literal_identifierContext> literal_identifier() {
			return getRuleContexts(Literal_identifierContext.class);
		}
		public Literal_identifierContext literal_identifier(int i) {
			return getRuleContext(Literal_identifierContext.class,i);
		}
		public Literal_inContext literal_in() {
			return getRuleContext(Literal_inContext.class,0);
		}
		public List<Literal_new_lineContext> literal_new_line() {
			return getRuleContexts(Literal_new_lineContext.class);
		}
		public Literal_new_lineContext literal_new_line(int i) {
			return getRuleContext(Literal_new_lineContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Literal_endforeachContext literal_endforeach() {
			return getRuleContext(Literal_endforeachContext.class,0);
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
		enterRule(_localctx, 174, RULE_iteration_statement_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			literal_foreach();
			setState(562);
			literal_identifier();
			setState(563);
			literal_in();
			setState(564);
			literal_identifier();
			setState(565);
			literal_new_line();
			setState(566);
			statements();
			setState(567);
			literal_endforeach();
			setState(568);
			literal_new_line();
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
		public Literal_returnContext literal_return() {
			return getRuleContext(Literal_returnContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Literal_new_lineContext literal_new_line() {
			return getRuleContext(Literal_new_lineContext.class,0);
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
		enterRule(_localctx, 176, RULE_return_statement);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				literal_return();
				setState(571);
				logical();
				setState(572);
				literal_new_line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				literal_return();
				setState(575);
				literal_new_line();
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
		public Literal_functionContext literal_function() {
			return getRuleContext(Literal_functionContext.class,0);
		}
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
		}
		public Literal_left_round_bracketContext literal_left_round_bracket() {
			return getRuleContext(Literal_left_round_bracketContext.class,0);
		}
		public Literal_right_round_bracketContext literal_right_round_bracket() {
			return getRuleContext(Literal_right_round_bracketContext.class,0);
		}
		public Literal_colon_signContext literal_colon_sign() {
			return getRuleContext(Literal_colon_signContext.class,0);
		}
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public Literal_beginContext literal_begin() {
			return getRuleContext(Literal_beginContext.class,0);
		}
		public List<Literal_new_lineContext> literal_new_line() {
			return getRuleContexts(Literal_new_lineContext.class);
		}
		public Literal_new_lineContext literal_new_line(int i) {
			return getRuleContext(Literal_new_lineContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Literal_end_functionContext literal_end_function() {
			return getRuleContext(Literal_end_functionContext.class,0);
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
		enterRule(_localctx, 178, RULE_function_declaration);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				literal_function();
				setState(580);
				literal_identifier();
				setState(581);
				literal_left_round_bracket();
				setState(582);
				literal_right_round_bracket();
				setState(583);
				literal_colon_sign();
				setState(584);
				return_types();
				setState(585);
				literal_begin();
				setState(586);
				literal_new_line();
				setState(587);
				statements();
				setState(588);
				return_statement();
				setState(589);
				literal_end_function();
				setState(590);
				literal_new_line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				literal_function();
				setState(593);
				literal_identifier();
				setState(594);
				literal_left_round_bracket();
				setState(595);
				formal_parameter_list();
				setState(596);
				literal_right_round_bracket();
				setState(597);
				literal_colon_sign();
				setState(598);
				return_types();
				setState(599);
				literal_begin();
				setState(600);
				literal_new_line();
				setState(601);
				statements();
				setState(602);
				return_statement();
				setState(603);
				literal_end_function();
				setState(604);
				literal_new_line();
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
		public Literal_left_square_bracketContext literal_left_square_bracket() {
			return getRuleContext(Literal_left_square_bracketContext.class,0);
		}
		public Literal_right_square_bracketContext literal_right_square_bracket() {
			return getRuleContext(Literal_right_square_bracketContext.class,0);
		}
		public Literal_voidContext literal_void() {
			return getRuleContext(Literal_voidContext.class,0);
		}
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
		enterRule(_localctx, 180, RULE_return_types);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				types();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				types_simple();
				setState(610);
				literal_left_square_bracket();
				setState(611);
				literal_right_square_bracket();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				literal_void();
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
		public List<Literal_commaContext> literal_comma() {
			return getRuleContexts(Literal_commaContext.class);
		}
		public Literal_commaContext literal_comma(int i) {
			return getRuleContext(Literal_commaContext.class,i);
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
		enterRule(_localctx, 182, RULE_formal_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			varible_in_function();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(617);
				literal_comma();
				setState(618);
				varible_in_function();
				}
				}
				setState(624);
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
		public Literal_identifierContext literal_identifier() {
			return getRuleContext(Literal_identifierContext.class,0);
		}
		public Literal_left_round_bracketContext literal_left_round_bracket() {
			return getRuleContext(Literal_left_round_bracketContext.class,0);
		}
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public Literal_right_round_bracketContext literal_right_round_bracket() {
			return getRuleContext(Literal_right_round_bracketContext.class,0);
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
		enterRule(_localctx, 184, RULE_function_call);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				literal_identifier();
				setState(626);
				literal_left_round_bracket();
				setState(627);
				function_params();
				setState(628);
				literal_right_round_bracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				literal_identifier();
				setState(631);
				literal_left_round_bracket();
				setState(632);
				literal_right_round_bracket();
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
		public List<Literal_commaContext> literal_comma() {
			return getRuleContexts(Literal_commaContext.class);
		}
		public Literal_commaContext literal_comma(int i) {
			return getRuleContext(Literal_commaContext.class,i);
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
		enterRule(_localctx, 186, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			call_id();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				literal_comma();
				setState(638);
				call_id();
				}
				}
				setState(644);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0288\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\6\2\u00c0\n\2\r\2\16\2\u00c1\3\3\6\3\u00c5\n\3\r\3\16\3\u00c6\3\3\5"+
		"\3\u00ca\n\3\3\4\6\4\u00cd\n\4\r\4\16\4\u00ce\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00d7\n\5\3\6\3\6\5\6\u00db\n\6\3\7\3\7\3\7\5\7\u00e0\n\7\3\b\3\b"+
		"\5\b\u00e4\n\b\3\t\3\t\5\t\u00e8\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00f2\n\13\3\13\3\13\3\13\5\13\u00f7\n\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u016f\nB\3C\3C\3C\3C\5C\u0175\nC\3"+
		"C\3C\7C\u0179\nC\fC\16C\u017c\13C\3D\3D\3D\5D\u0181\nD\3D\3D\7D\u0185"+
		"\nD\fD\16D\u0188\13D\3E\3E\3E\3E\3E\5E\u018f\nE\3E\3E\7E\u0193\nE\fE\16"+
		"E\u0196\13E\3F\3F\3F\5F\u019b\nF\3F\3F\7F\u019f\nF\fF\16F\u01a2\13F\3"+
		"G\3G\3G\5G\u01a7\nG\3G\3G\7G\u01ab\nG\fG\16G\u01ae\13G\3H\3H\3H\3H\3H"+
		"\3H\5H\u01b6\nH\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3K\5K\u01c4\nK\3L\3L"+
		"\3M\3M\3M\3M\3M\5M\u01cd\nM\3N\3N\3N\3N\5N\u01d3\nN\3N\3N\3N\3O\3O\3O"+
		"\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\5P\u01e5\nP\3Q\3Q\3Q\3Q\5Q\u01eb\nQ\3R"+
		"\3R\3R\3R\5R\u01f1\nR\3S\3S\3S\3S\3S\3S\3S\3S\5S\u01fb\nS\3T\3T\3T\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U"+
		"\u0217\nU\3V\3V\3V\5V\u021c\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X"+
		"\3X\3X\5X\u022d\nX\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\5Z\u0244\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0261\n[\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u0269\n\\\3]\3]\3]\3]\7]\u026f\n]\f]\16]\u0272\13]\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\5^\u027d\n^\3_\3_\3_\3_\7_\u0283\n_\f_\16_\u0286\13_\3"+
		"_\2\2`\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\2\2\2\u0263\2\u00bf\3\2\2\2\4\u00c9\3\2\2\2\6\u00cc\3\2\2\2\b\u00d6"+
		"\3\2\2\2\n\u00da\3\2\2\2\f\u00df\3\2\2\2\16\u00e3\3\2\2\2\20\u00e7\3\2"+
		"\2\2\22\u00e9\3\2\2\2\24\u00f6\3\2\2\2\26\u00f8\3\2\2\2\30\u00fa\3\2\2"+
		"\2\32\u00fc\3\2\2\2\34\u00fe\3\2\2\2\36\u0100\3\2\2\2 \u0102\3\2\2\2\""+
		"\u0104\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u010a\3\2\2\2*\u010c\3\2"+
		"\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60\u0112\3\2\2\2\62\u0114\3\2\2\2\64"+
		"\u0116\3\2\2\2\66\u0118\3\2\2\28\u011a\3\2\2\2:\u011c\3\2\2\2<\u011e\3"+
		"\2\2\2>\u0120\3\2\2\2@\u0122\3\2\2\2B\u0124\3\2\2\2D\u0126\3\2\2\2F\u0128"+
		"\3\2\2\2H\u012a\3\2\2\2J\u012c\3\2\2\2L\u012e\3\2\2\2N\u0130\3\2\2\2P"+
		"\u0132\3\2\2\2R\u0134\3\2\2\2T\u0136\3\2\2\2V\u0138\3\2\2\2X\u013a\3\2"+
		"\2\2Z\u013c\3\2\2\2\\\u013e\3\2\2\2^\u0140\3\2\2\2`\u0142\3\2\2\2b\u0144"+
		"\3\2\2\2d\u0146\3\2\2\2f\u0148\3\2\2\2h\u014a\3\2\2\2j\u014c\3\2\2\2l"+
		"\u014e\3\2\2\2n\u0150\3\2\2\2p\u0152\3\2\2\2r\u0154\3\2\2\2t\u0156\3\2"+
		"\2\2v\u0158\3\2\2\2x\u015a\3\2\2\2z\u015c\3\2\2\2|\u015e\3\2\2\2~\u0160"+
		"\3\2\2\2\u0080\u0162\3\2\2\2\u0082\u016e\3\2\2\2\u0084\u0170\3\2\2\2\u0086"+
		"\u017d\3\2\2\2\u0088\u0189\3\2\2\2\u008a\u0197\3\2\2\2\u008c\u01a3\3\2"+
		"\2\2\u008e\u01b5\3\2\2\2\u0090\u01b7\3\2\2\2\u0092\u01ba\3\2\2\2\u0094"+
		"\u01c3\3\2\2\2\u0096\u01c5\3\2\2\2\u0098\u01cc\3\2\2\2\u009a\u01ce\3\2"+
		"\2\2\u009c\u01d7\3\2\2\2\u009e\u01e4\3\2\2\2\u00a0\u01ea\3\2\2\2\u00a2"+
		"\u01f0\3\2\2\2\u00a4\u01fa\3\2\2\2\u00a6\u01fc\3\2\2\2\u00a8\u0216\3\2"+
		"\2\2\u00aa\u021b\3\2\2\2\u00ac\u021d\3\2\2\2\u00ae\u0226\3\2\2\2\u00b0"+
		"\u0233\3\2\2\2\u00b2\u0243\3\2\2\2\u00b4\u0260\3\2\2\2\u00b6\u0268\3\2"+
		"\2\2\u00b8\u026a\3\2\2\2\u00ba\u027c\3\2\2\2\u00bc\u027e\3\2\2\2\u00be"+
		"\u00c0\5\4\3\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\3\3\2\2\2\u00c3\u00c5\5\u00b4[\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\5\6\4\2\u00c9\u00c4\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\5\3\2\2\2\u00cb\u00cd\5\b\5\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\7\3"+
		"\2\2\2\u00d0\u00d7\5\u00ba^\2\u00d1\u00d7\5\u00a6T\2\u00d2\u00d7\5\u0096"+
		"L\2\u00d3\u00d7\5\u0094K\2\u00d4\u00d7\5\u00a8U\2\u00d5\u00d7\5\u00aa"+
		"V\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\t\3\2\2\2"+
		"\u00d8\u00db\5z>\2\u00d9\u00db\5x=\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db\13\3\2\2\2\u00dc\u00e0\5\16\b\2\u00dd\u00e0\5\20\t\2\u00de"+
		"\u00e0\5\22\n\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3"+
		"\2\2\2\u00e0\r\3\2\2\2\u00e1\u00e4\5\26\f\2\u00e2\u00e4\5\30\r\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\17\3\2\2\2\u00e5\u00e8\5\n\6"+
		"\2\u00e6\u00e8\5|?\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\21"+
		"\3\2\2\2\u00e9\u00ea\5~@\2\u00ea\23\3\2\2\2\u00eb\u00f7\5\u0080A\2\u00ec"+
		"\u00ed\5\u0080A\2\u00ed\u00f1\5H%\2\u00ee\u00f2\5\u0086D\2\u00ef\u00f2"+
		"\5z>\2\u00f0\u00f2\5\u0080A\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\5J&\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f7\5\f\7\2\u00f6\u00eb\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f9\7\4\2\2\u00f9\27\3\2\2\2\u00fa"+
		"\u00fb\7\5\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\33\3\2\2\2\u00fe"+
		"\u00ff\7\7\2\2\u00ff\35\3\2\2\2\u0100\u0101\7\b\2\2\u0101\37\3\2\2\2\u0102"+
		"\u0103\7\t\2\2\u0103!\3\2\2\2\u0104\u0105\7\n\2\2\u0105#\3\2\2\2\u0106"+
		"\u0107\7\13\2\2\u0107%\3\2\2\2\u0108\u0109\7\f\2\2\u0109\'\3\2\2\2\u010a"+
		"\u010b\7\r\2\2\u010b)\3\2\2\2\u010c\u010d\7\16\2\2\u010d+\3\2\2\2\u010e"+
		"\u010f\7\17\2\2\u010f-\3\2\2\2\u0110\u0111\7\20\2\2\u0111/\3\2\2\2\u0112"+
		"\u0113\7\21\2\2\u0113\61\3\2\2\2\u0114\u0115\7\22\2\2\u0115\63\3\2\2\2"+
		"\u0116\u0117\7\23\2\2\u0117\65\3\2\2\2\u0118\u0119\7\24\2\2\u0119\67\3"+
		"\2\2\2\u011a\u011b\7\25\2\2\u011b9\3\2\2\2\u011c\u011d\7\26\2\2\u011d"+
		";\3\2\2\2\u011e\u011f\7\27\2\2\u011f=\3\2\2\2\u0120\u0121\7\30\2\2\u0121"+
		"?\3\2\2\2\u0122\u0123\7\31\2\2\u0123A\3\2\2\2\u0124\u0125\7\32\2\2\u0125"+
		"C\3\2\2\2\u0126\u0127\7\33\2\2\u0127E\3\2\2\2\u0128\u0129\7\34\2\2\u0129"+
		"G\3\2\2\2\u012a\u012b\7\35\2\2\u012bI\3\2\2\2\u012c\u012d\7\36\2\2\u012d"+
		"K\3\2\2\2\u012e\u012f\7\37\2\2\u012fM\3\2\2\2\u0130\u0131\7 \2\2\u0131"+
		"O\3\2\2\2\u0132\u0133\7!\2\2\u0133Q\3\2\2\2\u0134\u0135\7\"\2\2\u0135"+
		"S\3\2\2\2\u0136\u0137\7#\2\2\u0137U\3\2\2\2\u0138\u0139\7$\2\2\u0139W"+
		"\3\2\2\2\u013a\u013b\7%\2\2\u013bY\3\2\2\2\u013c\u013d\7&\2\2\u013d[\3"+
		"\2\2\2\u013e\u013f\7\'\2\2\u013f]\3\2\2\2\u0140\u0141\7(\2\2\u0141_\3"+
		"\2\2\2\u0142\u0143\7)\2\2\u0143a\3\2\2\2\u0144\u0145\7*\2\2\u0145c\3\2"+
		"\2\2\u0146\u0147\7+\2\2\u0147e\3\2\2\2\u0148\u0149\7,\2\2\u0149g\3\2\2"+
		"\2\u014a\u014b\7-\2\2\u014bi\3\2\2\2\u014c\u014d\7.\2\2\u014dk\3\2\2\2"+
		"\u014e\u014f\7/\2\2\u014fm\3\2\2\2\u0150\u0151\7\60\2\2\u0151o\3\2\2\2"+
		"\u0152\u0153\7\61\2\2\u0153q\3\2\2\2\u0154\u0155\7\62\2\2\u0155s\3\2\2"+
		"\2\u0156\u0157\7\63\2\2\u0157u\3\2\2\2\u0158\u0159\7\64\2\2\u0159w\3\2"+
		"\2\2\u015a\u015b\7\65\2\2\u015by\3\2\2\2\u015c\u015d\7\66\2\2\u015d{\3"+
		"\2\2\2\u015e\u015f\7\67\2\2\u015f}\3\2\2\2\u0160\u0161\78\2\2\u0161\177"+
		"\3\2\2\2\u0162\u0163\79\2\2\u0163\u0081\3\2\2\2\u0164\u016f\5\24\13\2"+
		"\u0165\u016f\5\f\7\2\u0166\u0167\5\32\16\2\u0167\u0168\5\u0082B\2\u0168"+
		"\u016f\3\2\2\2\u0169\u016a\5L\'\2\u016a\u016b\5\u0082B\2\u016b\u016c\5"+
		"N(\2\u016c\u016f\3\2\2\2\u016d\u016f\5\u00ba^\2\u016e\u0164\3\2\2\2\u016e"+
		"\u0165\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0083\3\2\2\2\u0170\u017a\5\u0082B\2\u0171\u0175\5\36\20\2"+
		"\u0172\u0175\5 \21\2\u0173\u0175\5\"\22\2\u0174\u0171\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5\u0082B"+
		"\2\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0085\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u0186\5\u0084C\2\u017e\u0181\5\34\17\2\u017f\u0181\5\32\16\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5\u0084C"+
		"\2\u0183\u0185\3\2\2\2\u0184\u0180\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0087\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u0194\5\u0086D\2\u018a\u018f\5$\23\2\u018b\u018f\5&\24\2\u018c\u018f"+
		"\5*\26\2\u018d\u018f\5(\25\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5\u0086"+
		"D\2\u0191\u0193\3\2\2\2\u0192\u018e\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0089\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0197\u01a0\5\u0088E\2\u0198\u019b\5,\27\2\u0199\u019b\5.\30\2\u019a"+
		"\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5\u0088"+
		"E\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u008b\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a3\u01ac\5\u008aF\2\u01a4\u01a7\5\60\31\2\u01a5\u01a7\5\62\32"+
		"\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9"+
		"\5\u008aF\2\u01a9\u01ab\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab\u01ae\3\2\2"+
		"\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u008d\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01b0\5\24\13\2\u01b0\u01b1\5\64\33\2\u01b1\u01b6\3\2\2"+
		"\2\u01b2\u01b3\5\24\13\2\u01b3\u01b4\5\66\34\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01af\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\u008f\3\2\2\2\u01b7\u01b8\58"+
		"\35\2\u01b8\u01b9\5\u008cG\2\u01b9\u0091\3\2\2\2\u01ba\u01bb\5\24\13\2"+
		"\u01bb\u01bc\5\u0090I\2\u01bc\u0093\3\2\2\2\u01bd\u01be\5\u0092J\2\u01be"+
		"\u01bf\5:\36\2\u01bf\u01c4\3\2\2\2\u01c0\u01c1\5\u008eH\2\u01c1\u01c2"+
		"\5:\36\2\u01c2\u01c4\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4"+
		"\u0095\3\2\2\2\u01c5\u01c6\5:\36\2\u01c6\u0097\3\2\2\2\u01c7\u01cd\5<"+
		"\37\2\u01c8\u01cd\5> \2\u01c9\u01cd\5B\"\2\u01ca\u01cd\5D#\2\u01cb\u01cd"+
		"\5@!\2\u01cc\u01c7\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u0099\3\2\2\2\u01ce\u01cf\5\u0098"+
		"M\2\u01cf\u01d2\5H%\2\u01d0\u01d3\5z>\2\u01d1\u01d3\5\u0080A\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5J&\2\u01d5"+
		"\u01d6\5\u0080A\2\u01d6\u009b\3\2\2\2\u01d7\u01d8\5\u0098M\2\u01d8\u01d9"+
		"\5H%\2\u01d9\u01da\5J&\2\u01da\u01db\5\u0080A\2\u01db\u009d\3\2\2\2\u01dc"+
		"\u01dd\5r:\2\u01dd\u01de\5L\'\2\u01de\u01df\5\u0098M\2\u01df\u01e0\5t"+
		";\2\u01e0\u01e1\5\u0098M\2\u01e1\u01e2\5N(\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e5\5\u0098M\2\u01e4\u01dc\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u009f"+
		"\3\2\2\2\u01e6\u01e7\5\u009eP\2\u01e7\u01e8\5\u0080A\2\u01e8\u01eb\3\2"+
		"\2\2\u01e9\u01eb\5\u009aN\2\u01ea\u01e6\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"\u00a1\3\2\2\2\u01ec\u01ed\5\u009eP\2\u01ed\u01ee\5\u0080A\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01f1\5\u009cO\2\u01f0\u01ec\3\2\2\2\u01f0\u01ef\3\2\2"+
		"\2\u01f1\u00a3\3\2\2\2\u01f2\u01fb\5\u00a0Q\2\u01f3\u01f4\5\u00a0Q\2\u01f4"+
		"\u01f5\5\u0090I\2\u01f5\u01fb\3\2\2\2\u01f6\u01f7\5F$\2\u01f7\u01f8\5"+
		"\u0080A\2\u01f8\u01f9\5\u0090I\2\u01f9\u01fb\3\2\2\2\u01fa\u01f2\3\2\2"+
		"\2\u01fa\u01f3\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fb\u00a5\3\2\2\2\u01fc\u01fd"+
		"\5\u00a4S\2\u01fd\u01fe\5:\36\2\u01fe\u00a7\3\2\2\2\u01ff\u0200\5P)\2"+
		"\u0200\u0201\5L\'\2\u0201\u0202\5\u008cG\2\u0202\u0203\5N(\2\u0203\u0204"+
		"\5R*\2\u0204\u0205\5:\36\2\u0205\u0206\5\6\4\2\u0206\u0207\5V,\2\u0207"+
		"\u0208\5:\36\2\u0208\u0217\3\2\2\2\u0209\u020a\5P)\2\u020a\u020b\5L\'"+
		"\2\u020b\u020c\5\u008cG\2\u020c\u020d\5N(\2\u020d\u020e\5R*\2\u020e\u020f"+
		"\5:\36\2\u020f\u0210\5\6\4\2\u0210\u0211\5T+\2\u0211\u0212\5:\36\2\u0212"+
		"\u0213\5\6\4\2\u0213\u0214\5V,\2\u0214\u0215\5:\36\2\u0215\u0217\3\2\2"+
		"\2\u0216\u01ff\3\2\2\2\u0216\u0209\3\2\2\2\u0217\u00a9\3\2\2\2\u0218\u021c"+
		"\5\u00acW\2\u0219\u021c\5\u00aeX\2\u021a\u021c\5\u00b0Y\2\u021b\u0218"+
		"\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u00ab\3\2\2\2\u021d"+
		"\u021e\5X-\2\u021e\u021f\5L\'\2\u021f\u0220\5\u008cG\2\u0220\u0221\5N"+
		"(\2\u0221\u0222\5:\36\2\u0222\u0223\5\6\4\2\u0223\u0224\5Z.\2\u0224\u0225"+
		"\5:\36\2\u0225\u00ad\3\2\2\2\u0226\u0227\5\\/\2\u0227\u0228\5\u0080A\2"+
		"\u0228\u0229\5\u0090I\2\u0229\u022c\5^\60\2\u022a\u022d\5\n\6\2\u022b"+
		"\u022d\5\24\13\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u022e\3"+
		"\2\2\2\u022e\u022f\5:\36\2\u022f\u0230\5\6\4\2\u0230\u0231\5`\61\2\u0231"+
		"\u0232\5:\36\2\u0232\u00af\3\2\2\2\u0233\u0234\5b\62\2\u0234\u0235\5\u0080"+
		"A\2\u0235\u0236\5d\63\2\u0236\u0237\5\u0080A\2\u0237\u0238\5:\36\2\u0238"+
		"\u0239\5\6\4\2\u0239\u023a\5f\64\2\u023a\u023b\5:\36\2\u023b\u00b1\3\2"+
		"\2\2\u023c\u023d\5p9\2\u023d\u023e\5\u008cG\2\u023e\u023f\5:\36\2\u023f"+
		"\u0244\3\2\2\2\u0240\u0241\5p9\2\u0241\u0242\5:\36\2\u0242\u0244\3\2\2"+
		"\2\u0243\u023c\3\2\2\2\u0243\u0240\3\2\2\2\u0244\u00b3\3\2\2\2\u0245\u0246"+
		"\5h\65\2\u0246\u0247\5\u0080A\2\u0247\u0248\5L\'\2\u0248\u0249\5N(\2\u0249"+
		"\u024a\5v<\2\u024a\u024b\5\u00b6\\\2\u024b\u024c\5l\67\2\u024c\u024d\5"+
		":\36\2\u024d\u024e\5\6\4\2\u024e\u024f\5\u00b2Z\2\u024f\u0250\5n8\2\u0250"+
		"\u0251\5:\36\2\u0251\u0261\3\2\2\2\u0252\u0253\5h\65\2\u0253\u0254\5\u0080"+
		"A\2\u0254\u0255\5L\'\2\u0255\u0256\5\u00b8]\2\u0256\u0257\5N(\2\u0257"+
		"\u0258\5v<\2\u0258\u0259\5\u00b6\\\2\u0259\u025a\5l\67\2\u025a\u025b\5"+
		":\36\2\u025b\u025c\5\6\4\2\u025c\u025d\5\u00b2Z\2\u025d\u025e\5n8\2\u025e"+
		"\u025f\5:\36\2\u025f\u0261\3\2\2\2\u0260\u0245\3\2\2\2\u0260\u0252\3\2"+
		"\2\2\u0261\u00b5\3\2\2\2\u0262\u0269\5\u009eP\2\u0263\u0264\5\u0098M\2"+
		"\u0264\u0265\5H%\2\u0265\u0266\5J&\2\u0266\u0269\3\2\2\2\u0267\u0269\5"+
		"j\66\2\u0268\u0262\3\2\2\2\u0268\u0263\3\2\2\2\u0268\u0267\3\2\2\2\u0269"+
		"\u00b7\3\2\2\2\u026a\u0270\5\u00a2R\2\u026b\u026c\5t;\2\u026c\u026d\5"+
		"\u00a2R\2\u026d\u026f\3\2\2\2\u026e\u026b\3\2\2\2\u026f\u0272\3\2\2\2"+
		"\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u00b9\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0273\u0274\5\u0080A\2\u0274\u0275\5L\'\2\u0275\u0276\5\u00bc"+
		"_\2\u0276\u0277\5N(\2\u0277\u027d\3\2\2\2\u0278\u0279\5\u0080A\2\u0279"+
		"\u027a\5L\'\2\u027a\u027b\5N(\2\u027b\u027d\3\2\2\2\u027c\u0273\3\2\2"+
		"\2\u027c\u0278\3\2\2\2\u027d\u00bb\3\2\2\2\u027e\u0284\5\24\13\2\u027f"+
		"\u0280\5t;\2\u0280\u0281\5\24\13\2\u0281\u0283\3\2\2\2\u0282\u027f\3\2"+
		"\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u00bd\3\2\2\2\u0286\u0284\3\2\2\2)\u00c1\u00c6\u00c9\u00ce\u00d6\u00da"+
		"\u00df\u00e3\u00e7\u00f1\u00f6\u016e\u0174\u017a\u0180\u0186\u018e\u0194"+
		"\u019a\u01a0\u01a6\u01ac\u01b5\u01c3\u01cc\u01d2\u01e4\u01ea\u01f0\u01fa"+
		"\u0216\u021b\u022c\u0243\u0260\u0268\u0270\u027c\u0284";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}