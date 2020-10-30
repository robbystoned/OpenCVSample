package nl.robert.opencv.rwd;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDWRestTest {

	@Test
	public void test() {
		RDWRest rdwRest = new RDWRest();
		String rdwInfo = rdwRest.getRDWInfo("12-NVP-6");
		assertEquals("Car not in RDW database", rdwInfo);
	}

}
