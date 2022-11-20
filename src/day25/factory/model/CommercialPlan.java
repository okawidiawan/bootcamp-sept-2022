package day25.factory.model;

public class CommercialPlan extends Plan {

    private double rate = 8_000;
    
    @Override
    public double getRate() {
        return rate;
    }
    
}
