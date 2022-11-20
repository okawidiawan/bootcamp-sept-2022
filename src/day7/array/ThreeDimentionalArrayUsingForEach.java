package day7.array;

public class ThreeDimentionalArrayUsingForEach {

    public static void main(String[] args) {

        int[][][] threeDimentionalArray = {
            {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7}
            },
            {
                {-4, -5, 6, 9},
                {7}
            }
        };

        for (int[][] twoDimentionalArray : threeDimentionalArray) {
            System.out.println("twoDimentionalArray has length of " + twoDimentionalArray.length);
            for (int[] rowArray : twoDimentionalArray) {
                System.out.println("rowArray has length of " + rowArray.length);
                for (int item : rowArray) {
                    System.out.println("Item Value : " + item);
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }

}
