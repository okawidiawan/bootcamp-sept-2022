package day8.exam;

import java.util.Scanner;

public class Balok {

    private int p, l, t;

    public double inputValue(Scanner input) {
        System.out.print("Panjang : ");
        int p = input.nextInt();

        System.out.print("Lebar : ");
        int l = input.nextInt();

        System.out.print("Tinggi : ");
        int t = input.nextInt();

        double volume = vBalokSum(p, l, t);
        System.out.println("Volume Balok : " + volume);
        
        return volume;

    }

    public double vBalokSum(int p, int l, int t) {
        double sum = p * l * t;
        return sum;
    }
}
