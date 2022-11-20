package day11.collection;

import java.util.ArrayList;

public class ArrayListRemoveAllExample {
    
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Oka");
        students.add("Widiawan");
        students.add("Ozu");
        students.add("Bezarius");
        ArrayList<String> abcentStudents = new ArrayList<>();
        abcentStudents.add("Ozu");
        abcentStudents.add("Widiawan");
        abcentStudents.add("Mirajane");
        
        students.removeAll(abcentStudents);
        for(String presentStudent : students){
            System.out.println("Present Student : " + presentStudent);
        }
        
    }
    
}
