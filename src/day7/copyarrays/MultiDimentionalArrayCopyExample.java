package day7.copyarrays;

import java.util.Arrays;

public class MultiDimentionalArrayCopyExample {

    public static void main(String[] args) {

        int[][] source = {
            {10, 11, 12, 13},
            {14, 15, 16},
            {17}
        };

        int[][] firstDestination = new int[source.length][];
        for (int row = 0; row < source.length; row++) {
            firstDestination[row] = new int[source[row].length];
            for (int col = 0; col < source[row].length; col++) {
                firstDestination[row][col] = source[row][col];
            }
        }

        System.out.println("Destination value : " + Arrays.deepToString(firstDestination));

        int[][] secondDestination = new int[source.length][];
        for (int row = 0; row < source.length; row++) {
            secondDestination[row] = new int[source[row].length];
            System.arraycopy(source[row], 0, secondDestination[row], 0, source[row].length);
        }
        System.out.println("Destination value : " + Arrays.deepToString(secondDestination));
    }

}
