import com.antr.PseudoCodeLexer;
import com.antr.PseudoCodeParser;
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
        }
        myReader.close();
        com.antr.PseudoCodeLexer lexer = new PseudoCodeLexer(CharStreams.fromString(programString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        com.antr.PseudoCodeParser parser = new PseudoCodeParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        int t = 0;
    }
}