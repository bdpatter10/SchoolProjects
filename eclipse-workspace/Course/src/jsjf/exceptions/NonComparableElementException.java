package jsjf.exceptions;

public class NonComparableElementException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 * @param type - the element is not a element of an ordered list
	 */
	public NonComparableElementException(String type)
	{
		super("non compatible type: " + type);
	}
}
