package day8.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class BolaTest {
    
    private Bola b = new Bola();
    
    @Test
    public void testVBolaSum() {
        int jarijari = 7;
        double result = b.vBolaSum(jarijari);
        assertEquals((4/3D) * Math.PI * Math.pow(jarijari, 3), result, 0.1);
    }
}