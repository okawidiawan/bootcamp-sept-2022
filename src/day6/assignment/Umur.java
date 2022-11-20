package day6.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Umur {
    
        
    private int tahunLahir;
    
    public void askInput(Scanner input){
        
        System.out.print("Tahun Lahir : ");
        tahunLahir = input.nextInt(); input.nextLine();
        
        int umur = hitungUmur(tahunLahir);
        System.out.println("Umur = " + umur);
    }
    
    public int hitungUmur(int tahunLahir){
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        return tahunSekarang - tahunLahir;
    }
}
