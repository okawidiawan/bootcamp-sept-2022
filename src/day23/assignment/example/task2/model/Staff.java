package day23.assignment.example.task2.model;

import day23.assignment.example.task2.model.Worker;

public class Staff extends Worker {

    private Double takeHomePay;
    private Double mealAllowance;
    private Double transportAllowance;

    @Override
    public void calculateBaseSalary() {
        setBaseSalary(getBaseSalary() / 22 * getPresence());
    }

    public Double calculateMealAllowance() {
        Double mealAllowance = 220000d;
        if (getAnnualLeave() > 1) {
            Double cut = (mealAllowance / 22) * getAnnualLeave();
            mealAllowance -= cut;
        }
        return mealAllowance;
    }

    public Double calculateTransportAllowance() {
        Double transportAllowance = 440000d;
        if (getAnnualLeave() > 1) {
            Double cut = (transportAllowance / 22) * getPresence();
            transportAllowance -= cut;
        }
        return transportAllowance;
    }

    public Double calculateTakeHomePay() {
        takeHomePay = getBaseSalary() + getMealAllowance() + getTransportAllowance();
        return takeHomePay;
    }

    public Double getMealAllowance() {
        return mealAllowance;
    }

    public void setMealAllowance(Double mealAllowance) {
        this.mealAllowance = mealAllowance;
    }

    public Double getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(Double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public Double getTakeHomePay() {
        return takeHomePay;
    }

    public void setTakeHomePay(Double takeHomePay) {
        this.takeHomePay = takeHomePay;
    }

    @Override
    public String toString() {
        return getId() + ","
                + getName() + ","
                + getBaseSalary() + ","
                + getPresence() + ","
                + getAnnualLeave() + ","
                + getAbsenceWithNoReason() + ","
                + getMealAllowance() + ","
                + getStatus() + ","
                + getTakeHomePay();
    }

}
