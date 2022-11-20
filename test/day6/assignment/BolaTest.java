/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package day6.assignment;

import day6.assignment.Bola;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oka
 */
public class BolaTest {
    
    private Bola bola =  new Bola();
    
    @Test
    public void testVBola() {
        int jarijari = 7;
        double result = bola.vBola(jarijari);
        assertEquals((4/3D) * Math.PI * 7 * 7 * 7, result, 0.1);
    }
    
}
