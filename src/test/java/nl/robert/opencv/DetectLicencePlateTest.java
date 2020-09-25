package nl.robert.opencv;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class DetectLicencePlateTest {

	@Test
	public void test() {
		String input = "26-JVN-9";
		
		assertTrue(isDutchLicencePlate(input));
	}
	
	public boolean isDutchLicencePlate(String input) {
		String regex = "(([a-zA-Z]{3}[0-9]{3})|(\\w{2}-\\w{2}-\\w{2})|([0-9]{2}-[a-zA-Z]{3}-[0-9]{1})|([0-9]{1}-[a-zA-Z]{3}-[0-9]{2})|([a-zA-Z]{1}-[0-9]{3}-[a-zA-Z]{2}))";
		 Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		 Matcher matcher = pattern.matcher(input);
		 matcher.find();

		 System.out.println(matcher.group());
		 return true;
	}

}
