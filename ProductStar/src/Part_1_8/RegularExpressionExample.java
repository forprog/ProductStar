package Part_1_8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		/*System.out.println(testMobile("555-1234567"));
		System.out.println(testMobile("666-12345678"));
		System.out.println(testMobile("555-1234F67"));
		System.out.println(testMobile("55512345678"));

		System.out.println(testEmail("word@yandex.ru"));
		System.out.println(testEmail("word-0@yandex.ru"));
		System.out.println(testEmail("word+0@yandex.com"));
		System.out.println(testEmail("word-0@yandex.0"));
		System.out.println(testEmail("word-0@yandex"));

		System.out.println("============================");

		System.out.println(testUrl("word-0@yandex"));
		System.out.println(testUrl("https://java.productstar.ru/string-and-regex-4/ffff"));
		
		System.out.println(test1("ahb acb aeb aeeb adcb axeb"));
		System.out.println(test2("aba aca aea abba adca abea"));
		System.out.println(test3("aba aca aea abba adca abea"));
		test4("aa aba abba abbba abca abea","ab+a");
		test4("aa aba abba abbba abca abea","ab*a");
		test4("aa aba abba abbba abca abea","ab?a");
		test4("ab abab abab abababab abea","(ab)+");
		test4("a.a aba aea","a\\.a");
		test4("2+3 223 222","2\\+3");
		test4("23 2+3 2++3 2+++3 345 567","2\\++3");
		test4("23 2+3 2++3 2+++3 345 567","2\\+*3");
		test4("*+ *q+ *qq+ *qqq+ *qqq qqq+","\\*q+\\+");
		test4("aba accca azzza awwww a","a\\w+?a");
		System.out.println(test1("Îãî Àãà Àííåòóøêè"));*/
		System.out.println(test2("ôôôôôÿ"));
		
		
		
		
	}

	public static boolean testMobile(String number) {
		Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();

	}

	public static boolean testEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\[.A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	public static boolean testUrl(String url) {
		String URL_PATTERN = "^(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern pattern = Pattern.compile(URL_PATTERN);
		Matcher matcher = pattern.matcher(url);
		return matcher.matches();

	}
	
	public static boolean test1(String input) {
		String PATTERN = "À.+à";
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(input);
				
		return matcher.matches();
		
	}

	public static boolean test2(String input) {
		String PATTERN = "ß*ô";
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(input);
		
		return matcher.matches();
		
	}
	public static boolean test3(String input) {
		String PATTERN = "ab.a";
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(input);
				
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		return matcher.matches();
		
	}
	
	public static void test4(String input, String patternStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(input);
				
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
				
	}
	
}
