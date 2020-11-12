grammar PseudoCode;

// # ТЕРМИНАЛЫ
SPACE : (' ' | '\t') -> skip;
TRUE : 'true' ;
FALSE : 'false' ;
MINUS : '-';
PLUS : '+';
MULTY : '*';
DEV : '/';
MOD : '%';
LESS_SIGH : '<';
MORE_SIGN : '>';
LESS_EQUAL_SIGN : '<=';
MORE_EQUAL_SIGN : '>=';
EQUAL_SIGH : '==';
NOT_EQUAL_SIGN : '!=';
OR : 'OR';
AND : 'AND';
PLUS_PLUS : '++';
MINUS_MINUS : '--';
ASSIGN_SIGN : '<-';
NEW_LINE : '\n';
INT32 : 'int32';
INT64 : 'int64';
FLOAT : 'float';
STRING : 'String';
BOOLEAN : 'bool';
AUTO : 'auto';
LEFT_SQUARE_BRACKET : '[';
RIGHT_SQUARE_BRACKET : ']';
LEFT_ROUND_BRACKET : '(' ;
RIGHT_ROUND_BRACKET : ')' ;
IF : 'IF';
THEN : 'THEN';
ELSE : 'ELSE';
ENDIF : 'ENDIF';
WHILE : 'WHILE';
ENDWHILE : 'ENDWHILE';
FOR : 'FOR';
TO : 'TO';
ENDFOR : 'ENDFOR';
FOREACH : 'FOREACH';
IN : 'IN';
ENDFOREACH: 'ENDFOREACH';
FUNCTION : 'FUNCTION';
VOID : 'VOID';
BEGIN : 'BEGIN';
END_FUNCTION : 'END_FUNCTION';
RETURN : 'RETURN';
MAP : 'Map';
COMMA : ',';
COLON_SIGH : ':';
NEGATIVE : '-'('1'..'9')+('0'..'9')* ;
POSITIVE : ('1'..'9')+('0'..'9')* ;
FLOAT_NUMBER : ('-' | '+')?(('0'..'9')*('.'))?('0'..'9')+ ;
STRING_VALUE : '"'(~'"')*'"' ;
ID : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z')*('0'..'9')* ;

program : source_element+ ; // Набор элементов кода - от 1 до N элементов.
source_element : function_declaration+ | statements  ; // элемент - либо объявление функции, либо некоторое выражение.
statements : statement+ ;
statement : function_call
			 | variable_statement   // Определение переменной.
             | empty_statement      // Пустое выражение.
             | expr_statement       // Вычислимое выражение.
             | if_statement         // IF.
             | iteration_statements ; // FOR/WHILE.


//# ЛИТЕРАЛЫ.

integer : literal_postitive | literal_negative ;//на этапе лексера удобнее разбить на >= 0 и < 0

literal : boolean_literal // Булева константа.
           | numeric_literal // Число.
           | string_literal  ; // Строка.
boolean_literal : literal_true | literal_false ;
numeric_literal : integer | literal_float_number ;
string_literal : literal_string_value ;
call_id : literal_identifier | literal_identifier literal_left_square_bracket (additive | literal_postitive | literal_identifier) literal_right_square_bracket | literal; //Обращение к переменной
literal_true: TRUE;
literal_false: FALSE;
literal_minus: MINUS;
literal_plus: PLUS;
literal_multy: MULTY;
literal_dev: DEV;
literal_mod: MOD;
literal_less_sign :LESS_SIGH;
literal_more_sign: MORE_SIGN;
literal_less_equal_sign: LESS_EQUAL_SIGN;
literal_more_equal_sign: MORE_EQUAL_SIGN;
literal_equal_sign: EQUAL_SIGH;
literal_not_equal_sign: NOT_EQUAL_SIGN;
literal_or: OR;
literal_and: AND;
literal_plus_plus: PLUS_PLUS;
literal_minus_minis: MINUS_MINUS;
literal_assign_sign: ASSIGN_SIGN;
literal_new_line: NEW_LINE;
literal_int_32: INT32;
literal_int_64: INT64;
literal_float: FLOAT;
literal_string: STRING;
literal_boolean: BOOLEAN;
literal_auto: AUTO;
literal_left_square_bracket: LEFT_SQUARE_BRACKET;
literal_right_square_bracket: RIGHT_SQUARE_BRACKET;
literal_left_round_bracket: LEFT_ROUND_BRACKET;
literal_right_round_bracket: RIGHT_ROUND_BRACKET;
literal_if: IF;
literal_then: THEN;
literal_else: ELSE;
literal_endif: ENDIF;
literal_while: WHILE;
literal_endwhile: ENDWHILE;
literal_for: FOR;
literal_to: TO;
literal_endfor: ENDFOR;
literal_foreach: FOREACH;
literal_in: IN;
literal_endforeach: ENDFOREACH;
literal_function: FUNCTION;
literal_void: VOID;
literal_begin: BEGIN;
literal_end_function: END_FUNCTION;
literal_return: RETURN;
literal_map: MAP;
literal_comma: COMMA;
literal_colon_sign: COLON_SIGH;
literal_negative: NEGATIVE;
literal_postitive: POSITIVE;
literal_float_number: FLOAT_NUMBER;
literal_string_value: STRING_VALUE;
literal_identifier : ID ;// Название перменной.


