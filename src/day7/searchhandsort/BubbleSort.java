package day7.searchhandsort;

public class BubbleSort {

    public int[] sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        return numbers;
    }

}