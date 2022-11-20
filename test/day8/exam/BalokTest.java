package day8.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalokTest {
    
    private Balok blk = new Balok();
    
    @Test
    public void testVBalokSum() {
        int p = 10, l = 5, t = 2;
        double result = blk.vBalokSum(p, l, t);
        assertEquals(100, result,0.0);
    }
    
}
