package day6.whileloop;

import java.util.Scanner;

public class SumOfPositiveNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input positive number : ");
        int i = input.nextInt();
        
        int sum = 0;
        while(i >= 0){
            sum += i;
            System.out.print("Input positive number : ");
            i = input.nextInt();
        }
        System.out.println("Sum of positive number is : " + sum);
    }
    
}
