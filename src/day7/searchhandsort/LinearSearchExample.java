package day7.searchhandsort;

import java.util.Arrays;

public class LinearSearchExample {

    public static void main(String[] args) {
        int[] numbers = {3, 34, 5, 91, 100};
        int target = 91;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target " + target +
                        " is found in array " + Arrays.toString(numbers)+
                        " index of " + i);
                break;
            }
        }
    }

}
