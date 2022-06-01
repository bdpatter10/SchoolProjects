package modifiedtax.java;

import java.util.Scanner;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.*;
import java.util.List;


public class modifiedtax {
	
	public static class taxCalculation{
		
		public static String calculateTax(double income, int dep){
			String tax = "";
			double calc = 0;
		     // negative income case
		     if(income < 0) {
		    	 	if(dep >= 0 && dep <= 10) {
		    	 		tax = "invalid input for income";
		    	 	}else {
		    	 		tax = "invalid input for AGI and dependents.";
		    	 	}
		    	 	return tax;
		     }
		     // income over 1 million
		     if(income > 1000000) {
		    	 	if(dep >= 0 && dep <= 10) {
		    	 		tax = "This program does not calculate for AGI over 1 milliion";
		    	 	}else {
		    	 		tax = "invalid input for AGI and dependents.";
		    	 	}
		    	 	return tax;
		     }

		     // income between 25000 and 100000
		     if(income >= 25000 && income <= 100000) {
		    	 	if(dep < 5 && dep >= 0) {
		    	 		calc = (income * .22);
		    	 		tax = Double.toString(calc);
		    	 		return tax;
		    	 	}else if(dep >= 5 && dep <= 10) {
		    	 		calc = income * .2;
		    	 		tax = Double.toString(calc);
		    	 		return tax;
		    	 	}else if(dep < 0) {
		    	 		tax = "invalid number of dependents";
		    	 		return tax;
		    	 	}else {
		    	 		tax = "max number of dependents is 10.";
		    	 		return tax;
		    	 	}
		     }
		     // income from 100001 to 1 million
		     if(income >= 100001 && income <= 1000000) {
		    	 	if(dep < 5 && dep > 0) {
		    	 		calc = income * .27;
		    	 		tax = Double.toString(calc);
		    	 		return tax;
		    	 	}else if(dep >= 5 && dep <= 10) {
		    	 		calc = income * .25;
		    	 		tax = Double.toString(calc);
		    	 		System.out.println(tax);
		    	 		return tax;
		    	 	}else if(dep <= 0) {
		    	 		tax = "invalid number of dependents";
		    	 		return tax;
		    	 	}else {
		    	 		tax = "max number of dependents is 10.";
		    	 		return tax;
		    	 	}
		     }
		     // no tax deduction case
		     if(income < 25000) {
		    	 	tax = "no tax deducted.";
		    	 	return tax;
		     }else {
		    	 return "";
		     }
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     int dep;
	     double income;
	     double tax = 0;
	     System.out.println("how many dependents do you have?");
	     dep=scan.nextInt();
	     System.out.println("what is your AGI?");
	     income=scan.nextDouble();

	     System.out.println(taxCalculation.calculateTax(income, dep));
	     
	      //Running test cases using JunitCore
	      JUnitCore jUnitCore = new JUnitCore();
	      Result result = jUnitCore.run(modifiedtaxTest.class);
	      System.out.println("Failiure Count: " + result.getFailureCount());
	      
	      List<Failure> failures= result.getFailures();
	      
	      for (Failure each : failures)
	    	  System.out.println("To String: " + each.toString());
	      
	}

}
