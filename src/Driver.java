import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator calculator = new SimpleCalculator();
		
		//txt file must be on 'files' folder.
		calculator.acceptInput("input.txt");
		calculator.solve();	


	}

}
