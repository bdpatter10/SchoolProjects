import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import jsjf.ExpressionEvaluator;

public class ExpressionTreeDriver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String fileName = "";
		String expression = "";
		String postfix = "";
		int result = 0;
		//String up = " 9.0 ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the File");
		fileName = scan.next();
		
		
		try
		{
			Scanner scanFile = new Scanner(new File(fileName));
			while(scanFile.hasNextLine())
			{
				do
				{
					
					expression = scanFile.nextLine();
					//System.out.println(expression);
					if(expression.length() == 0)
					{
						expression += "#";
					}
					
				}
				while(expression.charAt(0) == '#'/* || expression != null*/);
		
				
			System.out.println(expression);
			ExpressionEvaluator eval = new ExpressionEvaluator
				(expression, "infix");
			PostfixEvaluator evaluator = new PostfixEvaluator();
			postfix = eval.GetPostfixExpression();
		
			result = evaluator.evaluate(postfix);
			System.out.println("That expression equals " + result);
		
			System.out.println("The Expression Tree for that expression is: ");
			System.out.println(evaluator.getTree());
			}
		}
		catch(FileNotFoundException e)
		{
				throw new FileNotFoundException();
		}
	
		
	}

}
