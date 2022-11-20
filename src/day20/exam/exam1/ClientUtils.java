package day20.exam.exam1;

import day14.regex.RegexEmailValidatorExample;
import day14.regex.RegexPasswordValidatorExample;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientUtils {

    private static RegexEmailValidatorExample emailValidator = new RegexEmailValidatorExample();
    private static RegexPasswordValidatorExample passwordValidator = new RegexPasswordValidatorExample();

    public static Student getStudentInput(Scanner input) {
        System.out.print("ID : ");
        Long id = input.nextLong();
        input.nextLine();
        String username = getUsernameInput(input);
        String password = getPasswordInput(input);
        System.out.print("Name : ");
        String name = input.nextLine();
        Student student = new Student();
        student.setId(id);
        student.setUsername(username);
        student.setPassword(password);
        student.setName(name);

        return student;
    }

    public static String getUsernameInput(Scanner input) {
        String username = null;
        do {
            System.out.print("Username : ");
            username = input.nextLine();
            if (!emailValidator.emailPatternMatch(username)) {
                System.out.println("Email Pattern is Invalid");
            } else {
                break;
            }
        } while (true);
        return username;
    }

    public static String getPasswordInput(Scanner input) {
        String password = null;
        do {
            System.out.print("Password : ");
            password = input.nextLine();
            if (!passwordValidator.passwordPatternMatch(password)) {
                System.out.println("Password Pattern is Invalid");
            } else {
                break;
            }
        } while (true);
        return password;
    }

    public static Student getStudentWithMarksInput(Scanner input) {
        Student student = getStudentInput(input);
        System.out.print("How Many Marks? ");
        Integer numOfMarks = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= numOfMarks; i++) {
            System.out.print("Nilai " + i + " : ");
            Long mark = input.nextLong();
            input.nextLine();
            student.getMarks().add(mark);
        }
        return student;
    }

    public static BufferedWriter openSocketConnection() throws IOException {
        Socket socket = new Socket("localhost", 3000);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        return writer;
    }

}
