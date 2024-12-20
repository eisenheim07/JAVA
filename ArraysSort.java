/*WAP TO SORT THE ARRAY IN ACENDING ORDER.*/

package practice;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        int[] ar = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("RESULT => " + Arrays.toString(func(ar)));

    }

    private static int[] func(int[] ar) {
        int temp;
        for (int i = 0; i < ar.length; i++) {
            for (int j = (i + 1); j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                    ;
                }
            }
        }
        return ar;
    }

}
