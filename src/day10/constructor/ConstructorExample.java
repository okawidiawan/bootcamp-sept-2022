package day10.constructor;

public class ConstructorExample {
    
    private String name;

    public ConstructorExample() {
        System.out.println("Constructor is Called");
        name = "Programmer";
    }
    
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        System.out.println("My name is : " + obj.name);
    }
}