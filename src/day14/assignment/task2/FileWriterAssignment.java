package day14.assignment.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            BufferedWriter writeUserName = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day14\\assignment\\task2\\username.txt"));
            BufferedWriter writePassword = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day14\\assignment\\task2\\password.txt"));

            System.out.print("Input Username : ");
            String username = input.nextLine();

            writeUserName.write(username);
            writeUserName.flush();
            writeUserName.close();

            System.out.print("Input Password : ");
            String password = input.nextLine();

            writePassword.write(password);
            writePassword.flush();
            writePassword.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
