import jsjf.exceptions.*;  
import jsjf.ArrayStack;
import jsjf.StackADT;
import java.util.*;
import jsjf.Reverse;

public class ReverseChar 
{
	public static void main(String[] args)
	{
		int wordCount = 1;
		int currentWord = 0;
		int endWordIndex = 0;
		Reverse<String> r = new Reverse<String>();
		ArrayStack<String> stack = new ArrayStack<String>();
		
		String input = "Now is the time";
		String message = input + " ";
		String result = "";
		
		for (int i = 0; i < message.length() ;i++)
		{
			if(message.charAt(i) == ' ')
			{
				wordCount++;
			}
		}
		
		String[] array = new String[wordCount];
		
		for (int i = 0; i<message.length() ;i++)
		{
			if(message.charAt(i) == ' ')
			{
				
				array[currentWord] = message.substring(endWordIndex, i);
				currentWord++;
				endWordIndex = i+1;
				
			}
		}
		
		for(int i = 0; i< wordCount -1; i++)
		{
			//System.out.println(array[i] + "l");
			stack.push(array[i]);
			r.Backwards(stack);
			System.out.print(" ");
		}
		//System.out.println(stack);
		//r.Backwards(stack);
		//System.out.print(" ");
		
		
	
	}
}
