/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package day4.operators;

import day4.operators.RelationalOperators;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oka
 */
public class RelationalOperatorsTest {
    
    private int a = 7;
    private int b = 11;
    private RelationalOperators operator = new RelationalOperators();
    public RelationalOperatorsTest() {
    }

    @Test
    public void testEqualTo() {
        boolean result = operator.equalTo(a, b);
        assertEquals(false, result);
    }

    @Test
    public void testNotEqualTo() {
        boolean result = operator.notEqualTo(a, b);
        assertEquals(true, result);
    }

    @Test
    public void testGreaterThan() {
        boolean result = operator.greaterThan(a, b);
        assertEquals(false, result);
    }

    @Test
    public void testLessThan() {
        boolean result = operator.lessThan(a, b);
        assertEquals(true, result);
    }

    @Test
    public void testGreaterThanEqual() {
        boolean result = operator.greaterThanEqual(a, b);
        assertEquals(false, result);
    }
    
    @Test
    public void testGreaterThanEqual_equal_value() {
        int x = 10;
        int y = 10;
        boolean result = operator.greaterThanEqual(x, y);
        assertEquals(true, result);
    }

    @Test
    public void testLessThanEqual() {
        boolean result = operator.lessThanEqual(a, b);
        assertEquals(true, result);
    }
    
}
