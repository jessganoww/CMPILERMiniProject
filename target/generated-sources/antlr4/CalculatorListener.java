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
	 * Enter a parse tree produced by {@link CalculatorParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(@NotNull CalculatorParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(@NotNull CalculatorParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#mdmExpression}.
	 * @param ctx the parse tree
	 */
	void enterMdmExpression(@NotNull CalculatorParser.MdmExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#mdmExpression}.
	 * @param ctx the parse tree
	 */
	void exitMdmExpression(@NotNull CalculatorParser.MdmExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(@NotNull CalculatorParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(@NotNull CalculatorParser.PlusOrMinusContext ctx);
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
	 * Enter a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull CalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull CalculatorParser.TermContext ctx);
}