package day23.assignment.example.task2.model;

import day16.exam.*;

public abstract class Worker {

    private Integer id;
    private String name;
    private Double baseSalary;
    private Integer presence;
    private Integer annualLeave;
    private String status;

    public abstract void calculateBaseSalary();

    public Integer getAbsenceWithNoReason() {
        Integer presenceAndAnnualLeave = getPresence() + getAnnualLeave();
        return 22 - presenceAndAnnualLeave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public Integer getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(Integer annualLeave) {
        this.annualLeave = annualLeave;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
