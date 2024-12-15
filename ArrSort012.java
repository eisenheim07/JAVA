package practice;

import java.util.Arrays;

public class ArrSort012 {

    public static void main(String[] args) {
        int[] ar = {0, 1, 1, 1, 1, 2, 1, 0, 0, 2, 0, 1, 1, 0, 2, 2, 2};
        System.out.println("RESULT => " + Arrays.toString(func(ar)));
    }

    private static int[] func(int[] ar) {
        int c0 = 0, c1 = 0, c2 = 0, count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                c0 += 1;
            } else if (ar[i] == 1) {
                c1 += 1;
            } else {
                c2 += 1;
            }
        }

        for (int i = 0; i < c0; i++) {
//            System.out.println("C0 " + i);
            ar[count++] = 0;
        }
//        System.out.println();
        for (int i = 0; i < c1; i++) {
//            System.out.println("C1 " + i);
            ar[count++] = 1;
        }
//        System.out.println();
        for (int i = 0; i < c2; i++) {
//            System.out.println("C2 " + i);
            ar[count++] = 2;
        }
//        System.out.println(Arrays.toString(ar));
        return ar;
    }

}
