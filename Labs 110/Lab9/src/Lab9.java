 /*-------------------------------------------------------------
 // AUTHOR: Blake Patterson
 // FILENAME: Lab9.java
 // SPECIFICATION: sums the elements in an array
 // FOR: CSE 110- Lab #9
 // TIME SPENT: 1.5 hours
 //----------------------------------------------------------- */
import java.util.Scanner;

public class Lab9 {
	public static void main(String[] args)
	{
		int arraySize = -1;
		double curElement = -1;
		double sumElements = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		arraySize = scan.nextInt();
		
		// Declare the array
		double[] studentGrade = new double[arraySize];
		for(int i = 0; i <= studentGrade.length -1; i++)
		{
			System.out.println("Please enter the next value");
			studentGrade[i] = scan.nextDouble();
		}
	
		// Display the sum of the array's values
		for(int i = 0; i <= studentGrade.length -1; i++)
		{
			sumElements += studentGrade[i];
			curElement = i;
			
			if(i == 8)
			{
				System.out.print(" \n" + curElement);
			}
			else
				{
				System.out.print(" " + curElement);
				}
			
		}
		System.out.println("\nSum of the Array's elements is: " + sumElements);
	}

}
