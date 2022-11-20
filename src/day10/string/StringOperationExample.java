package day10.string;

import java.util.Arrays;

public class StringOperationExample {

    public static void main(String[] args) {
        String greet = "Hello World";
        System.out.println("String : " + greet);
        int length = greet.length();
        System.out.println("Length : " + length);

        if ("HellO WoRlD".equals(greet)) {
            System.out.println("String is Equal");
        } else {
            System.out.println("String is not Equal");
        }
        
        if ("HellO WoRlD".equalsIgnoreCase(greet)) {
            System.out.println("String is Equal");
        } else {
            System.out.println("String is not Equal");
        }

        String lowerCase = greet.toLowerCase();
        System.out.println("Lower Case : " + lowerCase);

        String upperCase = greet.toUpperCase();
        System.out.println("Upper Case : " + upperCase);

        String target = "ello";
        if (greet.contains(target)) {
            System.out.println(greet + " is Contain " + target);
        }
        String data = "This String Is Became To Array Split By Spacing";
        String[] dataItems = data.split(" ");
        System.out.println(data + " Split by comma : " + Arrays.toString(dataItems));
        int index = greet.indexOf("o");
        System.out.println("o is in " + greet + " index of " + index);
    }
}
