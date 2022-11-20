package day7.copyarrays;

import java.util.Arrays;

public class CopyArrayExample {

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6};
        int[] destination = new int[source.length];

        System.out.println("Copying array item from source to destination");
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        System.out.println("Destination array is " + Arrays.toString(destination));
        System.out.println("Change source array value");
        source[0] = -1;
        System.out.println("Source array now change to : " + Arrays.toString(source));
        System.out.println("While destination array remain the same" + Arrays.toString(destination));
    }
}
