package day7.array;

import day7.array.AggregateValueOfArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class AggregateValueOfArrayTest {

    private int[] numbers = {10, 30, 20, 15, -3};

    private AggregateValueOfArray avoa = new AggregateValueOfArray();

    @Test
    public void testSum() {
        int result = avoa.sum(numbers);
        assertEquals(72, result);
    }

    @Test
    public void testAvg() {
        double result = avoa.avg(numbers);
        assertEquals(14.4d, result, 0d);
    }

    @Test
    public void testMin() {
        int result = avoa.min(numbers);
        assertEquals(-3, result);
    }

    @Test
    public void testMax() {
        int result = avoa.max(numbers);
        assertEquals(30, result);
    }

}
