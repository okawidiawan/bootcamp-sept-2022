package day14.regex;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegexCharacterClassesExampleTest {
    
private RegexCharacterClassesExample rcc = new RegexCharacterClassesExample();

    @Test
    public void testMatchAmn_1() {
        String text = "abcd";
        boolean result = rcc.matchAmn(text);
        assertFalse(result);
    }
    
    @Test
    public void testMatchAmn_2() {
        String text = "a";
        boolean result = rcc.matchAmn(text);
        assertTrue(result);
    }
    
    @Test
    public void testMatchAmn_3() {
        String text = "ammmmna";
        boolean result = rcc.matchAmn(text);
        assertFalse(result);
    }
    
}
