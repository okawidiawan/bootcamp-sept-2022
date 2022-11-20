package day8.exam;

import java.util.Scanner;

public class Bola {

    private int jarijari;

    public double inputValue(Scanner input) {
        System.out.print("Jari-Jari : ");
        int jarijari = input.nextInt();

        double volume = vBolaSum(jarijari);
        System.out.println("Volume Bola : " + volume);
        return volume;
    }

    public double vBolaSum(int jarijari) {
        double sum = Math.round((4 / 3D) * Math.PI * Math.pow(jarijari, 3) * 10.0) / 10.0;
        return sum;
    }

}
