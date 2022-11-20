package day5.assignment;

import day5.assignment.Bulan;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class BulanTest {
    private Bulan b = new Bulan();

    @Test
    public void testIdentity() {
        String name = "Hary";
        int date = 6, month = 5, year = 1984;
        String result = b.identity(name, date, month, year);
        assertEquals("Nama saya Hary, lahir 6 Mei 1984 berumur 38 tahun", result);
    }
    
    @Test
    public void testConvertMonth_jan(){
        int month = 1;
        String result = b.convertMonth(month);
        assertEquals("Januari", result);
    }
    @Test
    public void testConvertMonth_feb(){
        int month = 2;
        String result = b.convertMonth(month);
        assertEquals("Februari", result);
    }
    @Test
    public void testConvertMonth_mar(){
        int month = 3;
        String result = b.convertMonth(month);
        assertEquals("Maret", result);
    }
    @Test
    public void testConvertMonth_apr(){
        int month = 4;
        String result = b.convertMonth(month);
        assertEquals("April", result);
    }
    @Test
    public void testConvertMonth_mei(){
        int month = 5;
        String result = b.convertMonth(month);
        assertEquals("Mei", result);
    }
    @Test
    public void testConvertMonth_jun(){
        int month = 6;
        String result = b.convertMonth(month);
        assertEquals("Juni", result);
    }
    @Test
    public void testConvertMonth_jul(){
        int month = 7;
        String result = b.convertMonth(month);
        assertEquals("Juli", result);
    }
    @Test
    public void testConvertMonth_ags(){
        int month = 8;
        String result = b.convertMonth(month);
        assertEquals("Agustus", result);
    }
    @Test
    public void testConvertMonth_sep(){
        int month = 9;
        String result = b.convertMonth(month);
        assertEquals("September", result);
    }
    @Test
    public void testConvertMonth_okt(){
        int month = 10;
        String result = b.convertMonth(month);
        assertEquals("Oktober", result);
    }
    @Test
    public void testConvertMonth_nov(){
        int month = 11;
        String result = b.convertMonth(month);
        assertEquals("November", result);
    }
    @Test
    public void testConvertMonth_des(){
        int month = 12;
        String result = b.convertMonth(month);
        assertEquals("Desember", result);
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testConvertMonth() {
    }
    
}
