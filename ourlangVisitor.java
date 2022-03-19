// Generated from C:/Users/godle/Desktop/ourlang\ourlang.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ourlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ourlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ourlangParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ourlangParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ourlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ourlangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ourlangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ourlangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#ifSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSt(ourlangParser.IfStContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#forSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForSt(ourlangParser.ForStContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#whileSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSt(ourlangParser.WhileStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(ourlangParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExpr(ourlangParser.ExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinExpr(ourlangParser.MinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(ourlangParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bolExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBolExpr(ourlangParser.BolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(ourlangParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameExpr(ourlangParser.NameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExpr(ourlangParser.CmpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(ourlangParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ourlangParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(ourlangParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(ourlangParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ourlangParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourlangParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(ourlangParser.IndexesContext ctx);
}