package day7.assignment;

import day7.searchhandsort.BinarySearchExample;
import day7.searchhandsort.BubbleSort;
import java.util.Scanner;

public class SearchSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int selectedMenu = 0;
        int[] numbers = null;

        do {
            System.out.println("1. Input data-data dengan tipe integer");
            System.out.println("2. Sortir data-data (bubble sort)");
            System.out.println("3. Search data (binary search)");
            System.out.println("4. EXIT");
            System.out.print("Pilih Menu (1 - 4) : ");
            selectedMenu = input.nextInt();
            input.nextLine();

            if (selectedMenu == 1) {
                System.out.print("Berapa data yang ingin anda masukkan : ");
                int length = input.nextInt();
                input.nextLine();
                numbers = new int[length];
                for (int i = 1; i <= length; i++) {
                    System.out.print("Input data ke - " + i + " : ");
                    numbers[i - 1] = input.nextInt();
                }
                System.out.println("Data yang anda masukkan : " + java.util.Arrays.toString(numbers));

            } else if (selectedMenu == 2) {
                if (numbers != null) {
                    BubbleSort bubble = new BubbleSort();
                    bubble.sort(numbers);
                    System.out.println("Data setelah disort " + java.util.Arrays.toString(numbers));
                } else {
                    System.out.println("Input data terlebih dahulu di menu 1");
                }
            } else if (selectedMenu == 3) {
                System.out.print("Angka yang ingin dicari : ");
                int target = input.nextInt();
                input.nextLine();
                BinarySearchExample binary = new BinarySearchExample();
                int index = binary.search(numbers, target);
                if (index >= 0) {
                    System.out.println("Data " + target + " ditemukan di dalam array " + java.util.Arrays.toString(numbers) + " di index ke " + index);

                } else {
                    System.out.println("Data " + target + " tidak ditemukan di dalam array " + java.util.Arrays.toString(numbers));
                }
            }

        } while (selectedMenu != 4);
    }
}
