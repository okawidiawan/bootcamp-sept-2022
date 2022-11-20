package day11.collection;

import java.util.HashSet;

public class HashSetNoDuplicationExample {

    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
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
