package day18.assignment.task1;

public class Student {

    private String nama;
    private Integer nFisika;
    private Integer nKimia;
    private Integer nBiologi;
    private double nRataRata;

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

    public Student(String nama, Integer nFisika, Integer nKimia, Integer nBiologi) {
        this.nama = nama;
        this.nFisika = nFisika;
        this.nKimia = nKimia;
        this.nBiologi = nBiologi;
    }

    public double hitungNilaiRataRata() {
        return (this.nFisika + this.nKimia + this.nBiologi) / 3;
    }

}
