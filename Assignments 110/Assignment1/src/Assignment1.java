//Name: Blake Patterson
//Title: Assignment1
//Author: Blake Patterson
//Description: computes a reverse mortgage
//Time Spent: 4 hours
//Date: 1/22/2017

//answer a. the name of the class does not match the name of the file.
//answer b. There is a syntax error because the statement is not closed
//answer c. there is no error message but the fahrenheit value changes
//answer d. fahrenheit would either need to be made its own variable or write it correctly 
//answer e. base does not make sense in the equation because it is not defined as a variable

//import the java.util library
import java.util.Scanner;


public class Assignment1 
{
	public static void main(String[] args)
	{
		double PMT, i, n;
		Scanner scan = new Scanner(System.in);
		
		//print command for user to enter periodic payment
		System.out.println("Enter the Periodic Payment:");
		PMT = scan.nextDouble();
		//print command for user to input interest rate 
		System.out.println("Enter thr interest rate or compoud interest");
		i = scan.nextDouble();
		//print command for user to input number of payments
		System.out.println("Enter the number of payments");
		n = scan.nextDouble();
		
		//in order to use the Math.pow operation i will assign 1+i and n-1 to their respective variables
		double a = 1 + i;
		double b = n -1;
		
		// to make order of operations more simple I will calculate the numerator first
		double PVN = ((Math.pow(a, b) -1) / i);
		
		//next the denominator 
		double PVD = Math.pow(a, b);
		
		//finally by dividing the numerator by the denominator and multiplying by the periodic payment it will find the PV
		double PV = ( PMT * ((PVN / PVD) +1));
			
		System.out.println("Present value of annuity:" + PV);// print the result
		
	}

	
}
	

