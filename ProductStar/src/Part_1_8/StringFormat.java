package Part_1_8;

public class StringFormat {

	public static void main(String[] args) {
		String str = String.format("String with format %16.2f", 1000.0/3.0);
		System.out.println(str);
		
		System.out.printf("%,.2f%n",10000.0/3.0);
		System.out.printf("%, (.2f%n",-10000.0/3.0);
		System.out.printf("%09.2f%n",10000.0/3.0);
	}

}
