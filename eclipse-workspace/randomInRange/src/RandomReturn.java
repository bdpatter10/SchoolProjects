/*Name: Blake Patterson
 * Date: June 4 2018
 * Program Description: contains a method that prroduces a random integer
 */
import java.util.*;
public class RandomReturn {
	
	private int num1;
	private int num2;
	
	public RandomReturn()
	{
		int num1 = 0;
		int num2 = 0;
	}
	
	public int random(int num1, int num2)
	{
		int numGen = 0; 
		Random generator = new Random();
		numGen = generator.nextInt((num2 - num1) + 1) + num1;
		return numGen;
	}

}
