import java.util.*;
import java.io.*;

//(return_values are spiltted via (~))(!)name(!)(args are splitted via (~))

public class doublyTree
{

	public class nodeSymbolTable
{
	public int size = 0;
	public HashMap<String, String> hm = new HashMap<String, String>();// it's map of name to type

	public Vector<nodeSymbolTable> children = new Vector<nodeSymbolTable>();
	public nodeSymbolTable parent;
	public String SymbolTableName;
	public boolean ContainKey(String Key)
	{
		if(hm.containsKey(Key))
			return true;
		else
			return false;
	}
	public void setHM(String name, String type)
	{
		hm.put(name, type);
		sizeAdder(name, type);
	}
	public void ReplaceHMblock(String name,String type)
	{
		hm.replace(name,type);
	}

	public  int getByte(String name)//returns a number of bytes for each type used in program
	{
	if (name == "int") return 4;
	else if (name == "bool") return 1;
	else if (name == "long") return 8;
	else if (name == "float") return 4;
	else if (name == "double") return 8;
	else if (name == "char") return 2; // we use it for calculating string's size too :D
	else return 4;

	}

	public int getSize()
	{
		return this.size;
	}

	public String getHM(String key)
	{
		return this.hm.get(key);
	}

	public void sizeAdder(String name, String type)
	{

		//if(currentNode.SymbolTableName.equals())

		if(type.contains("."))
		{
			type = type.substring(0,type.length()-1);
		}
		if(type.contains("protected@"))
		{
			type = type.split("protected@")[1];
		}
		if(type.contains("public@"))
		{
			type = type.split("public@")[1];
		}
		if(type.contains("private@"))
		{
			type = type.split("private@")[1];
		}
		if(type.length()>5)
		{
			if(type.substring(0,5).equals("const"))
			{
				type = type.substring(6,type.length());
			}
		}
		if(type.equals("BaseClass"))
			return ; // do nothing
		if (type.equals("function") && currentNode.SymbolTableName.contains("function"))
		{

			String[] args = null;
			if(name.split("$")[0].length()>0)
			{
				args = name.split("$")[0].split(",");
			}
			else
				args = null;
			String returnValues[] ;
			if(name.split("~").length>1)
			{
				returnValues = name.split("~")[1].split(",");
			}
			else
				returnValues = null;

			if(returnValues != null)
				for(int i = 0 ; i < returnValues.length; i++)
					this.size += getByte(returnValues[i].split(" ")[0]);
			if(args != null)
				for(int i = 0 ; i < args.length; i++)
					this.size += getByte(args[i].split(" ")[0]);
		}
		else if(type.contains("_Array~"))
		{
			String stemp[] = type.split("_Array~");
			String ArrayD[] = stemp[1].split(",");
			if(ArrayD[0].equals("n"))
			{
				this.size += 4;
				return;
			}
			int Bsize = 1;
			for(int i = 0;i < ArrayD.length;i++)
				Bsize *= Integer.parseInt(ArrayD[i]);
			this.size += getByte(stemp[0])*Bsize;
		}
		else if(!currentNode.SymbolTableName.contains("function"))
			this.size += getByte(type);
	}

	
}
	public nodeSymbolTable currentNode = new nodeSymbolTable();
	private Stack<nodeSymbolTable> previousNodes = new Stack<nodeSymbolTable>();
	public nodeSymbolTable head;
	public doublyTree()
	{
		head = new nodeSymbolTable();
		head.SymbolTableName = "Root";
		head.parent = null;
		currentNode = head;
		previousNodes.push(head);
	}
    public void addNext(nodeSymbolTable parent)
    {	
    	if (parent != null)
    		parent = currentNode;
    	nodeSymbolTable newNode = new nodeSymbolTable();
    	previousNodes.push(currentNode);//assume we define a class it should be root's children so previous scope would be current node
		parent.children.add(newNode);
		newNode.parent = parent;
		currentNode = newNode;
		currentNode.size = 0;
    }

    public void returnToPreviousNode() // it is different from jumpToParent
    {
    	currentNode = previousNodes.pop();
    }
    public void jumpToParent()
    {
    	previousNodes.push(currentNode);
    	currentNode = currentNode.parent;
    	return;
    }

    int a = 0;   // FOR TEST
	public void PrintTree(nodeSymbolTable R,int parnetId)  //FOR TEST
	{
		final int selfId = a;
		a++;
		System.out.println("Tree Number : " + selfId);
		if(parnetId != -1)
			System.out.println("parnet Id : " + parnetId);
		System.out.println(R.SymbolTableName);
		System.out.println(R.getSize());
		for(Map.Entry<String,String> entry : R.hm.entrySet())
		{
			System.out.print(entry.getKey()+ "    ");
			System.out.println(entry.getValue());
		}
		System.out.println("-------------------------------------------");
		for(int i = 0;i < R.children.size();i++)
		{
			PrintTree(R.children.elementAt(i), selfId);
		}
	}


//--------------------------------------------START---------------------------------------------
//--------------------------------------------MALE MASOUDE--------------------------------------
	public void constChecking(String variableName,int lineNumber) // it has to be called when assigning an ID
	{
		nodeSymbolTable temp = currentNode;
		while (temp != null) {
			if (temp.hm.containsKey(variableName))
			{
				if(temp.hm.get(variableName).contains("const")) {
					System.out.println("Error at line " + lineNumber + " : const value can not be assigned");
					return;
				}
			}

			temp = temp.parent;
		}
		System.out.println();
		return;
	}
}


