package day25.factory.model;

public class InstitutionalPlan extends Plan {

    private double rate = 1_000;
    
    @Override
    public double getRate() {
        return rate;
    }
    
}
