package day15.assignment.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        int pilihMenu;

        do {
            System.out.println("MENU");
            System.out.println("1. Create & Input Data Mahasiswa");
            System.out.println("2. Laporan Nilai Data Mahasiswa");
            System.out.println("3. Print & Tulis ke File");
            System.out.println("4. Exit");
            System.out.print("Input Pilihan : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch (pilihMenu) {
                case 1 -> {

                    System.out.println("Create & Input Data Mahasiswa");

                    System.out.print("ID : ");
                    Integer id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Nilai Bahasa Inggris : ");
                    Double nBahasaInggris = input.nextDouble();
                    input.nextLine();

                    System.out.print("Nilai Fisika : ");
                    Double nFisika = input.nextDouble();
                    input.nextLine();

                    System.out.print("Nilai Algoritma : ");
                    Double nAlgoritma = input.nextDouble();
                    input.nextLine();

                    Mahasiswa mhs = new Mahasiswa(id, nama, nBahasaInggris, nFisika, nAlgoritma);

                    dataMahasiswa.add(mhs);

                }

                case 2 -> {
                    MahasiswaDisplayThread t = new MahasiswaDisplayThread(dataMahasiswa);
                    Collections.sort(dataMahasiswa);
                    t.displayMahasiswa();
                }
                
                case 3 -> {
                    MahasiswaDisplayThread displayThread = new MahasiswaDisplayThread(dataMahasiswa);
                    displayThread.start();
                    
                    MahasiswaSaveToFile saveToFileThread = new MahasiswaSaveToFile(dataMahasiswa);
                    saveToFileThread.start();
                }

            }

        } while (pilihMenu != 4);
    }
}
