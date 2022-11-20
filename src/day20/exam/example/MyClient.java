package day20.exam.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int pilihMenu;
            ObjectMapper mapper = new JsonMapper();
            do {
                System.out.println("Menu");
                System.out.println("1. Registration");
                System.out.println("2. Login");
                System.out.println("3. Update");
                System.out.println("4. Multithread Proccess");
                System.out.println("5. Exit");
                System.out.print("Pilih Menu : ");
                pilihMenu = input.nextInt();
                input.nextLine();
                switch (pilihMenu) {
                    case 1 -> {
                        Student student = ClientUtils.getStudentInput(input);
                        String studentJSON = mapper.writeValueAsString(student);
                        BufferedWriter writer = ClientUtils.openSocketConnection();
                        writer.write("registration\n");
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();
                    }
                    case 2 -> {
                        String username = ClientUtils.getUsernameInput(input);
                        String password = ClientUtils.getPasswordInput(input);
                        Student student = new Student();
                        student.setUsername(username);
                        student.setPassword(password);
                        String studentJSON = mapper.writeValueAsString(student);
                        BufferedWriter writer = ClientUtils.openSocketConnection();
                        writer.write("login\n");
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();
                    }
                    case 3 -> {
                        Student student = ClientUtils.getStudentWithMarksInput(input);
                        String studentJSON = mapper.writeValueAsString(student);
                        BufferedWriter writer = ClientUtils.openSocketConnection();
                        writer.write("update\n");
                        writer.write(studentJSON + "\n");
                        writer.flush();
                        writer.close();
                    }

                    case 4 -> {
                        BufferedWriter writer = ClientUtils.openSocketConnection();
                        writer.write("multithread\n");
                        writer.flush();
                        writer.close();
                    }
                }

            } while (pilihMenu != 5);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
