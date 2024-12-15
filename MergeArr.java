package practice;

import java.util.Arrays;

public class MergeArr {

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3};
        int[] ar2 = {4, 5, 6};
        System.out.println("RESULT => " + Arrays.toString(func(ar1, ar2))); ;
    }

    private static int[] func(int[] ar1, int[] ar2) {
        int[] arr = new int[ar1.length + ar2.length];
        int count = 0;
        for (int i = 0; i < ar1.length; i++) {
            arr[count++] = ar1[i];
        }
        for (int i = 0; i < ar2.length; i++) {
            arr[count++] = ar2[i];
        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
