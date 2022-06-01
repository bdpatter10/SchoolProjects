package jsjf.exceptions;

public class ElementNotFoundException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 * @param element - the element that could not be found
	 */
	public ElementNotFoundException(String element)
	{
		super("The " + element + " was not found.");
	}
}
