package day23.assignment.example.task2.utils;

import java.util.Scanner;

public class MenuUtils {

    public static Integer showMenu(Scanner input) {
        System.out.println("Menu");
        System.out.println("1. Connect to DB using config.properties database");
        System.out.println("2. Ganti Status Karyawan (Probation, Kontrak, Tetap, Keluar)");
        System.out.println("3. Edit Data Karyawan (Nama Karyawan)");
        System.out.println("4. Absensi Karyawan");
        System.out.println("5. Cuti Karyawan");
        System.out.println("6. Hitung Tunjangan Karyawan (Tunjangan hanya berlaku untuk karyawan Tetap)");
        System.out.println("7. Hitung Total Gaji Karyawan (Hanya untuk Status != Keluar)");
        System.out.println("8. Tampilkan Laporan per Status");
        System.out.println("9. Exit -> Finalize Close Method");
        System.out.print("Select Menu : ");
        Integer selectedMenu = input.nextInt();
        input.nextLine();
        return selectedMenu;
    }

    public static Integer getStaffId(Scanner input) {
        System.out.print("ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        return id;
    }

    public static String getStaffStatus(Scanner input) {
        System.out.print("Status Baru (Probation, Kontrak, Tetap, Keluar) : ");
        String status = input.nextLine();
        return status;
    }
    
    public static String showStaffStatus(Scanner input) {
        System.out.print("Pilih Status (Probation, Kontrak, Tetap, Keluar): ");
        String status = input.nextLine();
        return status;
    }

    public static String getStaffName(Scanner input) {
        System.out.print("Name : ");
        String name = input.nextLine();
        return name;
    }
}
