package day19.assignment.example.task2;

public class Student {

    private String nama;
    private Integer nFisika;
    private Integer nKimia;
    private Integer nBiologi;
    private double nRataRata;

    public Student(String csv) {
        String[] csvData = csv.split(",");
        nama = csvData[0];
        nFisika = Integer.parseInt(csvData[1]);
        nKimia = Integer.parseInt(csvData[2]);
        nBiologi = Integer.parseInt(csvData[3]);
    }

    public Student() {
    }

    public String getNama() {
        return nama;
    }

    public Integer getnFisika() {
        return nFisika;
    }

    public Integer getnKimia() {
        return nKimia;
    }

    public Integer getnBiologi() {
        return nBiologi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setnFisika(Integer nFisika) {
        this.nFisika = nFisika;
    }

    public void setnKimia(Integer nKimia) {
        this.nKimia = nKimia;
    }

    public void setnBiologi(Integer nBiologi) {
        this.nBiologi = nBiologi;
    }

    public void setnRataRata(double nRataRata) {
        this.nRataRata = nRataRata;
    }

    public double hitungNilaiRataRata() {
        return (this.nFisika + this.nKimia + this.nBiologi) / 3;
    }

    @Override
    public String toString() {
        String printOut
                = "Nama : " + nama + "\n"
                + "Nilai Fisika : " + nFisika + "\n"
                + "Nilai Kimia : " + nKimia + "\n"
                + "Nilai Biologi : " + nBiologi + "\n";
        return printOut;
    }

}
