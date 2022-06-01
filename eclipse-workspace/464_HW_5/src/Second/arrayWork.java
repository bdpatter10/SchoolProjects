package Second;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class arrayWork {

	public arrayWork() {
		
	}
	
	public double[] buildArray() throws FileNotFoundException {
		  double[] data = new double[10];
		// Read Integer values from a file the data array data[]
		  Scanner console = new Scanner(System.in);
	      System.out.print("Input file: ");
	      String inputFileName = console.next();
	      // Construct the Scanner and PrintWriter objects for reading and writing

	      File inputFile = new File(inputFileName);
	      Scanner in = new Scanner(inputFile);

	      // Read the input and write the output

	      double total = 0;
	      int i = 0;

	      while (in.hasNextDouble())
	      {
	         data[i] = in.nextDouble();
	         i++;
	      }

	      in.close();
	      return data;
	}
	
	public double[] sortArray(double[] data, int size) {
		
		 double temp;
		 	boolean exchanged = true;
		 	for (int i = 0; i < size && exchanged; i++)
		 	{
		 		exchanged = false;
		 		for (int j = size - 1; j >= i + 1; j--)
		 		{
		 			if (data[j] < data[j - 1])
		 			{
		 				temp = data[j];
		 				data[j] = data[j - 1];
		 				data[j-1] = temp;
		 				exchanged = true;
		 			}
		 		}
		 }
		return data;
	}
	
	public double calcSum(double[] data,int size ) {
		double sum = 0.0;
		// length is changed to size because it is duplicate code
	    for ( int i = 0; i < size; i++)
	    {
	    		sum += data [ i ];
	    }
		return sum;
	}
	
	public double calcVarSum(double[] data,int size, double mean) {
		double varsum = 0.0;
	      for (int i = 0; i < size; i++)
	      {
	           varsum = varsum  + ((data [ i ] - mean) * (data [ i ] - mean));
	      }
		return varsum;
	}
	
}
