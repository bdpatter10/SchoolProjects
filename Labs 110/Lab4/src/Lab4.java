/* AUTHOR: Blake Patterson 
   TITLE: Lab4
   DESCRIPTION: takes user input and can give three different math outputs.
   FOR: CSE 110- Lab #4
   TIME SPENT:  2 hours
 */
import java.util.Scanner;
public class Lab4 {
	public static void main (String[] args)
	{
		
		int choice, n1, n2, n3;
		int rem = 0;
		int sum = 0;
		int fact = 1;
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		
		do 
		{
			System.out.println("1) Calculate the sum of integers 1 to m.");
			System.out.println("2) Calculate the factorial of given number.");		
			System.out.println("3) Find the first digit of a given number.");
			System.out.println("4) Quit.");
			System.out.println("Your choice is: " );
			choice = scan.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Your number is: ");
				n1 = scan.nextInt();
				while (i<= n1)
				{
					sum = sum + i;
					i++;
					
				}
				System.out.println("The sum of the first " + n1 +" numbers is " + sum);
				break;
			case 2:
				System.out.println("Your number is: ");
				n2 = scan.nextInt();
				while (j <= n2)
				{
					fact = fact* j;
					j++;
					
				}
				System.out.println("The factorial of " + n2 + " is " + fact);
				break;
			case 3:
				System.out.println("Your number is: ");
				n3 = scan.nextInt();
				while (n3 != 0)
				{
					rem = n3 % 10;
					n3 = n3 / 10;
					
				}
				System.out.println("The first integer of the given number from the left"
				+ " is " + rem);
				break;
			case 4:
				break;
			default: 
				System.out.println("This is not a valid input.");
				
			}
			
		}
		while ( choice != 4); 
		
		
	}
}
