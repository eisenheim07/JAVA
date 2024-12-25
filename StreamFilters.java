package javac;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilters {

    public static void main(String[] args) {
        String[] ar = {"a", "aa", "aaa", "aaaa", "aaaaa"};
        Arrays.stream(ar).forEach(str -> System.out.println(str + " " + str.length()));

        System.out.println();

        int[] integers = {12, 1, 23, 43, 11, 10};
        int max = Arrays.stream(integers).max().getAsInt();
        int min = Arrays.stream(integers).min().getAsInt();
        double average = Arrays.stream(integers).average().getAsDouble();
        int sum = Arrays.stream(integers).sum();
        long counts = Arrays.stream(integers).count();
        System.out.println("MAXIMUM " + max + ", MINIMUM " + min + ", AVERAGE " + average + ", SUM " + sum + ", COUNT " + counts);


        System.out.println();

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Raushan", "PA", 25));
        employees.add(new Employee("Rohan", "HR", 15));
        employees.add(new Employee("Deepak", "IT", 22));
        employees.add(new Employee("Rehaan", "HR", 18));
        employees.add(new Employee("Amit", "Finance", 17));
        employees.add(new Employee("Amit", "IT", 21));

        employees.stream().filter(emp -> emp.getExp() > 20).forEach(System.out::println);

        System.out.println();

        Map<String, Long> map = employees.stream()
                .filter(emp -> emp.getExp() > 20)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map);

        System.out.println();

        employees.stream().filter(emp -> emp.getExp() > 20)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((deptt, count) -> System.out.println("Department " + deptt + ", " + "COUNT " + count));
    }

}

class Employee {
    private final String name;
    private final String department;
    private final int exp;

    public Employee(String name, String department, int exp) {
        this.name = name;
        this.department = department;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", department='" + department + '\'' + ", exp=" + exp + '}';
    }
}
