import antr.PseudoCodeBaseListener;
import antr.PseudoCodeParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PythonListener extends PseudoCodeBaseListener {
	private String code = "";
	private int tabCounter = 0;
	private boolean functionDeclaration = false;
	private boolean loopDeclaration = false;
	private boolean forLoop = false;
	//array : types_simple literal_left_square_bracket (literal_postitive | literal_identifier) literal_right_square_bracket literal_identifier;
	private boolean arrayDeclaration = false;
	private boolean rightSquarePassed = false;
	private String arraySize = "";

	private void addTabs() {
		for (int i=0; i<tabCounter; i++) {
			code+= "\t";
		}
	}

	@Override public void enterProgram(PseudoCodeParser.ProgramContext ctx) { }

	@Override public void exitProgram(PseudoCodeParser.ProgramContext ctx) { }

	@Override public void enterSource_element(PseudoCodeParser.Source_elementContext ctx) { }

	@Override public void exitSource_element(PseudoCodeParser.Source_elementContext ctx) { }

	@Override public void enterStatements(PseudoCodeParser.StatementsContext ctx) { }

	@Override public void exitStatements(PseudoCodeParser.StatementsContext ctx) { }

	@Override public void enterStatement(PseudoCodeParser.StatementContext ctx) { }

	@Override public void exitStatement(PseudoCodeParser.StatementContext ctx) { }

	@Override public void enterInteger(PseudoCodeParser.IntegerContext ctx) { }

	@Override public void exitInteger(PseudoCodeParser.IntegerContext ctx) { }

	@Override public void enterLiteral(PseudoCodeParser.LiteralContext ctx) { }

	@Override public void exitLiteral(PseudoCodeParser.LiteralContext ctx) { }

	@Override public void enterBoolean_literal(PseudoCodeParser.Boolean_literalContext ctx) { }

	@Override public void exitBoolean_literal(PseudoCodeParser.Boolean_literalContext ctx) { }

	@Override public void enterNumeric_literal(PseudoCodeParser.Numeric_literalContext ctx) { }

	@Override public void exitNumeric_literal(PseudoCodeParser.Numeric_literalContext ctx) { }

	@Override public void enterString_literal(PseudoCodeParser.String_literalContext ctx) { }

	@Override public void exitString_literal(PseudoCodeParser.String_literalContext ctx) { }

	@Override public void enterCall_id(PseudoCodeParser.Call_idContext ctx) { }

	@Override public void exitCall_id(PseudoCodeParser.Call_idContext ctx) { }

	@Override public void enterLiteral_true(PseudoCodeParser.Literal_trueContext ctx) {
		code += "true";
	}

	@Override public void exitLiteral_true(PseudoCodeParser.Literal_trueContext ctx) { }

	@Override public void enterLiteral_false(PseudoCodeParser.Literal_falseContext ctx) {
		code+= "false";
	}

	@Override public void exitLiteral_false(PseudoCodeParser.Literal_falseContext ctx) { }

	@Override public void enterLiteral_minus(PseudoCodeParser.Literal_minusContext ctx) {
		code += "-";
	}

	@Override public void exitLiteral_minus(PseudoCodeParser.Literal_minusContext ctx) { }

	@Override public void enterLiteral_plus(PseudoCodeParser.Literal_plusContext ctx) {
		code += "+";
	}

	@Override public void exitLiteral_plus(PseudoCodeParser.Literal_plusContext ctx) { }

	@Override public void enterLiteral_multy(PseudoCodeParser.Literal_multyContext ctx) {
		code+= "*";
	}

	@Override public void exitLiteral_multy(PseudoCodeParser.Literal_multyContext ctx) { }

	@Override public void enterLiteral_dev(PseudoCodeParser.Literal_devContext ctx) {
		code += "/";
	}

	@Override public void exitLiteral_dev(PseudoCodeParser.Literal_devContext ctx) { }

	@Override public void enterLiteral_mod(PseudoCodeParser.Literal_modContext ctx) {
		code += "%";
	}

	@Override public void exitLiteral_mod(PseudoCodeParser.Literal_modContext ctx) { }

	@Override public void enterLiteral_less_sign(PseudoCodeParser.Literal_less_signContext ctx) {
		code += "<";
	}

	@Override public void exitLiteral_less_sign(PseudoCodeParser.Literal_less_signContext ctx) { }

	@Override public void enterLiteral_more_sign(PseudoCodeParser.Literal_more_signContext ctx) {
		code += ">";
	}

	@Override public void exitLiteral_more_sign(PseudoCodeParser.Literal_more_signContext ctx) { }

	@Override public void enterLiteral_less_equal_sign(PseudoCodeParser.Literal_less_equal_signContext ctx) {
		code += "<=";
	}

	@Override public void exitLiteral_less_equal_sign(PseudoCodeParser.Literal_less_equal_signContext ctx) { }

	@Override public void enterLiteral_more_equal_sign(PseudoCodeParser.Literal_more_equal_signContext ctx) {
		code += ">=";
	}

	@Override public void exitLiteral_more_equal_sign(PseudoCodeParser.Literal_more_equal_signContext ctx) { }

	@Override public void enterLiteral_equal_sign(PseudoCodeParser.Literal_equal_signContext ctx) {
		code += "=";
	}

	@Override public void exitLiteral_equal_sign(PseudoCodeParser.Literal_equal_signContext ctx) { }

	@Override public void enterLiteral_not_equal_sign(PseudoCodeParser.Literal_not_equal_signContext ctx) {
		code += "!=";
	}

	@Override public void exitLiteral_not_equal_sign(PseudoCodeParser.Literal_not_equal_signContext ctx) { }

	@Override public void enterLiteral_or(PseudoCodeParser.Literal_orContext ctx) {
		code += " or ";
	}

	@Override public void exitLiteral_or(PseudoCodeParser.Literal_orContext ctx) { }

	@Override public void enterLiteral_and(PseudoCodeParser.Literal_andContext ctx) {
		code += " and ";
	}

	@Override public void exitLiteral_and(PseudoCodeParser.Literal_andContext ctx) { }

	@Override public void enterLiteral_plus_plus(PseudoCodeParser.Literal_plus_plusContext ctx) {
		code += " += 1";
	}

	@Override public void exitLiteral_plus_plus(PseudoCodeParser.Literal_plus_plusContext ctx) { }

	@Override public void enterLiteral_minus_minis(PseudoCodeParser.Literal_minus_minisContext ctx) {
		code += " -= 1";
	}

	@Override public void exitLiteral_minus_minis(PseudoCodeParser.Literal_minus_minisContext ctx) { }

	@Override public void enterLiteral_assign_sign(PseudoCodeParser.Literal_assign_signContext ctx) {
		if (!forLoop) {
			code += "=";
		} else {
			code += " in range(";
		}
	}

	@Override public void exitLiteral_assign_sign(PseudoCodeParser.Literal_assign_signContext ctx) { }

	@Override public void enterLiteral_new_line(PseudoCodeParser.Literal_new_lineContext ctx) {
		if (loopDeclaration) {
			if (forLoop) {
				code += ")";
				forLoop = false;
			}
			code += ":";
			loopDeclaration = false;
		}
		if (arrayDeclaration) {
			code += " = [None] * " + arraySize;
			arrayDeclaration = false;
			rightSquarePassed = false;
		}
		code +="\n";
		addTabs();
	}

	@Override public void exitLiteral_new_line(PseudoCodeParser.Literal_new_lineContext ctx) { }

	@Override public void enterLiteral_int_32(PseudoCodeParser.Literal_int_32Context ctx) { }

	@Override public void exitLiteral_int_32(PseudoCodeParser.Literal_int_32Context ctx) { }

	@Override public void enterLiteral_int_64(PseudoCodeParser.Literal_int_64Context ctx) { }

	@Override public void exitLiteral_int_64(PseudoCodeParser.Literal_int_64Context ctx) { }

	@Override public void enterLiteral_float(PseudoCodeParser.Literal_floatContext ctx) { }

	@Override public void exitLiteral_float(PseudoCodeParser.Literal_floatContext ctx) { }

	@Override public void enterLiteral_string(PseudoCodeParser.Literal_stringContext ctx) { }

	@Override public void exitLiteral_string(PseudoCodeParser.Literal_stringContext ctx) { }

	@Override public void enterLiteral_boolean(PseudoCodeParser.Literal_booleanContext ctx) { }

	@Override public void exitLiteral_boolean(PseudoCodeParser.Literal_booleanContext ctx) { }

	@Override public void enterLiteral_auto(PseudoCodeParser.Literal_autoContext ctx) { }

	@Override public void exitLiteral_auto(PseudoCodeParser.Literal_autoContext ctx) { }

	@Override public void enterLiteral_left_square_bracket(PseudoCodeParser.Literal_left_square_bracketContext ctx) {
		if (!functionDeclaration && !arrayDeclaration) {
			code += "[";
		}
	}

	@Override public void exitLiteral_left_square_bracket(PseudoCodeParser.Literal_left_square_bracketContext ctx) { }

	@Override public void enterLiteral_right_square_bracket(PseudoCodeParser.Literal_right_square_bracketContext ctx) {
		if (!functionDeclaration && !arrayDeclaration) {
			code += "]";
		}
		rightSquarePassed = true;
	}

	@Override public void exitLiteral_right_square_bracket(PseudoCodeParser.Literal_right_square_bracketContext ctx) { }

	@Override public void enterLiteral_left_round_bracket(PseudoCodeParser.Literal_left_round_bracketContext ctx) {
		code += "(";
	}

	@Override public void exitLiteral_left_round_bracket(PseudoCodeParser.Literal_left_round_bracketContext ctx) { }

	@Override public void enterLiteral_right_round_bracket(PseudoCodeParser.Literal_right_round_bracketContext ctx) {
		code += ")";
	}

	@Override public void exitLiteral_right_round_bracket(PseudoCodeParser.Literal_right_round_bracketContext ctx) { }

	@Override public void enterLiteral_if(PseudoCodeParser.Literal_ifContext ctx) {
		code += "if ";
		tabCounter++;
	}

	@Override public void exitLiteral_if(PseudoCodeParser.Literal_ifContext ctx) { }

	@Override public void enterLiteral_then(PseudoCodeParser.Literal_thenContext ctx) {
		code += ":";
	}

	@Override public void exitLiteral_then(PseudoCodeParser.Literal_thenContext ctx) { }

	@Override public void enterLiteral_else(PseudoCodeParser.Literal_elseContext ctx) {
		code = code.substring(0, code.length() - 1);
		code += "else:";
	}

	@Override public void exitLiteral_else(PseudoCodeParser.Literal_elseContext ctx) { }

	@Override public void enterLiteral_endif(PseudoCodeParser.Literal_endifContext ctx) {
		while (!code.endsWith("\n")) {
			code = code.substring(0, code.length()-1);
		}
		code = code.substring(0, code.length()-1);
		tabCounter--;
	}

	@Override public void exitLiteral_endif(PseudoCodeParser.Literal_endifContext ctx) { }

	@Override public void enterLiteral_while(PseudoCodeParser.Literal_whileContext ctx) {
		code += "while ";
		tabCounter++;
	}

	@Override public void exitLiteral_while(PseudoCodeParser.Literal_whileContext ctx) { }

	@Override public void enterLiteral_endwhile(PseudoCodeParser.Literal_endwhileContext ctx) {
		while (!code.endsWith("\n")) {
			code = code.substring(0, code.length()-1);
		}
		code = code.substring(0, code.length()-1);
		tabCounter--;
	}

	@Override public void exitLiteral_endwhile(PseudoCodeParser.Literal_endwhileContext ctx) { }

	@Override public void enterLiteral_for(PseudoCodeParser.Literal_forContext ctx) {
		forLoop = true;
		code += "for ";
		tabCounter++;
	}

	@Override public void exitLiteral_for(PseudoCodeParser.Literal_forContext ctx) { }

	@Override public void enterLiteral_to(PseudoCodeParser.Literal_toContext ctx) {
		code += ", ";
	}

	@Override public void exitLiteral_to(PseudoCodeParser.Literal_toContext ctx) { }

	@Override public void enterLiteral_endfor(PseudoCodeParser.Literal_endforContext ctx) {
		while (!code.endsWith("\n")) {
			code = code.substring(0, code.length()-1);
		}
		code = code.substring(0, code.length()-1);
		tabCounter--;
	}

	@Override public void exitLiteral_endfor(PseudoCodeParser.Literal_endforContext ctx) { }

	@Override public void enterLiteral_foreach(PseudoCodeParser.Literal_foreachContext ctx) {
		code += "for ";
		tabCounter++;
	}

	@Override public void exitLiteral_foreach(PseudoCodeParser.Literal_foreachContext ctx) { }

	@Override public void enterLiteral_in(PseudoCodeParser.Literal_inContext ctx) {
		code += " in ";
	}

	@Override public void exitLiteral_in(PseudoCodeParser.Literal_inContext ctx) { }

	@Override public void enterLiteral_endforeach(PseudoCodeParser.Literal_endforeachContext ctx) {
		while (!code.endsWith("\n")) {
			code = code.substring(0, code.length()-1);
		}
		code = code.substring(0, code.length()-1);
		tabCounter--;
	}

	@Override public void exitLiteral_endforeach(PseudoCodeParser.Literal_endforeachContext ctx) { }

	@Override public void enterLiteral_function(PseudoCodeParser.Literal_functionContext ctx) {
		functionDeclaration = true;
		code += "def ";
		tabCounter++;
	}

	@Override public void exitLiteral_function(PseudoCodeParser.Literal_functionContext ctx) { }

	@Override public void enterLiteral_void(PseudoCodeParser.Literal_voidContext ctx) { }

	@Override public void exitLiteral_void(PseudoCodeParser.Literal_voidContext ctx) { }

	@Override public void enterLiteral_begin(PseudoCodeParser.Literal_beginContext ctx) {
		functionDeclaration = false;
	}

	@Override public void exitLiteral_begin(PseudoCodeParser.Literal_beginContext ctx) { }

	@Override public void enterLiteral_end_function(PseudoCodeParser.Literal_end_functionContext ctx) {
		while (!code.endsWith("\n")) {
			code = code.substring(0, code.length()-1);
		}
		code = code.substring(0, code.length()-1);
		tabCounter--;
	}

	@Override public void exitLiteral_end_function(PseudoCodeParser.Literal_end_functionContext ctx) { }

	@Override public void enterLiteral_return(PseudoCodeParser.Literal_returnContext ctx) {
		code += "return ";
	}

	@Override public void exitLiteral_return(PseudoCodeParser.Literal_returnContext ctx) { }

	//TODO
	@Override public void enterLiteral_map(PseudoCodeParser.Literal_mapContext ctx) {
		code +="map";
	}

	@Override public void exitLiteral_map(PseudoCodeParser.Literal_mapContext ctx) { }

	@Override public void enterLiteral_comma(PseudoCodeParser.Literal_commaContext ctx) {
		code +=",";
	}

	@Override public void exitLiteral_comma(PseudoCodeParser.Literal_commaContext ctx) { }

	@Override public void enterLiteral_colon_sign(PseudoCodeParser.Literal_colon_signContext ctx) {
		code += ":";
	}

	@Override public void exitLiteral_colon_sign(PseudoCodeParser.Literal_colon_signContext ctx) { }

	@Override public void enterLiteral_negative(PseudoCodeParser.Literal_negativeContext ctx) {
		code += ctx.NEGATIVE().getText();
	}

	@Override public void exitLiteral_negative(PseudoCodeParser.Literal_negativeContext ctx) { }

	@Override public void enterLiteral_postitive(PseudoCodeParser.Literal_postitiveContext ctx) {
		if (arrayDeclaration) {
			arraySize = ctx.POSITIVE().getText();
		} else {
			code += ctx.POSITIVE().getText();
		}
	}

	@Override public void exitLiteral_postitive(PseudoCodeParser.Literal_postitiveContext ctx) { }

	@Override public void enterLiteral_float_number(PseudoCodeParser.Literal_float_numberContext ctx) {
		code += ctx.FLOAT_NUMBER().getText();
	}

	@Override public void exitLiteral_float_number(PseudoCodeParser.Literal_float_numberContext ctx) { }

	@Override public void enterLiteral_string_value(PseudoCodeParser.Literal_string_valueContext ctx) {
		code += ctx.STRING_VALUE().getText();
	}

	@Override public void exitLiteral_string_value(PseudoCodeParser.Literal_string_valueContext ctx) { }

	@Override public void enterLiteral_identifier(PseudoCodeParser.Literal_identifierContext ctx) {
		if (arrayDeclaration && !rightSquarePassed) {
			arraySize = ctx.ID().getText();
		} else {
			code += ctx.ID().getText();
		}
	}

	@Override public void exitLiteral_identifier(PseudoCodeParser.Literal_identifierContext ctx) { }

	@Override public void enterSimple_obj(PseudoCodeParser.Simple_objContext ctx) { }

	@Override public void exitSimple_obj(PseudoCodeParser.Simple_objContext ctx) { }

	@Override public void enterMultiplicative(PseudoCodeParser.MultiplicativeContext ctx) { }

	@Override public void exitMultiplicative(PseudoCodeParser.MultiplicativeContext ctx) { }

	@Override public void enterAdditive(PseudoCodeParser.AdditiveContext ctx) { }

	@Override public void exitAdditive(PseudoCodeParser.AdditiveContext ctx) { }

	@Override public void enterRelational(PseudoCodeParser.RelationalContext ctx) { }

	@Override public void exitRelational(PseudoCodeParser.RelationalContext ctx) { }

	@Override public void enterEquality(PseudoCodeParser.EqualityContext ctx) { }

	@Override public void exitEquality(PseudoCodeParser.EqualityContext ctx) { }

	@Override public void enterLogical(PseudoCodeParser.LogicalContext ctx) { }

	@Override public void exitLogical(PseudoCodeParser.LogicalContext ctx) { }

	@Override public void enterPostfix(PseudoCodeParser.PostfixContext ctx) { }

	@Override public void exitPostfix(PseudoCodeParser.PostfixContext ctx) { }

	@Override public void enterAssignment_expr(PseudoCodeParser.Assignment_exprContext ctx) { }

	@Override public void exitAssignment_expr(PseudoCodeParser.Assignment_exprContext ctx) { }

	@Override public void enterExpr(PseudoCodeParser.ExprContext ctx) { }

	@Override public void exitExpr(PseudoCodeParser.ExprContext ctx) { }

	@Override public void enterExpr_statement(PseudoCodeParser.Expr_statementContext ctx) { }

	@Override public void exitExpr_statement(PseudoCodeParser.Expr_statementContext ctx) { }

	@Override public void enterEmpty_statement(PseudoCodeParser.Empty_statementContext ctx) { }

	@Override public void exitEmpty_statement(PseudoCodeParser.Empty_statementContext ctx) { }

	@Override public void enterTypes_simple(PseudoCodeParser.Types_simpleContext ctx) { }

	@Override public void exitTypes_simple(PseudoCodeParser.Types_simpleContext ctx) { }

	@Override public void enterArray(PseudoCodeParser.ArrayContext ctx) {
		arrayDeclaration = true;
		rightSquarePassed = false;
	}

	@Override public void exitArray(PseudoCodeParser.ArrayContext ctx) { }

	@Override public void enterArray_in_function(PseudoCodeParser.Array_in_functionContext ctx) { }

	@Override public void exitArray_in_function(PseudoCodeParser.Array_in_functionContext ctx) { }

	@Override public void enterTypes(PseudoCodeParser.TypesContext ctx) { }

	@Override public void exitTypes(PseudoCodeParser.TypesContext ctx) { }

	@Override public void enterVarible(PseudoCodeParser.VaribleContext ctx) { }

	@Override public void exitVarible(PseudoCodeParser.VaribleContext ctx) { }

	@Override public void enterVarible_in_function(PseudoCodeParser.Varible_in_functionContext ctx) { }

	@Override public void exitVarible_in_function(PseudoCodeParser.Varible_in_functionContext ctx) { }

	@Override public void enterVariable_declaration(PseudoCodeParser.Variable_declarationContext ctx) { }

	@Override public void exitVariable_declaration(PseudoCodeParser.Variable_declarationContext ctx) { }

	@Override public void enterVariable_statement(PseudoCodeParser.Variable_statementContext ctx) { }

	@Override public void exitVariable_statement(PseudoCodeParser.Variable_statementContext ctx) { }

	@Override public void enterIf_statement(PseudoCodeParser.If_statementContext ctx) { }

	@Override public void exitIf_statement(PseudoCodeParser.If_statementContext ctx) { }

	@Override public void enterIteration_statements(PseudoCodeParser.Iteration_statementsContext ctx) {
		loopDeclaration = true;
	}

	@Override public void exitIteration_statements(PseudoCodeParser.Iteration_statementsContext ctx) { }

	@Override public void enterIteration_statement_while(PseudoCodeParser.Iteration_statement_whileContext ctx) { }

	@Override public void exitIteration_statement_while(PseudoCodeParser.Iteration_statement_whileContext ctx) { }

	@Override public void enterIteration_statement_for(PseudoCodeParser.Iteration_statement_forContext ctx) { }

	@Override public void exitIteration_statement_for(PseudoCodeParser.Iteration_statement_forContext ctx) { }

	@Override public void enterIteration_statement_for_each(PseudoCodeParser.Iteration_statement_for_eachContext ctx) { }

	@Override public void exitIteration_statement_for_each(PseudoCodeParser.Iteration_statement_for_eachContext ctx) { }

	@Override public void enterReturn_statement(PseudoCodeParser.Return_statementContext ctx) { }

	@Override public void exitReturn_statement(PseudoCodeParser.Return_statementContext ctx) { }

	@Override public void enterFunction_declaration(PseudoCodeParser.Function_declarationContext ctx) { }

	@Override public void exitFunction_declaration(PseudoCodeParser.Function_declarationContext ctx) { }

	@Override public void enterReturn_types(PseudoCodeParser.Return_typesContext ctx) { }

	@Override public void exitReturn_types(PseudoCodeParser.Return_typesContext ctx) { }

	@Override public void enterFormal_parameter_list(PseudoCodeParser.Formal_parameter_listContext ctx) { }

	@Override public void exitFormal_parameter_list(PseudoCodeParser.Formal_parameter_listContext ctx) { }

	@Override public void enterFunction_call(PseudoCodeParser.Function_callContext ctx) { }

	@Override public void exitFunction_call(PseudoCodeParser.Function_callContext ctx) { }

	@Override public void enterFunction_params(PseudoCodeParser.Function_paramsContext ctx) { }

	@Override public void exitFunction_params(PseudoCodeParser.Function_paramsContext ctx) { }


	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }

	public String toString() {
		return code;
	}
}
