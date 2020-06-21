
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;




public class ExtractInterfaceTool 
{
    public static void main(String[] args) throws Exception
     {
        String inputFile = null;
         InputStream is;

        //if ( args.length>0 )
        	//inputFile = args[0];
         Scanner S = new Scanner(System.in);
         inputFile = S.next();
        if ( inputFile!=null ) 
        {
            is = new FileInputStream(inputFile);
        }
        else
            return;

        ANTLRInputStream input = new ANTLRInputStream(is);

        LULU2Lexer lexer = new LULU2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LULU2Parser parser = new LULU2Parser(tokens);
        ParseTree tree = parser.program(); // parse
         //LULU2Parser.CompilationUnitContext  tree = parser.compilationUnit(); // parse a compilationUnit

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}
 