//# ВЫРАЖЕНИЯ.
simple_obj : call_id | literal  | literal_minus simple_obj | literal_left_round_bracket simple_obj literal_right_round_bracket | function_call ;
multiplicative : simple_obj ((literal_multy | literal_dev | literal_mod) simple_obj)* ;
additive : multiplicative ((literal_plus | literal_minus ) multiplicative)* ;

//Операторы сравнения
relational : additive ((literal_less_sign | literal_more_sign | literal_more_equal_sign | literal_less_equal_sign) additive)* ;

//Операторы равенства
equality : relational ((literal_equal_sign | literal_not_equal_sign) relational)* ;

//Логическе операторы
logical : equality ((literal_or | literal_and) equality)* ;

// ++ или --
postfix : call_id literal_plus_plus | call_id literal_minus_minis ;

//Выражения которые могут использоваться для присваивания
assignment_expr : literal_assign_sign logical ;

//Присваивание
expr : call_id assignment_expr ;
expr_statement : expr literal_new_line | postfix literal_new_line ;

// НИЧЕГО.
empty_statement : literal_new_line;

//# ОБЪЯВЛЕНИЕ ПЕРЕМЕННОЙ.

types_simple : literal_int_32 | literal_int_64 | literal_string | literal_boolean | literal_float ;//простые типы
array : types_simple literal_left_square_bracket (literal_postitive | literal_identifier) literal_right_square_bracket literal_identifier;//массив может быть только простого типа
array_in_function : types_simple literal_left_square_bracket literal_right_square_bracket literal_identifier ;
types : literal_map literal_left_round_bracket types_simple literal_comma  types_simple literal_right_round_bracket | types_simple ; //добавили к простым типам специальный тип Map
varible : types literal_identifier | array ;
varible_in_function : types literal_identifier | array_in_function;
variable_declaration : varible | varible assignment_expr | literal_auto literal_identifier assignment_expr ;
variable_statement : variable_declaration literal_new_line ;

//# СЛОЖНЫЕ КОНСТРУКЦИИ.

// IF.

if_statement : literal_if literal_left_round_bracket logical literal_right_round_bracket literal_then literal_new_line statements literal_endif literal_new_line
                | literal_if literal_left_round_bracket logical literal_right_round_bracket literal_then literal_new_line statements literal_else literal_new_line
                 statements literal_endif literal_new_line ;

// ЦИКЛЫ.
iteration_statements : iteration_statement_while | iteration_statement_for | iteration_statement_for_each ;
iteration_statement_while : literal_while literal_left_round_bracket logical literal_right_round_bracket literal_new_line statements literal_endwhile literal_new_line ;
iteration_statement_for : literal_for literal_identifier assignment_expr literal_to (integer | call_id) literal_new_line statements literal_endfor literal_new_line;
iteration_statement_for_each : literal_foreach literal_identifier literal_in literal_identifier literal_new_line statements literal_endforeach literal_new_line;

// RETURN. Если функция всегда что-то возвращает, то надо это в функциюю перенести
// И убрать из statements.

return_statement : literal_return logical literal_new_line | literal_return literal_new_line ;

//ФУНКЦИИ

function_declaration : literal_function literal_identifier literal_left_round_bracket literal_right_round_bracket literal_colon_sign return_types
							literal_begin literal_new_line statements return_statement literal_end_function literal_new_line
                        | literal_function literal_identifier literal_left_round_bracket formal_parameter_list literal_right_round_bracket literal_colon_sign return_types
                            literal_begin literal_new_line statements return_statement literal_end_function literal_new_line ;
return_types : types | types_simple literal_left_square_bracket literal_right_square_bracket | literal_void ;
formal_parameter_list : varible_in_function (literal_comma varible_in_function)* ;
function_call :  literal_identifier literal_left_round_bracket function_params literal_right_round_bracket | literal_identifier literal_left_round_bracket literal_right_round_bracket;
function_params : call_id (literal_comma call_id)* ;