/*Name: Blake Patterson      
 * Date: June 13 2018
 * Program Description: Zip code has getters to get the info and help 
 * place it into an array of objects 
 * 
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.*;

public class ZipCode {
	
	private String lastName;
	private String firstName;
	private int zipCode;
	
	
	public ZipCode(String fName, String lName, int zip) 
	{
		lastName = lName;
		firstName = fName;
		zipCode = zip;
	
	}
	
	public String getFName()
	{
		return firstName;
	}
	
	public String getLName()
	{
		return lastName;
	}
	
	public String getLFName()
	{
		String lFName = lastName + ", " + firstName; 
		return lFName;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	
	public String toString()//throws IOException, FileNotFoundException
	{
		String info = lastName + ", " + firstName +" " + zipCode;
		
	
		return info;
		
	}
	

	

}
