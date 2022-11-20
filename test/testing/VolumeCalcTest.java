package testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class VolumeCalcTest {
    
    private int panjang = 12;
    private int lebar = 5;
    private int tinggi = 3;
    
    private VolumeCalc operator = new VolumeCalc();
    
    
    public VolumeCalcTest() {
    }

    @Test
    public void testVolumeBalok() {
        int result = operator.volumeBalok(panjang, lebar, tinggi);
        assertEquals(180, result);
    }
    
}
