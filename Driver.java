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

        var newTree = new AST().visitProgram(parser.program());

        System.out.println(newTree.toString());
    }
}

//For arraylist I am using, not an ASTree node
class CustomNode {
    private String value;
    private String type;
    public CustomNode(String value, String type){
        this.value = value;
        this.type = type;
    }

    public String getValue(){
        return this.value;
    }

    public String getType(){
        return this.type;
    }
}

class SymbolExtractor extends LittleBaseListener {

    private Stack<SymbolTable> symbolTableStack;

    private SymbolTable current;

    private Integer blockCounter;

    private ArrayList<CustomNode> TinyList = new ArrayList();

    private ArrayList<AST> trees = new ArrayList<AST>();

    private AST current_tree;


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
            System.out.println(tinyOut.getValue());
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
        CustomNode newNode = new CustomNode(appendString, "STRING");
        TinyList.add(newNode);
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
                CustomNode newNode = new CustomNode(appendString, ctx.any_type().getText());
                TinyList.add(newNode);
            }
        }else{
            String appendString = "";
            appendString = appendString.concat("var " + variables);
            CustomNode newNode = new CustomNode(appendString, ctx.any_type().getText());
            TinyList.add(newNode);
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

     ///////////////////////////////// READ FUNC ///////////////////////////////////////
     @Override public void enterRead_stmt(LittleParser.Read_stmtContext ctx) {
         String appendString = "sys read";
         if(ctx.id_list().getText().contains(",") != true){
            for(int i = 0; i < TinyList.size(); i++){
                String tokens [] = TinyList.get(i).getValue().split(" ");
                if(tokens[1].equals(ctx.id_list().getText()) == true){
                    String type = TinyList.get(i).getType();
                    switch(type){
                        case "INT":
                            appendString = appendString.concat("i " + ctx.id_list().getText());
                            CustomNode newNode1 = new CustomNode(appendString, null);
                            TinyList.add(newNode1);
                            break;
                        case "FLOAT":
                            appendString = appendString.concat("f " + ctx.id_list().getText());
                            CustomNode newNode2 = new CustomNode(appendString, null);
                            TinyList.add(newNode2);
                            break;
                        default: 
                            System.out.println("No type");
                    };
                    break;
                }
            }
         }
         else{

         }

      }
     //////////////////////////////////////////////////////////////////////////////////

     ///////////////////////////////// WRITE FUNC ///////////////////////////////////////
     @Override public void enterWrite_stmt(LittleParser.Write_stmtContext ctx) { 
        String appendString = "sys write";
        if(ctx.id_list().getText().contains(",") != true){
            for(int i = 0; i < TinyList.size(); i++){
                String tokens [] = TinyList.get(i).getValue().split(" ");
                //Always Check tokens[1]
                if(tokens[1].equals(ctx.id_list().getText()) == true){
                    String type = TinyList.get(i).getType();
                    switch(type){
                        case "STRING": 
                            appendString = appendString.concat("s " + ctx.id_list().getText());
                            CustomNode newNode = new CustomNode(appendString, null);
                            TinyList.add(newNode);
                            break;
                        case "INT":
                            appendString = appendString.concat("i " + ctx.id_list().getText());
                            CustomNode newNode1 = new CustomNode(appendString, null);
                            TinyList.add(newNode1);
                            break;
                        case "FLOAT":
                            appendString = appendString.concat("f " + ctx.id_list().getText());
                            CustomNode newNode2 = new CustomNode(appendString, null);
                            TinyList.add(newNode2);
                            break;
                        default: 
                            System.out.println("No type");
                    };
                    break;
                }
            }
        }else{
            //For Mutliple params in write
            System.out.println();
            System.out.println("Multi params");
            System.out.println();
        }
        
        
     }
     //////////////////////////////////////////////////////////////////////////////////

     ///////////////////////// Assignment Statement //////////////////////////
     @Override public void enterAssign_expr(LittleParser.Assign_exprContext ctx) { 
        current_tree = new AST();
        System.out.println();
        System.out.println("Creating Tree");
        Node root = current_tree.visitAssign_expr(ctx);
        getNodesPost(root);
        System.out.println();
        //This is where we will create a new tree each time an assignment happens
        //Then call a function that will recursively get the nodes in post order, and at each node 
        //Generate the correct assembly for it put it into the arraylist and then be done
        // current_tree = new AST();
        // System.out.println("Creating new Tree:",current_tree.visitAssign_expr(ctx)); 
      }
    //////////////////////////////////////////////////////////////////////////

    /////////// Post order Nodes \\\\\\\\\\\\
    public static void getNodesPost(Node currentNode){
        //Just giving currentNode a type so it will compile
        if(currentNode == null) return;

        getNodesPost(currentNode.getRight());
        getNodesPost(currentNode.getLeft());
        
        /*
            Current Node is what is gotten back from the tree
            If it is a value/ variable store it into a new temp
            If it is a operand then do said operand and store into new temp
            Once := is found then store most recent temp into the last node
            On each call parse for arraylist to print correctly
        */
        String checkType = currentNode.getClass().getName();
        switch(checkType){
            case "AssignNode":
                AssignNode temp = (AssignNode) currentNode;
                System.out.println("AssignNode Node < " + temp.getValue() + " >");
                break;
            case "IdNode":
                IdNode temp2 = (IdNode) currentNode;
                System.out.println("IdNode Node < " + temp2.getValue() + " >");
                break;
            case "MulopNode":
                MulopNode temp3 = (MulopNode) currentNode;
                System.out.println("MulopNode Node < " + temp3.getValue() + " >");
                break;
            case "AddopNode":
                AddopNode temp4 = (AddopNode) currentNode;
                System.out.println("MulopNode Node < " + temp4.getValue() + " >");
                break;
            default:
                System.out.println("------------------------------------------");
                System.out.println("NO TYPE FOUND FOR " + checkType);
                System.out.println("------------------------------------------");
        }

    }
    /////////////////////////////////////////
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


