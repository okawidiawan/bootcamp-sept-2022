package day5.assignment;

import day5.assignment.Zodiak;
import org.junit.Test;
import static org.junit.Assert.*;

public class ZodiakTest {
    
    private Zodiak z = new Zodiak();

    @Test
    public void testIdentity() {
        String name = "Hary";
        int date = 6, month = 5, year = 1984;
        String result = z.identity(name, date, month, year);
        assertEquals("Nama saya Hary, zodiak saya Taurus", result);
    }
    
    @Test
    public void testZodiak(){
        int date = 6, month = 5;
        String result = z.convertZodiak(date, month);
        assertEquals("Taurus", result);
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testConvertZodiak() {
    }
}