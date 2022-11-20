
package day4.io;

import java.util.Scanner;

public class InputUsingScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Number (Integer) : ");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Your Number Is : " + number);
        
        System.out.print("Enter a Number (Float or Double) : ");
        double doubleNumber = input.nextDouble();
        input.nextLine();
        System.out.println("Your Number Is : " + doubleNumber);
        
        System.out.print("Enter a word : ");
        String str = input.nextLine();
        System.out.println("Your Word is " + str);
        
    }

    
}
