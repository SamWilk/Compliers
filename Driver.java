import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.tool.Rule;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;
//import java.util.Queue;
import java.util.Stack;

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
       
        CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
        //System.out.println(tokens.getText());
        LittleParser parser = new LittleParser(tokens);
        //parser.program();
        SymbolExtractor extractor = new SymbolExtractor();

        ParseTree tree = parser.program();
       
        ParseTreeWalker.DEFAULT.walk(extractor, tree);

        extractor.print();


    }
}

class SymbolExtractor extends LittleBaseListener {

    private Stack<SymbolTable> symbolTableStack;

    private SymbolTable current;

    public SymbolExtractor() {
        this.symbolTableStack = new Stack<>();
        this.current = null;
    }

    public void print()
    {
        current.print();
    }

    @Override public void enterProgram(LittleParser.ProgramContext ctx) { 

        //System.out.println("Entering Program");
        this.symbolTableStack.push(new SymbolTable("GLOBAL"));
        this.current = this.symbolTableStack.peek();

    }

    @Override public void exitProgram(LittleParser.ProgramContext ctx) { 

        //Queue<SymbolTable> displayList = new LinkedList<>();
        Stack<SymbolTable> displayList = new Stack<>();

        while(this.symbolTableStack.isEmpty() != true){
            SymbolTable currentNode = this.symbolTableStack.pop();
            displayList.push(currentNode);
            //System.out.printf("Symbol Table %s\n", currentNode.getScope());
            //currentNode.print();
        }

        while(displayList.isEmpty() != true){
            SymbolTable currentNode = displayList.pop();
            System.out.printf("Symbol Table %s\n", currentNode.getScope());
            currentNode.print();
            if(displayList.isEmpty() != true){
                System.out.println();
            }
        }


    }

    @Override public void enterPgm_body(LittleParser.Pgm_bodyContext ctx) {

        //System.out.println("Entering Body");
        //System.out.printf("Function Name: %s\n", ctx.func_declarations());
        //ctx.id().IDENTIFIER().getText();
        // this.symbolTableStack.push(new SymbolTable())

     }

    @Override public void exitPgm_body(LittleParser.Pgm_bodyContext ctx) {

        //System.out.println("Leaving Body");

     }

     @Override public void enterFunc_decl(LittleParser.Func_declContext ctx) {
        //System.out.printf("Function Name: %s\n", ctx.id().IDENTIFIER().getText());
        this.symbolTableStack.push(new SymbolTable(ctx.id().IDENTIFIER().getText()));
        this.current = this.symbolTableStack.peek();

        System.out.printf("Table : %s\n", ctx.id().IDENTIFIER().getText());

        // System.out.printf("Number of Params: %s\n", ctx.param_decl_list().length());
        while(ctx.param_decl_list().param_decl() != null){
            System.out.printf("Params: %s\n", ctx.param_decl_list().param_decl().getText());
            
        }
        if(ctx.param_decl_list().param_decl() != null){
            System.out.printf("Params: %s\n", ctx.param_decl_list().param_decl().getText());
        }else{
            if(ctx.param_decl_list().param_decl_tail() != null){
                System.out.printf("Params: %s\n", ctx.param_decl_list().param_decl_tail().getText());

            }

        }

      }

     @Override public void exitFunc_decl(LittleParser.Func_declContext ctx) { }


     @Override public void enterString_decl(LittleParser.String_declContext ctx)
     {
        this.current.addSymbol( ctx.id().IDENTIFIER().getText(),
                                new SymbolAttributes( "STRING", ctx.str().STRINGLITERAL().getText() ) 
                                );
     }
     @Override public void enterVar_decl(LittleParser.Var_declContext ctx) 
     {
         
        this.current.addSymbol( ctx.id_list().id().getText(), 
                                new SymbolAttributes( ctx.any_type().getText(), "0" )
                                );

        LittleParser.Id_tailContext current_id = ctx.id_list().id_tail();
        
        while(current_id.id() != null)
        {
            this.current.addSymbol( current_id.id().getText(),
                                    new SymbolAttributes(ctx.any_type().getText(), "0"));
            current_id = current_id.id_tail();
        }
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

    public void addSymbol(String symbolName, SymbolAttributes attributes)
    {
        if(this.symbolTable.containsKey(symbolName))
        {
            System.out.println("DECLARATION ERROR " + symbolName);
            System.exit(0);
        }

        this.symbolTable.put(symbolName, attributes);
        this.symbolName.add(symbolName);
        
    }
    public void print()
    {
        // ! Weird error, table is auto sorting by alphabetical order.
        symbolTable.forEach((name, attr) -> {
            if(attr.type.equals("STRING"))
            {
                System.out.println("name " + name + " type " + attr.type + " value " + attr.value);
            }
            else
            {
                System.out.println("name " + name + " type " + attr.type);
            }
        });
        
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