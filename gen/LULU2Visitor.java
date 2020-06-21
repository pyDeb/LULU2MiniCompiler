// Generated from E:/FinalProject (2)/temp\LULU2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LULU2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LULU2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LULU2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#ft_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_dcl(LULU2Parser.Ft_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#func_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dcl(LULU2Parser.Func_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LULU2Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#args_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_var(LULU2Parser.Args_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LULU2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#type_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dcl(LULU2Parser.Type_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(LULU2Parser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#var_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_val(LULU2Parser.Var_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LULU2Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#ft_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_def(LULU2Parser.Ft_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(LULU2Parser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(LULU2Parser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(LULU2Parser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#fun_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_def(LULU2Parser.Fun_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LULU2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LULU2Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LULU2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LULU2Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(LULU2Parser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LULU2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(LULU2Parser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LULU2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(LULU2Parser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(LULU2Parser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#goto_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_(LULU2Parser.Goto_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LULU2Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#const_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_val(LULU2Parser.Const_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link LULU2Parser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(LULU2Parser.Unary_opContext ctx);
}