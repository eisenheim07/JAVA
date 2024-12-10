package practice;

import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("RESULT => " + Arrays.toString(func(arr)));
	}

	private static int[] func(int[] arr) {
		int j = (arr.length - 1), temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[j];
			arr[j--] = arr[i];
			arr[i] = temp;
		}
//		System.out.print(Arrays.toString(arr));
		return arr;
	}

}
