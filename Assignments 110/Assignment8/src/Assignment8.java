
/* Part 1: Written Exercises 
1a. I. 3,16,19,18,14,6
	II. 3,6,19,18,14,16
	III. 3,6,14,18,19,16
	IV. 3,6,14,16,19,18
	V. 3,6,14,16,18,19
1b. I. 16,18,19,3,14,6
	II. 16,18,19,3,14,6
	III. 3,16,18,19,14,6
	IV. 3,14,16,18,19,6
	V. 3,6,14,16,18,19

2a. 3,5,6,8,12,16,17,18
 b. 12,17,18
 c. linear search: 10 bianary search: 4
 
 3a. 4
  b. 3
  c. 1
  d. 2
 
/*
 * Name: Blake Patterson
 * Author: pre-written
 * Filename: Assignment8.java
 * Specification: The program will print studdents average and final grade based on the
 * scores from a file.  The inpuut file has different number of reacords which includes
 * names and 4 exam scores. The lowest exam is dropped before computing the average.
 * Lab: F, Cheng
 * TIME SPENT: 2 hours
 */

import java.text.NumberFormat; 
import java.util.*;
import java.io.*;

public class Assignment8
{
    public static void main (String[] args) throws IOException
    {
        // BufferedReader stdin = new BufferedReader(new InputStreamReader (System.in));
        // StringTokenizer tokenizer;
        Scanner stdin = new Scanner(System.in);
        int count = 0;

        System.out.println("Please enter the filename: ");
        String fileName = stdin.nextLine();

        FileReader fr = new FileReader(fileName);
        BufferedReader inFile = new BufferedReader(fr);
        String line = inFile.readLine();
        while (line != null)
        {   count++;
            line = inFile.readLine();
        }
        inFile.close();

        System.out.println("Please enter a command or type \"?\" to see the menu:");
        String command = stdin.nextLine();
        GradeBook grades = new GradeBook(count);

        // Read the file and build grade book
        grades.fillGradeBook(fileName);
        // Calculate the letter grades
        grades.assignGrades();

        while (command.charAt(0) != 'q')
        {   switch (command.charAt(0))
            {
            case 'a': // display all
                System.out.println(grades.toString());
                break;
            case 'b' : // search
                System.out.println("Type student name? ");
                String name = stdin.nextLine();
                int index = grades.search(name);
                char grade = grades.getLetterGrade(index);
                if (index != -1)
                    System.out.println(name + " " + grade);
                else
                    System.out.println("Student doesn't exist!");
                break;

            case '?' : // help menu
                System.out.println("a: Display ");
                System.out.println("b: Search ");
                System.out.println("?: Help menu ");
                System.out.println("q: Stop the program ");
                break;

            case 'q': // stop the program
                break;

            default:
                System.out.println("Illegal cammand ");
            } // end of switch

            System.out.println();
            System.out.println("Please enter a command or type \"?\" to see the menu:");
            command = stdin.nextLine();
        } // end of while
    }// end main
} // end Assignment8