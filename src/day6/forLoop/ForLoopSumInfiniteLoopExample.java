package day6.forLoop;

public class ForLoopSumInfiniteLoopExample {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 0;
        
        for (; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum Value : " + sum);
    }
}
