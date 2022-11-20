package Part_08;

public class Homework_1 {

	public static void main(String[] args) {
		String template = "Санкт-Петербург был основан в %d году %s. За свою историю он носил имена: %s, %s, %s. Сейчас многие зовут его просто \"%s\".";
		Integer I = 1703;
		String a = "Петром Первым";
		String[] arrayNames = new String[]{"Санкт-Петербург", "Петроград", "Ленинград"};
		String b = "Питер";

		System.out.println(String.format(template,I,a,arrayNames[0],arrayNames[1],arrayNames[2],b));
	}

}
