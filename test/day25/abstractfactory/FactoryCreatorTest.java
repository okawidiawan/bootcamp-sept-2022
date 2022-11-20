package day25.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryCreatorTest {

    @Test
    public void testGetFactory_bank_factory() {
        AbstractFactory result = FactoryCreator.getFactory("bank");
        assertTrue(result instanceof BankFactory);
    }

    @Test
    public void testGetFactory_loan_factory() {
        AbstractFactory result = FactoryCreator.getFactory("loan");
        assertTrue(result instanceof LoanFactory);
    }

}
