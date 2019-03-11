
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


public class CalculatorErrorListener extends BaseErrorListener{
	
	public static CalculatorErrorListener INSTANCE = new CalculatorErrorListener();
	
	public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, 
                            int charPositionInLine, 
                            String msg, 
                            RecognitionException re) {
		
		System.err.println("Hotdog");
		CalculatorAnalyzer.setIfProceed(false);
	}

}
