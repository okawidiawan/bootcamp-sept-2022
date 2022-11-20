package day6.assignment;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int selectedMenu;
        
        do{
            for(int i = 1; i <= 4; i++){
                
                if(i < 4){
                    System.out.println(i + ". Cetak Menu " +i);
                    
                }else{
                    System.out.println(i + ". EXIT");
                }
            }
            
            System.out.print("Input nomor : ");
            selectedMenu = input.nextInt();
            input.nextLine();
            
            if(selectedMenu != 4){
                System.out.println("Menu " + selectedMenu);
            }
        }
        while(selectedMenu < 4);
    }
    
}