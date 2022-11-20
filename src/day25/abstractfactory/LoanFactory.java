package day25.abstractfactory;

import day25.abstractfactory.model.Bank;
import day25.abstractfactory.model.BusinessLoan;
import day25.abstractfactory.model.EducationLoan;
import day25.abstractfactory.model.HomeLoan;
import day25.abstractfactory.model.Loan;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        switch (loan) {
            case "HOME_LOAN" -> {
                return new HomeLoan();
            }
            case "BUSINESS_LOAN" -> {
                return new BusinessLoan();
            }
            case "EDUCATION_LOAN" -> {
                return new EducationLoan();
            }
        }
        return null;
    }

}
