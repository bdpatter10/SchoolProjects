import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isValidTester {
	
	@Test
	void SR1() {
		String number = "";
		assertFalse(isValid.IsValidMod10Number(number));
	}

	@Test
	void SR2() {
		String number = "0000000000000000";
		assertTrue(isValid.IsValidMod10Number(number));
	}
	
	@Test
	void SR3() {
		String number = "5450000000001010";
		assertTrue(isValid.IsValidMod10Number(number));
	}
	
	@Test
	void SR4() {
		String number = "5500000000000004";
		assertTrue(isValid.IsValidMod10Number(number));
	}
}
