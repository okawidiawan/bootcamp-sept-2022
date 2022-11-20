package day25.abstractfactory;

import day25.abstractfactory.model.BCA;
import day25.abstractfactory.model.BNI;
import day25.abstractfactory.model.Bank;
import day25.abstractfactory.model.Loan;
import day25.abstractfactory.model.OCBC;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankFactoryTest {
    
    private BankFactory bankFactory = new BankFactory();
    
    @Test
    public void testGetBank_BCA() {
        Bank result = bankFactory.getBank("BCA");
        assertTrue(result instanceof BCA);
    }
    
    @Test
    public void testGetBank_BNI() {
        Bank result = bankFactory.getBank("BNI");
        assertTrue(result instanceof BNI);
    }
    
    @Test
    public void testGetBank_OCBC() {
        Bank result = bankFactory.getBank("OCBC");
        assertTrue(result instanceof OCBC);
    }
    
    @Test
    public void testGetLoan() {
        Loan result = bankFactory.getLoan("xloan");
        assertNull(result);
    }
    
}
