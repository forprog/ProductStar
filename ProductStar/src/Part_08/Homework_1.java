package Part_08;

public class Homework_1 {

	public static void main(String[] args) {
		String template = "�����-��������� ��� ������� � %d ���� %s. �� ���� ������� �� ����� �����: %s, %s, %s. ������ ������ ����� ��� ������ \"%s\".";
		Integer I = 1703;
		String a = "������ ������";
		String[] arrayNames = new String[]{"�����-���������", "���������", "���������"};
		String b = "�����";

		System.out.println(String.format(template,I,a,arrayNames[0],arrayNames[1],arrayNames[2],b));
	}

}
