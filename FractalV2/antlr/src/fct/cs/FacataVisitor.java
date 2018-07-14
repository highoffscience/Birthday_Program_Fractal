// Generated from src/fct/cs/Facata.g4 by ANTLR 4.7

package fct.cs;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FacataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FacataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Unit_}
	 * labeled alternative in {@link FacataParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_(FacataParser.Unit_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleStatement_}
	 * labeled alternative in {@link FacataParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement_(FacataParser.SingleStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ListStatement_}
	 * labeled alternative in {@link FacataParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStatement_(FacataParser.ListStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement_(FacataParser.AssignmentStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement_(FacataParser.ReturnStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(FacataParser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression_}
	 * labeled alternative in {@link FacataParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_(FacataParser.AdditiveExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression_}
	 * labeled alternative in {@link FacataParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression_(FacataParser.AdditionExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpression_}
	 * labeled alternative in {@link FacataParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression_(FacataParser.MultiplicationExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression_}
	 * labeled alternative in {@link FacataParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_(FacataParser.MultiplicativeExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_(FacataParser.Integer_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Decimal_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_(FacataParser.Decimal_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Reference_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_(FacataParser.Reference_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Color_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_(FacataParser.Color_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_(FacataParser.FunctionCall_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryParenthesisedExpression_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryParenthesisedExpression_(FacataParser.PrimaryParenthesisedExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryPixelExpression_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryPixelExpression_(FacataParser.PrimaryPixelExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin_}
	 * labeled alternative in {@link FacataParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin_(FacataParser.Sin_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Cos_}
	 * labeled alternative in {@link FacataParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos_(FacataParser.Cos_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Tan_}
	 * labeled alternative in {@link FacataParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan_(FacataParser.Tan_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PixelExpression_}
	 * labeled alternative in {@link FacataParser#pixelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPixelExpression_(FacataParser.PixelExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisedExpression_}
	 * labeled alternative in {@link FacataParser#parenthesisedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisedExpression_(FacataParser.ParenthesisedExpression_Context ctx);
}