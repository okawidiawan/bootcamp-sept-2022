package day7.copyarrays;

public class CopyArrayUsingAssignmentOperator {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] positiveNumbers = numbers;

        for (int positiveNumber : positiveNumbers) {
            System.out.print(positiveNumber + ", ");
        }
        System.out.println("");

        numbers[0] = -1;
        System.out.println("positiveNumbers item with index 0 " + "will change since both variable refer to same array");

        for (int positiveNumber : positiveNumbers) {
            System.out.print(positiveNumber + ", ");
        }
        System.out.println("");

    }

}
