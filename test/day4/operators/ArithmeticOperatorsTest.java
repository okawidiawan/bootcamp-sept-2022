package day4.operators;

import day4.operators.ArithmeticOperators;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticOperatorsTest {
    private int a = 12;
    private int b = 5;
    private ArithmeticOperators operator = new ArithmeticOperators();
    
    
    @Test
    public void testAdd() {
        int result = operator.add(a, b);
        assertEquals(17, result);
    }

    @Test
    public void testSubs() {
        int result = operator.subs(a, b);
        assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
                int result = operator.multiply(a, b);
        assertEquals(60, result);
    }

    @Test
    public void testDivision() {
                int result = operator.division(a, b);
        assertEquals(2, result);
    }

    @Test
    public void testModulo() {
                int result = operator.modulo(a, b);
        assertEquals(2, result);
    }
    
}
