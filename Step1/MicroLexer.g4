lexer grammar MicroLexer;

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

COMMENT: '--'~('\n')*'\n' ;

SPACE: ('\n'|'\t'|' ')+ ;


