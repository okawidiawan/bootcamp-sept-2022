package day11.collection;

import java.util.ArrayList;

public class ArrayListOfStudentExample {

    public static void main(String[] args) {
        Student oka = new Student(1, "Oka", 30);
        Student widiawan = new Student(2, "Widiawan", 28);

        ArrayList<Student> students = new ArrayList<>();
        students.add(oka);
        students.add(widiawan);

        for (Student student : students) {
            System.out.println("Student : " + student.getId() + " " + student.getName() + " " + student.getAge());
        }
    }
}