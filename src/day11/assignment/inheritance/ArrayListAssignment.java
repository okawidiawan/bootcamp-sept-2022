package day11.assignment.inheritance;

import java.util.ArrayList;

public class ArrayListAssignment {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Peter");
        students.add("John");
        students.add("Billy");
        System.out.println("Students Are : " + students);
        
        students.add("Jack");
        
        System.out.println("Student after adding 1, are : " + students);
        
        students.remove("Peter");
        
        System.out.println("Student after remove 1, are : " + students);
        
        ArrayList<String> retainStudents = new ArrayList<>();
        retainStudents.add("John");
        retainStudents.add("Jack");
        students.retainAll(retainStudents);
        
        System.out.println("Student after retaining 2, are : " + students);
        

    }

}
