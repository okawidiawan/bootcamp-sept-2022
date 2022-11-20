package day8.exam;

import java.util.Scanner;

public class Kubus {
    
    private int rusuk;
    
    public double inputValue(Scanner input){
        System.out.print("Rusuk : ");
        int rusuk = input.nextInt();
        
        double volume = vKubusSum(rusuk);
        System.out.println("Volume Kubus : " + volume);
        return volume;
        
    }
    
    public double vKubusSum(int rusuk){
        double sum = Math.pow(rusuk, 3);
        return sum;
    }
    
}
