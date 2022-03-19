// Generated from C:/Users/godle/Desktop/ourlang\ourlang.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ourlangParser}.
 */
public interface ourlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ourlangParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ourlangParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ourlangParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ourlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ourlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ourlangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ourlangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ourlangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ourlangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ourlangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ourlangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#ifSt}.
	 * @param ctx the parse tree
	 */
	void enterIfSt(ourlangParser.IfStContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#ifSt}.
	 * @param ctx the parse tree
	 */
	void exitIfSt(ourlangParser.IfStContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#forSt}.
	 * @param ctx the parse tree
	 */
	void enterForSt(ourlangParser.ForStContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#forSt}.
	 * @param ctx the parse tree
	 */
	void exitForSt(ourlangParser.ForStContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void enterWhileSt(ourlangParser.WhileStContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void exitWhileSt(ourlangParser.WhileStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(ourlangParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(ourlangParser.StrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprExpr(ourlangParser.ExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprExpr(ourlangParser.ExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinExpr(ourlangParser.MinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinExpr(ourlangParser.MinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(ourlangParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(ourlangParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bolExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBolExpr(ourlangParser.BolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bolExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBolExpr(ourlangParser.BolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(ourlangParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(ourlangParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNameExpr(ourlangParser.NameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNameExpr(ourlangParser.NameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(ourlangParser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(ourlangParser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(ourlangParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(ourlangParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ourlangParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ourlangParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ourlangParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ourlangParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ourlangParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ourlangParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ourlangParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ourlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ourlangParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourlangParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(ourlangParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourlangParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(ourlangParser.IndexesContext ctx);
}