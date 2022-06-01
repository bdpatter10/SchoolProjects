/*Name: Blake Patterson      
 * Date: June 13 2018
 * Program Description: Zip code driver takes converts input file into 
 * an organized zipCode object and prints it formated
 */
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;



public class ZipCodeDriver 
{

	public static void main(String[] args)
	{
		
		int count = 0;
		String information;
		ZipCode zip;
		
		String fName;
		String lName ;
		int zipC;
		ZipCode[] zipArray = new ZipCode[50];
	
		try
		{
		FileReader read = new FileReader("NameAndZipList.txt");
		Scanner scan = new Scanner(read);
		
		while(scan.hasNext())
		{
		fName = scan.next();
		lName = scan.next();
		zipC = scan.nextInt();
		
		zip = new ZipCode(fName, lName, zipC);
		zipArray[count] = zip;

		count++;
		}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		for (int i = 0; i < count; i++ )
		{
			System.out.printf( "%-20s %15d \n", zipArray[i].getLFName() 
					, zipArray[i].getZipCode());
		}
		
	
	}


}
