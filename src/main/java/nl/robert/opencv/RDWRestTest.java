package nl.robert.opencv;

import org.junit.Test;

import nl.robert.opencv.rwd.RDWRest;

public class RDWRestTest {

	@Test
	public void test() {
		RDWRest rest = new RDWRest();
		String rdwInfo = rest.getRDWInfo("4-XXB-16");
		
		System.out.println(rdwInfo);
	}

}
