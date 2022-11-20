package day23.assignment.task2oka;

import day23.assignment.task2oka.model.Staff;
import java.util.List;

import java.util.Scanner;

public class MenuUtils {

    public static Staff inputStatusStaff(Scanner input) {
        System.out.print("Status : ");
        String status = input.nextLine();
        Staff staff = new Staff();
        staff.setStatus(status);
        return staff;
    }

    public static Staff inputNamaStaff(Scanner input) {
        System.out.print("Nama : ");
        String nama = input.nextLine();
        Staff staff = new Staff();
        staff.setNama(nama);
        return staff;
    }

    public static Staff inputAbsensiStaff(Scanner input) {
        System.out.print("Absensi : ");
        Integer absensi = input.nextInt();
        input.nextLine();
        Staff staff = new Staff();
        staff.setAbsensi(absensi);
        return staff;
    }

    public static Staff inputCutiStaff(Scanner input) {
        System.out.print("Cuti : ");
        Integer cuti = input.nextInt();
        input.nextLine();
        Staff staff = new Staff();
        staff.setJumlahCuti(cuti);
        return staff;
    }

    public static Integer inputId(Scanner input) {
        System.out.print("ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        return id;
    }

    public static void showKaryawan(List<Staff> staffs) {
        for (Staff staff : staffs) {
            
            System.out.println("ID : " + staff.getId());
            System.out.println("Nama : " + staff.getNama());
            System.out.println("Absensi : " + staff.getAbsensi());
            System.out.println("Cuti : " + staff.getJumlahCuti());
            System.out.println("Total Gaji : " + staff.getGajiTotal());
            System.out.println("Status : " + staff.getStatus());
            System.out.println("");

        }
    }

}
