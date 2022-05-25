import codeGenerator.CodeGenerator;
import codeGenerator.ExecuteCGVisitor;
import codeGenerator.OffsetVisitor;
import errorhandler.ErrorHandler;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;
import visitor.Visitor;

public class Main {

	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }

		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[1]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PmmParser parser = new PmmParser(tokens);
		Program ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(),null);
		ast.accept(new OffsetVisitor(), null);

		// * Check errors
		if(ErrorHandler.getErrorHandler().anyError()){
			// * Show errors
			ErrorHandler.getErrorHandler().showErrors(System.err);
		}
		else{
			// * The AST is shown
			ExecuteCGVisitor executeCGVisitor = new ExecuteCGVisitor(new CodeGenerator(args[0], args[1]));
			ast.accept(executeCGVisitor, null);
			//IntrospectorModel model=new IntrospectorModel("Program", ast);
			//new IntrospectorTree("Introspector", model);
		}
	}
}
