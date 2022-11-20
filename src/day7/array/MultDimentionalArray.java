package day7.array;

public class MultDimentionalArray {

    public static void main(String[] args) {
        int[][] numbers = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7}
        };

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Two Dimentional Array[" + row + "][" + col + "] : "
                        + numbers[row][col]);
            }
            System.out.println("");
        }

    }

}
