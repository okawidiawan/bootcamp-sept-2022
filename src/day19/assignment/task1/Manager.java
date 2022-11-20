package day19.assignment.task1;

import java.util.List;

public class Manager extends Worker{
    
    private Integer tunjanganTransport;
    private Integer tunjanganEntertainment;
    private List<String> nomorTelp;

    public Integer getTunjanganTransport() {
        return tunjanganTransport;
    }

    public void setTunjanganTransport(Integer tunjanganTransport) {
        this.tunjanganTransport = tunjanganTransport;
    }

    public Integer getTunjanganEntertainment() {
        return tunjanganEntertainment;
    }

    public void setTunjanganEntertainment(Integer tunjanganEntertainment) {
        this.tunjanganEntertainment = tunjanganEntertainment;
    }

    public List<String> getNomorTelp() {
        return nomorTelp;
    }

    public void setNomorTelp(List<String> nomorTelp) {
        this.nomorTelp = nomorTelp;
    }
    
}
