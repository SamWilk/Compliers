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
        System.out.print("Not Accepted");
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

        
            // parser.removeErrorListeners(); // remove ConsoleErrorListener 
            // parser.addErrorListener(new VerboseListener()); // add ours parser.prog(); // parse as usual
            // parser.program();
            // System.out.print("Accepted");
        //parser.program();
        SymbolExtractor extractor = new SymbolExtractor();

        

        ParseTree tree = parser.program();
       
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        extractor.printTiny();
        //extractor.print();


    }
}

class SymbolExtractor extends LittleBaseListener {

    private Stack<SymbolTable> symbolTableStack;

    private SymbolTable current;

    private Integer blockCounter;

    private ArrayList<String> TinyList = new ArrayList();


    public SymbolExtractor() {
        this.symbolTableStack = new Stack<>();
        this.current = null;
        this.blockCounter = 1;

    }

    public Integer getBlockCounter() {
        return this.blockCounter;
    }

    public void iterateBlockCounter() {
        this.blockCounter += 1;
    }

    public void print()
    {
        //System.out.println("PRINTING");
        current.print();
    }

    public void printTiny(){
        TinyList.forEach((tinyOut) -> {
            System.out.println(tinyOut);
        });
    }

    @Override public void enterProgram(LittleParser.ProgramContext ctx) { 

        //System.out.println("Entering Program");
        this.symbolTableStack.push(new SymbolTable("GLOBAL"));
        this.current = this.symbolTableStack.peek();

    }

    @Override public void exitProgram(LittleParser.ProgramContext ctx) { 

        Stack<SymbolTable> displayList = new Stack<>();

        while(this.symbolTableStack.isEmpty() != true){
            SymbolTable currentNode = this.symbolTableStack.pop();
            displayList.push(currentNode);
           
        }

        /*
        while(displayList.isEmpty() != true){
            SymbolTable currentNode = displayList.pop();
            System.out.printf("Symbol table %s\n", currentNode.getScope());
            currentNode.print();
            if(displayList.isEmpty() != true){
                System.out.println();
            }
        }
        */

    }

    @Override public void enterPgm_body(LittleParser.Pgm_bodyContext ctx) {


     }

    @Override public void exitPgm_body(LittleParser.Pgm_bodyContext ctx) {


     }

     @Override public void enterFunc_decl(LittleParser.Func_declContext ctx) {
        this.symbolTableStack.push(new SymbolTable(ctx.id().IDENTIFIER().getText()));
        this.current = this.symbolTableStack.peek();

        if(ctx.param_decl_list().getChildCount() > 1){
            this.current.addSymbol( ctx.param_decl_list().param_decl().id().getText(),
                                    new SymbolAttributes(ctx.any_type().getText(), "0"));

        LittleParser.Param_decl_tailContext current_id = ctx.param_decl_list().param_decl_tail();
           
        while(current_id.param_decl() != null)
        {
            this.current.addSymbol( current_id.param_decl().id().getText(),
                                    new SymbolAttributes(ctx.any_type().getText(), "0"));
            current_id = current_id.param_decl_tail();
        }

        }

      }

     @Override public void exitFunc_decl(LittleParser.Func_declContext ctx) { }


    //Handles If_statements///////////////////
     @Override public void enterIf_stmt(LittleParser.If_stmtContext ctx) {
        
        String temp = "BLOCK " + getBlockCounter();
        this.symbolTableStack.push(new SymbolTable(temp));
        this.current = this.symbolTableStack.peek();
        iterateBlockCounter();
      }
	
	 @Override public void exitIf_stmt(LittleParser.If_stmtContext ctx) { }

      //handles else in if
     @Override public void enterElse_part(LittleParser.Else_partContext ctx) { 
        
        if(ctx.stmt_list() != null){

            String temp = "BLOCK " + getBlockCounter();
            this.symbolTableStack.push(new SymbolTable(temp));
            this.current = this.symbolTableStack.peek();
            iterateBlockCounter();

        }
        
     }
	
	 @Override public void exitElse_part(LittleParser.Else_partContext ctx) { }
    /////////////////////////////////////////

