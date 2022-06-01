/*-------------------------------------------------------------------------
// AUTHOR: Blake Patterson
// FILENAME: Lab11.java
// SPECIFICATION:
// FOR: CSE 110- Lab #11
// TIME SPENT: 
//----------------------------------------------------------------------*/
import java.util.Scanner;
public class Lab11 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int row, column;
		int sumOfRow = 0;
		
		System.out.println("Enter the number of rows in the array: ");
		row = scan.nextInt();
		
		System.out.println("Enter the number of columns in the array: ");
		column = scan.nextInt();
		
		int[][] myArray = new int[row][column];
		
		for(int i = 0; i<= row -1; i++)
		{
			for(int j = 0; j<= column -1; j++)
			{
				System.out.println("Please enter the value for the position (" + i + "," + j 
						+ ")");
				myArray[i][j] = scan.nextInt();
			
			}
		}
		
		System.out.println("Your array looks like: ");
		for(int i = 0; i <= row - 1;i++ )
		{
			for(int j = 0; j <= column -1; j++)
			{
				System.out.print(myArray[i][j] + " ");
				
			}
			System.out.print("\n");
		}
		
		for(int i = 0; i <= row -1; i++)
		{
			int sum = 0; 
			for(int j = 0; j <= column -1; j++)
			{
				sum += myArray[i][j];
			}
			System.out.println("Sum of the elements in row " + i + " is: " + sum);
		}
	}
	

}
