package day4.operators;

public class AssignmentOperator {
    
    public int addAndAssign(int a, int b){
        a += b; // a = a + a;
        return a;
    }
    public int subsAndAssign(int a, int b){
        a -= b; // a = a - a;
        return a;
    }
    public int multiplyAndAssign(int a, int b){
        a *= b; // a = a * a;
        return a;
    }
    public int divAndAssign(int a, int b){
        a /= b; // a = a * a;
        return a;
    }
        public int moduloAndAssign(int a, int b){
        a %= b; // a = a * a;
        return a;
    }
}
