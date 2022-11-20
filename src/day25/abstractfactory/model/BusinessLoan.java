package day25.abstractfactory.model;

public class BusinessLoan extends Loan {

    private double rate = 10.00d;

    @Override
    public double getRate() {
        return rate;
    }

}
