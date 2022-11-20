package day20.exam.exam1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import org.apache.commons.net.ftp.FTPClient;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            String menu = null;
            List<Student> students = ServerUtils.loadStudentDataFromFile();
            ObjectMapper mapper = new JsonMapper();
            FTPClient ftpClient = ServerUtils.connectToFtpServer();
            System.out.println("Server is Running");
            do {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                menu = reader.readLine();
                System.out.println("Client Issue " + menu + " command!");

                switch (menu) {
                    case "registration" -> {
                        String studentJSON = reader.readLine();
                        Student student = mapper.readValue(studentJSON, Student.class);
                        students.add(student);
                        ServerUtils.saveStudentToFile(students);
                    }
                    case "login" -> {
                        String studentJSON = reader.readLine();
                        Student loggedinStudent = mapper.readValue(studentJSON, Student.class);
                        for (Student student : students) {
                            if (student.getUsername().equals(loggedinStudent.getUsername()) && student.getPassword().equals(loggedinStudent.getPassword())) {
                                System.out.println("Logged In " + loggedinStudent.getUsername() + " Success");
                            }
                        }

                    }
                    case "update" -> {
                        String studentJSON = reader.readLine();
                        Student updateStudent = mapper.readValue(studentJSON, Student.class);
                        Boolean found = false;
                        for (Student student : students) {
                            if (student.getId().equals(updateStudent.getId())) {
                                found = true;
                                student.setName(updateStudent.getName());
                                student.setUsername(updateStudent.getUsername());
                                student.setPassword(updateStudent.getPassword());
                                student.setMarks(updateStudent.getMarks());
                                ServerUtils.saveStudentToFile(students);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student with id : " + updateStudent.getId() + " is Not Found");
                        }

                    }
                    case "multithread" -> {
                        ShowStudentDataThread sendStudentData = new ShowStudentDataThread(students);
                        sendStudentData.start();
                        SendStudentDataToFTPThread sendStudentDataToFTP = new SendStudentDataToFTPThread(ftpClient, students);
                        sendStudentDataToFTP.start();

                    }
                }
            } while (true);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
