package day5.controlFlow;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShoesSizeTest {
    
    private ShoesSize grader = new ShoesSize();


    @Test
    public void testGrader_S() {
        int size = 29;
        String grade = grader.grade(size);
        assertEquals("Small", grade);
    }
    @Test
    public void testGrader_M() {
        int size = 42;
        String grade = grader.grade(size);
        assertEquals("Medium", grade);
    }
    @Test
    public void testGrader_L() {
        int size = 44;
        String grade = grader.grade(size);
        assertEquals("Large", grade);
    }
    @Test
    public void testGrader_XL() {
        int size = 48;
        String grade = grader.grade(size);
        assertEquals("Extra Large", grade);
    }
    @Test
    public void testGrader_Unk() {
        int size = 29;
        String grade = grader.grade(size);
        assertEquals("Unknown", grade);
    }

    @Test
    public void testGrade() {
    }

    
}
