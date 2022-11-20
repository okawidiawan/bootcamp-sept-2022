package day7.array;

public class MultDimentionalArrayTraversalUsingForEach {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7}
        };

        for (int[] row : numbers) {
            System.out.println("Row Length " + row.length);
            for (int item : row) {
                System.out.println("Item Value : " + item);
            }
            System.out.println("");
        }

    }

}
