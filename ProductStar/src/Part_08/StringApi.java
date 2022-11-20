package Part_08;

import java.util.Arrays;

public class StringApi {

	public static final int aaa = 2;
	
	public static void main(String[] args) {
		charAt();
		compareTo();
		concat();
		contains();
		copyValueOf();
		equals();
		indexOf();
		isEmpty();
		isBlank();
		join();
		split();
		substring();
		toCharArray();
		length();
		toLowerCase();
		trim();
		replace();
		replaceAll();
	}

	private static void replaceAll() {
		int i1 = Integer.parseInt("aaaaa123dd2".replaceAll("[\\D]", ""));
		System.out.println(i1);
		
	}

	private static void replace() {
		String str1 = "azazazaza".replace('a', 'z');
		System.out.println(str1);
	}

	private static void trim() {
		String str1 = "    fhjghdjsfgj   ".trim();
		System.out.println(str1);
	}

	private static void length() {
		int len = "abcde".length();
		System.out.println(len);
	}

	private static void toLowerCase() {
		String str1 = "HGDHJDGHJDGHJvvdaAAA".toLowerCase();
		System.out.println(str1);
	}

	private static void toCharArray() {
		char[] chars = "abcdefg".toCharArray();
		System.out.println(Arrays.toString(chars));
	}

	private static void substring() {
		String str1 = "abc".substring(1,3);
		System.out.println(str1);
		
	}

	private static void split() {
		String[] str1 = "aa.bb.cc..dd".split("\\.");
		System.out.println(Arrays.toString(str1));
	}

	private static void join() {
		String str1 = "aaa", str2 = "bbb", str3 = new String(), str4 = "ddd";
		String total = String.join("\n",str1, str2, str3, str4);
		System.out.println(total);
	}

	private static void isBlank() {
		boolean b1 = "abc".isBlank();
		System.out.println(b1);
		boolean b2 = "".isBlank();
		System.out.println(b2);
		boolean b3 = "     ".isBlank();
		System.out.println(b3);
		
	}

	private static void isEmpty() {
		boolean b1 = "abc".isEmpty();
		System.out.println(b1);
		boolean b2 = "".isEmpty();
		System.out.println(b2);
		boolean b3 = "     ".isEmpty();
		System.out.println(b3);
	}

	private static void indexOf() {
		int i = "abc".indexOf('c');
		System.out.println(i);
	}

	private static void equals() {
		boolean b1 = "abc".equals("ABC");
		System.out.println(b1);
		boolean b2 = "abc".equalsIgnoreCase("ABC");
		System.out.println(b2);
	}

	private static void copyValueOf() {
		char[] textArray = {'a','b','c','d','e'};
		String newString = String.copyValueOf(textArray,1,3);
		System.out.println(newString);
	}

	private static void contains() {
		boolean b1 = "abc".contains("ab");
		System.out.println(b1);
		boolean b2 = "abc".contains("ac");
		System.out.println(b2);
		
	}

	private static void concat() {
		String str1="aaa", str2 = "bbb";
		String concat = str1.concat(str2);
		System.out.println(concat);
		str1=str1+str2;
		System.out.println(str1);
	}

	private static void compareTo() {
		String str1 = "aaaa", str2 = "zzz";
		int i = str1.compareTo(str2);
		System.out.println(i);
				
		
	}

	private static void charAt() {
		char myChar = "123".charAt(2);
		System.out.println(myChar);
	}

}
