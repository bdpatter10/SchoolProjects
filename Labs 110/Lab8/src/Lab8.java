import java.util.Scanner;
public class Lab8 {
	public static void main(String[] args)
	{
		// declare variables 
		String firstName, lastName;
		String firstName2, lastName2, major;
		int credits, gPoints;
		Scanner scan = new Scanner(System.in);
		
		// get user input
		System.out.println("ENTER FIRST STUDENT INFORMATIONS");
		System.out.println("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.println("Enter your last name");
		lastName = scan.nextLine(); 
		
		// use the student constructor to and mehods to output info 
		Student student1 = new Student(firstName,lastName);
		System.out.println("FIRST STUDENT INFORMATIONS");
		System.out.println("The name of the student is: " + student1.getFullName());
		System.out.println("Major is: " + student1.getMajor());
		System.out.println("The student's number of points is: " + student1.getGradePoints());
		System.out.println("Number of earned credits is: " + student1.getCredits());
		
		// student2 info
		System.out.println("ENTER SECOND STUDENT INFORMATIONS");
		System.out.println("Enter the student's first name: ");
		firstName2 = scan.nextLine();
		System.out.println("Enter the student's last name: ");
		lastName2 = scan.nextLine();
		System.out.println("Enter the student's Major: " );
		major = scan.nextLine();
		System.out.println("Enter the student's number of credits: " );
		credits = scan.nextInt();
		System.out.println("Enter the student's number of grade points: ");
		gPoints = scan.nextInt();
		Student student2 = new Student(firstName2, lastName2, major, credits, gPoints);
		
		System.out.println("SECOND STUDENT INFORMATION\n");
		System.out.println("The name of the student is: " + student2.getFullName());
		System.out.println("Major is: " + student2.getMajor());
		System.out.println("Number of earned credits is: " + student2.getCredits());
		System.out.println("The student's number of points is: " + student2.getGradePoints());
	
		// change maor method
		student2.changeMajor("International Affairs");
		System.out.println("\n" + student2.getFullName() + " has changed majors to " 
		+ student2.getMajor() ); 
		
		// helper loop function
		System.out.println("STUDENT HELPER FUNCTIONS");
        student1.loopHelper(1, 30, 3);
        student1.loopHelper(5, 28, 2);
        
	}

}
