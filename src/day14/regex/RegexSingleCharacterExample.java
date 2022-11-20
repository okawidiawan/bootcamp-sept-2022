package day14.regex;

import java.util.regex.Pattern;

public class RegexSingleCharacterExample {
    
    private String singleCharacterFollowByS = ".s";
    private String twoCharacterFollowByS = "..s";
    
    public boolean singleCharacterFollowByS(String text){
        return Pattern.matches(singleCharacterFollowByS, text);
    }
    public boolean twoCharactersFollowByS(String text){
        return Pattern.matches(twoCharacterFollowByS, text);
    }
    
}