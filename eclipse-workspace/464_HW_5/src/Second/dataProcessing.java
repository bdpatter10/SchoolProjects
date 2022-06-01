package Second;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program reads a file with double values, then sort the aray, and finally calculate some statistics.
*/
public class dataProcessing
{
   public static void main(String[] args) throws FileNotFoundException
   {
	   // new class to reduce class size and size of main method
	   arrayWork work = new arrayWork();
     
      double[] data = new double[10];
      data = work.buildArray();

     // Sort the data array
     int size = data.length;
     
     data = work.sortArray(data,size);

	      // calculate statistics
     	  // lenght is removed duplicate code
	      //int length = data.length;
	      double med, var, sd, mean, sum, varsum;

	      sum = work.calcSum(data, size);
	      med   = data [ size / 2 ];
	      mean = sum / (double) size;

	      varsum = work.calcVarSum(data, size, mean);
	      var = varsum / ( size - 1 );
	      sd  = Math.sqrt ( var );

	      System.out.println ("length:                   " + size);
	      System.out.println ("mean:                    " + mean);
	      System.out.println ("median:                 " + med);
	      System.out.println ("variance:                " + var);
          System.out.println ("standard deviation: " + sd);


   }


}
