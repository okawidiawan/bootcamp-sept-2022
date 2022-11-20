package day10.assignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class MahasiswaDataTest {
    
    private MahasiswaData md = new MahasiswaData();
    
    @Test
    public void testSplitText() {
        String text = "test,7,5,7";
        String[] result = text.split(",");
        String[] expected = {"test","7","5","7"};
        assertArrayEquals(expected, result);
    }
}
