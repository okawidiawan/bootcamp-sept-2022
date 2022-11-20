package day19.assignment.example.task1;

public class Worker {

    private Integer id;
    private String nama;
    private Integer tunjanganPulsa;
    private Integer gajiPokok;
    private Integer absensi;

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", nama=" + nama + ", tunjanganPulsa=" + tunjanganPulsa + ", gajiPokok=" + gajiPokok + ", absensi=" + absensi + '}';
    }

    public Integer absensi() {
        return this.absensi++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getTunjanganPulsa() {
        return tunjanganPulsa;
    }

    public void setTunjanganPulsa(Integer tunjanganPulsa) {
        this.tunjanganPulsa = tunjanganPulsa;
    }

    public Integer getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(Integer gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Integer getAbsensi() {
        return absensi;
    }

    public void setAbsensi(Integer absensi) {
        this.absensi = absensi;
    }

}
