import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
class Micro {
	public static void main (String[] args) throws Exception {

		ANTLRFileStream file = new ANTLRFileStream(args[0]);
	
		Lexer lexer = new MicroLexer(file);
	
		CommonTokenStream commonToken = new CommonTokenStream(lexer);
		MicroParser parser = new MicroParser(commonToken);
		
		ANTLRErrorStrategy es = new CustomErrorStrategy();
  		parser.setErrorHandler(es);

		boolean done = true;
		try {
			parser.program();
			parser.tree.printWholeTree();

		} catch (ParseCancellationException e) {

		} catch (IllegalArgumentException e) {
			System.out.println("DECLARATION ERROR n");
		}
	}
}
