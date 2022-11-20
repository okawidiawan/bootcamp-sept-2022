package day24.exam.task1.utils;

import day24.exam.task1.model.Student;
import day24.exam.task1.model.User;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientUtils {

    public static User inputLogin(Scanner input) {
        User user = new User();
        System.out.print("Username : ");
        user.setUsername(input.nextLine());
        System.out.print("Password : ");
        user.setPassword(input.nextLine());
        return user;
    }

    public static Integer showMenu(Scanner input) {
        System.out.println("MENU");
        System.out.println("1. Input Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Select Data");
        System.out.println("5. Exit");
        System.out.print("Select Menu : ");
        Integer selectMenu = input.nextInt();
        input.nextLine();
        return selectMenu;
    }

    public static Student inputStudent(Scanner input) {
        Student student = new Student();

        System.out.print("Student Name : ");
        student.setName(input.nextLine());

        System.out.print("Address : ");
        student.setAddress(input.nextLine());

        System.out.print("Status : ");
        student.setStatus(input.nextLine());

        System.out.print("Physics : ");
        student.setPhysics(input.nextInt());
        input.nextLine();

        System.out.print("Calculus : ");
        student.setCalculus(input.nextInt());
        input.nextLine();

        System.out.print("Biology : ");
        student.setBiology(input.nextInt());
        input.nextLine();

        return student;
    }

    public static Student inputStudentWithId(Scanner input){
        Student student = new Student();

        System.out.print("ID : ");
        student.setId(input.nextInt()); input.nextLine();

        System.out.print("Student Name : ");
        student.setName(input.nextLine());

        System.out.print("Address : ");
        student.setAddress(input.nextLine());

        System.out.print("Status : ");
        student.setStatus(input.nextLine());

        System.out.print("Physics : ");
        student.setPhysics(input.nextInt());
        input.nextLine();

        System.out.print("Calculus : ");
        student.setCalculus(input.nextInt());
        input.nextLine();

        System.out.print("Biology : ");
        student.setBiology(input.nextInt());
        input.nextLine();

        return student;
    }

    public static Student inputStudentId(Scanner input) {
        Student student = new Student();

        System.out.print("ID : ");
        student.setId(input.nextInt());
        input.nextLine();

        return student;
    }

    public static BufferedWriter socketConnection() throws IOException {
        Socket socket = new Socket("localhost", 7000);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        return writer;
    }

    public static BufferedReader fromServerConnection() throws IOException {
        Socket socket = new Socket("localhost", 7000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        return reader;
    }

}
