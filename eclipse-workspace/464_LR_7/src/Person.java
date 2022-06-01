
public class Person {
       public String last;
       public String first;
       public String middle;
out.write(" "); out.write(person.middle);
public static String toString(Person person) { return person.last + ", " + person.first
+ ((person.middle == null) ? "" : " " + person.middle);
public Person(String last, String first, String middle) { this.last = last;
} }