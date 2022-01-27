// Define a grammar called Hello
grammar Little;
r  : 'Little' ;        // match keyword hello followed by an identifier
//ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

KEYWORD: ('PROGRAM'|'BEGIN'|'STRING'|'FUNCTION'|'INT'|'IF'|'ELSE'|'ENDIF'|'END'|'RETURN'|'VOID'|'WRITE'
|'READ'|'WHILE'|'ENDWHILE'|'END'|'FLOAT') ;

OPERATOR: (':='|';'|'('|')'|'<'|'>'|'='|'!='|'-'|'+'|','|'['|']');

IDENTIFIERS: ([a-zA-Z]+) ;

STRINGLETERAL: ('"'((IDENTIFIERS*)' '*)'"') ;

INTLITERAL: '-'?[0-9]+ ;

FLOATLITERAL: '-'?[0-9]('.'[0-9]*)? ;