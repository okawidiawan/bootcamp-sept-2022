package day25.abstractfactory;

import day25.abstractfactory.model.Bank;
import day25.abstractfactory.model.BusinessLoan;
import day25.abstractfactory.model.EducationLoan;
import day25.abstractfactory.model.HomeLoan;
import day25.abstractfactory.model.Loan;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoanFactoryTest {

    private LoanFactory loanFactory = new LoanFactory();

    @Test
    public void testGetBank() {
        Bank result = loanFactory.getBank("xBank");
        assertNull(result);
    }

    @Test
    public void testGetLoan_home_loan() {
        Loan result = loanFactory.getLoan("HOME_LOAN");
        assertTrue(result instanceof HomeLoan);
    }

    @Test
    public void testGetLoan_bussines_loan() {
        Loan result = loanFactory.getLoan("BUSINESS_LOAN");
        assertTrue(result instanceof BusinessLoan);
    }

    @Test
    public void testGetLoan_education_loan() {
        Loan result = loanFactory.getLoan("EDUCATION_LOAN");
        assertTrue(result instanceof EducationLoan);
    }

}
