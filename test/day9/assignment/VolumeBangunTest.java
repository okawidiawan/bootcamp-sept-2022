package day9.assignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class VolumeBangunTest {

    private VolumeBangun vb = new VolumeBangun();

    @Test
    public void testVolBangun_3args() {
        int p = 10;
        int l = 5;
        int t = 3;
        double result = vb.volBangun(p, l, t);
        assertEquals(150, result, 0.0);
    }

    @Test
    public void testVolBangun_int_int() {
        int jarijari = 8;
        int t = 10;
        double result = vb.volBangun(jarijari, t);
        assertEquals(Math.PI * jarijari * jarijari * t, result, 0.1);
    }

    @Test
    public void testVolBangun_int() {
        int jarijari = 8;
        double result = vb.volBangun(jarijari);
        assertEquals((4 / 3D) * Math.PI * Math.pow(jarijari, 3), result, 0.1);

    }

}
