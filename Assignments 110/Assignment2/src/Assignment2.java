/* Name:Blake Patterson
  Title: Assignment2
  Author: Blake Patterson
  Description: gives the middle of three strings
 Time Spent: 4 hours
 Date: 1/25/2018
 
 Question #1 System.out.println(myString.length());
 Question #2 System.out.println(myString.indexOf("d"));
 Question #3 System.out.println(myString.substring(10, 13));
 Question #4 a.true b. false c. false d. true
 Question #5  Hr
 */

import java.util.Scanner;

public class Assignment2
{
	public static void main (String[] args) 
	{
		// declare variables
		String str1 = "";
		String str2 = "";
		String str3 = "";
		String middle1 = "";
		
		// get user input using scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		str1 = scan.nextLine();
		System.out.println("Enter string 2: ");
		str2 = scan.nextLine();
		System.out.println("Enter string 3: ");
		str3 = scan.nextLine();
		
		/* use .compareTo inside of if else statements to find the middle string
		 and save the middle string in middle1*/
		 
		if (str1.compareTo(str3) > 0 && str1.compareTo(str2) > 0 )
		{
			if (str2.compareTo(str3) > 0)
			{
			middle1 = str2;
			}
			else
			{
				middle1 = str3;
			}
		}
		if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0)
		{
			if (str1.compareTo(str3) > 0)
			{
				middle1 = str1;
			}
			else
			{
				middle1 = str3;
			}
		}
		if (str3.compareTo(str1) > 0 && str3.compareTo(str2) > 0)
		{
			if(str2.compareTo(str1) > 0)
			{
				middle1 = str2;
			}
			else
			{
			middle1 = str1;
			}
		}
		// print middle1
		System.out.println("The middle string is " + middle1);
	}

}
