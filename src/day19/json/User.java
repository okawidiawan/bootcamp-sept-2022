package day19.json;

public class User {
    
    private String name;
    private Integer num;
    private Double balance;
    private Boolean isVip;

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", num=" + num + ", balance=" + balance + ", isVip=" + isVip + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }
    
    
    
}
