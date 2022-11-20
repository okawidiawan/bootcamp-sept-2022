
package day3.variables;


public class LocalVariableExample {
//    instance variable
    public String myVar = "Instance Variable";
    
    public void myMethod(){
    String myVar = "Inside Method";
    System.out.println(myVar);
}
    public static void main(String[] args) {
        LocalVariableExample obj = new LocalVariableExample();
        /**
         * We are calling the method, that change the
         * value of myVar. we are displaying myVar again after
         * the method call, to demonstarate that the local
         * variable scope is limited o the method itself
         */
        
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
    
}
