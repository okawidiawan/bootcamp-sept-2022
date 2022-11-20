package day10.assignment;

import java.util.Scanner;

public class MahasiswaData {

    private String nama;
    private String data;
    private int nilaiFisika, nilaiKimia, nilaiBiologi;
    
    public String[] splitText(String text){
        return text.split(",");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaData mhs = new MahasiswaData();
        int pilihMenu = 0;

        do {
            System.out.println("MENU");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Parsing and Print Data");
            System.out.println("3 EXIT");
            System.out.print("Input Nomor : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("Input Data Mahasiswa (create accumulate data)");
                    System.out.print("Input Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Input Nilai Fisika : ");
                    int nilai_fisika = input.nextInt();
                    input.nextLine();

                    System.out.print("Input Nilai Kimia : ");
                    int nilai_kimia = input.nextInt();
                    input.nextLine();

                    System.out.print("Input Nilai Biologi : ");
                    int nilai_biologi = input.nextInt();
                    input.nextLine();

                    String result = nama + "," + nilai_fisika + "," + nilai_kimia + "," + nilai_biologi;
                    mhs.data = result;
                    System.out.println(mhs.data);
                }
                case 2 -> {

                    System.out.println("Parsing and Print Data");
                    String[] textSplit = mhs.splitText(mhs.data);
                    mhs.nama = textSplit[0];
                    mhs.nilaiFisika = Integer.parseInt(textSplit[1]);
                    mhs.nilaiKimia = Integer.parseInt(textSplit[2]);
                    mhs.nilaiBiologi = Integer.parseInt(textSplit[3]);
                    System.out.println(mhs.nama);
                    System.out.println(mhs.nilaiFisika + " " + mhs.nilaiKimia + " " + mhs.nilaiBiologi);
                }
            }
        } while (pilihMenu != 3);
    }
}
