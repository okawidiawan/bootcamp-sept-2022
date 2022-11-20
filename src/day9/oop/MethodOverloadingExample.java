package day9.oop;

public class MethodOverloadingExample {
    
    public static void displayA(int a){
        System.out.println("Argument : " + a);
    }
    
    public static void displayA(int a, int b){
        System.out.println("Argument : " + a +" and " + b);
    }
    
    public static void main(String[] args) {
        displayA(10);
        displayA(10, 20);
    }
    
}
