/*WAP TO ROTATE AN ARRAY UPTO 'K' TIMES.*/

package practice;

import java.util.Arrays;

public class ArrRotation {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		func(ar, 3);

	}

	private static void func(int[] ar, int pos) {
		int temp[] = new int[ar.length];
		int i = 0;
		while(i!=pos) {
			if (i % 2 == 0) {
				for (int j = 0; j < ar.length; j++) {
					if (j < ar.length - 1) {
						temp[j + 1] = ar[j];
					} else {
						temp[0] = ar[j];
					}
				}
				System.out.println("ORIGINAL => " + Arrays.toString(ar));
				System.out.println("TEMP =>    " + Arrays.toString(temp));
				System.out.println();
			} else {
				for (int j = 0; j < temp.length; j++) {
					if (j < temp.length - 1) {
						ar[j + 1] = temp[j];
					} else {
						ar[0] = temp[j];
					}
				}
				System.out.println("TEMP =>    " + Arrays.toString(temp));
				System.out.println("ORIGINAL => " + Arrays.toString(ar));
				System.out.println();
			}
			i++;
		}
	}

}
