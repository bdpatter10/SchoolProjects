/* AUTHOR: Blake Patterson  
   TITLE: Lab5
   DESCRIPTION: takes user input to print or a triangle or a range of numbers
   FOR: CSE 110- Lab #5
   TIME SPENT:  1 hours
 */
import java.util.Scanner;
public class Lab5 
{
	public static void main(String[] args)
	{
		int choice, start, end, height;
		//int i = 0;
		Scanner scan = new Scanner(System.in);
		do
		{
			
			System.out.println("\nPlease choose your choice from the following menu");
			System.out.println("1) Print though all integer numbers between two given integers.");
			System.out.println("2) Display the pattern- right triangle of stars.");
			System.out.println("3) Quit.");
			choice = scan.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("starting integer? ");
				start = scan.nextInt();
				System.out.println("ending integer? ");
				end = scan.nextInt();
				for(int i = start; i <= end; i++)
				{
					System.out.print(i + " ");
				}
				break;
			case 2:
				System.out.print("What is the height of the triangle? ");
				height = scan.nextInt();
				for(int j = 1; j <= height; j++)
				{
					System.out.print("\n");
					for(int k = 1; k <= j; k++)
					{
					System.out.print("*");
					}
				
				}
				break;
			case 3:
				break;
			default:
				System.out.println("not a valid input");
				break;
			}
		}while (choice != 3);
	}
}
