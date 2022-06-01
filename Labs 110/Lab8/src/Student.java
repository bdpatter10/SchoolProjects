
public class Student {
	// Attribute
	private String firstName;
	private String lastName;
	private String studentMajor;
	private int studentCredits;
	private int studentPoints;
	
	//Constructor
	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentMajor = "General Studies";
		this.studentCredits = 0;
		this.studentPoints = 0;
		
	}

	// Constructor2
	public Student(String firstName, String lastName, 
			String studentMajor, int studentCredits, int studentPoints) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentMajor = studentMajor;
		this.studentCredits = studentCredits;
		this.studentPoints = studentPoints;
	}

	
	 // return the firstName
	 
	public String getFullName() {
		String fullName = firstName + " " + lastName;
		return fullName;
	}


	
	// return the studentMajor
	 
	public String getMajor() 
	{
		return studentMajor;
	}

	
	// return the studentCredits
	 
	public int getCredits() 
	{
		return studentCredits;
	}


	
	  //return the studentPoints
	
	public int getGradePoints() {
		return studentPoints;
	}

	// change major
	public void changeMajor(String newMajor)
	{
		studentMajor = newMajor;
	}

	// loop helper
	public void loopHelper(int start, int end, int incBy)
	{
		int sum = 0;
		System.out.println("Iterate from " + start + " till " 
	+ end + " with " + incBy + " steps and find the sum");
		
		for(int i = start; i <= end; i += incBy)
		{
			sum = sum + i;
			System.out.print(i + " ");
			
		}
		System.out.print("\n Sum is " + sum + "\n");
	}
}
