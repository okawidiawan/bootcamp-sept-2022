package day13.assignment.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Staff> dataStaff = new ArrayList<>();
        int pilihMenu;

        do {
            System.out.println("MENU");
            System.out.println("1. Buat Staff");
            System.out.println("2. Absensi Staff");
            System.out.println("3. Hitung Tunjangan");
            System.out.println("4. Hitung Total Gaji");
            System.out.println("5. Laporan Gaji");
            System.out.println("6. Exit");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("Buat Data Staff");

                    System.out.print("ID Staff : ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Staff : ");
                    String nama = input.nextLine();

                    System.out.print("Gaji Pokok : ");
                    int gajiPokok = input.nextInt();

                    Staff staff = new Staff(id, nama, gajiPokok);
                    dataStaff.add(staff);

                    System.out.println("");
                }

                case 2 -> {
                    System.out.println("Absensi Staff");
                    System.out.print("ID Staff : ");
                    int id = input.nextInt();
                    Staff stf = dataStaff.get(id - 1);
                    stf.absensiMethod();
                    System.out.println("");
                }

                case 3 -> {
                    System.out.println("Hitung Tunjangan Staff");
                    System.out.print("ID Staff : ");
                    int id = input.nextInt();
                    Staff stf = dataStaff.get(id - 1);
                    System.out.println("Tunjangan : \n" + stf.getTunjanganMakan() + " * " + stf.getAbsensi() + " : " + stf.getTotalTunjangan());
                    System.out.println("");
                }

                case 4 -> {
                    System.out.println("Hitung Total Gaji");
                    System.out.print("ID Staff : ");
                    int id = input.nextInt();
                    Staff stf = dataStaff.get(id - 1);
                    System.out.println("Total Gaji : \n" + stf.getGajiPokok() + " + " + (stf.getTunjanganMakan() * stf.getAbsensi()) + " : " + stf.getTotalGaji());
                    System.out.println("");

                }

                case 5 -> {
                    System.out.println("\t\t\t\tLAPORAN GAJI\n");
                    System.out.println("ID\tNAMA\t\tGAJI POKOK\tTUNJANGAN\tABSENSI\t\tTOTAL GAJI");
                    for (Staff staff : dataStaff) {
                        System.out.println(
                                staff.getId() + "\t"
                                + staff.getNama() + "\t\t"
                                + staff.getGajiPokok() + "\t\t"
                                + staff.getTotalTunjangan() + "\t\t"
                                + staff.getAbsensi() + " Hari" + "\t\t"
                                + staff.getTotalGaji());
                    }
                    System.out.println("");
                }
            }
        } while (pilihMenu != 6);
    }
}
