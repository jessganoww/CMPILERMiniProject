import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

public class SimpleCalculator {
	private List<String> expressionList;
	public static int current_expression_index = 0;
	
	public SimpleCalculator() {
		this.expressionList = new ArrayList<String>();
		current_expression_index = 0;
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
		
		//Traverse all incoming expressions.
		for(int i = 0; i < this.expressionList.size(); i++) {
			current_expression_index = i;
			
			List<String> expTokenList = CalculatorAnalyzer.analyze(this.expressionList.get(i));
			if(CalculatorAnalyzer.willProceed())
				this.solveExpression(expTokenList);
			
			//restore defaults.
			CalculatorAnalyzer.reset();
		}
	}
	
	/**
	 * Evaluates a valid expression.
	 * @param expression - an expression 
	 */
	private void solveExpression(List<String> expTokenList) {
		Stack<String> postFixExpressionStack = this.convertToPostFix(expTokenList);
		
		if(postFixExpressionStack != null)
			this.evaluate(postFixExpressionStack);
		else CalculatorAnalyzer.showErrorParenthesis();
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
				if(operatorStack.size() != 0)
					operatorStack.pop();
				else {
					//Unbalanced parenthesis, dont continue.
					postFixStack = null;
					break; //get out of loop.
				}
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
		if(postFixStack != null)
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
		boolean followsDivisionRule = true;
		boolean followsOperatorCount = true;
		
		String value = "";
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		//check for missing operator.
		int operandCount = 0;
		int operatorCount = 0;
		String[] testExpression = this.expressionList.get(current_expression_index).split("[\" \"]+");
		
		for(int i = 0; i < testExpression.length; i++) {
			
			if(this.checkIfOperator(testExpression[i]) ) {
				operatorCount++;
			}
			
			else if(testExpression[i].matches("\\(?-?([0-9])+\\)?")) {
				operandCount++;
			}
		}
		
		if(operatorCount == operandCount-1) {
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
						          
						case "/": try {
								      result = this.divide(num2, num1);
								  }
						
								  //divided by zero
								  catch(Exception e) {
									  followsDivisionRule = false;
								  }
							       
						          break;
						          
						case "%": result = this.modulo(num2, num1); 
						          break;
						          
						default: System.out.println("HELP ME");
					}
					
					resultStack.push(result);
				}
			}
		}
		//does not follow operator count.
		else {
			followsOperatorCount = false;
		}
		
		if(followsDivisionRule && followsOperatorCount)
			this.printAnswer(resultStack.pop());
		else {
			
			if(!followsDivisionRule)
				CalculatorAnalyzer.showErrorDivision();
			
			if(!followsOperatorCount)
				CalculatorAnalyzer.showErrorOperatorCount();
		}
	}
	
	private void printAnswer(int answer) {
		System.out.println(
		    (current_expression_index + 1) + ") " + this.expressionList.get(current_expression_index) + " = " + answer
		);
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
}
