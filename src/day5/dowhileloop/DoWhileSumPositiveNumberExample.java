package day5.dowhileloop;

import java.util.Scanner;

public class DoWhileSumPositiveNumberExample {
    
    public static void main(String[] args) {
        
        int sum = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);
        
        do{
            sum += number;
            System.out.print("Input positive number : ");
            number = input.nextInt();

        } while(number >= 0);
        
        System.out.println("Sum : " + sum);
    }
    
}
