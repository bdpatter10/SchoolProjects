//-------------------------------------------------------------------------
// NAME: Blake Patterson
// FILENAME:      CharList.java
// DESCRIPTION:   CharList is a class that randomizes an array of char and then 
// can act on that array.
// AUTHOR:        Blake Patterson
// FOR:           CSE 110 Assignment 7
// DUE DATE: Friday the 6th of April
// Time SpenT: 5 hours
//-------------------------------------------------------------------------
import java.util.*;
public class CharList 
{
	private char list[];
	private int count;
	
	public CharList (int size)
	{
		count = size; 
		list = new char[size];
	}
	
	public void randomize ()
	{
		Random generator = new Random();
		for (int i = 0; i < list.length; i++)
		{
			list[i] = (char) (generator.nextInt(26) + 97);
			
		}
	}	
		
		public void addChar (char newChar, int index)
		{
			
			if(count == list.length)	
			{
				increaseSize();
			}
			for (int i = list.length - 1; i > index; i--)
			{
				list[i] = list[i - 1];
				//System.out.print("list" + list[i]);
				
			}
			 
			list[index] = newChar;
			
			count++;
			
			
			/*else
			{
			for (int i = list.length - 1; i > index; i--)
			{
				list[i] = list[i - 1];
				
			}
			 
			list[index] = newChar;
			
			count++;
			}*/
			
		}
		
		private void increaseSize()
		{
			char temp[] = new char[count *2];
			for (int i = 0; i <= list.length -1; i++)
			{
				temp[i] = list[i];
				//System.out.print("temp" + temp[i]);
				 
			}
		}
		
		public void removeFirst(int newChar)
		{
			for(int i = 0; i < list.length; i++)
			{
				if(list[i] == newChar)
				{
					for(int j = i; j < list.length; j++)
					{
						if(j <= list.length -2)
						{
							list[j] = list[j + 1];
						}
						else
						{
							list[j] = 0;
						}
					}
				}
			}
				
		}
		
		public int[] countLetters()
		{
			final int CHARCOUNT = 26;
			int[] letter = new int[CHARCOUNT];
			char current;
			String str = list.toString();
			for (int i = 0; i < list.length; i++)
			{
				current = str.charAt(i);
				if (current >= 'a' && current <= 'z')
				{
					letter[current - 'a']++;
				}
			}
			/*for (int i = 0; i < letter.length; i++)
			{
				letter[i] =  
			}*/
			return letter;
		}
		
		public String toString()
		{
			String charStr = "";
			
				for(int i = 0; i <= list.length - 1; i++)
				{
					if(i+1 % 10 == 0 )
					{
						System.out.print("\n");
					}
					charStr += list[i];	
				}
				return charStr; 
			
		/*	else if (count > 10)
			{
				for(int i = 0; i <= list.length - 1; i++)
				{
					if(i % 9 == 0 )
					{
						System.out.print("\n");
					}
				
					charStr += list[i];	
				}
				return charStr;
			}
			return charStr;*/
		}
}
