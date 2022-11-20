package day13.assignment.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Staff> dataStaff = new HashMap<>();
        int pilihMenu;

        do {
            System.out.println("MENU");
            System.out.println("1. Buat Staff");
            System.out.println("2. Tambah Absensi");
            System.out.println("3. Tampilkan Laporan Staff");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("Input Data Staff");
                    System.out.print("ID : ");
                    Integer id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Jabatan : ");
                    String jabatan = input.nextLine();

                    Staff staff = new Staff(id, nama, jabatan);
                    dataStaff.put(staff.getId(), staff);
                    System.out.println("");

                }
                case 2 -> {
                    System.out.println("Absensi Staff");
                    System.out.print("Cari ID : ");
                    Integer id = input.nextInt();
                    Staff stf = dataStaff.get(id);
                    stf.tambahAbsensi();
                    System.out.println(stf.getId() + " : " + stf.getName());
                    System.out.println("");

                }

                case 3 -> {
                    Iterator<Integer> iterator = dataStaff.keySet().iterator();
                    System.out.println("+------------------------------------------------------------+");
                    System.out.println("|\t\t\tLaporan Staff\t\t\t     |");
                    System.out.println("+------------------------------------------------------------+");
                    System.out.println("|   ID\t\tNAMA\t\tJABATAN\t\tABSEN\t     |");
                    System.out.println("+------------------------------------------------------------+");
                    while (iterator.hasNext()) {
                        Staff stf = dataStaff.get(iterator.next());
                        System.out.println("|   " + stf.getId() + "\t\t" + stf.getName() + "\t\t" + stf.getJabatan() + "\t\t" + stf.getAbsensi() + " Hari\t     |");
                    }
                    System.out.println("+------------------------------------------------------------+\n");
                }
            }
        } while (pilihMenu != 4);
    }
}
