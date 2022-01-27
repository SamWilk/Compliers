import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.io.*;

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

    String val = "STRING input := 23 4.332\"Please input an integer number: \";";
    Scanner scan = new Scanner(System.in);
    System.out.println(scan);
    ANTLRInputStream input = new ANTLRInputStream(System.in); // a lexer that feeds off of input CharStream
    
    LittleLexer lexer = new LittleLexer(input); // create a buffer of tokens pulled from the lexer
    while(true){
        Token token = lexer.nextToken();
        if(token.getType() == LittleLexer.EOF){
            break;
        }
        System.out.print("Token Type: ");
        if(token.getType() == 3){
            System.out.println("KEYWORD");
        }
        if(token.getType() == 5){
            System.out.println("IDENTIFIER");
        }
        if(token.getType() == 4){
            System.out.println("OPERATOR");
        }
        if(token.getType() == 6){
            System.out.println("STRINGLITERAL");
        }
        if(token.getType() == 7){
            System.out.println("INTLITERAL");
        }
        if(token.getType() == 8){
            System.out.println("FLOATLITERAL");
        }
        if(token.getType() == 9){
            continue;
        }
        // if(token.getType() == 10){
        //     System.out.println("IDENTIFIER");
        // }
        System.out.println("Value: " + token.getText());
    }
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    //System.out.println(lexer);

    System.out.println(tokens.getText());
    //LittleLexer parser = new LittleParser(tokens);
    //ParseTree tree = parser.init(); // begin parsing at init rule
    //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
     
    }
}