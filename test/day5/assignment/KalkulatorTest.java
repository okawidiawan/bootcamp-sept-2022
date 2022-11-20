package day5.assignment;

import day5.assignment.Kalkulator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oka
 */
public class KalkulatorTest {
    
    private Kalkulator kalkulator = new Kalkulator();

    @Test
    public void testOperasiMatematika_add() {
        String operator = "+";
        double firstNumber = 3;
        double secondNumber = 9;
        String result = kalkulator.operasiMatematika(operator, firstNumber, secondNumber);
        assertEquals("3.0 + 9.0 = 12.0", result);
    }
    
    @Test
    public void testOperasiMatematika_subs() {
        String operator = "-";
        double firstNumber = 3;
        double secondNumber = 9;
        String result = kalkulator.operasiMatematika(operator, firstNumber, secondNumber);
        assertEquals("3.0 - 9.0 = -6.0", result);
    }
    
    @Test
    public void testOperasiMatematika_multiply() {
        String operator = "*";
        double firstNumber = 3;
        double secondNumber = 9;
        String result = kalkulator.operasiMatematika(operator, firstNumber, secondNumber);
        assertEquals("3.0 * 9.0 = 27.0", result);
    }
    
    @Test
    public void testOperasiMatematika_div() {
        String operator = "/";
        double firstNumber = 9;
        double secondNumber = 3;
        String result = kalkulator.operasiMatematika(operator, firstNumber, secondNumber);
        assertEquals("9.0 / 3.0 = 3.0", result);
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testOperasiMatematika() {
    }
    
}
