package day9.oop;

public class StaticMethodExample {
    
    public static int square(int a){
        return a * a;
    }
    
    public static void main(String[] args) {
        int a = 10;
        int result = square(a);
        System.out.println("Square Volume : " + result);
    }
    
}
