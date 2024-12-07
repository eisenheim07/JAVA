/*WAP TO CREATE AN ARRAY WITH NON-DESCENDING ARRAY, 
ALL UNIQUE ELEMENTS SHOULD BE AT THE STARTING OF ARRAY
WITHOUT USING ANY EXTERNAL ARRAY, AND RETURN ITS INDEX.*/

package practice;

import java.util.Arrays;

public class RemoveDupEle {

	public static void main(String[] args) {

		int[] ar = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 7, 7, 8, 8, 8 };
		System.out.print("RESULT => " + func(ar)) ;

	}

	private static int func(int ar[]) {
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[j] != ar[i]) {
				ar[++j] = ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		return (j+1);
	}

}
