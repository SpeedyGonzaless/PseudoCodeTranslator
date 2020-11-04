// Generated from C:/Users/ivanf/IdeaProjects/Course_Compilers/src/main/java/antrl\PseudoCode.g4 by ANTLR 4.8
package com.antr;
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
	 * Visit a parse tree produced by {@link PseudoCodeParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PseudoCodeParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#call_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_id(PseudoCodeParser.Call_idContext ctx);
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