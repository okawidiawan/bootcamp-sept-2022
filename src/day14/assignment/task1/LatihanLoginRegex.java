package day14.assignment.task1;

import java.util.Scanner;

public class LatihanLoginRegex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckRegex cr = new CheckRegex();

        System.out.println("Login");
        System.out.print("Check Username : ");
        String username = input.nextLine();
        boolean checkUserName = cr.checkRegexUsername(username);

        System.out.print("Check Password : ");
        String password = input.nextLine();
        boolean checkPassword = cr.checkRegexPassword(password);

        if (checkUserName == true && checkPassword == true) {
            System.out.println("Username & Password Regex is Valid");
        } else if (checkUserName == true && checkPassword == false) {
            System.out.println("Password Regex is not Valid");
        } else if (checkUserName == false && checkPassword == true) {
            System.out.println("Username Regex is not Valid");
        } else {
            System.out.println("Username & Password Regex is not Valid");
        }
    }
}
