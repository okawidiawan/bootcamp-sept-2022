package day6.assignment;

import java.util.Scanner;

public class Balok {
    
    private int p;
    private int l;
    private int t;
    
    public void askInput(Scanner input){
        System.out.print("Panjang : ");
        p = input.nextInt(); input.nextLine();
        
        System.out.print("Lebar : ");
        l = input.nextInt(); input.nextLine();
        
        System.out.print("Tinggi : ");
        t = input.nextInt(); input.nextLine();
        
        int vol = vBalok(p, l, t);
        System.out.println("Volume Balok : " + vol);
    }
    
    public int vBalok(int p, int l, int t){
        return p * l * t;
    }
}
