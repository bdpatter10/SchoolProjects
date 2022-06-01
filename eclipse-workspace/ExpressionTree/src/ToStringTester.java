
import jsjf.*;
import jsjf.ExpressionEvaluator.EXPRESSIONTYPE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ToStringTester 
{
	  public static enum EXPRESSIONTYPE
	   {
	      Prefix, Infix, Postfix
	   }

	public static void main(String[] args) throws FileNotFoundException
	{
		
		
	/*	String str = "this";
		String str1 = "that";*/
		char c1 = '1'; 
		char c2 = '2';
		char c3 = '+';
		
		ExpressionTreeOp plus = new ExpressionTreeOp(1, '+', 1);
		ExpressionTreeOp minus = new ExpressionTreeOp(1, '-', 2);
		ExpressionTreeOp multiply = new ExpressionTreeOp(1, '*', 3);
		ExpressionTreeOp one = new ExpressionTreeOp(2, '+', 4);
		
		//LinkedBinaryTree<ExpressionTreeOp> tree1 = 
		//		new LinkedBinaryTree<ExpressionTreeOp>();
		//LinkedBinaryTree<ExpressionTreeOp> tree = 
		//		new LinkedBinaryTree<ExpressionTreeOp>(plus, tree1, tree1);
		//LinkedBinaryTree<ExpressionTreeOp> tree2 = 
		//		new LinkedBinaryTree<ExpressionTreeOp>(one,tree1 ,tree );
		//ExpressionTree tree0 = new ExpressionTree();
		ExpressionTree tree1 = new ExpressionTree();
		ExpressionTree tree = 
				new ExpressionTree(one, tree1, tree1);
		ExpressionTree tree2 = 
				new ExpressionTree(plus,tree ,tree );
		ExpressionTree tree0 = new ExpressionTree();
		
		//ExpressionTree tree1 = new ExpressionTree(plus, tree0 , tree0);
		//ExpressionTree tree2 = new ExpressionTree(one, tree1, tree1);
	//	ExpressionTree tree3 = new ExpressionTree(one, tree2, tree2);
	//	ArrayUnorderedList<String> list = new ArrayUnorderedList<String>(); 
		/*for(int i = 0; i < 5;i++)
		{
			list.addToFront("" + i + "!");
		}
		list.addToRear(str);*/
		//System.out.println(list);
	/*	System.out.println("to string "+tree.toString());
		System.out.println("root "+tree.getRootElement());
		
		System.out.println("is empty " + tree.isEmpty());
		System.out.println("size " + tree.size());
		System.out.println("contains t " + tree.contains('1'));
		System.out.println("contains f " + tree.contains('+'));*/
	//	System.out.println(tree2.printTree());
		
		String fileName = "";
		String expression = "";
		String postfix = "";
		int result = 0;
		//String up = " 9.0 ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the File");
		fileName = scan.next();
		//System.out.println(fileName);
		
		try
		{
			Scanner scanFile = new Scanner(new File(fileName));	
			while(scanFile.hasNext())
			{
				do
				{
					expression = scanFile.nextLine();
					System.out.println(expression);
					if(expression.length() == 0)
					{
						expression += "#";
					}
				}while(expression.charAt(0) == '#'/* || expression != null*/);
		//expression = scanFile.nextLine();
		}
		catch(FileNotFoundException e)
		{
			throw new FileNotFoundException();
		}
		System.out.println(expression);
		ExpressionEvaluator eval = new ExpressionEvaluator
				(expression, "infix");
		PostfixEvaluator evaluator = new PostfixEvaluator();
		postfix = eval.GetPostfixExpression();
		//System.out.println(up);
		//System.out.println(Double.parseDouble(up));
		//System.out.println(up);
		result = evaluator.evaluate(postfix);
		System.out.println("That expression equals " + result);
		
		System.out.println("The Expression Tree for that expression is: ");
        System.out.println(evaluator.getTree());
		}
	}
}
