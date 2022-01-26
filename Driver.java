import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Driver {
    public static void main(String[] args) throws Exception {
    String inputFile = null;
    if(args.length>0){ 
        inputFile = args[0];
        System.out.println(inputFile);
    }
    InputStream is = System.in;
    if (inputFile!=null) {
        is = new FileInputStream(inputFile); 
    }
    ANTLRInputStream input = new ANTLRInputStream(is); // a lexer that feeds off of input CharStream
    
    LittleLexer lexer = new LittleLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    //System.out.println(lexer);

    System.out.println(tokens.getText());
    //LittleLexer parser = new LittleParser(tokens);
    //ParseTree tree = parser.init(); // begin parsing at init rule
    //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
     
    }
}