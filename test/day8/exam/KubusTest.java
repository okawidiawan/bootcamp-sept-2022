package day8.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class KubusTest {
    
    private Kubus k = new Kubus();

    @Test
    public void testVKubusSum() {
        int rusuk = 8;
        double result = k.vKubusSum(rusuk);
        assertEquals(512, result, 0.0);
    }   
}