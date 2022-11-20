package day14.exceptionHandling;

public class ThrowExample {
    
    public boolean validate(int age){
        if(age < 18){
            throw new ArithmeticException("Not Valid");
        }
        return true;
    }
    
    public static void main(String[] args) {
        ThrowExample t = new ThrowExample();
        
        try{
            t.validate(15);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }   
}