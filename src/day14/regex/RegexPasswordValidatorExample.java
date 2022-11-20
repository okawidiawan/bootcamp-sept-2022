package day14.regex;

import java.util.regex.Pattern;

public class RegexPasswordValidatorExample {
    
    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    
    public boolean passwordPatternMatch(String password){
        return Pattern.matches(regex, password);
    }
    
}
