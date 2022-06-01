 /*-------------------------------------------------------------
 // AUTHOR: your name.
 // FILENAME: title of the source file.
 // SPECIFICATION: your own description of the program.
 // FOR: CSE 110- Lab #10
 // TIME SPENT: how long it took you to complete the assignment.
 //----------------------------------------------------------- */

public class StringSet {
	private String[] str;
	private int size;
	
	public StringSet()
	{
		size = 0;
		str = new String[size];
	}
	
	public boolean add(String strToAdd)
	{
		boolean flag = true;
		if(indexOf(strToAdd) != -1)
			return false;
		
		if(size == str.length)
			return false;
			//doubleArray();
		str[size] =strToAdd;
		size++;
			
	}
}
