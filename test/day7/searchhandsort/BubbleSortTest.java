package day7.searchhandsort;

import day7.searchhandsort.BubbleSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    private int[] numbers = {4, 85, 7, 1, 0, 36, -5, 48};
    private BubbleSort b = new BubbleSort();

    @Test
    public void testSomeMethod() {
        int[] sortedNumbers = b.sort(numbers);
        int[] expected = {-5, 0, 1, 4, 7, 36, 48, 85};
        assertArrayEquals(expected, sortedNumbers);
    }

}
