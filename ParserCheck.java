import output_directory.ccalLexer;
import output_directory.ccalParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserCheck
{

    public static void main(String[] args)
    {
        final String inputFile = args[0];

        try
        {
            CharStream input = CharStreams.fromFileName(inputFile);
            // Use the generated lexer to tokenize the input.
            ccalLexer lexer = new ccalLexer(input);
            // Wrap the lexer tokens into a token stream for the parser.
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Instantiate the parser with the token stream.
            ccalParser parser = new ccalParser(tokens);
            // Begin parsing at the 'prog' rule defined in the CCAL grammar.
            ParseTree tree = parser.prog();
            // Output the result of the parsing process.
            System.out.println(inputFile + (parser.getNumberOfSyntaxErrors() == 0 ? " parsed successfully" : " has not parsed"));
        }
        catch (Exception e)
        {
            // Print out an error message if an exception is thrown during the parsing process.
            System.err.println("Error: " + e.getMessage());
        }
    }
}
