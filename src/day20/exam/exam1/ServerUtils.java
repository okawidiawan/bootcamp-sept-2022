package day20.exam.exam1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.net.ftp.FTPClient;

public class ServerUtils {

    public static final String DB_FILE_NAME = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day20\\exam\\exam1\\User.txt";

    public static List<Student> loadStudentDataFromFile() {

        List<Student> students = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(DB_FILE_NAME));
            String line = null;
            Integer lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (lineNumber > 1) {
                    Student student = new Student(line);
                    students.add(student);
                }
                lineNumber++;
            }
            reader.close();

        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("No Database is Found");
            } else {
                e.printStackTrace();
            }
        }
        return students;
    }

    public static void saveStudentToFile(List<Student> students) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(DB_FILE_NAME));
            Student maxMarksStudent = getMaxMarksStudent(students);
            String header = maxMarksStudent.generateHeader();
            writer.write(header + "\n");
            for (Student student : students) {
                writer.write(student.generateCsv(true) + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FTPClient connectToFtpServer() throws IOException {
        FTPClient client = new FTPClient();
        client.connect("localhost", 21);
        client.login("oka", "admin");
        client.enterLocalPassiveMode();
        return client;
    }

    public static Student getMaxMarksStudent(List<Student> students) {
        Student maxMarksStudent = null;
        for (Student student : students) {
            if (maxMarksStudent == null) {
                maxMarksStudent = student;
            } else if (student.getMarks().size() > maxMarksStudent.getMarks().size()) {
                maxMarksStudent = student;
            }
        }
        return maxMarksStudent;
    }

}
