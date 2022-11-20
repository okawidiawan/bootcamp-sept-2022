package day24.exam.task1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import day24.exam.task1.dao.DeleteDao;
import day24.exam.task1.dao.InsertDao;
import day24.exam.task1.dao.StudentSelectDao;
import day24.exam.task1.dao.UserSelectDao;
import day24.exam.task1.model.Student;
import day24.exam.task1.utils.DbUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;

public class MainServer {
    public static void main(String[] args) {
        Connection con = DbUtils.connectToDb();
        UserSelectDao userSelectDao = new UserSelectDao(con);
        InsertDao insertDao = new InsertDao(con);
        DeleteDao deleteDao = new DeleteDao(con);
        StudentSelectDao studentSelectDao = new StudentSelectDao(con);
        try {
            ServerSocket serverSocket = new ServerSocket(7000);
            String menuFromClient = null;
            System.out.println("Server is Running, Waiting for Client Response");
            ObjectMapper mapper = new JsonMapper();
            do {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                menuFromClient = reader.readLine();
                System.out.println("Client : " + menuFromClient);
                switch (menuFromClient) {
                    case "input" -> {

                        System.out.println("Client Choose Input Menu");
                        String studentJSON = reader.readLine();
                        Student student = mapper.readValue(studentJSON, Student.class);
                        insertDao.insertStudent(student);
                        writer.write(studentJSON);
                        writer.flush();
                        writer.close();
                        System.out.println("Input Student : \n" + studentJSON);
                        System.out.println("Success Input Data");
                    }
                    case "edit" -> {
                        System.out.println("Client Choose Update/Edit Menu");
                        String studentJSON = reader.readLine();
                        Student student = mapper.readValue(studentJSON, Student.class);
                        insertDao.updateStudent(student);
                        writer.write(studentJSON);
                        writer.flush();
                        writer.close();
                        System.out.println("Edit Student : \n" + studentJSON);
                        System.out.println("Success Edit Data");
                    }
                    case "delete" -> {
                        System.out.println("Client Choose Delete Menu");
                        String studentJSON = reader.readLine();
                        Student student = mapper.readValue(studentJSON, Student.class);
                        deleteDao.deleteStudent(student);
                        writer.write(studentJSON);
                        writer.flush();
                        writer.close();
                        System.out.println("Delete Student : \n" + studentJSON);
                        System.out.println("Success Delete Data");
                    }
                    case "select" -> {
                        System.out.println("Client Choose Select Menu");
                        String studentJSON = reader.readLine();
                        Student student = mapper.readValue(studentJSON, Student.class);
                        Student studentData = studentSelectDao.getStudentById(student);
                        String toClient = mapper.writeValueAsString(studentData);
                        System.out.println("To Client : \n" + toClient);
                        writer.write(toClient + "\n");
                        writer.flush();
                        writer.close();
                        reader.close();
                    }
                }
            } while (true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
