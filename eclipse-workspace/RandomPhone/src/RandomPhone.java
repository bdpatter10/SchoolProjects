/*Name: Blake Patterson   
 * Date: June 4 2018
 * Program Description:generates a random phone number
 */
import java.util.Random;

public class RandomPhone 
{
	public static void main(String[] args)
	{
		
		int num1, num2, num3;
		int mThree = 0;
		int lFour = 0;
		Random generator = new Random();
		
		num1 = generator.nextInt(7);
		num2 = generator.nextInt(7);
		num3 = generator.nextInt(7);
		mThree =  generator.nextInt(742) + 1;
		
		lFour = generator.nextInt(9999) + 1;
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3 + "-");
		System.out.printf( "%3d", mThree);
		System.out.print("-");
		System.out.printf("%04d", lFour);
		
		
	}
	
}
