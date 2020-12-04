import antr.PseudoCodeLexer;
import antr.PseudoCodeParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    private static final String pyExpansion = ".py";
    private static final String cppExpansion = ".cpp";
    public static void main( String[] args) throws Exception
    {
        String inputFile = args[0];
        String file = inputFile.split("\\.")[0];
        File programFile = new File(System.getProperty("user.dir") + "\\" + inputFile);
        String programString = "";
        Scanner myReader = new Scanner(programFile);
        while (myReader.hasNextLine()) {
            programString += myReader.nextLine();
            programString += "\n";
        }
        myReader.close();
        PseudoCodeLexer lexer = new PseudoCodeLexer(CharStreams.fromString(programString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PseudoCodeParser parser = new PseudoCodeParser(tokens);

        System.out.println();

        ParseTree tree = parser.program();
        ParseTreeWalker walker = new CustomWalker();

        PythonListener pythonListener = new PythonListener();
        walker.walk(pythonListener, tree);

        CPlusPlusListener cPlusPlusListener = new CPlusPlusListener();
        walker.walk(cPlusPlusListener, tree);

        if (!cPlusPlusListener.hasError()) {
            FileOutputStream outputStreamPython = new FileOutputStream(file + pyExpansion);
            byte[] strToBytesPython = pythonListener.toString().getBytes();
            outputStreamPython.write(strToBytesPython);
            outputStreamPython.close();

            FileOutputStream outputStreamCPP = new FileOutputStream(file + cppExpansion);
            byte[] strToBytesCPP = cPlusPlusListener.toString().getBytes();
            outputStreamCPP.write(strToBytesCPP);
            outputStreamCPP.close();
        }
    }
}