package day9.assignment;

import java.util.Scanner;

public class VolumeBangun {

    public double volBangun(int p, int l, int t) {
        return p * l * t;
    }

    public double volBangun(int jarijari) {
        return (4 / 3D) * Math.PI * Math.pow(jarijari, 3);
    }

    public double volBangun(int jarijari, int t) {

        return Math.PI * jarijari * jarijari * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VolumeBangun vb = new VolumeBangun();
        int pilihanMenu = 0;

        do {
            System.out.println("MENU");
            System.out.println("1. Volume Balok");
            System.out.println("2. Volume Bola");
            System.out.println("3. Volume Tabung");
            System.out.println("4. Exit");
            System.out.println("MENU");
            System.out.print("Input Nomor : ");
            pilihanMenu = input.nextInt();
            input.nextLine();

            switch (pilihanMenu) {
                case 1 -> {
                    System.out.println("Volume Balok");
                    int p = inputBilangan(input, "Panjang");
                    int l = inputBilangan(input, "Lebar");
                    int t = inputBilangan(input, "Tinggi");
                    double volume = vb.volBangun(p, l, t);
                    System.out.println("Volume Balok : " + volume);
                }
                case 2 -> {
                    System.out.println("Volume Bola");
                    int jarijari = inputBilangan(input, "Jari-Jari");
                    double volume = vb.volBangun(jarijari);
                    System.out.println("Volume Bola : " + volume);
                }
                case 3 -> {
                    System.out.println("Volume Tabung");
                    int jarijari = inputBilangan(input, "Jari-Jari");
                    int t = inputBilangan(input, "Tinggi");
                    double volume = vb.volBangun(jarijari, t);
                    System.out.println("Volume Bola : " + volume);
                }
                default -> {
                }
            }
        } while (pilihanMenu != 4);

    }

    public static int inputBilangan(Scanner input, String label) {
        System.out.print(label + " : ");
        int bilangan = input.nextInt();
        input.nextLine();
        return bilangan;

    }
}
