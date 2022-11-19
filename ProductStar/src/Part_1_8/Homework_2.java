package Part_1_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework_2 {

	public static void main(String[] args) {
		System.out.println(testIPAdress("29.0.1.0"));
	}
	
	public static boolean testIPAdress(String IPAdress) {
		//Pattern pattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
		Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
		Matcher matcher = pattern.matcher(IPAdress);
		return matcher.matches();

	}

}
