package day11.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortedListExample {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Oka");
        students.add("Widiawan");
        students.add("Ozu");
        students.add("Bezarius");
        students.add("Widiawan");

        Collections.sort(students);
        students.forEach(student ->
        System.out.println("Student : " + student)
        );
        
        Integer index = Collections.binarySearch(students, "Ozu");
        System.out.println("Ozu Found In Index : " + index);
    }
}
