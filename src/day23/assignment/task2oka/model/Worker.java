package day23.assignment.task2oka.model;

public abstract class Worker {
    private Integer id;
    private String nama;
    private Integer gajiPokok;
    private Integer absensi;
    private Integer jumlahCuti;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void hitungGajiPokok();

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

    public Integer getJumlahCuti() {
        return jumlahCuti;
    }

    public void setJumlahCuti(Integer jumlahCuti) {
        this.jumlahCuti = jumlahCuti;
    }
}
