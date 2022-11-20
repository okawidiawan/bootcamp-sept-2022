package day25.factory.model;

public class FamilyPlan extends Plan {

    private double rate = 10_000;
    
    @Override
    public double getRate() {
        return rate;
    }
    
}
