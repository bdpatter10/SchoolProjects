/*-------------------------------
//AUTHOR: Blake Patterson
//FILENAME: Lab1
//SPECIFICATION: Calculate the avergae
//FOR: CSE110-Lab #1
// TIME SPENT: 45 minutes
//------------------------------*/

// All imports have to be outside class
// import Scanner class from the java.util library
import java.util.Scanner;

//class name should match file name
public class Lab1 
{
	//we must have a main method to run the program 
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		//declare variables 
		double test1, test2, test3, average;
		final int NUM_TESTS = 3;
		
		//Get the input
		System.out.println("Enter the score of the first test: ");
		test1 = input.nextInt(); //read in the first integer
		
		System.out.println("Enter the score on the second test:");
		test2 = input.nextInt(); //read in the second integer
		
		System.out.println("Enter the score on the third test;");
		test3 = input.nextInt(); //read in the third integer
		
		//Calculate the average
		average = (test1 + test2 + test3) / NUM_TESTS; 
		
		//display results
		System.out.println("Your average score is " + average);
	}//end main method

}//end Lab1 class
