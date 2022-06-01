/*Name: Blake Patterson
 * Date: June 18th 2018
 * Description: Exception class 
 */
public class StringTooLongException extends Exception
{
	public StringTooLongException()
	{
		super();
	}
	
	public StringTooLongException(String message)
	{
		super(message);
	}
}
