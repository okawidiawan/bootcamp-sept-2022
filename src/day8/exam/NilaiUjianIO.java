package day8.exam;

import java.util.Scanner;

public class NilaiUjianIO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Jumlah Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        String[] names = new String[jumlahMahasiswa];
        double[][] values = new double[jumlahMahasiswa][4];
        
        
        for (int i = 0; i < names.length; i++) {
            System.out.print("Nama Mahasiswa : ");
            names[i] = input.next();

            System.out.print("Nilai UTS : ");
            values[i][0] = input.nextDouble();

            System.out.print("Nilai UAS : ");
            values[i][1] = input.nextDouble();

            System.out.print("Tugas : ");
            values[i][2] = input.nextDouble();

            values[i][3] = (0.35 * values[i][0])
                    + (0.45 * values[i][1])
                    + (0.2 * values[i][2]);
            System.out.println("");
        }

        System.out.println("   NAMA     UTS      UAS      TUGAS    NILAI AKHIR ");

        for (int i = 0; i < names.length; i++) {
            System.out.print("   " + names[i]);
            for (int j = 0; j <= values.length; j++) {
                System.out.print("     " + values[i][j]);
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------------------");
    }
}
