package day14.regex;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegexPasswordValidatorExampleTest {
    
    private RegexPasswordValidatorExample rpass = new RegexPasswordValidatorExample();

    @Test
    public void testPasswordPatternMatch() {
        
        String password = "Password@#234";
        boolean result = rpass.passwordPatternMatch(password);
        assertTrue(result);
    }
    
    @Test
    public void testPasswordPatternMatch_2() {
        
        String password = "pwd123";
        boolean result = rpass.passwordPatternMatch(password);
        assertFalse(result);
    }
    
}