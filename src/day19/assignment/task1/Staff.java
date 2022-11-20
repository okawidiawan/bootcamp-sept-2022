package day19.assignment.task1;

import java.util.List;

public class Staff extends Worker{
    
    private Integer tunjanganMakan;
    private List<String> emails;

    public Integer getTunjanganMakan() {
        return tunjanganMakan;
    }

    public void setTunjanganMakan(Integer tunjanganMakan) {
        this.tunjanganMakan = tunjanganMakan;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
    
}
