package day17.assignment.example.task2;

import java.util.regex.Pattern;

public class CheckRegex {

    String regexUserName = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    public boolean checkRegexUsername(String username) {
        return Pattern.matches(regexUserName, username);
    }

    public boolean checkRegexPassword(String password) {
        return Pattern.matches(regexPassword, password);
    }

}
