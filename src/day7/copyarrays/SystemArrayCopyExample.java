package day7.copyarrays;

import java.util.Arrays;

public class SystemArrayCopyExample {

    public static void main(String[] args) {

        int[] source = {11, 12, 13, 14, 15, 16};
        int[] firstDestination = new int[source.length];
        int[] secondDestination = new int[source.length];

        // copy entire array from source to firstDestination
        System.arraycopy(source, 0, firstDestination, 0, source.length);
        System.out.println("firstDestination array items are : " + Arrays.toString(firstDestination));

        // selective copy array from source to secondDestination
        System.arraycopy(source, 2, secondDestination, 1, 2);
        System.out.println("selective copy result in secondDestination are : " + Arrays.toString(secondDestination));

    }

}
