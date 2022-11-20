/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package day6.assignment;

import day6.assignment.Balok;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oka
 */
public class BalokTest {
    
    private Balok balok = new Balok();

    @Test
    public void testVBalok() {
        int p = 10, l = 5, t = 3;
        int result = balok.vBalok(p, l, t);
        assertEquals(150, result);
    }
    
}
