
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


public class CalculatorParserErrorListener extends BaseErrorListener{
	
	public static CalculatorParserErrorListener INSTANCE = new CalculatorParserErrorListener();
	
	public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, 
                            int charPositionInLine, 
                            String msg, 
                            RecognitionException re) {
		CalculatorAnalyzer.setIfProceed(false);
		CalculatorAnalyzer.showErrorParser(msg, line, charPositionInLine);
	}

}
