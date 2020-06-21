// Generated from E:\FinalProject (2)\temp\LULU2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LULU2Parser}.
 */
public interface LULU2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LULU2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LULU2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFt_dcl(LULU2Parser.Ft_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFt_dcl(LULU2Parser.Ft_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dcl(LULU2Parser.Func_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dcl(LULU2Parser.Func_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LULU2Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LULU2Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#args_var}.
	 * @param ctx the parse tree
	 */
	void enterArgs_var(LULU2Parser.Args_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#args_var}.
	 * @param ctx the parse tree
	 */
	void exitArgs_var(LULU2Parser.Args_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LULU2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LULU2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void enterType_dcl(LULU2Parser.Type_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void exitType_dcl(LULU2Parser.Type_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(LULU2Parser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(LULU2Parser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#var_val}.
	 * @param ctx the parse tree
	 */
	void enterVar_val(LULU2Parser.Var_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#var_val}.
	 * @param ctx the parse tree
	 */
	void exitVar_val(LULU2Parser.Var_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LULU2Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LULU2Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#ft_def}.
	 * @param ctx the parse tree
	 */
	void enterFt_def(LULU2Parser.Ft_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#ft_def}.
	 * @param ctx the parse tree
	 */
	void exitFt_def(LULU2Parser.Ft_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(LULU2Parser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(LULU2Parser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(LULU2Parser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(LULU2Parser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(LULU2Parser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(LULU2Parser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(LULU2Parser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(LULU2Parser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LULU2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LULU2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LULU2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LULU2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LULU2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LULU2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LULU2Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LULU2Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(LULU2Parser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(LULU2Parser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LULU2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LULU2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(LULU2Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(LULU2Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LULU2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LULU2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(LULU2Parser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(LULU2Parser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(LULU2Parser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(LULU2Parser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#goto_}.
	 * @param ctx the parse tree
	 */
	void enterGoto_(LULU2Parser.Goto_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#goto_}.
	 * @param ctx the parse tree
	 */
	void exitGoto_(LULU2Parser.Goto_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LULU2Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LULU2Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#const_val}.
	 * @param ctx the parse tree
	 */
	void enterConst_val(LULU2Parser.Const_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#const_val}.
	 * @param ctx the parse tree
	 */
	void exitConst_val(LULU2Parser.Const_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link LULU2Parser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(LULU2Parser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LULU2Parser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(LULU2Parser.Unary_opContext ctx);
}