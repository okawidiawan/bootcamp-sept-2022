package day16.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaporanGajiApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Staff> karyawans = new ArrayList<>();
        int pilihMenu;

        do {
            System.out.println("MENU");
            System.out.println("1. Input Data Karyawan");
            System.out.println("2. Edit Data Karyawan");
            System.out.println("3. Absensi Karyawan");
            System.out.println("4. Izin Karyawan");
            System.out.println("5. Hitung Total Gaji Karyawan");
            System.out.println("6. Tampilkan Laporan per Karyawan");
            System.out.println("7. Tampilkan Seluruh Karyawan");
            System.out.println("8. Exit");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch (pilihMenu) {
                case 1 -> {
                    Staff staff = new Staff();
                    LaporanGajiUtils.inputStaffData(input, staff);
                    karyawans.add(staff);

                }
                case 2 -> {
                    Staff staff = LaporanGajiUtils.searchStaffData(input, karyawans);
                    if (staff != null) {
                        LaporanGajiUtils.inputStaffData(input, staff);
                    }

                }
                case 3 -> {
                    Staff staff = LaporanGajiUtils.searchStaffData(input, karyawans);
                    if (staff != null) {
                        staff.setAbsensi(staff.getAbsensi() + 1);
                    }

                }
                case 4 -> {
                    Staff staff = LaporanGajiUtils.searchStaffData(input, karyawans);
                    if (staff != null) {
                        staff.setJumlahCuti(staff.getJumlahCuti());
                    }

                }
                case 5 -> {
                    for (Staff karyawan : karyawans) {
                        karyawan.hitungGajiTotal();
                    }

                }
                case 6 -> {
                    Staff staff = LaporanGajiUtils.searchStaffData(input, karyawans);
                    if (staff != null) {
                        System.out.println(Staff.HEADER);
                        System.out.println(staff);
                    }

                }
                case 7 -> {
                    StaffDisplayThread displayThread = new StaffDisplayThread(karyawans);
                    displayThread.start();
                    StaffWriteFile writeToFile = new StaffWriteFile(karyawans);
                    writeToFile.start();

                }
            }
        } while (pilihMenu != 8);
    }

}
