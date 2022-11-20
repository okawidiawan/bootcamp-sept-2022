package day6.assignment;

import java.util.Scanner;

public class MenuHitung {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int selectedMenu;
        
        do{
            System.out.println("1. Volume Balok");
            System.out.println("2. Volume Bola");
            System.out.println("3. Hitung Umur");
            System.out.println("4. EXIT");
            System.out.print("Input nomor : ");
            selectedMenu = input.nextInt();
            input.nextLine();
            if(selectedMenu == 1){
                // Balok
                Balok balok = new Balok();
                balok.askInput(input);
            } else if(selectedMenu == 2){
                // Bola
                Bola bola = new Bola();
                bola.askInput(input);
            } else if(selectedMenu == 3){
                // Umur
                Umur umur = new Umur();
                umur.askInput(input);
            }
        }
        while(selectedMenu < 4);
    }
        
}
    
