/*
// AUTHOR: Blake Patterson
// FILENAME: Lab6
// SPECIFICATION: prints the first and last names and age now and in ten years
// FOR: CSE 110- Lab #6
// TIME SPENT: 1 hour
 */
import java.util.Scanner;
public class Lab6 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String fname = "",lname = "";
		int bYear = 0;
		
		System.out.println("Enter the first name of the person: ");
		fname =  keyboard.nextLine();
		System.out.println("Enter the last name of the person: ");
		lname = keyboard.nextLine();
		System.out.println("Enter the birth year of the person: ");
		bYear = keyboard.nextInt();
		
		Person person = new Person(fname, lname, bYear);
		System.out.println(person.getFirstName() + " " + person.getLastName() + " is " + person.getAge()
		+ " years old in 2016 and will be " + person.getAge2026() + " in ten years.");
		
	}

}
