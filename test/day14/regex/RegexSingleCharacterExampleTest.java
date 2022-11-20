package day14.regex;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegexSingleCharacterExampleTest {

    private RegexSingleCharacterExample rsc = new RegexSingleCharacterExample();

    @Test
    public void testSingleCharacterFollowByS_1() {
        String text = "as";
        boolean result = rsc.singleCharacterFollowByS(text);
        assertTrue(result);
    }

    @Test
    public void testSingleCharacterFollowByS_2() {
        String text = "mk";
        boolean result = rsc.singleCharacterFollowByS(text);
        assertFalse(result);
    }
    
    @Test
    public void testSingleCharacterFollowByS_3() {
        String text = "mst";
        boolean result = rsc.singleCharacterFollowByS(text);
        assertFalse(result);
    }
    
    @Test
    public void testSingleCharacterFollowByS_4() {
        String text = "amms";
        boolean result = rsc.singleCharacterFollowByS(text);
        assertFalse(result);
    }
    
    @Test
    public void testTwoCharacterFollowByS() {
        String text = "mxs";
        boolean result = rsc.twoCharactersFollowByS(text);
        assertTrue(result);
    }
    
}