import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.io.*;

public class Driver {

    public static class VerboseListener extends BaseErrorListener { @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
        int line, int charPositionInLine, String msg,
        RecognitionException e)
        {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack(); Collections.reverse(stack);
        // System.err.println("rule stack: "+stack);
        // System.err.println("line "+line+":"+charPositionInLine+" at "+
        // offendingSymbol+": "+msg);
        //System.out.print("Not Accepted");
        System.exit(1);
        } }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if(args.length>0){ 
            inputFile = args[0];
            System.out.println(inputFile);
        }
        InputStream is = System.in;
        if (inputFile!=null)
        {
            is = new FileInputStream(inputFile); 
        }
        ANTLRInputStream input = new ANTLRInputStream(is); // a lexer that feeds off of input CharStream
        LittleLexer lexer = new LittleLexer(input); // create a buffer of tokens pulled from the lexer
        // while(true){

        //     Token token = lexer.nextToken();
        //     if(token.getType() == LittleLexer.EOF){
        //         break;
        //     }
        //     System.out.print("Token Type: ");
        //     if(token.getType() == 3){
        //         System.out.println("KEYWORD");
        //     }
        //     if(token.getType() == 5){
        //         System.out.println("IDENTIFIER");
        //     }
        //     if(token.getType() == 4){
        //         System.out.println("OPERATOR");
        //     }
        //     if(token.getType() == 6){
        //         System.out.println("STRINGLITERAL");
        //     }
        //     if(token.getType() == 7){
        //         System.out.println("INTLITERAL");
        //     }
        //     if(token.getType() == 8){
        //         System.out.println("FLOATLITERAL");
        //     }
        //     if(token.getType() == 9){
        //         continue;
        //     }
        //     // if(token.getType() == 10){
        //     //     System.out.println("IDENTIFIER");
        //     // }
        //     System.out.println("Value: " + token.getText());
        // }
        CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
        //System.out.println(tokens.getText());
        LittleParser parser = new LittleParser(tokens);
        //parser.program();
        SymbolExtractor extractor = new SymbolExtractor();
        System.out.println("Just to make sure it is running");
        //parser.program();
        //System.out.println(parser.program());
        
            parser.removeErrorListeners(); // remove ConsoleErrorListener 
            parser.addErrorListener(new VerboseListener()); // add ours parser.prog(); // parse as usual
            parser.program();
             //System.out.print("Accepted");

            
        //Add custom class here and then print out here
       
        //System.out.println(parser.program());
        //run parser, start rule on parser.program(); rule
        //extend a class baseerrorlistener override syntaxerr(), not execpt try catch, remove error listener in parsers
        ParseTree tree = parser.program(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

    }
}

class SymbolExtractor extends LittleBaseListener {

    private Stack<SymbolTable> symbolTableStack;

    private SymbolTable current;

    public SymbolExtractor() {
        this.symbolTableStack = new Stack<>();
        this.current = null;
    }

    @Override public void enterProgram(LittleParser.ProgramContext ctx) { 

        System.out.print("Entering Program");
        this.symbolTableStack.push(new SymbolTable("GLOBAL"));
        this.current = this.symbolTableStack.peek();

    }

    @Override public void exitProgram(LittleParser.ProgramContext ctx) { 

        while(this.symbolTableStack.isEmpty() != true){
            SymbolTable currentNode = this.symbolTableStack.pop();
            System.out.printf("Symbol Table %s\n", currentNode.getScope());
        }

    }

    @Override public void enterPgm_body(LittleParser.Pgm_bodyContext ctx) {

        System.out.println("Entering Body");

     }

    @Override public void exitPgm_body(LittleParser.Pgm_bodyContext ctx) {

        System.out.println("Leaving Body");

     }

}

class SymbolTable {

    private String scope;

    private HashMap<String, SymbolAttributes> symbolTable;

    private ArrayList<String> symbolName;

    public SymbolTable(String scope) {
        this.scope = scope;
        this.symbolTable = new HashMap<>();
        this.symbolName = new ArrayList<>();
    }

    public String getScope() {
        return this.scope;
    }

}

class SymbolAttributes {

    String type;
    String value;

    public SymbolAttributes(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType(){
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

}