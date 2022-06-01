/* AUTHOR: Blake Patterson
   FILENAME: Lab3.java
   SPECIFICATION: Grade calculator 
   FOR: CSE110- Lab 3
   TIME SPENT: 1 hour
 */
// all imports must be outside the class
import java.util.Scanner;

public class Lab3 
{

	// main method must be used
	public static void main(String[] args)
	{
		 // Declaring variables:

        double finalexamGrade = 50.0;
        double midtermGrade = 50.0;
        double homeworkGrade = 0.0;
        double finalGrade = 0.0;
        // a character called letterGrade
        char letterGrade = ' ';
        // a variable of type Scanner
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Student's homework grade: ");
        homeworkGrade = scan.nextInt();
        
        System.out.println("Student's midterm grade: ");
        midtermGrade = scan.nextInt();        
        
        System.out.println("Student's final exam grade: ");
        finalexamGrade = scan.nextInt();
        
        if  (homeworkGrade >= 0 && homeworkGrade <= 100 && midtermGrade >= 0 && midtermGrade <= 100 && finalGrade >= 0 && finalGrade <= 200)
        { 
        		finalGrade = ((finalexamGrade / 200) * 50) + (midtermGrade * .25) + (homeworkGrade * .25);
        		
        		if (finalGrade >= 50)
        		{
        			letterGrade = 'P';
        			
        		}
        		else 
        		{
        			letterGrade = 'F';
        			
        		}
        		if (letterGrade == 'P')
        		{
        			
        			System.out.println("Student Passed the class");
        		}
        		else if (letterGrade =='F')
        		{
        			
        			System.out.println("Student Failed the Class");		
        		}	
        }
        else
        {
        	System.out.print("Invalid input. Homework and midterm grades should be between 0 and 100 and the final exam grade should be between 0 and 200");
        	
        }
         
	}// end main method
}// end Lab3 class
