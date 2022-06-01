/* Name:Blake Patterson   
  Title: Assignment4
  Author: Blake Patterson
  Description: checks if a credit card number is valid
 Time Spent: 4 hours
 Date: 2/13/2018

A) 18
B) 4 times
C)  int num;
	Scanner scan = new Scanner(System.in);
	do
 	{
 		System.out.println("please enter a value between 1 and 100" );
 		num = scan.nextInt();
 		
 	} while (num < 0 || num > 100);
	
*/
import java.util.Scanner;
public class Assignment4 
{
	public static void main(String [] args)
	{
		int n1;
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		int lSum = 0;
		int prod1 = 0;
		int rem2 = 0;
		int rem, checkD;
		int ccNum, ccNumS;
		char choice;
		Scanner scan = new Scanner(System.in);
		do
		{	
			// declare variables used inside the loop to be zero
			sum1 = 0;
			sum2 = 0;
			count = 0;
			System.out.println("Enter the credit card number: ");
			ccNum = scan.nextInt();
			// store the original ccNum to use later
			ccNumS = ccNum;

			// make sure the number has eight digits	
			if (ccNum <= 10000000 || ccNum >= 99999999)
				{	
					System.out.println("invalid Number! Doesnt have 8 digits!");
					ccNum = -1;
				}	
			// if it has eight digits perform the math operations
			else
			{
				
					while (ccNum > 0)
					{
						n1 = ccNum % 10;
						ccNum = ccNum / 10;
				
					if (count % 2 == 0)
					{
							sum1 = sum1 + n1;
					}
				// use a do loop to separate potentially two integers from the product
					else {
						do
						{
							prod1 = n1 * 2;
							while(prod1 > 0)
							{
								rem2 = prod1 % 10;
								sum2 += rem2;
								prod1 = prod1 / 10; 
								
							}
						}while (prod1 > 0);
						}
				
						count++;
						
					}
			}
			lSum = sum1 + sum2;
			if(lSum % 10 == 0 && lSum / 10 != 0)
			{
				System.out.println("Valid!");
			}
			else
				{
					// Check for correct check digit
					do
					{
						checkD = ccNumS % 10;
						rem = lSum % 10;
						if(rem < 5)
						{
							checkD = checkD - rem;
							System.out.println("Invalid, the check digit should be " + checkD);
						}
						else
						{
						checkD = 10 - rem;
						System.out.println("Invalid, the check digit should be " + checkD);
						}
						count++;
					}while(count < 1);
				}
				
			
			
			System.out.print("Check another credit card (y/n)? ");
			choice = scan.next().charAt(0);
		}while  (choice == 'y');
			
		
	}

}
