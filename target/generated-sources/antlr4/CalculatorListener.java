// Generated from Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(CalculatorParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(CalculatorParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operation1}.
	 * @param ctx the parse tree
	 */
	void enterOperation1(CalculatorParser.Operation1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operation1}.
	 * @param ctx the parse tree
	 */
	void exitOperation1(CalculatorParser.Operation1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operation2}.
	 * @param ctx the parse tree
	 */
	void enterOperation2(CalculatorParser.Operation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operation2}.
	 * @param ctx the parse tree
	 */
	void exitOperation2(CalculatorParser.Operation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#addOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterAddOrMinus(CalculatorParser.AddOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitAddOrMinus(CalculatorParser.AddOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multDivOrMod}.
	 * @param ctx the parse tree
	 */
	void enterMultDivOrMod(CalculatorParser.MultDivOrModContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multDivOrMod}.
	 * @param ctx the parse tree
	 */
	void exitMultDivOrMod(CalculatorParser.MultDivOrModContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
}