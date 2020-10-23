package nl.robert.opencv.anpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicencePlateValidator {
	private static String[] licencePlateRegexes = { 
			"^([A-Z]{2})(\\d{2})(\\d{2})$", // 1 XX-99-99 (since 1951)
			"^(\\d{2})(\\d{2})([A-Z]{2})$", // 2 99-99-XX (since 1965)
			"^(\\d{2})([A-Z]{2})(\\d{2})$", // 3 99-XX-99 (since 1973)
			"^([A-Z]{2})(\\d{2})([A-Z]{2})$", // 4 XX-99-XX (since 1978)
			"^([A-Z]{2})([A-Z]{2})(\\d{2})$", // 5 XX-XX-99 (since 1991)
			"^(\\d{2})([A-Z]{2})([A-Z]{2})$", // 6 99-XX-XX (since 1999)
			"^(\\d{2})([A-Z]{3})(\\d{1})$", // 7 99-XXX-9 (since 2005)
			"^(\\d{1})([A-Z]{3})(\\d{2})$", // 8 9-XXX-99 (since 2009)
			"^([A-Z]{2})(\\d{3})([A-Z]{1})$", // 9 XX-999-X (since 2006)
			"^([A-Z]{1})(\\d{3})([A-Z]{2})$", // 10 X-999-XX (since 2008)
			"^([A-Z]{3})(\\d{2})([A-Z]{1})$", // 11 XXX-99-X (since 2015)
			"^([A-Z]{1})(\\d{2})([A-Z]{3})$", // 12 X-99-XXX
			"^(\\d{1})([A-Z]{2})(\\d{3})$", // 13 9-XX-999
			"^(\\d{3})([A-Z]{2})(\\d{1})$", // 14 999-XX-9

			// likely upcoming plate patterns
			// ^(\\d{3})(\\d{2})([A-Z]{1})$/, // 999-99-X
			// ^([A-Z]{3})(\\d{2})(\\d{1})$/, // XXX-99-9
			// ^([A-Z]{3})([A-Z]{2})(\\d{1})$/, // XXX-XX-9
	};
	
	public void validateLicensePlate(LicencePlate licencePlate) {
		// Standard Dutch License plate patterns (from 1951 onward)
		System.out.println("input: " + licencePlate.getRawLicencePlate());
		for(String regex: licencePlateRegexes) {
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			 Matcher matcher = pattern.matcher(licencePlate.getRawLicencePlate().replace("-", ""));
			 if(matcher.find()) {
				 licencePlate.setDutchLicencePlate(true);
				 licencePlate.setNormalizedLicencePlate(matcher.group());
				 licencePlate.setCarDetail(lookupCarDetail(licencePlate.getNormalizedLicencePlate()));
				 break;
			 }
		}
	}
	
	private String lookupCarDetail(String licencePlate) {
		//RDWRest rdwRest = new RDWRest();
		return "";//rdwRest.getRDWInfo(licencePlate);
	}
}