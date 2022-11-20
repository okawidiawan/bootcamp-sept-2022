package day25.abstractfactory;

import day25.abstractfactory.model.BCA;
import day25.abstractfactory.model.BNI;
import day25.abstractfactory.model.Bank;
import day25.abstractfactory.model.Loan;
import day25.abstractfactory.model.OCBC;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        switch (bank) {
            case "BCA" -> {
                return new BCA();
            }
            case "BNI" -> {
                return new BNI();
            }
            case "OCBC" -> {
                return new OCBC();
            }
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }

}
