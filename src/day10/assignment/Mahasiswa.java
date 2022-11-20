package day10.assignment;

import java.util.Scanner;

public class Mahasiswa {

    String nama;
    String jurusan;
    int nilai_fisika;
    int nilai_kimia;
    int nilai_biologi;

    public Mahasiswa() {
        nama = "Default";
        jurusan = "Default";
    }

    public Mahasiswa(String namaMhs, String jurusanMhs) {
        nama = namaMhs;
        jurusan = jurusanMhs;
    }

    public Mahasiswa(String namaMhs, String jurusanMhs, int nilaiFisika, int nilaiKimia, int nilaiBiologi) {
        nama = namaMhs;
        jurusan = jurusanMhs;
        nilai_fisika = nilaiFisika;
        nilai_kimia = nilaiKimia;
        nilai_biologi = nilaiBiologi;

    }

    public void getMahasiswa() {
        System.out.println(nama + " " + jurusan);
        System.out.println(nilai_fisika + " " + nilai_kimia + " " + nilai_biologi);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu = 0;

        do {

            System.out.println("MENU");
            System.out.println("1. Konstruktor Tanpa Parameter");
            System.out.println("2. Konstruktor Dengan 2 Parameter");
            System.out.println("3. Konstruktor Dengan 5 Parameter");
            System.out.println("4. EXIT");
            System.out.print("Pilih Nomor : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            System.out.println("");
            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("Konstruktor Tanpa Parameter");
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.getMahasiswa();

                }
                case 2 -> {
                    System.out.println("Konstruktor Dengan 2 Parameter");
                    Mahasiswa mhs = new Mahasiswa("Steve", "IT");
                    mhs.getMahasiswa();
                }
                case 3 -> {
                    System.out.println("Konstruktor Dengan 5 Parameter");
                    Mahasiswa mhs = new Mahasiswa("Steve", "IT", 7, 8, 9);
                    mhs.getMahasiswa();
                }
            }
            System.out.println("");

        } while (pilihMenu != 4);

    }

}
