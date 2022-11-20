package day11.collection;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();
        students.add("Oka");
        students.add("Widiawan");
        students.add("Ozu");
        students.add("Bezarius");
        students.add("Widiawan");

        students.forEach(student
                -> System.out.println("Student : " + student)
        );
    }

}
