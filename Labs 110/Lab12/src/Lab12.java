import java.io.BufferedReader;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//import java.io.PrintWriter;
public class Lab12 
{
	
	public static void main(String[] args)
	{
		final int NUM_ROWS = 4;
		final int NUM_COLMS = 3;
		String[][] str = new String[NUM_ROWS][NUM_COLMS];
		try
		{
		FileReader freader = new FileReader("Input.txt");
		
		BufferedReader bfReader = new BufferedReader(freader);
		
		
		
		
		for (int i = 0; i < NUM_ROWS; i++)
		{
			for(int j = 0; j < NUM_COLMS; j++)
			{
				str[i][j] = bfReader.readLine();
			}
		}
		bfReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.err.println("File Not Found");
		}
		catch(IOException e)
		{
			System.err.println("I/O error occurs");
		}
		
		for (int i = 0; i < NUM_ROWS; i++)
		{
			for(int j = 0; j < NUM_COLMS; j++)
			{
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
