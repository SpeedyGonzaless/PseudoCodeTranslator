import antr.PseudoCodeLexer;
import antr.PseudoCodeParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main( String[] args) throws Exception
    {
        File programFile = new File("C:\\Users\\ivanf\\IdeaProjects\\Course_Compilers\\src\\main\\java\\program.txt");
        String programString = "";
        Scanner myReader = new Scanner(programFile);
        while (myReader.hasNextLine()) {
            programString += myReader.nextLine();
            programString += "\n";
        }
        myReader.close();
//        programString = "FUNCTION InsetSort (int32[] a) : int32[] BEGIN\n";
        PseudoCodeLexer lexer = new PseudoCodeLexer(CharStreams.fromString(programString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PseudoCodeParser parser = new PseudoCodeParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new CustomWalker();
        MyListener myListener = new MyListener();
        walker.walk(myListener, tree);
        System.out.println();
        System.out.println(myListener);
        int t = 0;
    }
}