import org.antlr.v4.runtime.*;

class Micro {
	public static void main (String[] args) throws Exception {

		ANTLRFileStream file = new ANTLRFileStream(args[0]);
	
		Lexer lexer = new MicroLexer(file);
	
		Token token = lexer.nextToken();
		while (token.getType() != Lexer.EOF) {
		    switch (token.getType()) {
			case MicroLexer.KEYWORD:
                        System.out.println("Token Type: KEYWORD");
                        System.out.println("Value: " + token.getText());
                        break;
			case MicroLexer.IDENTIFIER:  
			System.out.println("Token Type: IDENTIFIER");
			System.out.println("Value: " + token.getText());
			break;
			case MicroLexer.OPERATOR:  
			System.out.println("Token Type: OPERATOR");
			System.out.println("Value: " + token.getText());	
			break;
			case MicroLexer.STRINGLITERAL: 
			System.out.println("Token Type: STRINGLITERAL");
			System.out.println("Value: " + token.getText());
			break;
			case MicroLexer.INTLITERAL: 
                        System.out.println("Token Type: INTLITERAL");
			System.out.println("Value: " + token.getText());
                        break;
			case MicroLexer.FLOATLITERAL: 
                        System.out.println("Token Type: FLOATLITERAL");
			System.out.println("Value: " + token.getText());
                        break;
		    }
		    token = lexer.nextToken();
		}
	
	}
}
