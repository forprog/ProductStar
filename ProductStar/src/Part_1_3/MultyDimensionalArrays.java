package Part_1_3;

public class MultyDimensionalArrays {

	public static void main(String[] args) {
		
		String arr[][] = {{"1","2"},{"4","5","6"}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
