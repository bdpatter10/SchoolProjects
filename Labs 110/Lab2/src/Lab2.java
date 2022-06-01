// AUTHOR: Blake Patterson
// FILENAME: Lab2.java
// SPECIFICATION: String operations 
// FOR: CSE 110 - Lab #2
// TIME SPENT: 1 hour


import java.util.Scanner;

public class Lab2 
{
	public static void main(String[] args)
	{
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int nameLength = 0 ;//fullName.length();
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter first name:");
		firstName = scan.nextLine();
		System.out.println("Please enter last name: ");
		lastName = scan.nextLine();
		
		fullName = firstName + " " + lastName;    
		
		fullName.toUpperCase();
		fullName = fullName.toUpperCase();
		
		fullName.length();
		nameLength =  fullName.length();
		
		System.out.println("Full Name: " + fullName );
		System.out.println("Length of Name:" + nameLength );
		
		String title1 = new String ("cse110");
		String title2 = "cse110";
		
		if (title1 == title2) {
			System.out.println("String comparison using == sign works");
		} else { 
			System.out.println("String comparison using == does NOT work");
		}
		if (title1.equals(title2)) {
		System.out.println("String comparison using equals method works");
		}else {
			System.out.println("String comparison using equals does NOT work");
		}
		
	}
}
