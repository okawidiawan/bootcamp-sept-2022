
package day3.variables;

public class StaticVarExample {
    public static String myClassVar = "Class or Static Variable";
    public static void main(String[] args) {
        StaticVarExample obj = new StaticVarExample();
        StaticVarExample obj2 = new StaticVarExample();
        StaticVarExample obj3 = new StaticVarExample();
        
// All three will display "class or static variable
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

// Changing the value of static variable being obj2
        obj2.myClassVar = "Changed Text";
        
// All three will display "Change Task"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

    }
}
