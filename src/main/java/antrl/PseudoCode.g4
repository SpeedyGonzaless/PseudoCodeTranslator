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
LEFT_SQUARE_BRACKER : '[';
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
statement : variable_statement   // Определение переменной.
             | empty_statement      // Пустое выражение.
             | expr_statement       // Вычислимое выражение.
             | if_statement         // IF.
             | iteration_statements ; // FOR/WHILE.


//# ЛИТЕРАЛЫ.

integer : POSITIVE | NEGATIVE ;//на этапе лексера удобнее разбить на >= 0 и < 0

literal : boolean_literal // Булева константа.
           | numeric_literal // Число.
           | string_literal  ; // Строка.
boolean_literal : TRUE | FALSE ;
numeric_literal : integer | FLOAT_NUMBER ;
string_literal : STRING_VALUE ;
identifier : ID ;// Название перменной.
call_id : identifier | identifier LEFT_SQUARE_BRACKER (additive | POSITIVE | identifier) RIGHT_SQUARE_BRACKET; //Обращение к переменной


//# ВЫРАЖЕНИЯ.
simple_obj : call_id | literal  | MINUS simple_obj | LEFT_ROUND_BRACKET simple_obj RIGHT_ROUND_BRACKET | function_call ;
multiplicative : simple_obj ((MULTY | DEV | MOD) simple_obj)* ;
additive : multiplicative ((PLUS | MINUS ) multiplicative)* ;

//Операторы сравнения
relational : additive ((LESS_SIGH | MORE_SIGN | MORE_EQUAL_SIGN | LESS_EQUAL_SIGN) additive)* ;

//Операторы равенства
equality : relational ((EQUAL_SIGH | NOT_EQUAL_SIGN) relational)* ;

//Логическе операторы
logical : equality ((OR | AND) equality)* ;

// ++ или --
postfix : call_id PLUS_PLUS | call_id MINUS_MINUS ;

//Выражения которые могут использоваться для присваивания
assignment_expr : ASSIGN_SIGN logical ;

//Присваивание
expr : call_id assignment_expr ;
expr_statement : expr NEW_LINE | postfix NEW_LINE ;

// НИЧЕГО.
empty_statement : NEW_LINE;

//# ОБЪЯВЛЕНИЕ ПЕРЕМЕННОЙ.

types_simple : INT32 | INT64 | STRING | BOOLEAN | FLOAT ;//простые типы
array : types_simple LEFT_SQUARE_BRACKER (POSITIVE | identifier) RIGHT_SQUARE_BRACKET identifier;//массив может быть только простого типа
array_in_function : types_simple LEFT_SQUARE_BRACKER RIGHT_SQUARE_BRACKET identifier ;
types : MAP LEFT_ROUND_BRACKET types_simple COMMA  types_simple RIGHT_ROUND_BRACKET | types_simple ; //добавили к простым типам специальный тип Map
varible : types identifier | array ;
varible_in_function : types identifier | array_in_function ;
variable_declaration : varible | varible assignment_expr | AUTO identifier assignment_expr ;
variable_statement : variable_declaration NEW_LINE ;

//# СЛОЖНЫЕ КОНСТРУКЦИИ.

// IF.

if_statement : IF LEFT_ROUND_BRACKET logical RIGHT_ROUND_BRACKET THEN NEW_LINE statements ENDIF NEW_LINE
                | IF LEFT_ROUND_BRACKET logical RIGHT_ROUND_BRACKET THEN NEW_LINE statements ELSE NEW_LINE statements ENDIF NEW_LINE ;

// ЦИКЛЫ.
iteration_statements : iteration_statement_while | iteration_statement_for | iteration_statement_for_each ;
iteration_statement_while : WHILE LEFT_ROUND_BRACKET logical RIGHT_ROUND_BRACKET NEW_LINE statements ENDWHILE NEW_LINE ;
iteration_statement_for : FOR identifier assignment_expr TO (integer | call_id) NEW_LINE statements ENDFOR NEW_LINE;
iteration_statement_for_each : FOREACH identifier IN identifier NEW_LINE statements ENDFOREACH NEW_LINE;

// RETURN. Если функция всегда что-то возвращает, то надо это в функциюю перенести
// И убрать из statements.

return_statement : RETURN logical NEW_LINE | RETURN NEW_LINE ;

//ФУНКЦИИ

function_declaration : FUNCTION identifier LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET COLON_SIGH return_types
							BEGIN NEW_LINE statements return_statement END_FUNCTION NEW_LINE
                        | FUNCTION identifier LEFT_ROUND_BRACKET formal_parameter_list RIGHT_ROUND_BRACKET COLON_SIGH return_types
                            BEGIN NEW_LINE statements return_statement END_FUNCTION NEW_LINE ;
return_types : types | types_simple LEFT_SQUARE_BRACKER RIGHT_SQUARE_BRACKET | VOID ;
formal_parameter_list : varible_in_function (COMMA varible_in_function)* ;
function_call :  identifier LEFT_ROUND_BRACKET function_params RIGHT_ROUND_BRACKET | identifier LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;
function_params : call_id (COMMA call_id)* ;