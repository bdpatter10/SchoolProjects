/*
 * Author: Blake Patterson
 * Filename: GradeBook.java
 * Specification: a class that contains methods a teacher may need to make
 * a gradebook. 
 * Lab: F, Cheng
 * For: CSE 110- homework# 8 tuesday thursday 12:00
 * TIME SPENT: 2 hours
 */
import java.io.BufferedReader;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GradeBook 
{
	private String name[];
	private char grade[];
	private double scores[][];
	public final int NUM_TESTS = 4;
	
	// constructor
	GradeBook (int size)
	{
		name = new String[size];
		grade = new char[size];
		scores = new double[size][NUM_TESTS];
		
	}
	
	// fill both the array of names and the grades for text file.
	public void fillGradeBook (String fileName)
	{
		try
		{
		FileReader freader = new FileReader("roster.txt");
		
		BufferedReader bfReader = new BufferedReader(freader);
	
		for (int i = 0; i < scores.length; i++)
		{
			for(int j = 0; j < NUM_TESTS; j++)
			{
				scores[i][j] = bfReader.read();
			}
		}
		for (int i = 0; i < name.length; i++)
		{
			name[i] = bfReader.readLine();
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
	}
	
	// Average of a students three highest grades
	private double getStudentAverage (int index)
	{
		double average = 0.0;
		double min = 0;
		double temp = 0.0;
		
		for(int i = 0; i < scores[index].length; i++)
		{
			if ( temp < scores[index][i])
			{
				temp = scores[index][i]; 
			}
		}
		min = temp;
		for(int i = 0; i < scores[index].length; i++)
		{
			if ( min < scores[index][i])
			{
				temp += scores[index][i];
			}
		}
		average = temp/3;
			
		return average;
	}
	
	// assigns grades
	public void assignGrades()
	{
		
	}
	
	// return the student name of the index entered
	public String getStudentName(int index)
	{
		String student = "";
		student = name[index-1];
		return student;
	}
	
	// returns the letter grade of the student
	public char getLetterGrade (int index)
	{
		char letter = 0;
		letter = grade[index-1];
		
		return letter;
	}
	
	// returns the index of the target name
	public int search (String target)
	{
		int indexOfName = 0;
		
		return indexOfName; 
	}
	
	// makes a string with the students name average and their grade
	public String toString()
	{
		String info = "";
		
		return info;
	}

}
