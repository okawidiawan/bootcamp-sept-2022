package day9.assignment;

import java.util.Scanner;

public class Calculator {

    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihanMenu;
        Calculator cal = new Calculator();

        do {
            System.out.println("KALKULATOR");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Exit");
            System.out.print("Input Nomor : ");
            pilihanMenu = input.nextInt();
            input.nextLine();

            switch (pilihanMenu) {
                case 1 ->                     {
                        System.out.print("Bilangan 1 : ");
                        int a = input.nextInt();
                        System.out.print("Bilangan 2 : ");
                        int b = input.nextInt();
                        int result = cal.pertambahan(a, b);
                        System.out.println(a + " + " + b + " = " + result);
                    }
                case 2 ->                     {
                        System.out.print("Bilangan 1 : ");
                        int a = input.nextInt();
                        System.out.print("Bilangan 2 : ");
                        int b = input.nextInt();
                        int result = cal.pengurangan(a, b);
                        System.out.println(a + " - " + b + " = " + result);
                    }
                case 3 ->                     {
                        System.out.print("Bilangan 1 : ");
                        int a = input.nextInt();
                        System.out.print("Bilangan 2 : ");
                        int b = input.nextInt();
                        int result = cal.perkalian(a, b);
                        System.out.println(a + " * " + b + " = " + result);
                    }
                case 4 ->                     {
                        System.out.print("Bilangan 1 : ");
                        int a = input.nextInt();
                        System.out.print("Bilangan 2 : ");
                        int b = input.nextInt();
                        int result = cal.pembagian(a, b);
                        System.out.println(a + " / " + b + " = " + result);
                    }
                default -> {
                }
            }
            
            System.out.println("");

        } while (pilihanMenu != 5);

    }

}
