package day14.regex;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegexEmailValidatorExampleTest {
    
    private RegexEmailValidatorExample remail = new RegexEmailValidatorExample();

    @Test
    public void testEmailPatternMatch() {
        String email = "oka.widiawan@gmail.com";
        boolean result = remail.emailPatternMatch(email);
        assertTrue(result);
    }
    
    @Test
    public void testEmailPatternMatch_1() {
        String email = "oka.widiawan";
        boolean result = remail.emailPatternMatch(email);
        assertFalse(result);
    }
}