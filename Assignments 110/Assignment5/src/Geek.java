/*-------------------------------------------------------------------------
// NAME: Blake Patterson
// FILENAME: Assignment5.java
// SPECIFICATION: Geek.java class answer simple tasks such as count spaces and give sums
// LAB: F Cheng Monday 4:10 to 5:00
// FOR: CSE 110- homework #5
// TIME SPENT: 4 hours
 * //----------------------------------------------------------------------*/
public class Geek 
{
	// instance variables
	private String name;
	private int questions;
	
	// constructor
	public Geek(String name1)
	{
		name = name1;
		questions = 0;
	}
	
	// get name meathod
	public String getName()
	{
		return name;
	}
	
	// get number of questions
	public int getNumberOfQuestions()
	{
		return questions;
	}
	
	// Is it odd
	public boolean isOdd(int num1)
	{
		num1 = num1 % 2;
		if(num1 != 0)
		{
			boolean isOdd = true;
			questions++;
			return isOdd;
		}
		else
		{
			boolean isOdd = false;
			questions++;
			return isOdd;
		}
	}
	
	// reverses a string
	public String reverse(String input)
	{
		String str1 = "";
		for(int i = input.length()-1; i >= 0; i-- )
		{
			str1 += input.charAt(i);
		}
		return str1;
	}
	
	// sum of all numbers between two integers
	public int sum(int num1, int num2)
	{
		int total = 0;
		if(num1 < num2)
		{
			do
			{
				total = total + num1;
				num1++;		
			}while(num1 <= num2);
		}
		else
		{
			do
			{
				total = total + num2;
				num2++;		
			}while(num2 <= num1);
		}
		questions++;
		return total;
	}
	
	
	
	// returns true if 3 number are in order least to greatest
	public boolean sorted(int num1, int num2, int num3)
	{
		if(num1< num2 && num3 > num2)
		{
			boolean sorted = true;
			questions++;
			return sorted;
		}
		else
		{
			boolean sorted = false;
			questions++;
			return sorted;
		}
	}
	
	// count the number of spaces
	public int countSpace(String text)
	{
		int in1 = 0;
		int space = 0;
		while(in1 != -1)
		{
			in1 = text.indexOf(' ', in1);
			
			
			if(in1 != -1)
			{
				space++;
				in1++;
			}	
		}
		return space;
	}
	
	// count the digits
	public int countDigits(int num)
	{
		int digit = 0;
		do 
		{
			num = num / 10;
			digit++;
		}while(num > 0);
		questions++;
		return digit;
	}

}
