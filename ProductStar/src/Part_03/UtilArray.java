package Part_03;

import java.util.Arrays;

public class UtilArray {

	public static void main(String[] args) {
		int[] arr = {2,1,9,29,3};
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = arr[i]+5;
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

		int[][] arr2d = {{1,2},{3,4}};
		System.out.println(Arrays.toString(arr2d));
		
		for (int i = 0; i < arr2d.length; i++) {
			System.out.println(Arrays.toString(arr2d[i]));
		}
		
		int[][][][][] myArr;
	}

}
