import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Paths;
import java.io.IOException;

import ccal.ccalLexer;
import ccal.ccalParser;

public class CCALCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java CCALCheck <input-file.ccl>");
            System.exit(1);
        }

        String inputFile = args[0];

        try {
            CharStream charStream = CharStreams.fromPath(Paths.get(inputFile));
            ccalLexer lexer = new ccalLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ccalParser parser = new ccalParser(tokens);

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

            parser.prog();
            System.out.println("File \"" + inputFile + "\" parsed successfully.");

        } catch (IllegalStateException e) {
            System.err.println("The file \"" + inputFile + "\" could not be parsed.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Failed to read the file: " + inputFile);
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An error occurred while parsing the file: " + inputFile);
            e.printStackTrace();
        }
    }
}
