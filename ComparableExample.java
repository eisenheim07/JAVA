/*USING COMPARABLE AND COMPARATOR.*/

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Shahbaz");
        arrayList.add("Uzair");
        arrayList.add("Puneet");
        arrayList.add("Rahul");
        arrayList.add("Faisal");
        System.out.println("UNSORTED => " + arrayList);
        Collections.sort(arrayList);
        System.out.println("SORTED => " + arrayList);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(109, 82.9, "Rahul"));
        studentArrayList.add(new Student(112, 82.1, "Mahesh"));
        studentArrayList.add(new Student(119, 81.9, "Manish"));
        studentArrayList.add(new Student(118, 69.0, "Arun"));
        studentArrayList.add(new Student(102, 78.0, "Kunal"));
        System.out.println("UNSORTED => " + studentArrayList);
        Collections.sort(studentArrayList, new SortingComparator());
        System.out.println("SORTED => " + studentArrayList);
    }

}

/*USING COMPARATOR INTERFACE*/
class Student {
    private final int rollNo;
    private final double percentage;
    private final String name;

    public Student(int rollNo, double percentage, String name) {
        this.rollNo = rollNo;
        this.percentage = percentage;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", percentage=" + percentage +
                ", name='" + name + '\'' +
                '}';
    }
}

class SortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

/*USING COMPARABLE INTERFACE*/
//class Student implements Comparable<Student> {
//    private final int rollNo;
//    private final double percentage;
//    private final String name;
//
//    public Student(int rollNo, double percentage, String name) {
//        this.rollNo = rollNo;
//        this.percentage = percentage;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "rollNo=" + rollNo +
//                ", percentage=" + percentage +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo - o.rollNo;
//    }
//}
