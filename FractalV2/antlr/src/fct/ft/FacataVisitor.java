// Generated from src/fct/ft/Facata.g4 by ANTLR 4.7

package fct.ft;

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
	 * Visit a parse tree produced by the {@code AssignScaleStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignScaleStatement_(FacataParser.AssignScaleStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignTransStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTransStatement_(FacataParser.AssignTransStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignWidthStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignWidthStatement_(FacataParser.AssignWidthStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignHeightStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignHeightStatement_(FacataParser.AssignHeightStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignAutoStatement_}
	 * labeled alternative in {@link FacataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAutoStatement_(FacataParser.AssignAutoStatement_Context ctx);
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
	 * Visit a parse tree produced by the {@code PrimaryParenthesisedExpression_}
	 * labeled alternative in {@link FacataParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryParenthesisedExpression_(FacataParser.PrimaryParenthesisedExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PointExpression_}
	 * labeled alternative in {@link FacataParser#pointExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointExpression_(FacataParser.PointExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisedExpression_}
	 * labeled alternative in {@link FacataParser#parenthesisedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisedExpression_(FacataParser.ParenthesisedExpression_Context ctx);
}