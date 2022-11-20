package day25.abstractfactory.model;

public class EducationLoan extends Loan {

    private double rate = 5.00d;

    @Override
    public double getRate() {
        return rate;
    }

}
