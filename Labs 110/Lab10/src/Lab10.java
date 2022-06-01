 /*-------------------------------------------------------------
 // AUTHOR: Blake Patterson
 // FILENAME: Lab10
 // SPECIFICATION: 
 // FOR: CSE 110- Lab #10
 // TIME SPENT: 1 hour
 //----------------------------------------------------------- */
import java.util.Scanner;

public class Lab10 
{
	public static void main(String[] args)
	{
		int arraySize = -1;
		int var = -1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array size: " );
		arraySize = scan.nextInt();
		
		int[] myArray = new int[arraySize];
		
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.println("Please enter the next value of the ");
			myArray[i] = scan.nextInt();
		}
		
		for (int i = 0; i < myArray.length;i++)
		{
			
			for(int j = i + 1; j < myArray.length; j++)
			{
				System.out.print(i + ", " + j);
				if (myArray[i] > myArray[j])
				{
					var = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = var;
					
				}	
			}
		}
		
		int offset = 1;
		for(int i = 0; i < myArray.length - offset; i++)
		{
			myArray[i] = myArray[i +1];
			
		}
		myArray[myArray.length -1] = 0;
		
		boolean isFound = false;
		System.out.println("\nEnter the element you wish to remove: ");
		int valueToRemove = scan.nextInt();
		
		for (int i = 0; i < myArray.length; i++)
		{
		if(myArray[i] == valueToRemove)
			isFound = true;
		
		if(isFound)
		{
			if(i + 1 < myArray.length)
				myArray[i] = myArray[i+1];
			else
				myArray[i] = 0;
		}
		}
	}
		
}


