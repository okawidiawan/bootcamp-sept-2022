package day9.oop;

public class MethodParameterExample {
    
    public void display1(){
        System.out.println("Method without parameter");
    }
    
    public void display2(int a){
        System.out.println("Method with single parameter : " + a);
    }
    
    public static void main(String[] args) {
        MethodParameterExample obj = new MethodParameterExample();
        obj.display1();
        obj.display2(10);
    }
    
}
