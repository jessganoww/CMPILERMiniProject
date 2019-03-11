import java.util.ArrayList;

import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class CalculatorAnalyzer {
	
	private static boolean proceed = true;
	
	//lexical + syntax analysis.
	public static List<String> analyze(String expression) {
		CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(expression));
		CommonTokenStream tokens  = new CommonTokenStream(lexer);
		CalculatorParser parser = new CalculatorParser(tokens);
		
		//set custom error messages.
		lexer.removeErrorListeners();
		lexer.addErrorListener(CalculatorLexerErrorListener.INSTANCE);
		
		parser.removeErrorListeners();
		parser.addErrorListener(CalculatorParserErrorListener.INSTANCE);
		
		parser.startRule();
		
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
	
	public static void showErrorDivision() {
		int realLineNumber = 1+SimpleCalculator.current_expression_index;
		System.err.println("EVALUATION ERROR: cannot divide by zero at line: " + realLineNumber + ".");
	}
	
	public static void showErrorParenthesis() {
		int realLineNumber = 1+SimpleCalculator.current_expression_index;
		System.err.println("SYNTAX ERROR at line: " + realLineNumber + "| Missing pair of parenthesis.");
	}
	
	public static void showErrorLexer(String msg, int line, int charPositionInLine) {
		int realLineNumber = line+SimpleCalculator.current_expression_index;
		int realCharPos = charPositionInLine+1;
		System.err.println("LEXICAL ERROR at line: " + realLineNumber + 
	                       " character position: " + realCharPos + "|" + msg + ".");
	}
	
	public static void showErrorParser(String msg, int line, int charPositionInLine) {
		int realLineNumber = line+SimpleCalculator.current_expression_index;
		
		System.err.println("SYNTAX ERROR at Line: " + realLineNumber + " character position: " + charPositionInLine + "| " + msg  + ".");
	}

	public static void showErrorOperatorCount() {
		int realLineNumber = 1+SimpleCalculator.current_expression_index;
		System.err.println("SYNTAX ERROR at line: " + realLineNumber + "| Invalid arithmetic expression with lacking operator/s.");
		
	}
}
