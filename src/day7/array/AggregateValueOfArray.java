package day7.array;

public class AggregateValueOfArray {

    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double avg(int[] numbers) {
        double sum = sum(numbers);
        double length = numbers.length;
        double average = sum / length;
        return average;
    }

    public int min(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    public int max(int[] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

}
