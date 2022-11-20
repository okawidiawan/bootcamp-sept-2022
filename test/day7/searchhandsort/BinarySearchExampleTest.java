/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package day7.searchhandsort;

import day7.searchhandsort.BinarySearchExample;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oka
 */
public class BinarySearchExampleTest {

    @Test
    public void testSearch() {
        int[] numbers = {7, 10, 15, 21, 91, 100};
        int target = 91;
        BinarySearchExample binary = new BinarySearchExample();
        int result = binary.search(numbers, target);
        assertEquals(4, result);

    }

}
