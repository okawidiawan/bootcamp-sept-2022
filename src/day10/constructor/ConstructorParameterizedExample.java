package day10.constructor;

public class ConstructorParameterizedExample {
    
    private String language;
    
    public ConstructorParameterizedExample(String lang){
        language = lang;
        System.out.println(language + " Programming Language");
    }
    
    public static void main(String[] args) {
        ConstructorParameterizedExample java = new ConstructorParameterizedExample("Java");
        ConstructorParameterizedExample python = new ConstructorParameterizedExample("Python");
        ConstructorParameterizedExample c = new ConstructorParameterizedExample("C");
    }
    
}
