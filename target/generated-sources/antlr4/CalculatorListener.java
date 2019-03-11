// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multDivOrMod}.
	 * @param ctx the parse tree
	 */
	void enterMultDivOrMod(@NotNull CalculatorParser.MultDivOrModContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multDivOrMod}.
	 * @param ctx the parse tree
	 */
	void exitMultDivOrMod(@NotNull CalculatorParser.MultDivOrModContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operation2}.
	 * @param ctx the parse tree
	 */
	void enterOperation2(@NotNull CalculatorParser.Operation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operation2}.
	 * @param ctx the parse tree
	 */
	void exitOperation2(@NotNull CalculatorParser.Operation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operation1}.
	 * @param ctx the parse tree
	 */
	void enterOperation1(@NotNull CalculatorParser.Operation1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operation1}.
	 * @param ctx the parse tree
	 */
	void exitOperation1(@NotNull CalculatorParser.Operation1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(@NotNull CalculatorParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(@NotNull CalculatorParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#addOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterAddOrMinus(@NotNull CalculatorParser.AddOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitAddOrMinus(@NotNull CalculatorParser.AddOrMinusContext ctx);
}