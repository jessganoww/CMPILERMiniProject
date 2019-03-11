import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class CalculatorAnalyzer {
	
	private static boolean proceed = true;
	
	//lexical + syntax analysis.
	public static List<String> analyze(String expression) {
		CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(expression));
		CommonTokenStream tokens  = new CommonTokenStream(lexer);
		CalculatorParser parser = new CalculatorParser(tokens);
		
		//set custom error messages.
		lexer.removeErrorListeners();
		lexer.addErrorListener(CalculatorErrorListener.INSTANCE);
		
		parser.removeErrorListeners();
		parser.addErrorListener(CalculatorErrorListener.INSTANCE);
		
		ParseTree tree = parser.startRule();
		
		List<String> expTokenString = new ArrayList<String>();
		
		for(Token t : tokens.getTokens()) {
			if(t.getType() != -1) { //make sure EOF is not included.
				expTokenString.add(t.getText());
			}
		}
		
		return expTokenString;
	}
	
	public static boolean willProceed() {
		return proceed;
	}
	
	public static void setIfProceed(boolean flag) {
		proceed = flag;
	}

	public static void reset() {
		// TODO Auto-generated method stub
		proceed = true;
	}
}
