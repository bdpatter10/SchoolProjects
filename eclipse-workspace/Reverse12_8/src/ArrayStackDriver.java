import jsjf.exceptions.*; 
import jsjf.ArrayStack;
import jsjf.StackADT;

public class ArrayStackDriver 
{
	public static void main(String[] args)
	{
		String message = "Stack";
		EmptyCollectionException empty = new EmptyCollectionException(message);
		int size = 20;
		
		try
		{
		ArrayStack<String> stack = new ArrayStack<String>();
		
		for (int i = 0; i < 20; i++)
		{
			stack.push("a"+i);
			
		}
		System.out.println("Pushed stack " + stack.toString());
		
		for (int i = 0; i < 5; i++)
		{
			stack.pop();
		}
		System.out.println("the contents of the stack after five pops " + stack);
		System.out.println("the stack is empty? true or false?" + stack.isEmpty());
		System.out.println("There are " + stack.size() + " elements in the stack.");
		}catch(EmptyCollectionException e)
		{
			System.out.println(e);
		}
		
	}
}
