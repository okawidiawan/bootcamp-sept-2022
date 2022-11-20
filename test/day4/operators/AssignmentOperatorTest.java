package day4.operators;

import day4.operators.AssignmentOperator;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentOperatorTest {
    
    private int a = 12;
    private int b = 5;
    private AssignmentOperator operator = new AssignmentOperator();
    
    public AssignmentOperatorTest() {
    }

    @Test
    public void testAddAndAssign() {
        int result = operator.addAndAssign(a, b);
        assertEquals(17, result);
    }

    @Test
    public void testSubsAndAssign() {
        int result = operator.subsAndAssign(a, b);
        assertEquals(7, result);
    }

    @Test
    public void testMultiplyAndAssign() {
        int result = operator.multiplyAndAssign(a, b);
        assertEquals(60, result);
    }

    @Test
    public void testDivAndAssign() {
        int result = operator.divAndAssign(a, b);
        assertEquals(2, result);
    }

    @Test
    public void testModuloAndAssign() {
        int result = operator.moduloAndAssign(a, b);
        assertEquals(2, result);
    }
    
}
