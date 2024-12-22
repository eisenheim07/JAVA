package javac;

import java.util.*;

public class Arr2Max {
    public static void main(String[] args) {
        int[] arr = {1001, 11, 22, 33, 44, 55, 23, 34, 45, 56, 100, 200, 1000, 1003};
//        func(arr);
        System.out.println("RESULT => " + funcSL(arr));
    }

    private static int funcSL(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > largest) {
                second = largest;
                largest = j;
            } else if (j > second) {
                second = j;
            }
        }
//        System.out.println(second);
        return second;
    }

    private static void func(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("MAXIMUM => " + max);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (max - arr[i] != 0) {
                arrayList.add(max - arr[i]);
            }
        }

        int min = arrayList.getFirst();
        System.out.println("LIST => " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (min > arrayList.get(i)) {
                min = arrayList.get(i);
            }
        }
        System.out.println("2nd MAXIMUM => " + (max - min));
    }
}
