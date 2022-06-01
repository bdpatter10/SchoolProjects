
/* Name:Blake Patterson  
  Title: Assignment3
  Author: Blake Patterson
  Description: Gets user's name and outputs said name in three ways
 Time Spent: 4 hours
 Date: 2/2/2018
 
 Question #1
  a) x <= 0   
 b) x >= 10  
 c) x < 10  
 d)  x == 0 && y == 0   
 e) x % 2 == 0
 Question #2 
 a) month == 2 && 28 == day  
 b)month <= 4 || month == 4 && 15 <= day 
 Question #3 
 a) word1.compareTo(word2) == 0  
 b) word1.compareTo(word2) < 0  
 c) word1.substring(0,4) && word2.substring(0,4) == 0
  
 */

import java.util.Scanner;

public class Assignment3 
{
	
	public static void main(String[] args)
	{
		// declare all variables
		String name = "";
		String fName = "";
		String mName2 = "";
		String mName = "";
		String lName = "";
		String initials = "";
		String var1 = "";
		String var2 = "";
		
		// use scanner to get user input
		Scanner scan = new Scanner(System.in);
		System.out.println("What are your first, middle and last names? ");
		name = scan.nextLine();
		
		// separate first middle and last name using .substring, .indexOf, .lastIndexOf and .length.
		fName = name.substring(0, name.indexOf(" "));
		mName = name.substring(name.indexOf(" "), name.lastIndexOf(" "));
		lName = name.substring(name.lastIndexOf(" ") + 1,name.length());
	
		// if there is a middle name take away the space cause by the index of " "
		if (mName.contains(" "))
		{
			mName2 = mName.substring(1 , mName.length()); 
		}
		else
		{
			mName2 = mName;
		}
		
		// write an if else in case of a name without a middle name
		if (mName2.isEmpty())
		{
		
			initials = fName.substring(0,1) + lName.substring(0,1);
			initials = initials.toUpperCase();
		}
		else
		{
			initials = fName.substring(0,1) + mName2.substring(0,1) + lName.substring(0,1);
			initials = initials.toUpperCase();
		}
		
		// write an if else in case of a name without a middle name
		if (mName.isEmpty())
		{
			var1 = lName.substring(0,1).toUpperCase() + lName.substring(1,lName.length()).toLowerCase()
+ ", " + fName.toUpperCase();	
		}
		else
		{
			var1 = lName.substring(0,1).toUpperCase() + lName.substring(1,lName.length()).toLowerCase()
+ ", " + fName.toUpperCase() + " " + mName2.substring(0,1).toUpperCase() + ".";		
		}
		
		// write an if else in case of a name without a middle name
		if(mName.isEmpty())
		{
			var2 = lName.substring(0,1).toUpperCase() + lName.substring(1,lName.length()).toLowerCase() 
+ ", " + fName.substring(0,1).toUpperCase() + fName.substring(1,fName.length()).toLowerCase();
		}
		else
		{
			var2 = lName.substring(0,1).toUpperCase() + lName.substring(1,lName.length()).toLowerCase() 
+ ", " + fName.substring(0,1).toUpperCase() + fName.substring(1,fName.length()).toLowerCase() 
+ " " + mName2.substring(0,1).toUpperCase() + mName2.substring(1,mName2.length()).toLowerCase();
		}
		
		// print the desired outputs
		System.out.println("Your initials are: " + initials);
		System.out.println("Variation 1: " + var1);
		System.out.println("Variation 2: " + var2);
		
		
	}
	

}