package day10.string;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringSplitExampleTest {
    
    private StringSplitExample split = new StringSplitExample();

    @Test
    public void testSplitOnlyDigit() {
        String text = "March032021April";
        String[] result = split.splitOnlyDigit(text);
        String[] expected = {"March","April"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSplitByDash() {
        String text = "950-003-123-900-456 : 11 _343-1 789---";
        String[] result = split.splitByDash(text);
        String[] expected = {"950","003", "123", "900","456 : 11 _343","1 789"};
        assertArrayEquals(expected, result);
    }
    
}
