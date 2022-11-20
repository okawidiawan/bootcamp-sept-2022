package day4.assignment;

import java.util.Scanner;

public class InputOutput {
    
    public static void main(String[] args) {
        
        // Membuat object scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang = ");
        // Membaca input value panjang yang dilakukan user, dengan tipe data int
        int panjang = input.nextInt();
        
        System.out.print("Lebar = ");
        // Membaca input value lebar yang dilakukan user, dengan tipe data int
        int lebar = input.nextInt();
    
        System.out.print("Tinggi = ");
        // Membaca input value tinggi yang dilakukan user, dengan tipe data int
        int tinggi = input.nextInt();
        
        // Menghitung voleme balok
        int volumeBalok = panjang * lebar * tinggi;
        // Mencetak hasil perhitungan dari volume balok
        System.out.println("Volume Balok Adalah " + volumeBalok);
        
        
        System.out.print("Pi = ");
        // Membaca input value pi yang dilakukan user, dengan tipe data double
        double pi = input.nextDouble();
        
        System.out.print("Jari-jari = ");
        // Membaca input value jari-jari yang dilakukan user, dengan tipe data double
        double jariJari = input.nextDouble();
        
        // Menghitung volume bola
        double volumeBola = 4/3D * (pi * (Math.pow(jariJari, 3)));
        // Mencetak hasil perhitungan dari volume bola
        System.out.println("Volume Balok Adalah " + volumeBola);

    }
}