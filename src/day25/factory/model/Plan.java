package day25.factory.model;

public abstract class Plan {

    protected double rate;

    public abstract double getRate();

    public double calculateBill(int units) {
        double bill = units * getRate();
        System.out.println("Bill : " + bill);
        return bill;
    }
}
