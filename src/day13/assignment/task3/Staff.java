package day13.assignment.task3;

public class Staff implements Worker {

    private Integer id;
    private String nama;
    private Integer gajiPokok;
    private Integer absensi = 20;
    private Integer tunjanganMakan = 20000;

    public Staff(Integer id, String nama, Integer gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    @Override
    public void absensiMethod() {
        this.absensi++;
    }

    public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Integer getGajiPokok() {
        return gajiPokok;
    }

    public Integer getAbsensi() {
        return absensi;
    }

    public Integer getTunjanganMakan() {
        return tunjanganMakan;
    }
    
    public Integer getTotalTunjangan(){
        return this.absensi * this.tunjanganMakan;
    }
    
    public Integer getTotalGaji(){
        return this.gajiPokok + getTotalTunjangan();
    }
}