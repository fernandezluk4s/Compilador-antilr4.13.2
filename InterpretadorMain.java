import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class InterpretadorMain {
    public static void main(String[] args) throws IOException {
        String filename = args.length > 0 ? args[0] : null;
        CharStream input;
        
        if (filename != null) {
            input = CharStreams.fromFileName(filename);
        } else {
            String source = 
                "int a = 10; " +
                "if (a > 5) then { " +
                "   print(a * 2); " +
                "}";
            input = CharStreams.fromString(source);
        }

        // 1. Parsing (ANTLR)
        LinguagemALexer lexer = new LinguagemALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguagemAParser parser = new LinguagemAParser(tokens);
        ParseTree tree = parser.prog();

        // 2. Construção da AST (AstBuilder)
        AstBuilder builder = new AstBuilder();
        Node astRoot = builder.visit(tree);

        // --- NOVO: Impressão da Árvore ASCII ---
        System.out.println("\n--- AST (Abstract Syntax Tree) ---");
        AstPrinter printer = new AstPrinter();
        printer.print(astRoot);
        System.out.println("----------------------------------\n");
        // ---------------------------------------

        // 3. Execução (Interpretador)
        System.out.println("--- Iniciando Execução ---");
        Interpretador interp = new Interpretador();
        interp.executeGlobal(astRoot);
        
        System.out.println("\n--- Tabela Final ---");
        interp.tabela.imprimir();
    }
}