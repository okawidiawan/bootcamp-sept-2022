package day10.constructor;

public class ConstructorOverloadingExample {

    private String language;
    
    public ConstructorOverloadingExample() {
        language = "Java";
    }
    
    public ConstructorOverloadingExample(String lang){
        language = lang;
    }

    public void getName() {
        System.out.println("Programming Language : " + language);
    }
    
    public static void main(String[] args) {
        ConstructorOverloadingExample java = new ConstructorOverloadingExample();
        ConstructorOverloadingExample python = new ConstructorOverloadingExample("Python");
        
        java.getName();
        python.getName();
    }
}