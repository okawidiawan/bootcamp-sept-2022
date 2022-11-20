package day13.assignment.task2;

public abstract class Worker {
    
    private Integer id;
    private String nama;
    private Integer absensi = 0;
    
    public abstract void tambahAbsensi();

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAbsensi(Integer absensi) {
        this.absensi = absensi;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return nama;
    }

    public Integer getAbsensi() {
        return absensi;
    }

    public void setAbsensi() {
        this.absensi++;
    }
}
