package day9.oop;

public class MethodExample {

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        MethodExample obj = new MethodExample();
        
        int result = obj.addNumbers(10, 20);
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}