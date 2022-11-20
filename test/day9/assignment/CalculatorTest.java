package day9.assignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cal = new Calculator();
    private int a = 3;
    private int b = 30;

    @Test
    public void testPertambahan() {
        int result = cal.pertambahan(a, b);
        assertEquals(33, result);
    }

    @Test
    public void testPengurangan() {
        int result = cal.pengurangan(b, a);
        assertEquals(27, result);
    }

    @Test
    public void testPerkalian() {
        int result = cal.perkalian(a, b);
        assertEquals(90, result);
    }

    @Test
    public void testPembagian() {
        int result = cal.pembagian(b, a);
        assertEquals(10, result);
    }

}
