package day24.exam.task1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import day24.exam.task1.model.Student;
import day24.exam.task1.model.User;
import day24.exam.task1.utils.ClientUtils;
import day24.exam.task1.utils.DbUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Integer selectMenu;
            ObjectMapper mapper = new JsonMapper();
            CheckRegex cr = new CheckRegex();
            do {
                BufferedWriter writer = ClientUtils.socketConnection();
                User user = ClientUtils.inputLogin(input);
                boolean checkUsername = cr.checkRegexUsername(user.getUsername());
                boolean checkPassword = cr.checkRegexPassword(user.getPassword());
                String userJson = mapper.writeValueAsString(user);
                writer.write(userJson);
                writer.flush();
                writer.close();
                if(checkUsername && checkPassword){
                    System.out.println("Login Success");
                    break;
                }else{
                    System.out.println("Login Failed");
                }

            } while (true);


            do {
                selectMenu = ClientUtils.showMenu(input);
                switch (selectMenu) {
                    case 1 -> {
                        System.out.println("Input Data");
                        BufferedWriter writer = ClientUtils.socketConnection();
                        writer.write("input\n");

                        Student student = ClientUtils.inputStudent(input);
                        String studentJSON = mapper.writeValueAsString(student);
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();
                    }
                    case 2 -> {
                        System.out.println("Edit Data");
                        BufferedWriter writer = ClientUtils.socketConnection();
                        writer.write("edit\n");

                        Student studentUpdateData = ClientUtils.inputStudentWithId(input);

                        String studentJSON = mapper.writeValueAsString(studentUpdateData);
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();
                    }
                    case 3 -> {
                        System.out.println("Delete Data");
                        BufferedWriter writer = ClientUtils.socketConnection();
                        writer.write("delete\n");

                        Student studentdeleteData = ClientUtils.inputStudentId(input);

                        String studentJSON = mapper.writeValueAsString(studentdeleteData);
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();
                    }
                    case 4 -> {

                        System.out.println("Select Data");
                        BufferedWriter writer = ClientUtils.socketConnection();
                        BufferedReader reader = ClientUtils.fromServerConnection();
                        writer.write("select\n");

                        Student studentSelectData = ClientUtils.inputStudentId(input);

                        String studentJSON = mapper.writeValueAsString(studentSelectData);
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();

                        String studentJSONFromServer = reader.readLine();
                        Student student = mapper.readValue(studentJSONFromServer, Student.class);
                        System.out.println("ID : " + student.getId());
                        System.out.println("Name : " + student.getName());
                        System.out.println("Address : " + student.getAddress());
                        System.out.println("Status : " + student.getStatus());
                        System.out.println("Physics : " + student.getPhysics());
                        System.out.println("Calculus : " + student.getCalculus());
                        System.out.println("Biology : " + student.getBiology());
                        reader.close();
                    }
                }

            } while (selectMenu != 5);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
