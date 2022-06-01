/*-------------------------------
//Name: Blake Patterson
//Title: Tempconverter.java
//AUTHOR: Modified from an example in Lewis and Loftus book 
//SPECIFICATION: Computes the Fahrenheit equivalent of a specific Celsius value
//
// TIME SPENT: 45 minutes
//------------------------------*/
public class TempConverter
{
	//Computes the Fahrenheit equivilent of a specific Celcius value using the formula F= (9/5)C +32.
	public static void main (String[] args)
	{ 
		
		//constant variables 
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		
		//declare variables
		int celsiusTemp = 24;  //value to convert
		double fahrenheitTemp;
		
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		
		System.out.println ("Celsius Temperature: " + celsiusTemp);
		System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
		
		System.out.print("pizza" .length());
		
	}
		
}
