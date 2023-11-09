grammar ccal;

prog: (decl_list function_list main);

decl_list: (decl SEMICOL decl_list)?;

decl: var_decl | const_decl;

var_decl: VARIABLE ID COLON type;

const_decl: CONSTANT ID COLON type ASSIGN expression;

function_list: (function function_list)?;

function:
	type ID LEFTBR parameter_list RIGHTBR IS decl_list LEFTCURLYBR statement_block RETURN LEFTBR
		expression? RIGHTBR SEMICOL RIGHTCURLYBR;

type: INT | BOOL | VOID;

parameter_list: nemp_parameter_list?;
nemp_parameter_list:
	ID COLON type
	| ID COLON type COMMA nemp_parameter_list;

main: MAIN LEFTCURLYBR decl_list statement_block RIGHTCURLYBR;

statement_block: (statement statement_block)?;

statement:
	ID ASSIGN expression SEMICOL
	| ID LEFTBR arg_list RIGHTBR SEMICOL
	| LEFTCURLYBR statement_block RIGHTCURLYBR
	| IF condition LEFTCURLYBR statement_block RIGHTCURLYBR
	| ELSE LEFTCURLYBR statement_block RIGHTCURLYBR
	| WHILE condition LEFTCURLYBR statement_block RIGHTCURLYBR
	| SKIPSTATEMENT SEMICOL;

expression:
	frag (binary_arith_op frag)*
	| LEFTBR expression RIGHTBR
	| ID LEFTBR arg_list RIGHTBR
	| frag;

binary_arith_op: PLUS | MINUS;

frag: ID | MINUS ID | NUM | TRUE | FALSE;

condition:
	NEG condition
	| LEFTBR condition RIGHTBR
	| expression comp_op expression
	| condition (OR | AND) condition;

comp_op:
	EQUALTO
	| NOTEQUALTO
	| LESSTHAN
	| LESSTHANOREQUAL
	| GREATERTHAN
	| GREATERTHANOREQUAL;

arg_list: nemp_arg_list?;

nemp_arg_list: ID | ID COMMA nemp_arg_list;

fragment A: 'A' | 'a';
fragment B: 'B' | 'b';
fragment C: 'C' | 'c';
fragment D: 'D' | 'd';
fragment E: 'E' | 'e';
fragment F: 'F' | 'f';
fragment G: 'G' | 'g';
fragment H: 'H' | 'h';
fragment I: 'I' | 'i';
fragment J: 'J' | 'j';
fragment K: 'K' | 'k';
fragment L: 'L' | 'l';
fragment M: 'M' | 'm';
fragment N: 'N' | 'n';
fragment O: 'O' | 'o';
fragment P: 'P' | 'p';
fragment Q: 'Q' | 'q';
fragment R: 'R' | 'r';
fragment S: 'S' | 's';
fragment T: 'T' | 't';
fragment U: 'U' | 'u';
fragment V: 'V' | 'v';
fragment W: 'W' | 'w';
fragment X: 'X' | 'x';
fragment Y: 'Y' | 'y';
fragment Z: 'Z' | 'z';

fragment Letter: [A-Za-z];
fragment Digit: [0-9];
fragment UnderScore: '_';

VARIABLE: V A R I A B L E;
CONSTANT: C O N S T A N T;
IS: I S;
RETURN: R E T U R N;
INT: I N T;
BOOL: B O O L;
VOID: V O I D;
MAIN: M A I N;
IF: I F;
ELSE: E L S E;
TRUE: T R U E;
FALSE: F A L S E;
WHILE: W H I L E;
SKIPSTATEMENT: S K I P S T A T E M E N T;

COMMA: ',';
SEMICOL: ';';
COLON: ':';
ASSIGN: '=';
LEFTCURLYBR: '{';
RIGHTCURLYBR: '}';
LEFTBR: '(';
RIGHTBR: ')';
PLUS: '+';
MINUS: '-';
NEG: '~';
OR: '||';
AND: '&&';
EQUALTO: '==';
NOTEQUALTO: '!=';
LESSTHAN: '<';
LESSTHANOREQUAL: '<=';
GREATERTHAN: '>';
GREATERTHANOREQUAL: '>=';

WS: [ \t\n\r]+ -> skip;

NUM: '0' | (MINUS? [1-9] Digit*);
ID: (Letter | UnderScore) (Letter | Digit | UnderScore)*;

COMMENT: '//' .*? '\n' -> skip;
MULTILINECOMMENT: '/' (MULTILINECOMMENT | .)? '/' -> skip;
