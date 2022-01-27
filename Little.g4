// Define a grammar called Hello
grammar Little;
r  : 'Little' ;        // match keyword hello followed by an identifier
//ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

KEYWORD: ('PROGRAM'|'BEGIN') ;
STRING: 'STRING' ;
FUNCTION: 'FUNCTION' ;
IF: 'IF' ;
ELSE: 'ELSE' ;
ENDIF: 'ENDIF' ;
END: 'END';
RETURN: 'RETURN' ;
VOID: 'VOID' ;
WRITE: 'WRITE' ;
READ: 'READ' ;
WHILE: 'WHILE' ;
ENDWHILE: 'ENDWHILE' ;
LETTERS: [a-z]+ ;
INT: [0-9]+ ;

