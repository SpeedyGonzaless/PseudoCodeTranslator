// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.9
package antr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoCodeParser}.
 */
public interface PseudoCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PseudoCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PseudoCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#source_element}.
	 * @param ctx the parse tree
	 */
	void enterSource_element(PseudoCodeParser.Source_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#source_element}.
	 * @param ctx the parse tree
	 */
	void exitSource_element(PseudoCodeParser.Source_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PseudoCodeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PseudoCodeParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PseudoCodeParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PseudoCodeParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PseudoCodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PseudoCodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(PseudoCodeParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(PseudoCodeParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(PseudoCodeParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(PseudoCodeParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(PseudoCodeParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(PseudoCodeParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#call_id}.
	 * @param ctx the parse tree
	 */
	void enterCall_id(PseudoCodeParser.Call_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#call_id}.
	 * @param ctx the parse tree
	 */
	void exitCall_id(PseudoCodeParser.Call_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_true}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_true(PseudoCodeParser.Literal_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_true}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_true(PseudoCodeParser.Literal_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_false}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_false(PseudoCodeParser.Literal_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_false}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_false(PseudoCodeParser.Literal_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_minus}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_minus(PseudoCodeParser.Literal_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_minus}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_minus(PseudoCodeParser.Literal_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_plus}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_plus(PseudoCodeParser.Literal_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_plus}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_plus(PseudoCodeParser.Literal_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_multy}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_multy(PseudoCodeParser.Literal_multyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_multy}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_multy(PseudoCodeParser.Literal_multyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_dev}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_dev(PseudoCodeParser.Literal_devContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_dev}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_dev(PseudoCodeParser.Literal_devContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_mod}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_mod(PseudoCodeParser.Literal_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_mod}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_mod(PseudoCodeParser.Literal_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_less_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_less_sign(PseudoCodeParser.Literal_less_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_less_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_less_sign(PseudoCodeParser.Literal_less_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_more_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_more_sign(PseudoCodeParser.Literal_more_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_more_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_more_sign(PseudoCodeParser.Literal_more_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_less_equal_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_less_equal_sign(PseudoCodeParser.Literal_less_equal_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_less_equal_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_less_equal_sign(PseudoCodeParser.Literal_less_equal_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_more_equal_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_more_equal_sign(PseudoCodeParser.Literal_more_equal_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_more_equal_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_more_equal_sign(PseudoCodeParser.Literal_more_equal_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_equal_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_equal_sign(PseudoCodeParser.Literal_equal_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_equal_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_equal_sign(PseudoCodeParser.Literal_equal_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_not_equal_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_not_equal_sign(PseudoCodeParser.Literal_not_equal_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_not_equal_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_not_equal_sign(PseudoCodeParser.Literal_not_equal_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_or}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_or(PseudoCodeParser.Literal_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_or}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_or(PseudoCodeParser.Literal_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_and}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_and(PseudoCodeParser.Literal_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_and}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_and(PseudoCodeParser.Literal_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_plus_plus}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_plus_plus(PseudoCodeParser.Literal_plus_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_plus_plus}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_plus_plus(PseudoCodeParser.Literal_plus_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_minus_minis}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_minus_minis(PseudoCodeParser.Literal_minus_minisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_minus_minis}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_minus_minis(PseudoCodeParser.Literal_minus_minisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_assign_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_assign_sign(PseudoCodeParser.Literal_assign_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_assign_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_assign_sign(PseudoCodeParser.Literal_assign_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_new_line}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_new_line(PseudoCodeParser.Literal_new_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_new_line}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_new_line(PseudoCodeParser.Literal_new_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_int_32}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_int_32(PseudoCodeParser.Literal_int_32Context ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_int_32}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_int_32(PseudoCodeParser.Literal_int_32Context ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_int_64}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_int_64(PseudoCodeParser.Literal_int_64Context ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_int_64}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_int_64(PseudoCodeParser.Literal_int_64Context ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_float}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_float(PseudoCodeParser.Literal_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_float}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_float(PseudoCodeParser.Literal_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_string}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_string(PseudoCodeParser.Literal_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_string}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_string(PseudoCodeParser.Literal_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_boolean}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_boolean(PseudoCodeParser.Literal_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_boolean}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_boolean(PseudoCodeParser.Literal_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_auto}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_auto(PseudoCodeParser.Literal_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_auto}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_auto(PseudoCodeParser.Literal_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_left_square_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_left_square_bracket(PseudoCodeParser.Literal_left_square_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_left_square_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_left_square_bracket(PseudoCodeParser.Literal_left_square_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_right_square_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_right_square_bracket(PseudoCodeParser.Literal_right_square_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_right_square_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_right_square_bracket(PseudoCodeParser.Literal_right_square_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_left_round_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_left_round_bracket(PseudoCodeParser.Literal_left_round_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_left_round_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_left_round_bracket(PseudoCodeParser.Literal_left_round_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_right_round_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_right_round_bracket(PseudoCodeParser.Literal_right_round_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_right_round_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_right_round_bracket(PseudoCodeParser.Literal_right_round_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_if}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_if(PseudoCodeParser.Literal_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_if}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_if(PseudoCodeParser.Literal_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_then}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_then(PseudoCodeParser.Literal_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_then}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_then(PseudoCodeParser.Literal_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_else}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_else(PseudoCodeParser.Literal_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_else}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_else(PseudoCodeParser.Literal_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_endif}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_endif(PseudoCodeParser.Literal_endifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_endif}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_endif(PseudoCodeParser.Literal_endifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_while}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_while(PseudoCodeParser.Literal_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_while}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_while(PseudoCodeParser.Literal_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_endwhile}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_endwhile(PseudoCodeParser.Literal_endwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_endwhile}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_endwhile(PseudoCodeParser.Literal_endwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_for}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_for(PseudoCodeParser.Literal_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_for}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_for(PseudoCodeParser.Literal_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_to}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_to(PseudoCodeParser.Literal_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_to}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_to(PseudoCodeParser.Literal_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_endfor}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_endfor(PseudoCodeParser.Literal_endforContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_endfor}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_endfor(PseudoCodeParser.Literal_endforContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_foreach}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_foreach(PseudoCodeParser.Literal_foreachContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_foreach}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_foreach(PseudoCodeParser.Literal_foreachContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_in}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_in(PseudoCodeParser.Literal_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_in}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_in(PseudoCodeParser.Literal_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_endforeach}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_endforeach(PseudoCodeParser.Literal_endforeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_endforeach}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_endforeach(PseudoCodeParser.Literal_endforeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_function}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_function(PseudoCodeParser.Literal_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_function}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_function(PseudoCodeParser.Literal_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_void}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_void(PseudoCodeParser.Literal_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_void}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_void(PseudoCodeParser.Literal_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_begin}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_begin(PseudoCodeParser.Literal_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_begin}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_begin(PseudoCodeParser.Literal_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_end_function}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_end_function(PseudoCodeParser.Literal_end_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_end_function}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_end_function(PseudoCodeParser.Literal_end_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_return}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_return(PseudoCodeParser.Literal_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_return}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_return(PseudoCodeParser.Literal_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_map}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_map(PseudoCodeParser.Literal_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_map}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_map(PseudoCodeParser.Literal_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_comma}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_comma(PseudoCodeParser.Literal_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_comma}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_comma(PseudoCodeParser.Literal_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_colon_sign}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_colon_sign(PseudoCodeParser.Literal_colon_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_colon_sign}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_colon_sign(PseudoCodeParser.Literal_colon_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_negative}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_negative(PseudoCodeParser.Literal_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_negative}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_negative(PseudoCodeParser.Literal_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_postitive}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_postitive(PseudoCodeParser.Literal_postitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_postitive}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_postitive(PseudoCodeParser.Literal_postitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_float_number}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_float_number(PseudoCodeParser.Literal_float_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_float_number}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_float_number(PseudoCodeParser.Literal_float_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_string_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_string_value(PseudoCodeParser.Literal_string_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_string_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_string_value(PseudoCodeParser.Literal_string_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal_identifier}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_identifier(PseudoCodeParser.Literal_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal_identifier}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_identifier(PseudoCodeParser.Literal_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#simple_obj}.
	 * @param ctx the parse tree
	 */
	void enterSimple_obj(PseudoCodeParser.Simple_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#simple_obj}.
	 * @param ctx the parse tree
	 */
	void exitSimple_obj(PseudoCodeParser.Simple_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(PseudoCodeParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(PseudoCodeParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(PseudoCodeParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(PseudoCodeParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(PseudoCodeParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(PseudoCodeParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(PseudoCodeParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(PseudoCodeParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(PseudoCodeParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(PseudoCodeParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(PseudoCodeParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(PseudoCodeParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expr(PseudoCodeParser.Assignment_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expr(PseudoCodeParser.Assignment_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PseudoCodeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PseudoCodeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr_statement(PseudoCodeParser.Expr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr_statement(PseudoCodeParser.Expr_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(PseudoCodeParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(PseudoCodeParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#types_simple}.
	 * @param ctx the parse tree
	 */
	void enterTypes_simple(PseudoCodeParser.Types_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#types_simple}.
	 * @param ctx the parse tree
	 */
	void exitTypes_simple(PseudoCodeParser.Types_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PseudoCodeParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PseudoCodeParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#array_in_function}.
	 * @param ctx the parse tree
	 */
	void enterArray_in_function(PseudoCodeParser.Array_in_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#array_in_function}.
	 * @param ctx the parse tree
	 */
	void exitArray_in_function(PseudoCodeParser.Array_in_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(PseudoCodeParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(PseudoCodeParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#varible}.
	 * @param ctx the parse tree
	 */
	void enterVarible(PseudoCodeParser.VaribleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#varible}.
	 * @param ctx the parse tree
	 */
	void exitVarible(PseudoCodeParser.VaribleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#varible_in_function}.
	 * @param ctx the parse tree
	 */
	void enterVarible_in_function(PseudoCodeParser.Varible_in_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#varible_in_function}.
	 * @param ctx the parse tree
	 */
	void exitVarible_in_function(PseudoCodeParser.Varible_in_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PseudoCodeParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PseudoCodeParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_statement(PseudoCodeParser.Variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_statement(PseudoCodeParser.Variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PseudoCodeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PseudoCodeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#iteration_statements}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statements(PseudoCodeParser.Iteration_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#iteration_statements}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statements(PseudoCodeParser.Iteration_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#iteration_statement_while}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement_while(PseudoCodeParser.Iteration_statement_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#iteration_statement_while}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement_while(PseudoCodeParser.Iteration_statement_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#iteration_statement_for}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement_for(PseudoCodeParser.Iteration_statement_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#iteration_statement_for}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement_for(PseudoCodeParser.Iteration_statement_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#iteration_statement_for_each}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement_for_each(PseudoCodeParser.Iteration_statement_for_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#iteration_statement_for_each}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement_for_each(PseudoCodeParser.Iteration_statement_for_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(PseudoCodeParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(PseudoCodeParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#return_types}.
	 * @param ctx the parse tree
	 */
	void enterReturn_types(PseudoCodeParser.Return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#return_types}.
	 * @param ctx the parse tree
	 */
	void exitReturn_types(PseudoCodeParser.Return_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(PseudoCodeParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(PseudoCodeParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PseudoCodeParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PseudoCodeParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(PseudoCodeParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(PseudoCodeParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PseudoCodeParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PseudoCodeParser.Return_statementContext ctx);
}