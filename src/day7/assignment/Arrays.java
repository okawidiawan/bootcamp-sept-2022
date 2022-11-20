package day7.assignment;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Panjang Array Integer = ");
        
        int length = input.nextInt();
        input.nextLine();
        
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Index[" + i + "] : ");
            numbers[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("Panjang Array Integer : " + length);
        System.out.println("Array integer : "
                + java.util.Arrays.toString(numbers));

    }

}
