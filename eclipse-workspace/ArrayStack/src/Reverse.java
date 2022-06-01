

import jsjf.*;
/**
 * takes the input of an Array Stack and reverses the order of the elements 
 * @author blakepatterson
 *
 * @param <T>
 */
public class Reverse<T> 
{
	
	private ArrayStack<T> reverse;
	private int length;

	/**
	 * reverses the contents of an Array Stack
	 * @param stack the array stack passed to the method
	 * @returnthe contents of the given array stack in reverse order
	 */
	
	public ArrayStack<T> backwards(ArrayStack<T> stack)
	{
		length = stack.size();
		T temp = null;
		
		//call = new ArrayStack<T>();
		reverse = new ArrayStack<T>();
		
		for(int i = 0; i < length; i++)
		{
			temp = stack.pop();
			//temp = (T)call.pop();
			
			reverse.push(temp); 	
			
		}
		//System.out.print(reverse);
		
		return reverse;
	}
	
}
