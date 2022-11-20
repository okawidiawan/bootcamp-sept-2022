package day6.assignment;

import day6.assignment.Umur;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class UmurTest {
    
    private Umur umur = new Umur();

    @Test
    public void testHitungUmur() {
        int tahunLahir = 1992;
        int result = umur.hitungUmur(tahunLahir);
        assertEquals((Calendar.getInstance().get(Calendar.YEAR) - tahunLahir), result);
    }
    
}
