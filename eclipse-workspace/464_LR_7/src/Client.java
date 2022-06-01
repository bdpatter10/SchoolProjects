
public class Client1 {
public static void printPerson(Writer out, Person person) throws IOException { out.write(person.first);
out.write(" ");
if (person.middle != null) {
out.write(person.middle); out.write(" ");
} out.write(person.last);
}}
public class Client2 {
public static String formatPerson(Person person) {
String result = person.last + ", " + person.first; if (person.middle != null)
result += " " + person.middle; return result;
}}
public class Client3 {
public static void display(Writer out, Person person) throws IOException { out.write(person.last);
out.write(", "); out.write(person.first);
if (person.middle != null) {
} }}
public class Client4 {
}}
public class Person {
       public String last;
       public String first;
       public String middle;
out.write(" "); out.write(person.middle);
public static String toString(Person person) { return person.last + ", " + person.first
+ ((person.middle == null) ? "" : " " + person.middle);
public Person(String last, String first, String middle) { this.last = last;
} }