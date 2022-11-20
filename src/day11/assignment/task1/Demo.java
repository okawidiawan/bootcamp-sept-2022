package day11.assignment.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Staff> dataKaryawan = new ArrayList<>();

        int pilihMenu;

        do {
            System.out.println("MENU");
            System.out.println("1. Buat Staff");
            System.out.println("2. Tampilkan Laporan Staff");
            System.out.println("3. Exit");
            System.out.print("Input Nomor : ");
            pilihMenu = input.nextInt();
            input.nextLine();

            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("Input Data Karyawan");
                    System.out.print("ID : ");
                    String id = input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Jabatan : ");
                    String jabatan = input.nextLine();

                    Staff staff = new Staff(id, nama, jabatan);

                    dataKaryawan.add(staff);
                }

                case 2 -> {

                    System.out.println("ID\t\tNAMA\t\tJABATAN");
                    for (Staff staff : dataKaryawan) {
                        System.out.println(staff.getId() + "\t\t" + staff.getNama() + "\t\t" + staff.getJabatan());
                    }

                }
            }

        } while (pilihMenu != 3);
    }

}
