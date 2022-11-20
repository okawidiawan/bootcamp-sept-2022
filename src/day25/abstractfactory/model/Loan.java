package day25.abstractfactory.model;

public abstract class Loan {

    protected double rate;

    public abstract double getRate();

    public double calculateLoanPayment(double loanAmount, int years) {
        int month = years * 12;
        double rate = getRate() / 1200;
        return ((rate * Math.pow((1 + rate), month)) / ((Math.pow((1 + rate), month)) - 1)) * loanAmount;
    }

}
