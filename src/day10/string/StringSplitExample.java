package day10.string;

public class StringSplitExample {
    
    public String[] splitOnlyDigit(String text){
        return text.split("\\d+");
    }
    
    public String[] splitByDash(String text){
        return text.split("-");
    }
}
