/*-------------------------------------------------------------
// AUTHOR: Blake Patterson 
// FILENAME: Lab7.java
// SPECIFICATION:
// FOR: CSE 110- Lab #7
// TIME SPENT: 2 hour
//----------------------------------------------------------- */

import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args)
	{
		
		int num1 = 0;
		int num2 = 0;
		String star;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the builder's name: ");
		String name1 = scan.nextLine();
		
		Builder build = new Builder(name1);
		
		// Print the name of the builder
		System.out.println("The name of the Builder is: " + build.getName());
		
		// print n number of String star
		System.out.println("Enter a positive integer: ");
		num1 = scan.nextInt();
		System.out.println("Enter a String: ");
		star = scan.nextLine();
		
		System.out.println(build.makeRow(num1, "*"));
		
		System.out.println("Enter a positive odd integer, that represents the "
				+ "number of stars in the base of a pyramid: ");
		num2 = scan.nextInt();
		build.makePyramid(num2, "*");
		
		
	}
	

}
