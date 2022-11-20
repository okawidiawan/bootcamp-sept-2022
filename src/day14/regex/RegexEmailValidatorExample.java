package day14.regex;

import java.util.regex.Pattern;

public class RegexEmailValidatorExample {
    
    private String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    
    public boolean emailPatternMatch(String email){
        return Pattern.matches(regex, email);
    }
    
}
