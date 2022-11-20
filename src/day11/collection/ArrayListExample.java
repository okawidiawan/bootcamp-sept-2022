package day11.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Oka");
        students.add("Widiawan");

        System.out.println("Iterate collection using iterator");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println("Student : " + student);
        }
        System.out.println("");

        System.out.println("Use for to iterate collection");
        for (int i = 0; i < students.size(); i++) {
            String student = students.get(i);
            System.out.println(i + ". Student : " + student);
        }
        System.out.println("");

        System.out.println("Use for each");
        for (String student : students) {
            System.out.println("Student : " + student);
        }
        System.out.println("");

        System.out.println("Use Stream");
        students.stream()
                .forEach(student -> System.out.println("Student : " + student));
    }

}
