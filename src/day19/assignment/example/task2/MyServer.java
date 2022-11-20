package day19.assignment.example.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {

    public static void main(String[] args) {
        ObjectMapper mapper = new JsonMapper();
        List<Student> dataStudents = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("Server is Running");
            do {
                Socket socket = serverSocket.accept();
                System.out.println("Accepting message from client");
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day19\\assignment\\example\\task2\\file.txt"));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    Student student = new Student(line);
                    dataStudents.add(student);
                }
                reader.close();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String studentListJSON = mapper.writeValueAsString(dataStudents);
                writer.write(studentListJSON + "\n");
                writer.flush();
                writer.close();
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
