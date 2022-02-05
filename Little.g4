// Define a grammar called Hello
grammar Little;
r  : 'Little' ;        // match keyword hello followed by an identifier
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

KEYWORD: ('PROGRAM'|'BEGIN'|'STRING'|'FUNCTION'|'INT'|'IF'|'ELSE'|'ENDIF'|'END'|'RETURN'|'VOID'|'WRITE'
|'READ'|'WHILE'|'ENDWHILE'|'FLOAT'|'CONTINUE'|'BREAK') ;

// not an operator [,]
OPERATOR: (':='|';'|'('|')'|'<'|'>'|'='|'!='|'-'|'+'|','|'*'|'/'|
'<='|'>=');

//Might work, just have to test it
IDENTIFIER: (~([0-9])[A-Za-z0-9]+) ;

STRINGLITERAL: ('"'~('"')*'"');

INTLITERAL: [0-9]+ ;

//I don't know exactly what a fragment does, but made it so, since having [0-9]* says it might be am empty string and is throwing an error
fragment FLOATLITERAL: (([0-9]*)('.'[0-9]+)?) ;

Comment: '--'~('\r' | '\n')* -> skip;


