package day6.assignment;

import java.util.Scanner;

public class PerTahun {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tahun Lahir = ");
        int tahunLahir = input.nextInt();
        input.nextLine();
        
        System.out.print("Tahun Sekarang = ");
        int tahunSekarang = input.nextInt();
        input.nextLine();
        
        for(int age = tahunSekarang - tahunLahir ; age > 0 ; age--){
            System.out.println(age + " tahun pada tahun " + (age + tahunLahir));
        }
    }
    
}