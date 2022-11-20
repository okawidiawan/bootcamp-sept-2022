package day14.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    private String regex = ".s";

    public boolean regexFirstWay(String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(text);
        return m.matches();
    }

    public boolean regexSecondWay(String text) {
        return Pattern.compile(regex).matcher(text).matches();
    }

    public boolean regexThirdWay(String text) {
        return Pattern.matches(regex, text);
    }

}