import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.*;

class Micro {
	public static void main (String[] args) throws Exception {

		ANTLRFileStream file = new ANTLRFileStream(args[0]);
	
		Lexer lexer = new MicroLexer(file);
	
		CommonTokenStream commonToken = new CommonTokenStream(lexer);
		MicroParser parser = new MicroParser(commonToken);
		
		ANTLRErrorStrategy es = new CustomErrorStrategy();
  		parser.setErrorHandler(es);
		ParseTree tree = null;
		boolean done = true;
		try {
			tree = parser.program();
			//parser.tree.printWholeTree();

		} catch (ParseCancellationException e) {

		} catch (IllegalArgumentException e) {
			System.out.println("DECLARATION ERROR n");
		}

		ParseTreeWalker walker = new ParseTreeWalker();
		MicroIRListener listener = new MicroIRListener(parser.tree);
        // initiate walk of tree with listener
        walker.walk(listener, tree); 
		IRStorage storage = new IRStorage(parser.tree);
		storage.printIRlist();
		storage.printTinyList();
	}
}
