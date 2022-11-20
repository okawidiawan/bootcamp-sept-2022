package day7.assignment;

import java.util.Scanner;

public class ArraysMulti {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Baris Array Integer : ");
        int rowLength = input.nextInt();
        input.nextLine();

        System.out.print("Kolom Array Integer : ");
        int colLength = input.nextInt();
        input.nextLine();

        int[][] numbers = new int[rowLength][colLength];
        
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                System.out.print("Index[" + row + "][" + col + "] : ");
                numbers[row][col] = input.nextInt();
                input.nextLine();
            }
        }
        
        System.out.println("Baris dan Kolom Array 2 Dimensi Adalah ["
                + rowLength + "," + colLength + "]");
        System.out.println("Array Multidimensi 2 Dimensi");
        for(int[] rowArray : numbers){
            for(int item : rowArray){
                System.out.print(item + "\t");
            }
            System.out.println("");
        }

    }

}
