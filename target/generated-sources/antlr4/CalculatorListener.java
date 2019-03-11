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
	 * Enter a parse tree produced by {@link CalculatorParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(CalculatorParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(CalculatorParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#mdmExpression}.
	 * @param ctx the parse tree
	 */
	void enterMdmExpression(CalculatorParser.MdmExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#mdmExpression}.
	 * @param ctx the parse tree
	 */
	void exitMdmExpression(CalculatorParser.MdmExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(CalculatorParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(CalculatorParser.PlusOrMinusContext ctx);
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
}