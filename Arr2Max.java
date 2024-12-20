package practice;

import java.util.ArrayList;

public class Arr2Max {
    public static void main(String[] args) {
        int[] arr = {1001,11,22,33,44,55,23,34,45,56,100,200,1000};
        func(arr);
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
        System.out.println("2nd MAXIMUM => " + (max-min));
    }
}
