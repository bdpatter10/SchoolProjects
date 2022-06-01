import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assignment2Test {
	

	 @Test 
	 public void SR0() {
		 assertEquals("Valid Card", Assignment2.Validate(5500000000000004L));
	 }
	 @Test
	 public void SR1() {
		 assertEquals("Invalid Card", Assignment2.Validate(4211111111111111L));
	 }

}
