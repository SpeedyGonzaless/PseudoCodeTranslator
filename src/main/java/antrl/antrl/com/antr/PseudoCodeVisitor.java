// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.8
package antrl.com.antr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PseudoCodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#source_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_element(PseudoCodeParser.Source_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PseudoCodeParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(PseudoCodeParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PseudoCodeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(PseudoCodeParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(PseudoCodeParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(PseudoCodeParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#call_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_id(PseudoCodeParser.Call_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_true(PseudoCodeParser.Literal_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_false(PseudoCodeParser.Literal_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_minus(PseudoCodeParser.Literal_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_plus(PseudoCodeParser.Literal_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_multy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_multy(PseudoCodeParser.Literal_multyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_dev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_dev(PseudoCodeParser.Literal_devContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_mod(PseudoCodeParser.Literal_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_less_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_less_sign(PseudoCodeParser.Literal_less_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_more_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_more_sign(PseudoCodeParser.Literal_more_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_less_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_less_equal_sign(PseudoCodeParser.Literal_less_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_more_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_more_equal_sign(PseudoCodeParser.Literal_more_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_equal_sign(PseudoCodeParser.Literal_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_not_equal_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_not_equal_sign(PseudoCodeParser.Literal_not_equal_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_or(PseudoCodeParser.Literal_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_and(PseudoCodeParser.Literal_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_plus_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_plus_plus(PseudoCodeParser.Literal_plus_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_minus_minis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_minus_minis(PseudoCodeParser.Literal_minus_minisContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_assign_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_assign_sign(PseudoCodeParser.Literal_assign_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_new_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_new_line(PseudoCodeParser.Literal_new_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_int_32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_int_32(PseudoCodeParser.Literal_int_32Context ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_int_64}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_int_64(PseudoCodeParser.Literal_int_64Context ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_float(PseudoCodeParser.Literal_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_string(PseudoCodeParser.Literal_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_boolean(PseudoCodeParser.Literal_booleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_auto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_auto(PseudoCodeParser.Literal_autoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_left_square_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_left_square_bracket(PseudoCodeParser.Literal_left_square_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_right_square_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_right_square_bracket(PseudoCodeParser.Literal_right_square_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_left_round_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_left_round_bracket(PseudoCodeParser.Literal_left_round_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_right_round_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_right_round_bracket(PseudoCodeParser.Literal_right_round_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_if(PseudoCodeParser.Literal_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_then(PseudoCodeParser.Literal_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_else(PseudoCodeParser.Literal_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_endif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_endif(PseudoCodeParser.Literal_endifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_while(PseudoCodeParser.Literal_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_endwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_endwhile(PseudoCodeParser.Literal_endwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_for(PseudoCodeParser.Literal_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_to(PseudoCodeParser.Literal_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_endfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_endfor(PseudoCodeParser.Literal_endforContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_foreach(PseudoCodeParser.Literal_foreachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_in(PseudoCodeParser.Literal_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_endforeach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_endforeach(PseudoCodeParser.Literal_endforeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_function(PseudoCodeParser.Literal_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_void(PseudoCodeParser.Literal_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_begin(PseudoCodeParser.Literal_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_end_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_end_function(PseudoCodeParser.Literal_end_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_return(PseudoCodeParser.Literal_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_map(PseudoCodeParser.Literal_mapContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_comma(PseudoCodeParser.Literal_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_colon_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_colon_sign(PseudoCodeParser.Literal_colon_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_negative(PseudoCodeParser.Literal_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_postitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_postitive(PseudoCodeParser.Literal_postitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_float_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_float_number(PseudoCodeParser.Literal_float_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_string_value(PseudoCodeParser.Literal_string_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_identifier(PseudoCodeParser.Literal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#simple_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_obj(PseudoCodeParser.Simple_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(PseudoCodeParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(PseudoCodeParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(PseudoCodeParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(PseudoCodeParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(PseudoCodeParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(PseudoCodeParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expr(PseudoCodeParser.Assignment_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PseudoCodeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement(PseudoCodeParser.Expr_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(PseudoCodeParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#types_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes_simple(PseudoCodeParser.Types_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PseudoCodeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#array_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_in_function(PseudoCodeParser.Array_in_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(PseudoCodeParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#varible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible(PseudoCodeParser.VaribleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#varible_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible_in_function(PseudoCodeParser.Varible_in_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PseudoCodeParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_statement(PseudoCodeParser.Variable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PseudoCodeParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#iteration_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statements(PseudoCodeParser.Iteration_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#iteration_statement_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement_while(PseudoCodeParser.Iteration_statement_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#iteration_statement_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement_for(PseudoCodeParser.Iteration_statement_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#iteration_statement_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement_for_each(PseudoCodeParser.Iteration_statement_for_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PseudoCodeParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(PseudoCodeParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#return_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_types(PseudoCodeParser.Return_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameter_list(PseudoCodeParser.Formal_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PseudoCodeParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(PseudoCodeParser.Function_paramsContext ctx);
}