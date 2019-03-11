import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CalculatorLexerErrorListener extends BaseErrorListener {
	
	public static CalculatorLexerErrorListener INSTANCE = new CalculatorLexerErrorListener();
	
	public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, 
                            int charPositionInLine, 
                            String msg, 
                            RecognitionException re) {
		CalculatorAnalyzer.setIfProceed(false);
		CalculatorAnalyzer.showErrorLexer(msg, line, charPositionInLine);
	}
}
