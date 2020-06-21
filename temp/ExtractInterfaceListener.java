import com.sun.org.apache.regexp.internal.RE;
import org.antlr.runtime.Lexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;


public class ExtractInterfaceListener extends LULU2BaseListener
{
	LULU2Parser parser;
	doublyTree dt;
	public ExtractInterfaceListener(LULU2Parser parser)
	{
		this.parser = parser;
	}

	@Override public void enterProgram(LULU2Parser.ProgramContext ctx)
	{
		dt = new doublyTree();
	}

	@Override public void exitProgram(LULU2Parser.ProgramContext ctx)
	{
		int funcCount = 0;
		Vector<doublyTree.nodeSymbolTable> headChild = dt.head.children;
		for(int i = 0;i < headChild.size();i++)
		{
			if(headChild.get(i).SymbolTableName.length() > 9)
			{
				if(headChild.get(i).SymbolTableName.contains("_function"))
					funcCount++;
			}
		}
		dt.head.size += funcCount*4;
		//print the all nodes of tree
		dt.PrintTree(dt.head,-1);
		//pop all remaining items in previousNodes stack
		// check all fucntion prototypes has been defined
	}

	@Override public void enterFt_dcl(LULU2Parser.Ft_dclContext ctx)
	{

		//Do nothing
	}

	@Override public void exitFt_dcl(LULU2Parser.Ft_dclContext ctx)
	{
		//Do nothing
	}

	public String MakeArgs_var(LULU2Parser.Args_varContext ctx)
	{
		String AV = "";
		if(ctx.args_var() != null)
			AV = MakeArgs_var(ctx.args_var());
		String ctxStr;
		int ctxSize = ctx.getText().split(",").length;
		if(ctxSize > 1)
			ctxStr = ctx.getText().split(",")[1];
		else
			ctxStr = ctx.getText().split(",")[0];
		String Type = ctx.type().getText();
		String temp[] = ctxStr.split(Type);
		if(temp.length > 1)
		AV += Type+" "+temp[1];
		if(ctxSize == 1)
			AV += ',';
		return AV;
	}
	@Override public void enterFunc_dcl(LULU2Parser.Func_dclContext ctx)
	{
		if(ctx.ID().getText().length()>6000)
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : ID length can not be greater than 6000 character");
		}
		String outArgs;
		try {

			outArgs = ctx.args(0).getText();
		}
		catch (Exception e)
		{
			outArgs = null;
		}
		String inpArgs;
		try {

			inpArgs = ctx.args(1).getText();
		}
		catch (Exception e)
		{
			inpArgs = null;
		}
		String name;
		try {

			name = ctx.ID().getText();
		}
		catch (Exception e)
		{
			name = null;
		}
		String args_var;
		try {
			args_var = ctx.args_var().getText();
		}
		catch (Exception e)
		{
			args_var = null;
		}

		String finalResult = "";
		if (outArgs != null)
		{
			finalResult +=  (outArgs + "$");
		}
		else
			finalResult += "$";

		finalResult += (name + "~");

		if(inpArgs != null)
		{
		finalResult +=  inpArgs;
		}

