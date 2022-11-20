package day15;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        int[] arrayInt = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arrayInt[i] = i;
        }

        System.out.println("=================================================");
        System.out.println("Using Sequential Stream");
        System.out.println("=================================================");

        Long start = System.currentTimeMillis();
        IntStream sequentialStream = Arrays.stream(arrayInt);
        sequentialStream.forEach(s -> System.out.println(Thread.currentThread().getName() + " is executing task " + s));
        Long end = System.currentTimeMillis();
        System.out.println("Sequential stream executing for : " + (end - start) + "ms");

        System.out.println("=================================================");
        System.out.println("Using Paralele Stream");
        System.out.println("=================================================");
        start = System.currentTimeMillis();

        IntStream parallelStream = Arrays.stream(arrayInt).parallel();
        parallelStream.forEach(s -> System.out.println(Thread.currentThread().getName() + " is executing task " + s));
        end = System.currentTimeMillis();
        System.out.println("Parallel stream executing for : " + (end - start) + "ms");
    }

}
