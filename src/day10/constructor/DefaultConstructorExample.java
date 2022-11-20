package day10.constructor;

public class DefaultConstructorExample {

    private int age;
    private boolean married;

    public static void main(String[] args) {
        DefaultConstructorExample d = new DefaultConstructorExample();
        System.out.println("Default Value");
        System.out.println("Age : " + d.age);
        System.out.println("Married : " + d.married);
    }
}