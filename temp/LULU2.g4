grammar LULU2;
program
	: ft_dcl? ft_def* EOF
	;
ft_dcl
	: 'declare' '{' ( func_dcl | type_dcl | var_def )+  '}'
	;

func_dcl : (  '('  args  ')'  '='  )?  ID  '('  ( args | args_var )?  ')'  ';'
	;
args :  type  (  '['  ']'  )*  | args  ','   type  (  '['  ']'  )*
	;
args_var : type ID ( '['  ']'  )* | args_var ',' type ID (  '['  ']'  )*
	;
type : 'int' | 'bool' | 'float' | 'long' | 'char' | 'double' | 'string' | ID
	;
type_dcl : ID ';'
	;
var_def : 'const'? type var_val ( ',' var_val )* ';'
	;
var_val : ID ( '[' INT_CONST ']' )* ( '=' ( expr | list | 'allocate' ID ) )?
	;
list :  '[' ( expr | list ) ( ',' ( expr | list ) )* ']'
	;
ft_def : ( type_def | fun_def )+
	;
type_def : 'type' ID ( ':' ID )? '{' component+ '}'
	;
component : access_modifier? ( var_def | fun_def )
	;
access_modifier : 'private' | 'public' | 'protected'
	;
fun_def : ( '(' args_var ')' '=' )? 'function' ID '(' args_var? ')' block
	;
block : '{' ( var_def | stmt )* '}'
	;
stmt : assign ';' | func_call ';' | cond_stmt | loop_stmt | 'return' ';' | goto_ ';' | label | expr ';' | 'break' ';' | 'continue' ';' |
'destruct' ( '['  ']'  )* ID ';'
	;
assign : var '=' expr | var '=' 'new' | '(' var ( ',' var )* ')' '=' func_call
	;
var : ( ( 'this' | 'super' ) '.' )? ref ( '.' ref )*
	;
ref : ID ( '[' expr ']' )*
	;
expr : expr ('*') expr | expr ('/') expr | expr('%') expr | expr ('+') expr |
       expr ('-') expr | expr ('&') expr | expr ('^') expr | expr ('|') expr |
       expr ('<=') expr |expr ('>=') expr |expr ('<') expr | expr ('>') expr |
       expr ('==') expr |expr ('!=') expr |expr ('&&') expr|expr ('||') expr |
       '(' expr ')' | const_val | unary_op expr | func_call | var | 'nil'
	;
func_call : ( var '.' )? ID '(' params? ')' | 'sizeof' '(' ( type | var ) ')' | 'read' '(' var ')' | 'write' '(' var ')'
	;
params : expr | expr ',' params
	;
cond_stmt : 'if' '(' expr ')' block ( 'else' block )? | 'switch' '(' var ')' 'of' ':' '{' ( 'case' 'int_const' ':' block )* 'default' ':' block '}'
	;
loop_stmt : 'for' '(' var_def? ';' expr ';' assign? ')' block | 'while' '(' expr ')' block
	;
goto_ : 'goto' ID
	;// it raised an error before changing goto to goto_ so we decided to change it
label : ID ':'
	;
const_val : INT_CONST | REAL_CONST |  CHAR_CONST  | BOOL_CONST |  STRING_CONST
	;
unary_op : '-' | '!' | '~'
	;

ID : [a-zA-Z_][_a-zA-Z0-9]*;

WS: [ \n\t\r] -> skip;


INT_CONST
	:
	DIGIT+
	|
	'0x'[0-9A-Fa-f]+
	;
DIGIT
	:
	[0-9]
	;
VALID_CHAR :
	~[\n\t\r] | '\\n' | '\\r' | '\\t' | '\\\\' | '\\0' | '\\X' ([0-9A-F] | [1-7][0-9A-F])
	;
CHAR_CONST
	:
	'\''VALID_CHAR'\''
    ;
STRING_CONST
	:
	'"'VALID_CHAR*'"'
	;
BOOL_CONST
	:
	'true' | 'false'
	;
REAL_CONST
	:
	DIGIT+ '.'? DIGIT* ( (('e' | 'E') ('+' | '-') DIGIT+ ) | ('e' | 'E') )?
	|
	DIGIT* '.' DIGIT+ ( (('e' | 'E') ('+' | '-') DIGIT+ ) | ('e' | 'E') )?
	;
//
//
/*KEYWORDS
	:
	'allocate' | 'bool' | 'break' | 'case' | 'char' | 'const' | 'declare' | 'continue' |
	'default' | 'destruct' | 'double' | 'else' | 'false' | 'function' | 'float' | 'for' | 'goto' |
	'if' | 'int' | 'long' | 'new' | 'nil' | 'of' | 'private' | 'protected' | 'public' | 'read' |
	'return' | 'sizeof' | 'super' | 'swtich' | 'this' | 'true' | 'type' | 'while' | 'write'
	;
	*/

COMMENT : '%@' .*? '@%' -> skip ;
LINE_COMMENT : '%%' .*? '\n' -> skip ;
