package day14.regex;

import java.util.regex.Pattern;

public class RegexCharacterClassesExample {
    
    private String regex = "[amn]";
    
    public boolean matchAmn(String text){
        return Pattern.matches(regex, text);
    }
    
}
