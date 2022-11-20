package day16.exam;

public abstract class Worker {
    
    private Integer id;
    private String nama;
    private Integer gajiPokok;
    private Integer absensi;
    private Integer jumlahCuti;
    
    
    public abstract void hitungGajiPokok();
    
    public Integer getTanpaKabar(){
        Integer denganKabar = getAbsensi() + getJumlahCuti();
        return 22 - denganKabar;
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
