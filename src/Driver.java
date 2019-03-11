import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator calculator = new SimpleCalculator(null, //lexical analyzer
				                                           null); //syntax analyzer
		
		//txt file must be on 'files' folder.
		calculator.acceptInput("input.txt");
		calculator.solve();
		//calculator.printResults();
		
		CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString("ano"));
	}

}
