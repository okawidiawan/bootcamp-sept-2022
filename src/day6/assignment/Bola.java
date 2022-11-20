package day6.assignment;

import java.util.Scanner;

public class Bola {
    
    private int jarijari;
    
    public void askInput(Scanner input){
        System.out.print("Jari-jari : ");
        jarijari = input.nextInt(); input.nextLine();
        

        double vol = vBola(jarijari);
        System.out.println("Volume Bola : " + vol);
    }
    
    public double vBola(int jarijari){
        return (4/3D) * Math.PI * (Math.pow(jarijari, 3));
    }
}