		if (args_var != null)
		{
			String AV = "";
			AV = MakeArgs_var(ctx.args_var());

			String Sav[] = AV.split(",");
			String Result = "";
			for(int i = 0;i < Sav.length;i++) {
				String St []= Sav[i].split(" ");
				Result = Result + St[0];
				if(St[1].length() > 1) {
					if(St[1].indexOf("[") > -1)
						Result = Result + St[1].substring(St[1].indexOf("["), St[1].length()); // apend for Array
					else
						Result = Result + St[1].substring(1, St[1].length());
				}
				Result += ",";
			}
			Result = Result.substring(0,Result.length()-1);
			AV = Result;

			finalResult += AV;
		}
		if(!dt.head.ContainKey(finalResult))
			dt.head.setHM(finalResult, "function"); // function prototype is global and it should be put in head
		else
		{
			String RS = "(" + finalResult + ")";
			RS = RS.replace("$",") = ") ;
			RS = RS.replace('~','(');
			System.out.println("Error on Line " + ctx.getStart().getLine() + " : " + "The function \"" + RS + "\" is Decleared before");
		}

	}
	@Override public void exitFunc_dcl(LULU2Parser.Func_dclContext ctx) 
	{ 
		//Do nothing we guess
	}
	
	@Override public void enterArgs(LULU2Parser.ArgsContext ctx) 
	{
		validTypeDefinition(ctx.type().getText(),ctx.start.getLine());
	}
	
	@Override public void exitArgs(LULU2Parser.ArgsContext ctx) 
	{ 
		// Do nothing we guess
	}
	
	@Override public void enterArgs_var(LULU2Parser.Args_varContext ctx)
	{
		if(ctx.ID().getText().length()>6000)
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : ID length can not be greater than 6000 character");
		}
		validTypeDefinition(ctx.type().getText(),ctx.start.getLine());
		if(checkWhetherVariableNameIsSameWithClassNameOrNo(ctx.ID().getText()))
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : Name " + ctx.ID().getText() + " was defined as a class name");
			return;
		}
		if(checkWhetherVariableNameIsSameWithFunctionNameOrNo(ctx.ID().getText()))
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : Name " + ctx.ID().getText() + " was defined as a function name");
			return;
		}
	}
	
	@Override public void exitArgs_var(LULU2Parser.Args_varContext ctx) 
	{ 
		//Again do nothing as we guess
	}
	

	@Override public void enterType(LULU2Parser.TypeContext ctx) 
	{ 
		//Again do nothing as we guess
	}
	
	@Override public void exitType(LULU2Parser.TypeContext ctx) 
	{ 
		//Again do nothing as we guess
	}

	public boolean checkWhetherVariableNameIsSameWithClassNameOrNo(String variableName)
	{
		for(int i = 0 ; i < dt.head.children.size(); i++) {
			if (dt.head.children.elementAt(i).SymbolTableName.equals(variableName + "_class"))
				return true;
		}
		return false;
	}

	public boolean checkWhetherVariableNameIsSameWithFunctionNameOrNo(String variableName)
	{
		for(int i = 0 ; i < dt.head.children.size(); i++)
		{
			if(dt.head.children.elementAt(i).SymbolTableName.equals(variableName + "_function"))
				return true;
		}
		return false;
	}

	public int type_dcl_number = 0;
	@Override public void enterType_dcl(LULU2Parser.Type_dclContext ctx) 
	{
		if(ctx.ID().getText().length()>6000)
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : ID length can not be greater than 6000 character");
		}
		if(checkWhetherVariableNameIsSameWithClassNameOrNo(ctx.ID().getText()))
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : Name " + ctx.ID().getText() + " was defined as a class name");
			return;
		}
		if(checkWhetherVariableNameIsSameWithFunctionNameOrNo(ctx.ID().getText()))
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : Name " + ctx.ID().getText() + " was defined as a function name");
			return;
		}
		dt.head.setHM(""+type_dcl_number, ctx.ID().getText());
		type_dcl_number++;
	}
	
	@Override public void exitType_dcl(LULU2Parser.Type_dclContext ctx) 
	{ 
		////Again do nothing as we guess	
	}

	String AccessModifier;
	@Override public void enterVar_def(LULU2Parser.Var_defContext ctx) 
	{
		validTypeDefinition(ctx.type().getText(), ctx.start.getLine());

		String Type = "";
		String Name = "";
		if(ctx.getText().split(ctx.type().getText())[0].equals("const"))
			Type += "const_";
		Type += ctx.type().getText();
		List<LULU2Parser.Var_valContext> var_val = ctx.var_val();
		for(int j = 0;j < var_val.size();j++)
		{
		int ArrayDimensionsCount = ctx.var_val(j).getTokens(LULU2Parser.INT_CONST).size();
		String var_val_Type = Type;
		if(ArrayDimensionsCount != 0) {
			var_val_Type += "_";
			List<TerminalNode> D = ctx.var_val(j).getTokens(LULU2Parser.INT_CONST);
			var_val_Type = var_val_Type + "Array~";
			for (int i = 0; i < D.size(); i++)
				var_val_Type = var_val_Type + D.get(i).getText() + ",";
			var_val_Type = var_val_Type.substring(0, var_val_Type.length() - 1);
		}
		Name = ctx.var_val(j).ID(0).getText();
		if(dt.currentNode.SymbolTableName.contains("_class"))
			var_val_Type = AccessModifier + var_val_Type;
		/////// add to symbol table /////////
		if(dt.currentNode.ContainKey(Name))
		{
			System.out.println("Error on Line " + ctx.start.getLine() + " : Name \"" + Name +"\" was declear in this scope");
		}
		else {
			if(checkWhetherVariableNameIsSameWithClassNameOrNo(Name))
			{
				System.out.println("Error on line "+ctx.start.getLine()+" : Name " + Name + " was defined as a class name");
				return;
			}
			if(checkWhetherVariableNameIsSameWithFunctionNameOrNo(Name))
			{
				System.out.println("Error on line "+ctx.start.getLine()+" : Name " + Name + " was defined as a function name");
				return;
			}
			dt.currentNode.setHM(Name, var_val_Type);
		}
		}
	}
	
	@Override public void exitVar_def(LULU2Parser.Var_defContext ctx) 
	{ 
		// DO nothing
	}
	
	@Override public void enterVar_val(LULU2Parser.Var_valContext ctx) 
	{
		if(ctx.ID(0).getText().length()>6000)
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : ID length can not be greater than 6000 character");
		}
		if(ctx.getText().contains("allocate"))
		{
			if(!ctx.ID(0).getText().equals(ctx.ID(1).getText()))
				System.out.println("Error on line " + ctx.start.getLine() + " : Allocated ID and declared ID are not match");
		}
	}
	
	@Override public void exitVar_val(LULU2Parser.Var_valContext ctx) 
	{ 
		// Do nothing
	}

	
	@Override public void enterList(LULU2Parser.ListContext ctx) 
	{ 
		// skip it, we'll come back to you :D
	}
	
	@Override public void exitList(LULU2Parser.ListContext ctx) 
	{ 
		// skip it, we'll come back to you :D
	}

	@Override public void enterFt_def(LULU2Parser.Ft_defContext ctx) 
	{
		// DO NOTHING
		//dt.addNext(dt.head);
		//dt.currentNode.SymbolTableName = ""
	}
	
	@Override public void exitFt_def(LULU2Parser.Ft_defContext ctx) 
	{
		// DO NOTHING
		//dt.returnToPreviousNode();
	}

	@Override public void enterType_def(LULU2Parser.Type_defContext ctx) 
	{
		if(ctx.ID(0).getText().length()>6000)
		{
			System.out.println("Error on line "+ctx.start.getLine()+" : ID length can not be greater than 6000 character");
		}
		Vector<doublyTree.nodeSymbolTable> headChild = dt.head.children;
		for(int i = 0;i < headChild.size();i++)
		{
			if(headChild.get(i).SymbolTableName.equals(ctx.ID(0).getText() + "_class"))
			{
				System.out.println("Error on line " + ctx.start.getLine() +" : Type " + ctx.ID(0).getText() + " was being defined");
				return ;
			}
		}

			dt.addNext(dt.head);
			dt.currentNode.SymbolTableName = ctx.ID(0).getText() + "_class";
			List<TerminalNode> IdList = ctx.ID();
			for (int i = 1; i < IdList.size(); i++) //inheritance
			{
				String Type = "BaseClass";
				String BaseClassName = IdList.get(i).getText();
				dt.currentNode.setHM(BaseClassName, Type);
			}

	}
	
	@Override public void exitType_def(LULU2Parser.Type_defContext ctx)
	{
		dt.currentNode.size += dt.currentNode.children.size()*4;
		dt.returnToPreviousNode();
	}

	@Override public void enterComponent(LULU2Parser.ComponentContext ctx)
	{
		if(ctx.access_modifier() != null)
		{
			AccessModifier = ctx.access_modifier().getText()+"@";
		}
		else
			AccessModifier = "";
	}

	@Override public void exitComponent(LULU2Parser.ComponentContext ctx)
	{
		AccessModifier = "";
	}

	@Override public void enterAccess_modifier(LULU2Parser.Access_modifierContext ctx)
	{
		// do nothing
	}

	@Override public void exitAccess_modifier(LULU2Parser.Access_modifierContext ctx)
	{
		// do nothing
	}
	boolean IsFun_def;
	@Override public void enterFun_def(LULU2Parser.Fun_defContext ctx)
	{
		IsFun_def = true;
		if(dt.currentNode.SymbolTableName.contains("_class"))
			dt.addNext(dt.currentNode);
		else
			dt.addNext(dt.head);
		dt.currentNode.SymbolTableName = ctx.ID().getText()+"_function";
		String inpArg;
		String outpArg;
		String Name = "$"+ctx.ID().getText()+"~";
		try {
			inpArg = MakeArgs_var(ctx.args_var(1));
		}
		catch (Exception e)
		{
			inpArg = "";
		}
		try {
			outpArg = MakeArgs_var(ctx.args_var(0));
		}
		catch (Exception e)
		{
			outpArg = "";
		}
		if(!inpArg.equals(""))
		{
			String temp[] = inpArg.split(",");
			for(int i = 0;i < temp.length ;i++)
			{
				String Stemp[] = temp[i].split(" ");
				int ArrayD = Stemp[1].split("]").length;
				if(ArrayD > 1) {
					Stemp[0] = Stemp[0] + "_Array~";
					Stemp[1] = Stemp[1].split("]")[0].substring(0,Stemp[1].split("]")[0].length()-1);
					for (int h = 0; h < ArrayD ; h++)
						Stemp[0] += "n,";
					Stemp[0] = Stemp[0].substring(0, Stemp[0].length() - 1);
				}
				if(dt.currentNode.ContainKey(Stemp[1]))
					System.out.println("Error on line " + ctx.start.getLine() + " : arg " + Stemp[1] + " was being decleared");
				else
					dt.currentNode.setHM(Stemp[1],Stemp[0]);
			}
		}
		if(!outpArg.equals(""))
		{
			String temp[] = outpArg.split(",");
			for(int i = 0;i < temp.length;i++)
			{
				String Stemp[] = temp[i].split(" ");
				int ArrayD = Stemp[1].split("]").length;
				if(ArrayD > 1) {
					Stemp[0] = Stemp[0] + "_Array~";
					Stemp[1] = Stemp[1].split("]")[0].substring(0,Stemp[1].split("]")[0].length()-1);
					for (int h = 0; h < ArrayD; h++)
						Stemp[1] += "n,";
					Stemp[0] = Stemp[0].substring(0, Stemp[0].length() - 1);
				}
				if(dt.currentNode.ContainKey(Stemp[1]))
					System.out.println("Error on line " + ctx.start.getLine() + " : arg " + Stemp[1] + " was being decleared");
				else
					dt.currentNode.setHM(Stemp[1],Stemp[0] + ".");
			}
		}
		if(!inpArg.equals("")) {
			String SinpArg[] = inpArg.split(",");
			String Result = "";
			for (int i = 0; i < SinpArg.length; i++) {
				String St[] = SinpArg[i].split(" ");
				Result += St[0];
				if (St[1].length() > 1) {
					if(St[1].indexOf("[") > -1)
						Result = Result + St[1].substring(St[1].indexOf("["), St[1].length()); // apend for Array
					else
						Result = Result + St[1].substring(1, St[1].length());
				}
				Result += ",";
			}
			Result = Result.substring(0, Result.length() - 1);
			inpArg = Result;
		}
		if(!outpArg.equals("")) {
			String SoutpArg[] = outpArg.split(",");
			String Result = "";
			for (int i = 0; i < SoutpArg.length; i++) {
				String St[] = SoutpArg[i].split(" ");
				Result += St[0];
				if (St[1].length() > 1)
				{
					if(St[1].indexOf("[") > -1)
						Result = Result + St[1].substring(St[1].indexOf("["), St[1].length()); // apend for Array
					else
						Result = Result + St[1].substring(1, St[1].length());
				}
				Result += ",";
			}

			Result = Result.substring(0, Result.length() - 1);
			outpArg = Result;
		}
		String OnlyName = Name;
		Name = outpArg + Name + inpArg;
		if(!AccessModifier.equals("")) {
			if(dt.currentNode.ContainKey(Name))
				System.out.println("Error on line " + ctx.start.getLine() + " : Funciton " + OnlyName + " with same input and output was being decleared in this type");
			else
				dt.currentNode.setHM(Name, AccessModifier + "_function");
		}
		else {
			Vector<doublyTree.nodeSymbolTable> headChild = dt.head.children;
			for(int i = 0;i < headChild.size();i++)
			{
				if(headChild.get(i).ContainKey(Name))
				{
					System.out.println("Error on line " + ctx.start.getLine() + " : Function " + OnlyName + "with same input and output was being decleared");
					return ;
				}
			}
			dt.currentNode.setHM(Name, "function");
		}

		if(ctx.block().stmt() != null) {
			List<LULU2Parser.StmtContext> stmCxt = ctx.block().stmt();
			for (int i = 0; i < stmCxt.size();i++) {
				if (stmCxt.get(i).getText().equals("break;"))
					System.out.println("Error on line " + stmCxt.get(i).start.getLine() + " : break not allowed here");
				else if (stmCxt.get(i).getText().equals("continue;"))
					System.out.println("Error on line " + stmCxt.get(i).start.getLine() + " : continue not allowed here");
			}
		}
	}
	public void checkWhetherAllReturnArgsHaveAssignedOrNo(String functionName)
	{
		doublyTree.nodeSymbolTable dtnst = dt.currentNode;
		for(Map.Entry<String, String> entry : dtnst.hm.entrySet())
		{
			if(entry.getValue().contains("."))
				System.out.println("Variable named " + entry.getKey() + " in function " + functionName + " is not assigned before returning");
		}
	}
	@Override public void exitFun_def(LULU2Parser.Fun_defContext ctx)
	{
		checkWhetherAllReturnArgsHaveAssignedOrNo(ctx.ID().getText());

		dt.returnToPreviousNode();
		IsFun_def = false;
	}
	///////////////////////////////////////////////////////////////////////////////////
	@Override public void enterBlock(LULU2Parser.BlockContext ctx)
	{
		if(IsFun_def)
			return;
		dt.addNext(dt.currentNode);
		if(IsCond_stmt)
		{
			if(ctx.stmt() != null) {
				List<LULU2Parser.StmtContext> stmCxt = ctx.stmt();
				for (int i = 0; i < stmCxt.size();i++) {
					if (stmCxt.get(i).getText().equals("break;"))
						System.out.println("Error on line " + stmCxt.get(i).start.getLine() + " : break not allowed here");
					else if (stmCxt.get(i).getText().equals("continue;"))
						System.out.println("Error on line " + stmCxt.get(i).start.getLine() + " : continue not allowed here");
				}
			}
			dt.currentNode.SymbolTableName = "Cond_stmt";
			return;
		}
		if(IsLoop_stmt)
		{
			dt.currentNode.SymbolTableName = "Loop_stmt";
			return;
		}

	}

	@Override public void exitBlock(LULU2Parser.BlockContext ctx)
	{
		if(!IsFun_def)
			dt.returnToPreviousNode();
	}
	public boolean checkWhetherDistructForAnArrayIsValidOrNoHeheHe(String context, String variableName)
	{
		int numberOfBracketsInCode = context.split("]").length-1;
		doublyTree.nodeSymbolTable temp = dt.currentNode;
		while(temp != null)
		{
			if(temp.hm.containsKey(variableName))
			{
				int numberOfBracketsInSymbolTable = temp.hm.get(variableName).split("~")[1].split(",").length;// returns number of brackets! easy peasy
				if (numberOfBracketsInCode == numberOfBracketsInSymbolTable)
					return true;
				else return false;

			}

			temp = temp.parent;
		}
		return false;
	}
	@Override public void enterStmt(LULU2Parser.StmtContext ctx)
	{
		if(ctx.getText().contains("destruct")) {
			if(!checkWhetherDistructForAnArrayIsValidOrNoHeheHe(ctx.getText(),ctx.ID().getText()))
				System.out.println("Error on line "+ctx.start.getLine()+" : Dimension of array you want to destruct is incorrect!");
		}
	}



	@Override public void exitStmt(LULU2Parser.StmtContext ctx) { }

	public void validTypeDefinition(String type, int lineNumber)
	{
		String temp;
		if(type.contains("const"))
			temp = type.split("_")[1];
		else
			temp = type.split("_")[0];
		if (temp.equals("int")) return;
		else if (temp.equals("bool")) return;
		else if (temp.equals("long") ) return;
		else if (temp.equals("float")) return;
		else if (temp.equals("double")) return;
		else if (temp.equals("char")) return;
		else if (temp.equals("string")) return;
		else
		{
			for (int i = 0; i < dt.head.children.size(); i++) {
				if (dt.head.children.elementAt(i).SymbolTableName.equals(temp + "_class"))
					return;
			}
			for(int i = 0 ; dt.head.hm.containsKey(i); i++)
				if (dt.head.getHM(i+"").equals(temp))
					return;
		}
		System.out.println("Error at line " + lineNumber + " : Type " + temp + " is undefined!");
	}
	@Override public void enterAssign(LULU2Parser.AssignContext ctx)
	{


		List<LULU2Parser.VarContext> varList = ctx.var();
		for(int i = 0;i < varList.size();i++)
		{
			if(varList.get(i) != null) {
				if(dt.currentNode.getHM(varList.get(i).ref(0).ID().getText()).contains("."))
				{
					String tempNAME = varList.get(i).ref(0).ID().getText();
					dt.currentNode.setHM(tempNAME,dt.currentNode.getHM(tempNAME).substring(0,dt.currentNode.getHM(tempNAME).length()-1));
				}
				dt.constChecking(varList.get(i).getText(), ctx.start.getLine());
			}
		}
		/*
		if(ctx.func_call() != null) {
			String functionName = ctx.func_call().ID().getText();
			if (ctx.var() != null) {

			} else {
				String Input_parameters ="";
				String StempPara = "";
				List<LULU2Parser.VarContext> varCtx = ctx.var();
				for(int i = 0;i < varCtx.size();i++)
				{

				}
				for(int i = 0 ; i < dt.head.children.size(); i++)
				{
					if (dt.head.children.elementAt(i).SymbolTableName.equals(functionName + "_function"))
					{
						for(Map.Entry<String, String> entry : dt.head.children.elementAt(i).hm.entrySet())
						{
							if(entry.getKey().contains("$" + functionName + "~"  )
								return;
						}
					}
				}
				System.out.println("I gave up :( Error at line " + ctx.start.getLine() + " : Function " + functionName + " was not declared" );
			}
		}*/
	}

	@Override public void exitAssign(LULU2Parser.AssignContext ctx) { }

	@Override public void enterVar(LULU2Parser.VarContext ctx)
	{

	}

	@Override public void exitVar(LULU2Parser.VarContext ctx) { }

	@Override public void enterRef(LULU2Parser.RefContext ctx) { }

	@Override public void exitRef(LULU2Parser.RefContext ctx) { }


	/*public String typeChecking(LULU2Parser.ExprContext ctx)
	{
		if(ctx.expr(0) != null && ctx.expr(1) == null)
		{
			return typeChecking(ctx.expr(0));
		}
		else if(ctx.expr(0) != null && ctx.expr(1) != null)
		{
			String op;
			op = ctx.getText().substring(0,ctx.expr(0).getText().length());
			op = op.substring(op.length() - ctx.expr(1).getText().length(),op.length());
			if(op.contains("*") || op.contains("+") || op.contains("/") || op.contains("-") || op.contains("%"))
			{
				String firstType = typeChecking(ctx.expr(0));
				String secondType = typeChecking(ctx.expr(1));
				if (firstType.equals("nil") || secondType.equals("nil"))
				{
					if(!firstType.equals("nil")) return firstType;
					else return secondType;
				}
				else if ((firstType.equals("string") || secondType.equals("string")) && (!firstType.equals("string") || !secondType.equals("string")))
					return "error";
				else if((firstType.equals("double") || secondType.equals("double")) && (!firstType.equals("double") || !firstType.equals("double")))
					return "error";
				else if (firstType.equals("error") || secondType.equals("error")) return "error";
				else if (firstType.equals("double") && secondType.equals("double")) return "double";
				else if (firstType.equals("bool") || secondType.equals("bool"))
				{
					if (!firstType.equals("bool")) return firstType;
					else return secondType;
				}
				else if (firstType.equals("char") || secondType.equals("char"))
				{
					if (!firstType.equals("char")) return firstType;
					else return secondType;
				}
				else
					return "long";


			}
			else if(op.contains("!=") ||op.contains("==") ||op.contains("<=") ||op.contains(">=") ||op.contains(">") ||op.contains("<") ||op.contains("||")||op.contains("&&"))
			{
				String firstType = typeChecking(ctx.expr(0));
				String secondType = typeChecking(ctx.expr(1));
	//			if(firstType.equals("int") && secondType.equals("string"))
				if (firstType.equals("nil") || secondType.equals("nil"))
					return "nil";
				else if ((firstType.equals("string") || secondType.equals("string")) && (!firstType.equals("string") || !secondType.equals("string")))
					return "error";
				else if((firstType.equals("double") || secondType.equals("double")) && (!firstType.equals("double") || !firstType.equals("double")))
					return "error";
				else if (firstType.equals("error") || secondType.equals("error")) return "error";
				else return "bool";
			}
			else //bit operand
			{
				String firstType = typeChecking(ctx.expr(0));
				String secondType = typeChecking(ctx.expr(1));
				if ((!firstType.equals("string") || !firstType.equals("double")) && (!secondType.equals("string")) || !secondType.equals("double"))
					return "long";
				else return "error";
			}
		}
		else
		{
			if(ctx.const_val() != null)
			{
				return ;
			}
			if(ctx.func_call() != null)
			{
				return;
			}
			if(ctx.getText().equals("nil"))
			{
				return "true";
			}

		}
	}*/

	@Override public void enterExpr(LULU2Parser.ExprContext ctx) { }

	@Override public void exitExpr(LULU2Parser.ExprContext ctx)
	{/*

		int size = ctx.expr().size();
		String ex = ctx.getText();

		int s0 = ctx.getText().split("\'+'").length;
		int s1 = ctx.getText().split("-").length;
		int s2 = ctx.getText().split("\'*'").length;
		int s3 = ctx.getText().split("/").length;
		int s4 = ctx.getText().split("%").length;
		int s5 = ctx.getText().split("&").length;
		int s6 = ctx.getText().split("^").length;
		int s7 = ctx.getText().split("!").length;
		int s8 = ctx.getText().split("<=").length;
		int s9 = ctx.getText().split(">=").length;
		int s10 = ctx.getText().split("<").length;
		int s11 = ctx.getText().split(">").length;
		int s12 = ctx.getText().split("==").length;
		int s13 = ctx.getText().split("!=").length;
		int s14 = ctx.getText().split("&&").length;
		int s15 = ctx.getText().split("||").length;

		String Splitted0[] = new  String[s0];
		String Splitted1[] = new  String[s1];
		String Splitted2[] = new  String[s2];
		String Splitted3[] = new  String[s3];
		String Splitted4[] = new  String[s4];
		String Splitted5[] = new  String[s5];
		String Splitted6[] = new  String[s6];
		String Splitted7[] = new  String[s7];
		String Splitted8[] = new  String[s8];
		String Splitted9[] = new  String[s9];
		String Splitted10[] = new  String[s10];
		String Splitted11[] = new  String[s11];
		String Splitted12[] = new  String[s12];
		String Splitted13[] = new  String[s13];
		String Splitted14[] = new  String[s14];
		String Splitted15[] = new  String[s15];
		String types[] = new String[size] ;
		//String typetemp = "";
		if(size != 0) {
			if (ex.length() > 0) {
				Splitted0 = ex.split("'+'");
				for (int i = 0; i < Splitted0.length; i++) {
					Splitted1 = Splitted0[i].split("-");
				}
				for (int i = 0; i < Splitted1.length; i++) {
					Splitted2 = Splitted1[i].split("'*'");
				}
				for (int i = 0; i < Splitted2.length; i++) {
					Splitted3 = Splitted2[i].split("/");
				}
				for (int i = 0; i < Splitted3.length; i++) {
					Splitted4 = Splitted3[i].split("%");
				}
				for (int i = 0; i < Splitted4.length; i++) {
					Splitted5 = Splitted4[i].split("&");
				}
				for (int i = 0; i < Splitted5.length; i++) {
					Splitted6 = Splitted5[i].split("^");
				}
				for (int i = 0; i < Splitted6.length; i++) {
					Splitted7 = Splitted6[i].split("!");
				}
				for (int i = 0; i < Splitted7.length; i++) {
					Splitted8 = Splitted7[i].split("<=");
				}
				for (int i = 0; i < Splitted8.length; i++) {
					Splitted9 = Splitted8[i].split(">=");
				}
				for (int i = 0; i < Splitted9.length; i++) {
					Splitted10 = Splitted9[i].split("<");
				}
				for (int i = 0; i < Splitted10.length; i++) {
					Splitted11 = Splitted10[i].split(">");
				}
				for (int i = 0; i < Splitted11.length; i++) {
					Splitted12 = Splitted11[i].split("==");
				}
				for (int i = 0; i < Splitted12.length; i++) {
					Splitted13 = Splitted12[i].split("!=");
				}
				for (int i = 0; i < Splitted13.length; i++) {
					Splitted14 = Splitted13[i].split("&&");
				}
				for (int i = 0; i < Splitted14.length; i++) {
					Splitted15 = Splitted14[i].split("||");
				}
				for (int i = 0; i < Splitted15.length; i++)
				{
					types[i] = dt.currentNode.getHM(Splitted15[i]);
				}
				for (int k = 0; k < types.length; k++) {
					if (types[k] == types[k + 1]) {
						continue;
					} else if (types[k] == "int") {
						if (types[k + 1] == "double" || types[k + 1] == "long")
							continue;
						else {
							System.out.println("Error at line " + ctx.start.getLine() + " : Type " + types[k] + " cannot be converted to Type " + types[k + 1] + " ");
							break;
						}
					} else if (types[k] == "float") {
						if (types[k + 1] == "double")
							continue;
						else {
							System.out.println("Error at line " + ctx.start.getLine() + " : Type " + types[k] + " cannot be converted to Type " + types[k + 1] + " ");
							break;
						}
					}//
					else if (types[k] == "long")//if > 0 -> true ....
					{
						if (types[k] == "bool")
							continue;
						else {
							System.out.println("Error at line " + ctx.start.getLine() + " : Type " + types[k] + " cannot be converted to Type " + types[k + 1] + " ");
							break;
						}
					} else if (types[k] == "bool")//false -> '\X0' and true -> '\X01'
					{
						if (types[k] == "char")
							continue;
						else {
							System.out.println("Error at line " + ctx.start.getLine() + " : Type " + types[k] + " cannot be converted to Type " + types[k + 1] + " ");
							break;
						}
					} else if (types[k] == "char") {
						if (types[k + 1] == "int")
							continue;
						else {
							System.out.println("Error at line " + ctx.start.getLine() + " : Type " + types[k] + " cannot be converted to Type " + types[k + 1] + " ");
							break;
						}
					} else {
						System.out.println("Error at line " + ctx.start.getLine() + " : Type " + types[k] + " cannot be converted to Type " + types[k + 1] + " ");
						break;
					}

				}
			}
		}	//

	*/}

	@Override public void enterFunc_call(LULU2Parser.Func_callContext ctx)
	{
	}

	@Override public void exitFunc_call(LULU2Parser.Func_callContext ctx) { }

	@Override public void enterParams(LULU2Parser.ParamsContext ctx) { }

	@Override public void exitParams(LULU2Parser.ParamsContext ctx) { }

	boolean IsCond_stmt;
	@Override public void enterCond_stmt(LULU2Parser.Cond_stmtContext ctx)
	{
		IsCond_stmt = true;
		if(IsLoop_stmt)
			IsLoop_stmt = false;
	}

	@Override public void exitCond_stmt(LULU2Parser.Cond_stmtContext ctx)
	{
		IsCond_stmt = false;
	}

	boolean IsLoop_stmt;
	@Override public void enterLoop_stmt(LULU2Parser.Loop_stmtContext ctx)
	{
		IsLoop_stmt = true;
		if(IsCond_stmt)
			IsCond_stmt = false;
	}

	@Override public void exitLoop_stmt(LULU2Parser.Loop_stmtContext ctx)
	{
		IsLoop_stmt = false;
	}

	@Override public void enterGoto_(LULU2Parser.Goto_Context ctx)
	{
		if(!dt.currentNode.ContainKey(ctx.ID().getText()))
			System.out.println("Error on line " + ctx.start.getLine() + " : Label undefined");
	}

	@Override public void exitGoto_(LULU2Parser.Goto_Context ctx) { }

	@Override public void enterLabel(LULU2Parser.LabelContext ctx)
	{
		String Name = ctx.ID().getText();
		if(dt.currentNode.ContainKey(Name))
			System.out.println("Error on line " + ctx.start.getLine() + " : Label " + Name + " was being decleared");
		else {
			if(checkWhetherVariableNameIsSameWithClassNameOrNo(ctx.ID().getText()))
			{
				System.out.println("Error on line "+ctx.start.getLine()+" : Name " + ctx.ID().getText() + " was defined as a class name");
				return;
			}
			if(checkWhetherVariableNameIsSameWithFunctionNameOrNo(ctx.ID().getText()))
			{
				System.out.println("Error on line "+ctx.start.getLine()+" : Name " + ctx.ID().getText() + " was defined as a function name");
				return;
			}
			dt.currentNode.setHM(Name, "Label");
		}
	}

	@Override public void exitLabel(LULU2Parser.LabelContext ctx)
	{
		// do nothing
	}

	@Override public void enterConst_val(LULU2Parser.Const_valContext ctx) { }

	@Override public void exitConst_val(LULU2Parser.Const_valContext ctx) { }

	@Override public void enterUnary_op(LULU2Parser.Unary_opContext ctx) { }

	@Override public void exitUnary_op(LULU2Parser.Unary_opContext ctx) { }


	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/*@Override public void visitTerminal(TerminalNode node) { }*/
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/*@Override public void visitErrorNode(ErrorNode node) { }*/

}
