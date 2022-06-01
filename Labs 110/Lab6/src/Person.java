/*
// AUTHOR: Blake Patterson
// FILENAME: Person.java
// SPECIFICATION: Person class gets the first and last name and the birth year
// FOR: CSE 110- Lab #6
// TIME SPENT: 1 hour
 */
public class Person {
	private String firstname, lastname;
	private int birthYear;
	public Person(String fname, String lname, int bYear)
	{
		//System.out.println(fname+ "," + lname + "," + bYear);
		firstname = fname;
		lastname =lname;
		birthYear = bYear;
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public int getAge()
	{
		return(2016 - birthYear);
	}
	public int getAge2026()
	{
		return(2026 - birthYear);
	}
}
