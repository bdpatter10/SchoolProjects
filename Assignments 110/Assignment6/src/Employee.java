/*-------------------------------------------------------------------------
// AUTHOR: Blake Patterson 
// FILENAME: Assignment6.java
// SPECIFICATION:  Employee class tracks number of employees
// and can access and change their information
// LAB: lab F with Cheng
// FOR: CSE 110- homework #6- Tuesday Thursday 12:00
// TIME SPENT: 4hours
//----------------------------------------------------------------------*/

import java.util.Scanner;
import java.text.NumberFormat;

public class Employee {
	// instance variables
	private String name;
	private double salary;
	private int yearsEx;
	private static int numEmployees;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, double salary, int yearsEx)
	{
		this.name = name;
		this.salary = salary;
		this.yearsEx = yearsEx;
		numEmployees++;
	}
	
	public Employee(String str)
	{
		String info = str;
		Scanner scan = new Scanner (info);
		scan.useDelimiter(":");
		name = scan.next();
		salary = scan.nextDouble();
		yearsEx = scan.nextInt();
		numEmployees++;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getYears()
	{
		return yearsEx;
	}
	
	public String setName()
	{
		String newName;
		System.out.println("what is the new name? ");
		Scanner scan = new Scanner(System.in);
		newName = scan.nextLine();
		
		return newName;
	}

	public void setYears()
	{
		yearsEx += 1;
	}
	
	public void setYears(int numYears)
	{
		yearsEx = numYears;
	}
	
	public void raiseSalary(double byPercent)
	{
		salary = salary + (salary * (byPercent / 100));
	}
	
	public Employee moreExperience(Employee e)
	{
		if(this.getYears() > this.getYears())
		{
			return this;
		}
		else
		{
			return this;
		}
	}
	
	public static int getNumEmployees()
	{
		return numEmployees;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String str1 = "";
		str1 = "\nName: " + getName() + "\n" + "Salary: "
		+ currency.format(getSalary()) + "\nYears of Experience: " 
		+ getYears() + "\n";
		
		return str1;
	}
}
