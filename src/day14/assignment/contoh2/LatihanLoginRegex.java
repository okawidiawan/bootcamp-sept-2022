package day14.assignment.contoh2;

import day14.assignment.task2.CheckRegex;
import day14.regex.RegexEmailValidatorExample;
import day14.regex.RegexPasswordValidatorExample;
import java.util.Map;
import java.util.Scanner;

public class LatihanLoginRegex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegexEmailValidatorExample eValidator = new RegexEmailValidatorExample();
        RegexPasswordValidatorExample pValidator = new RegexPasswordValidatorExample();
        Map<String, String> usernamePasswordMap = UsernamePasswordLoader.loadUsernamePasswordMap();
        
        do {
            System.out.print("Username : ");
            String username = input.nextLine();
            System.out.print("Password : ");
            String password = input.nextLine();
            if (pValidator.passwordPatternMatch(password) && eValidator.emailPatternMatch(username)) {
                System.out.println("Regex Validation Success");
            } else {
                System.out.println("Regex Validation Fail");
                continue;
            }

            String passwordFromDb = usernamePasswordMap.get(username.toLowerCase());
            if (passwordFromDb != null && passwordFromDb.equals(password)) {
                System.out.println("Login Successfull");
            } else {
                System.out.println("Login Failed");
            }

        } while (true);
    }

}