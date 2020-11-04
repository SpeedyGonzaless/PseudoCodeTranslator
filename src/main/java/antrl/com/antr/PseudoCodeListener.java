// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.8
package com.antr;
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PseudoCodeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PseudoCodeParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PseudoCodeParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PseudoCodeParser.Return_statementContext ctx);
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
}