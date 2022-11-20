package day25.abstractfactory.model;

public class HomeLoan extends Loan {

    private double rate = 7.00d;

    @Override
    public double getRate() {
        return rate;
    }
}
