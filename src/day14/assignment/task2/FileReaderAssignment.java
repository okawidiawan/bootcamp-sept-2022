package day14.assignment.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAssignment {

    public static void main(String[] args) {

        CheckRegex checkRegex = new CheckRegex();

        try {
            BufferedReader readUserName = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day14\\assignment\\task2\\username.txt"));

            BufferedReader readPassword = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day14\\assignment\\task2\\password.txt"));

            String textReadUserName = readUserName.readLine();
            String textReadPassword = readPassword.readLine();

            boolean checkRegexUserName = checkRegex.checkRegexUsername(textReadUserName);
            boolean checkRegexPassword = checkRegex.checkRegexPassword(textReadPassword);
            if (checkRegexUserName && checkRegexPassword) {
                System.out.println("Username & Password Regex is Valid");
            } else if (checkRegexUserName && !checkRegexPassword) {
                System.out.println("Password Regex is not Valid");
            } else if (!checkRegexUserName && checkRegexPassword) {
                System.out.println("Username Regex is not Valid");
            } else {
                System.out.println("Username & Password Regex is not Valid");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
