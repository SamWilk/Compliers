// Define a grammar called Hello
grammar Little;
r  : 'Little' ;        // match keyword hello followed by an identifier
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

KEYWORD: ('PROGRAM'|'BEGIN'|'STRING'|'FUNCTION'|'INT'|'IF'|'ELSE'|'ENDIF'|'END'|'RETURN'|'VOID'|'WRITE'
|'READ'|'WHILE'|'ENDWHILE'|'FLOAT'|'CONTINUE'|'BREAK') ;

// not an operator [,]
OPERATOR: (':='|';'|'('|')'|'<'|'>'|'='|'!='|'-'|'+'|','|'*'|'/'|
'<='|'>=');

IDENTIFIER: ([A-Za-z]+) ;

STRINGLITERAL: (('"'('a'..'z' | 'A'..'Z' | '0'..'9' | ':' | '.' | '&' | '/' | '\\' | ';'| ' ')*'"')) ;

INTLITERAL: '-'?[0-9]+ ;

FLOATLITERAL: '-'?[0-9]('.'[0-9]*)? ;

Comment: '--'+ -> skip;

