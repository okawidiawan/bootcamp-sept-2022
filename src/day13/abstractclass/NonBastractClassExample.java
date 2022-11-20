package day13.abstractclass;

public class NonBastractClassExample extends Language {
    
    public static void main(String[] args) {
        NonBastractClassExample java = new NonBastractClassExample();
        java.nonAbstractMethod();
        java.abstractMethod();
    }
    @Override
    public void abstractMethod() {
        System.out.println("This is implementation of abstract class");
    }
}