    ////////////////// Handles While //////////////////////////
    @Override public void enterWhile_stmt(LittleParser.While_stmtContext ctx) { 

        String temp = "BLOCK " + getBlockCounter();
        this.symbolTableStack.push(new SymbolTable(temp));
        this.current = this.symbolTableStack.peek();
        iterateBlockCounter();
    }
	
	@Override public void exitWhile_stmt(LittleParser.While_stmtContext ctx) { }
    ///////////////////////////////////////////////////////////
     @Override public void enterString_decl(LittleParser.String_declContext ctx)
     {
        this.current.addSymbol( ctx.id().IDENTIFIER().getText(),
                                new SymbolAttributes( "STRING", ctx.str().STRINGLITERAL().getText() ) 
                                );
        String appendString = "";
        appendString = appendString.concat("str " + 
                ctx.id().IDENTIFIER().getText() +" "+ ctx.str().getText());
        TinyList.add(appendString);
     }
     ///////////////////////// Int and Floats ////////////////////////////
     @Override public void enterVar_decl(LittleParser.Var_declContext ctx) 
     {
        this.current.addSymbol( ctx.id_list().id().getText(), 
                                new SymbolAttributes( ctx.any_type().getText(), "0" )
                                );

        String variables = ctx.id_list().getText();
        if(variables.contains(",") == true){
            String tokens[] = variables.split(",");
            for(int i = 0; i < tokens.length; i++){
                String appendString = "";
                appendString = appendString.concat("var " + tokens[i]);
                TinyList.add(appendString);
            }
        }else{
            String appendString = "";
            appendString = appendString.concat("var " + variables);
            TinyList.add(appendString);
        }

        LittleParser.Id_tailContext current_id = ctx.id_list().id_tail();
        while(current_id.id() != null )
        {   
            
            this.current.addSymbol( current_id.id().getText(),
                                    new SymbolAttributes(ctx.any_type().getText(), "0"));
            current_id = current_id.id_tail();
        }
     }
     ////////////////////////////////////////////////////////////////////////

     ///////////////////////// Assignment Statement //////////////////////////
     @Override public void enterAssign_stmt(LittleParser.Assign_stmtContext ctx) {
         //System.out.println("Assigning Value: " + ctx.assign_expr().getText());
         String [] tokens = ctx.assign_expr().getText().split(":=");
         for(int i = 0; i < tokens.length; i++){
             //System.out.println("Token: " + tokens[i]);
         }

         /*
         AST tree = new AST();
         tree.setAssignment(tokens[0]);
         tree.createTree(tokens[1]);
         System.out.println("Tree: " + tree.getRoot().temp + " : " + tree.getRoot().left.temp + " : " + tree.getRoot().right.temp);
         */
      }
	
	 @Override public void exitAssign_stmt(LittleParser.Assign_stmtContext ctx) { }
    //////////////////////////////////////////////////////////////////////////
}

class SymbolTable {

    private String scope;

    private LinkedHashMap<String, SymbolAttributes> symbolTable;

    private ArrayList<String> symbolName;

    public SymbolTable(String scope) {
        this.scope = scope;
        this.symbolTable = new LinkedHashMap<>();
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

// class AST {

//     public class Node{

//         public String temp;
//         public String oprand;
//         public String code;
//         public Node left;
//         public Node right;
    
//         public Node(String node){
//             this.temp = node;
//             this.left = null;
//             this.right = null;
//         }
    
//     }

//     public Node root;

//     public AST(){
//         Node node = new Node(":=");
//         node.code = "STORE";
//         node.oprand = ":=";
//         this.root = node;
//     }

//     public Node getRoot(){
//         return this.root;
//     }

//     public void setAssignment(String temp){
//         Node newNode = new Node(temp);
//         root.left = newNode;
//     }

//     public void createTree(String rightHand){
//         String [] tokens;
//         if(rightHand.contains("+") == true){
//             tokens = rightHand.split("\\+");
//             Node newNode = new Node("+");
//         Node current = root;
//         while(current.right != null){
//             current = current.right;
//         }
//         current.right = newNode;
//         }
//         if(rightHand.contains("*") == true){
//             tokens = rightHand.split("\\*");
//             Node newNode = new Node("*");
//         Node current = root;
//         while(current.right != null){
//             current = current.right;
//         }
//         current.right = newNode;
//         }
        

        
//     }


// }

