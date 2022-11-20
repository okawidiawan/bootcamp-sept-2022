package day14.regex;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegexExampleTest {

    private String text = "cs";
    private RegexExample re = new RegexExample();

    @Test
    public void testRegexFirstWay() {
        boolean result = re.regexFirstWay(text);
        assertTrue(result);
    }

    @Test
    public void testRegexSecondWay() {
        boolean result = re.regexFirstWay(text);
        assertTrue(result);
    }

    @Test
    public void testRegexThirdWay() {
        boolean result = re.regexFirstWay(text);
        assertTrue(result);
    }

}
