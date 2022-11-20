package day24.exam.example;

public class Student {
    private Integer id;
    private String name;
    private String address;
    private String status;
    private Integer physics;
    private Integer biology;
    private Integer calculus;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getBiology() {
        return biology;
    }

    public void setBiology(Integer biology) {
        this.biology = biology;
    }

    public Integer getCalculus() {
        return calculus;
    }

    public void setCalculus(Integer calculus) {
        this.calculus = calculus;
    }
}
