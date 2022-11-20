package day20.exam.exam1;

import java.util.List;

public class ShowStudentDataThread extends Thread {
    
    private List<Student> students;
    
    public ShowStudentDataThread(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public void run() {
        Student maxMarksStudent = null;
        for (Student student : students) {
            if (maxMarksStudent == null) {
                maxMarksStudent = student;
            } else if (student.getMarks().size() > maxMarksStudent.getMarks().size()) {
                maxMarksStudent = student;
            }
        }
        System.out.println(maxMarksStudent.generateHeader());
        for (Student student : students) {
            System.out.println(student.generateCsv(false));
        }
    }
    
}
