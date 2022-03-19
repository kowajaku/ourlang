package main;

import gen.ourlangLexer;
import gen.ourlangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        try {
            ourlangLexer lexer = new ourlangLexer(CharStreams.fromFileName("src/ourl/example.ourl"));
            ourlangParser parser = new ourlangParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();
            
            Scope scope = new Scope();
            ExtendedVisitor visitor = new ExtendedVisitor(scope);
            visitor.visit(tree);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}
