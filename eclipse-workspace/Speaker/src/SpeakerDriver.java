
public class SpeakerDriver 
{
	public static void main(String[] args)
	{
		Speaker current = new Mom();
		System.out.print("Mom says to ");
		current.speak();
		
		current = new Dad();
		System.out.print("Dad says to ");
		current.speak();
		
		current = new Child();
		System.out.print("Child says to ");
		current.speak();
		
	}

}
