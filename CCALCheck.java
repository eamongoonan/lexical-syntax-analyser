import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Paths;
import java.io.IOException;

// Assuming the generated ANTLR files are in the 'ccal' package, import them
import ccal.ccalLexer;
import ccal.ccalParser;

public class CCALCheck {
    public static void main(String[] args) {
        // Declare 'inputFile' at the top so it's accessible throughout the main method
        String inputFile = null;

        // Check if a single command-line argument is provided
        if (args.length != 1) {
            System.err.println("Usage: java CCALCheck <input-file.ccl>");
            System.exit(1);
        }

        // Assign the filename to 'inputFile'
        inputFile = args[0];

        // Try block for the file parsing logic
        try {
            // Read from the file
            CharStream charStream = CharStreams.fromPath(Paths.get(inputFile));
            // Create a lexer instance
            ccalLexer lexer = new ccalLexer(charStream);
            // Token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Parser instance from the token stream
            ccalParser parser = new ccalParser(tokens);

            // Custom error listener for syntax errors
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line,
                                        int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    throw new IllegalStateException("Syntax error at line " + line + ": " + msg, e);
                }
            });

            // Begin parsing at the root rule 'prog'
            ParseTree tree = parser.prog();

            // If no exceptions, parsing was successful
            System.out.println("File \"" + inputFile + "\" parsed successfully.");

        } catch (IllegalStateException e) {
            // Custom syntax error handling
            System.err.println("The file \"" + inputFile + "\" could not be parsed.");
            e.printStackTrace();
        } catch (IOException e) {
            // IO exceptions handling, such as file not found
            System.err.println("Failed to read the file: " + inputFile);
            e.printStackTrace();
        } catch (Exception e) {
            // General exception handling
            System.err.println("An error occurred while parsing the file: " + inputFile);
            e.printStackTrace();
        }
    }
}
