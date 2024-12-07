package practice;

public class ArraysSort {

	public static void main(String[] args) {
		
		int[] ar = { 2, 3, 1, 10, 9, 12, 13, 7 };
		func(ar);
		
	}

	private static void func(int[] ar) {
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = (i + 1); j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					continue;
				} else {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}	

}
