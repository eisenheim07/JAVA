package practice;

import java.util.*;

public class Filters {


    public static void main(String[] args) {
        filter1();
        filter2();
        filter3();
        filter4();
    }

    private static void filter1() {
        List<Integer> integers = Arrays.asList(33, 44, 55, 12, 77, 32, 40);
        integers = integers.stream().filter(marks -> marks >= 33).toList();
        System.out.println("PASSED => " + integers);
    }

    private static void filter2() {
        List<Integer> integers = Arrays.asList(1, 33, 44, 55, 12, 77, 32, 40);
        integers = integers.stream().map(marks -> {
            if (marks < 33) {
                marks = marks + 5;
            }
            return marks;
        }).toList();
        System.out.println("GRACE => " + integers);
    }

    private static void filter3() {
        List<Integer> integers = Arrays.asList(33, 44, 55, 12, 77, 32, 40);
        integers = integers.stream().sorted().toList();
        System.out.println("SORTED => " + integers);
        integers = integers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("REVERSE => " + integers);
    }

    private static void filter4() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaaaaa");
        strings.add("aaaa");
        strings.add("aaaaa");
        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).stream().count());     /*GETTING STRING COUNT*/
        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).get());    /*GETTING STRING*/
    }

}
