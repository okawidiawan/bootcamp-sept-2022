package day5.assignment;

import java.util.Scanner;

public class Kalkulator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose an operator: +, -, *, or / : ");
        String operator = input.nextLine();
        
        System.out.print("Enter first number : ");
        double firstNumber = input.nextDouble();
        input.nextLine();
        
        System.out.print("Enter second number : ");
        double secondNumber = input.nextDouble();
        input.nextLine();
        
        Kalkulator k = new Kalkulator();
        String operasiMatematika = k.operasiMatematika(operator, firstNumber, secondNumber);
        System.out.println(operasiMatematika);
        
    }
            public String operasiMatematika(String operator, double firstNumber, double secondNumber){
                
                String result = "";
                switch(operator){
                    case "+":
                        result = firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber + secondNumber);
                        break;
                    case "-":
                        result = firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber - secondNumber);
                        break;
                    case "*":
                        result = firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber * secondNumber);
                        break;
                    case "/":
                        result = firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber / secondNumber);
                        break;
                }
            return result;
        }
    
}
