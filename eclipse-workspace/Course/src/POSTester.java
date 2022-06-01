import java.io.IOException;
import jsjf.*;

/**
 * Demonstrates the use of a list to manage a set of objects.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class POSTester
{
	/**
	 * Creates and populates a Program of Study. Then saves it using serialization.
	 */
   public static void main(String[] args) throws IOException
   {
      ProgramOfStudy pos = new ProgramOfStudy();
      OrderedList<Course> order = new OrderedList<Course>();
      //System.out.println(pos.find("CSE", 101));
      
      pos.addCourse(new Course("CS", 101, "Introduction to Programming", "A-"));
      pos.addCourse(new Course("ARCH", 305, "Building Analysis", "A"));
      pos.addCourse(new Course("GER", 210, "Intermediate German"));
      pos.addCourse(new Course("CS", 320, "Computer Architecture"));
      pos.addCourse(new Course("THE", 201, "The Theatre Experience"));
   	
      
      Course arch = pos.find("CS", 320);
      pos.addCourseAfter(arch, new Course("CS", 321, "Operating Systems"));
   	
      Course theatre = pos.find("THE", 201);
      theatre.setGrade("A-");
   	
      
      Course german = pos.find("GER", 210);
      pos.replace(german, new Course("FRE", 110, "Beginning French", "B+"));
      
      Course fre = pos.find("FRE", 110);
      Course bArch = pos.find("ARCH", 305);
    	  Course op = pos.find("CS", 321);
     /* order.add(fre);
      order.add(bArch);
      order.add(op);
      order.add(theatre);
      order.add(arch);*/
    	  
      
    	  System.out.println("comparing two courses based on prefix and number"
    	  		+ ".\nif the first prefix comes first in the alphabet a\n"
    	  		+ "negative number will be displayed and the opposite is true"
    	  		+ "\nif the prefix is the same and the first number is smaller"
    	  		+ "\na negative number will be displayed if the courses are"
    	  		+ "\nthe same a zero will be displayed.");
      System.out.println("ARCH 305 and GER 210: " + bArch.compareTo(german));
      System.out.println("CS 320 and CS 321: " + arch.compareTo(op));
      System.out.println("FRE 110 and THE 201: " + fre.compareTo(theatre));
      System.out.println("ARCH 305 and CS 321: " +  bArch.compareTo(op));
      System.out.println("CS 320 and CS 320: " + arch.compareTo(arch));
      //System.out.println(pos.getList());
      
     System.out.println("\n" + pos);
      
     
   	
    //  pos.save("ProgramOfStudy");		
   }
}