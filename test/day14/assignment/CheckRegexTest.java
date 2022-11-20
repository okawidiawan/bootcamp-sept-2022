package day14.assignment;

import day14.assignment.task1.CheckRegex;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckRegexTest {

    private CheckRegex rgx = new CheckRegex();

    @Test
    public void testCheckRegexUsername() {
        String username = "oka.widiawan@gmail.com";
        boolean result = rgx.checkRegexUsername(username);
        assertEquals(true, result);
    }

    @Test
    public void testCheckRegexUsername_wrong() {
        String username = "oka.widiawan";
        boolean result = rgx.checkRegexUsername(username);
        assertEquals(false, result);
    }

    @Test
    public void testCheckRegexPassword() {
        String password = "PassW0rd@123";
        boolean result = rgx.checkRegexPassword(password);
        assertEquals(true, result);
    }
    
    @Test
    public void testCheckRegexPassword_wrong() {
        String password = "password";
        boolean result = rgx.checkRegexPassword(password);
        assertEquals(false, result);
    }
}