/*WAP TO CREATE A GIVEN ARRAY THROUGH POS[] AT POS[] INDEXES WITH AR[] ELEMENTS.*/

package javac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PosTargetArray {

	public static void main(String args[]) {
		int ar[] = { 0, 1, 2, 3, 4 };
		int pos[] = { 0, 1, 2, 2, 1 };
		System.out.print("RESULT => " + Arrays.toString(func(ar, pos)));
	}

	private static int[] func(int ar[], int pos[]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			list.add(pos[i], ar[i]);
		}

		int target[] = new int[5];
		for (int i = 0; i < list.size(); i++) {
			target[i] = list.get(i);
		}
		return target;
	}

}
