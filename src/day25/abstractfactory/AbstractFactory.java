package day25.abstractfactory;

import day25.abstractfactory.model.Bank;
import day25.abstractfactory.model.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
