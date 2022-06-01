/*Name: Blake Patterson
 * Date: June 19th 2018
 * Description: Test driver for encryption classes secret and password
 */
import java.util.Scanner;
public class EncryptionDriver 
{
	public static void main (String[] args)
	{
		//Scanner scan = new Scanner(;)
		String password = "have a nice day";
		Encryption key = new Password(password);
		
		System.out.println("original Password: " + key);
		key.encrypt();
		System.out.println("encrypted Password: " + key);
		key.decrypt();
		System.out.println("decrypted Password: " + key);
		
		key = new Secret(password);
		System.out.println("\noriginal Secret: " + key);
		key.encrypt();
		System.out.println("encrypted Secret: " + " " + key);
		key.decrypt();
		System.out.println("decrypted Secret: " + key);
	}
}
