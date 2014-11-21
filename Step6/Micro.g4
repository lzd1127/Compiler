grammar Micro;

@members {
	public SymbolTableTree tree = new SymbolTableTree();
}

/* Program */
program: 'PROGRAM' id 'BEGIN' pgm_body 'END' ; 

id returns [String idname]
	: IDENTIFIER 
	{
		$idname = (String)$IDENTIFIER.text;
 	};
pgm_body: decl func_declarations ;

decl: string_decl decl | var_decl decl | ;


/* Global String Declaration */
string_decl: 'STRING' id ':=' str ';' 
	{
		tree.insertVariable($id.text, "STRING", $str.text);
	};

str: STRINGLITERAL ;

/* Variable Declaration */
var_decl: var_type id_list ';' 
	{
		tree.insertVariables($id_list.ids, $var_type.text);
	};

var_type: 'FLOAT' | 'INT' ;

any_type: var_type | 'VOID' ; 

id_list returns [List<String> ids]
	: id id_tail 
	{
		$ids = $id_tail.ids_list;
		$ids.add(0, $id.text);
	};

id_tail returns [List<String> ids_list]
	: ',' id 
	tmp = id_tail 
	{
		$ids_list = $tmp.ids_list;
		$ids_list.add(0, $id.text);
	} 
	|
	{
		$ids_list = new ArrayList<String>();
	};

/* Function Paramater List */
param_decl_list: param_decl param_decl_tail |  ;

param_decl: var_type id 
	{	
		tree.insertVariable($id.text, $var_type.text, "parameterflag");
	};

param_decl_tail: ',' param_decl param_decl_tail | ;


/* Function Declarations */
func_declarations: func_decl func_declarations | ;

func_decl: 'FUNCTION' any_type id 
	{
		tree.enterScope($id.text);
	}
	'('param_decl_list')' 'BEGIN' func_body 'END'
	{
		tree.exitScope();
	} ;

func_body: decl stmt_list ; 



/* Statement List */
stmt_list: stmt stmt_list | ;
stmt: base_stmt | aug_if_stmt | while_stmt ;
base_stmt: assign_stmt | read_stmt | write_stmt | return_stmt ;

/* Basic Statements */
assign_stmt: assign_expr ';' ;
assign_expr: id ':=' expr;
read_stmt: 'READ' '(' id_list ')' ';' ;
write_stmt: 'WRITE' '(' id_list ')' ';' ;
return_stmt: 'RETURN' expr ';' ;


/* Expressions */
expr:	expr_prefix factor ;
expr_prefix:	expr_prefix factor addop | ;
factor:	factor_prefix postfix_expr ;
factor_prefix:	factor_prefix postfix_expr mulop | ;
postfix_expr:	primary | call_expr ;
call_expr:	id '(' expr_list ')'  ;
expr_list:	expr expr_list_tail | ;
expr_list_tail:	',' expr expr_list_tail | ;
primary_prefix:  '(' expr ')';
primary:	primary_prefix | id | INTLITERAL | FLOATLITERAL ;
addop:	'+' | '-' ;
mulop:	'*' | '/' ;


/* Complex Statements and Condition */ 
if_stmt:	'IF' 
	{
		tree.enterScope();
	}
	'(' cond ')' decl stmt_list 
	{
		tree.exitScope();
	}	
	else_part 'ENDIF' ;

else_part:	'ELSE' 
	{
		tree.enterScope();
	}
	decl stmt_list
	{
		tree.exitScope();		
	} 
	| ;


cond:	expr compop expr ;
compop: 	'<' | '>' | '=' | '!=' | '<=' | '>=' ;

/* ECE 573 students use this version of do_while_stmt */
while_stmt: 
	'WHILE' 
	{
		tree.enterScope();
	}
	'(' cond ')' decl aug_stmt_list 'ENDWHILE' 
	{
		tree.exitScope();
	};

/* CONTINUE and BREAK statements. ECE 573 students only */
aug_stmt_list: aug_stmt aug_stmt_list | ;
aug_stmt: base_stmt | aug_if_stmt | while_stmt | 'CONTINUE;' | 'BREAK;' ;

/* Augmented IF statements for ECE 573 students */ 
aug_if_stmt:	'IF' 
	{
		tree.enterScope();
	}'(' cond ')' decl aug_stmt_list aug_else_part 'ENDIF'
	{
		tree.exitScope();	
	} ;
aug_else_part:	'ELSE'
	{
		tree.enterScope();

	} decl aug_stmt_list 
	{
		tree.exitScope();
	}	
	| ;


KEYWORD :'PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'READ'|'WRITE'|'IF'|'ELSE'|'ENDIF' |'WHILE'|'ENDWHILE'|'CONTINUE'|'BREAK'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT'|'TRUE' | 'FALSE';

fragment
WORD: [A-Za-z]+ ;
fragment
DIGIT: [0-9] ;

IDENTIFIER: ('_'|WORD)('_'|WORD|DIGIT)* ;

OPERATOR: ':='| '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ;

STRINGLITERAL: '"'~('"')*'"' ;

INTLITERAL: DIGIT+ ;

FLOATLITERAL: INTLITERAL+'.'DIGIT* ;

COMMENT: '--'(~('\n'))*'\n' -> skip;

SPACE: ('\n'|'\t'|' '|'\r'|'\f')+ -> skip;
