package day6.forLoop;

import day6.forLoop.SumOfArrayItems;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfArrayItemsTest {
    
    private SumOfArrayItems soai = new SumOfArrayItems();

    @Test
    public void testSum() {
        int numbers[] = {10, 10, 5, 5, 20};
        int result = soai.sum(numbers);
        assertEquals(50, result);
    }
    
}