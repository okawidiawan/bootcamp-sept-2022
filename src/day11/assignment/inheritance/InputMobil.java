package day11.assignment.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class InputMobil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu;
        ArrayList<Mobil> dataMobil = new ArrayList<>();

        do {
            System.out.println("MENU");
            System.out.println("1. Input Data Mobil");
            System.out.println("2. Tampilkan Data Mobil");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("Input Data Mobil");
                    System.out.print("Merek : ");
                    String merk = input.nextLine();
                    
                    System.out.print("Warna : ");
                    String warna = input.nextLine();
                            
                    System.out.print("Tahun : ");
                    int tahun = input.nextInt();
                    
                    Mobil mobil = new Mobil(merk, warna, tahun);
                    dataMobil.add(mobil);
                }
                case 2 -> {
                    int index = 1;
                    for (Mobil mobil : dataMobil) {
                        System.out.println(index + ". Mobil " + mobil.getMerk() + " Warna " + mobil.getWarna() + " tahun " + mobil.getYear());
                        index++;
                    }
                }
            }

        } while (pilihMenu != 3);
    }

}
