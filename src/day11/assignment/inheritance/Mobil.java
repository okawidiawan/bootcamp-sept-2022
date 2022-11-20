package day11.assignment.inheritance;

public class Mobil {
    
    private String merk;
    private String warna;
    private Integer tahun;

    public Mobil(String merk, String warna, Integer tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public Integer getYear() {
        return tahun;
    }
    
    
    
    
}
