package day7.searchhandsort;

import java.util.Arrays;

public class BinarySearchExample {

    public int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else if (numbers[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
