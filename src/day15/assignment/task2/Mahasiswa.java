package day15.assignment.task2;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa implements Comparable<Mahasiswa>{

    public static final String HEADER =
            "ID\tNAMA\tB.INGRISS\tFISIKA\t\tALGORITMA";
    private Integer id;
    private String nama;
    private Double nBahasaInggris;
    private Double nFisika;
    private Double nAlgoritma;
    private List<Double> nilai = new ArrayList<>();

    public Mahasiswa(Integer id, String nama, Double nBahasaInggris, Double nFisika, Double nAlgoritma) {
        this.id = id;
        this.nama = nama;
        nilai.add(nBahasaInggris);
        nilai.add(nFisika);
        nilai.add(nAlgoritma);
    }

    public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Double getnBahasaInggris() {
        return nBahasaInggris;
    }

    public Double getnFisika() {
        return nFisika;
    }

    public Double getnAlgoritma() {
        return nAlgoritma;
    }

    public List<Double> getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        String mahasiswaText = id + "\t"
                + nama +"\t";
        for(Double item : nilai){
            mahasiswaText += item + "\t\t";
        }
        return mahasiswaText;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return getId().compareTo(o.getId());
    }
}
