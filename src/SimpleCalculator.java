import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimpleCalculator {
	private CalculatorLexer calculatorLexer;
	private CalculatorParser calculatorParser;
	private List<String> expressionList;
	private int current_expression_index;
	private boolean isValid = false;
	
	public SimpleCalculator(CalculatorLexer lexicalAnalyzer,
			                CalculatorParser syntaxAnalyzer) {
		
		this.calculatorLexer = lexicalAnalyzer;
		this.calculatorParser = syntaxAnalyzer;
		
		this.expressionList = new ArrayList<String>();
		this.current_expression_index = 0;
	}
	
	/**
	 * Accepts a text file that contains multiple expressions.
	 * Each line is an expression.
	 */
	public void acceptInput(String filename) {
		List<String> expressionList = TextFileReader.readPerLine(filename);
		
		for(int i = 0; i < expressionList.size(); i++) {
			this.expressionList.add(expressionList.get(i));
		}
	}
	
	/**
	 *Flow of solution: LexicalAnalyzer -> SyntaxAnalyzer -> Evaluation.
	 */
	public void solve() {
		//Lexical
		//Syntax

		//Evaluation
		System.out.println("TESTING");
		List<List<String>> test = this.temp_tokenize();
		System.out.print("Equation: ");
		int expression_number = 2; // change 'index' to change equation provided by input.txt
		for(int i = 0; i < test.get(expression_number).size(); i++) {
			System.out.print(test.get(expression_number).get(i) + " ");
		}
		System.out.println();
		System.out.println("Java's answer: " + (( 10 + 5 ) * 12 - -15 / 4 + 2)); //change dis depending on the equation for evaluation.
		
		this.solveExpression(test.get(expression_number));
	}
	
	/**
	 * Evaluates a valid expression.
	 * @param expression - an expression 
	 */
	private void solveExpression(List<String> expTokenList) {
		Stack<String> postFixExpressionStack = this.convertToPostFix(expTokenList);
		this.evaluate(postFixExpressionStack);
	}
	
	/**
	 * Converts infix notation into a postfix notation via the shanting yard algorithm
	 */
	private Stack<String> convertToPostFix(List<String> expTokenList) {
		Stack<String> operandStack = new Stack<String>();
		Stack<String> operatorStack = new Stack<String>();
		Stack<String> postFixStack = new Stack<String>();
		
		
		int expTokenListCount = expTokenList.size();
		int index = 0;
		String value = "";
		
		while(index < expTokenListCount) {
			
			value = expTokenList.get(index);
			
			if(this.checkIfOperand(value)) {
				operandStack.push(value);
			}
			
			else if(this.checkIfOperator(value)) {
				
				while(operatorStack.size() > 0 && //must not be zero.
					  this.checkIfOperator(operatorStack.peek()) && //whatever we're comparing MUST be an operator.
					  this.precedence(value) <= this.precedence(operatorStack.peek())) {
					  operandStack.push(operatorStack.pop());
				}
				
				operatorStack.push(value);
			}
			
			else if(this.checkIfOpenParenthesis(value)) {
				operatorStack.push(value);
			}
			
			else if(this.checkIfCloseParenthesis(value)) {
				
				while(operatorStack.size() > 0 && !this.checkIfOpenParenthesis(operatorStack.peek())) {
					operandStack.push(operatorStack.pop());
				}
				
				//pop close parenthesis.
				operatorStack.pop();
			}
			
			/* Debugging. 
			if(operatorStack.size() != 0) {
				System.out.println("OperatorStack head: " + operatorStack.peek());
			}
			else System.out.println("OperatorStack head: empty");
			
			if(operandStack.size() != 0) {
				System.out.println("Operand head: " + operandStack.peek());
			}
			else {
				System.out.println("Operand Head: empty");
			}
			System.out.println();
			*/
			
			index++;
		}
		
		//push any leftover operators on operatorStack to operandStack
		while(operatorStack.size() > 0) {
			operandStack.push(operatorStack.pop());
		}
		
		//reverse the position so that the orientation for evaluation is fixed.
		while(operandStack.size() > 0) {
			postFixStack.push(operandStack.pop());
		}
		
		return postFixStack;
	}
	

	/**
	 * evaluates a postfix expression. 
	 * @param postFixExpression
	 */
	private void evaluate(Stack<String> postFixExpressionStack) {
		Stack<Integer> resultStack = new Stack<Integer>();
		
		String value = "";
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while(postFixExpressionStack.size() > 0) {
			
			if(this.checkIfOperand(postFixExpressionStack.peek())) {
				resultStack.push(this.convertStringToInt(postFixExpressionStack.pop()));
			}
			
			else {
				
				num1 = resultStack.pop();
				num2 = resultStack.pop();
				value = postFixExpressionStack.pop();
				//top of stack must be at left of operator
				//while next to top is at the right of operator
				switch(value) {
					case "+": result = this.add(num2, num1); 
							  break;
							  
					case "-": result = this.subtract(num2, num1); 
					          break;
					          
					case "*": result = this.multiply(num2, num1);  
					          break;
					          
					case "/": result = this.divide(num2, num1); 
					          break;
					          
					case "%": result = this.modulo(num2, num1); 
					          break;
					          
					default: System.out.println("HELP ME");
				}
				
				resultStack.push(result);
			}
		}
		
		System.out.println("Answer: " + resultStack.peek() );
		
	}
	
	
	
	
	public void printResults() {
		
		if(this.isValid) {
			
		}
		
	}
	

	
	private int precedence(String value) {
		
		if(value.matches("\\+|-"))
			return 0;
		
		else // *, / and % has higher priority.
			return 1;
	}
	
	private int add(int x, int y) {
		return x + y;
	}
	private int divide(int x, int y) {
		return x / y;
	}
	private int multiply(int x, int y) {
		return x * y;
	}
	private int subtract(int x, int y) {
		return x - y;
	}
	private int modulo(int x, int y) {
		return x % y;
	}
	
	private int convertStringToInt(String value) {
		return Integer.parseInt(value);
	}
	private boolean checkIfOperand(String value) {
		return value.matches("-?([0-9])+"); //assumes integer is valid (no leading zeroes)
	}
	private boolean checkIfOperator(String value) {
		return value.matches("\\+|-|\\*|/|%");
	}
	private boolean checkIfCloseParenthesis(String value) {
		return value.matches("\\)");
	}
	private boolean checkIfOpenParenthesis(String value) {
		return value.matches("\\(");
	}
	
	/**
	 * Temporary tokenizing. do not use on final.
	 * used for testing.
	 */
	private List<List<String>> temp_tokenize() {
		List<List<String>> temp_exp_list = new ArrayList<List<String>>();
		
		for(int i = 0; i < this.expressionList.size(); i++) {
			List<String> expression = new ArrayList<String>();
			String[] splitted_expression = this.expressionList.get(i).split(" ");
			
			for(int x = 0; x < splitted_expression.length; x++) {
				expression.add(splitted_expression[x]);
			}
			
			temp_exp_list.add(expression);
		}
		
		return temp_exp_list;
	}

}
