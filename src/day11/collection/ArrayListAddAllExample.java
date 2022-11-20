package day11.collection;

import java.util.ArrayList;

public class ArrayListAddAllExample {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Oka");
        students.add("Widiawan");
        ArrayList<String> newStudents = new ArrayList<>();
        newStudents.add("Ozu");
        newStudents.add("Bezarius");

        // Append / add all item in the end of existing list
        students.addAll(newStudents);

        students.forEach(student -> {
            System.out.println("Student : " + student);
        });
        
        
        
    }

}
