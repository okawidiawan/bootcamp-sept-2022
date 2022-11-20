package day6.forLoop;

import day6.forLoop.Faktorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oka
 */
public class FaktorialTest {
    
    private Faktorial f = new Faktorial();
    @Test
    public void testSomeMethod() {
        int n = 5;
        int result = f.faktorial(n);
        assertEquals(120, result);
    }
}
