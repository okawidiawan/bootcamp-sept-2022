package day3.assignment;

public class Karyawan {
    private String nama;
    private String jabatan;
    private int gaji;
    
    public void printKaryawan(){
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGaji() {
        return gaji;
    }
}
