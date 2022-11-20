package day5.controlFlow;

import org.junit.Test;
import static org.junit.Assert.*;

public class GraderTest {
    
    private Grader grader = new Grader();
    
    public GraderTest() {
    }

    @Test
    public void testGrade_A() {
        int marks = 93;
        String grade = grader.grade(marks);
        assertEquals("Grade A", grade);
    }
    
    @Test
    public void testGrade_B() {
        int marks = 79;
        String grade = grader.grade(marks);
        assertEquals("Grade B", grade);
    }
    
    @Test
    public void testGrade_C() {
        int marks = 65;
        String grade = grader.grade(marks);
        assertEquals("Grade C", grade);
    }
    
    @Test
    public void testGrade_D() {
        int marks = 50;
        String grade = grader.grade(marks);
        assertEquals("Grade D", grade);
    }
    
    @Test
    public void testGrade_E() {
        int marks = 35;
        String grade = grader.grade(marks);
        assertEquals("Grade E", grade);
    }
    
    @Test
    public void testGrade_F() {
        int marks = 0;
        String grade = grader.grade(marks);
        assertEquals("Grade F", grade);
    }

    @Test
    public void testGrade() {
    }
    
}
