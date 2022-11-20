package day5.controlFlow;

public class IfElseExample {
    public static void main(String[] args) {
        
        int number = -10;
        if(number > 0){
            System.out.println("This number is positive");
        }else{
            System.out.println("This number is negative");
        }
        System.out.println("Statement outside IF...ELSE block");
    }
}
