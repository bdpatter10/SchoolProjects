/*Name: Blake Patterson
 * Date: June 4 2018
 * Program Description: produces a random number between two numbers given 
 * by the user
 */
import java.util.Scanner;

public class RandomInRange 
{
	public static void main(String[] args)
	{
		
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		RandomReturn ranInt = new RandomReturn();
		System.out.println("Please enter the lower parameter: ");
		num1 = scan.nextInt();
		System.out.println("Please enter the upper parameter: ");
		num2 = scan.nextInt();
		
		System.out.println(ranInt.random(num1, num2));
		
	}

}
