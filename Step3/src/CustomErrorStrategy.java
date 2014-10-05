import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

class CustomErrorStrategy extends DefaultErrorStrategy {

	public void recover(Parser recognizer, 
		RecognitionException e) {


	}
	
	@Override
	public void reportError(Parser recognizer,
				RecognitionException e) {
		
	}
	public Token recoverInline(Parser recognizer)
		throws RecognitionException {
		 throw new ParseCancellationException(new InputMismatchException(recognizer));
	}

}
