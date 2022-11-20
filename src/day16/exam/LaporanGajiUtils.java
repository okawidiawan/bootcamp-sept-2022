package day16.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaporanGajiUtils {

    public static List<Staff> loadDataStaff() {

        List<Staff> karyawans = new ArrayList<>();
        try {
            String karyawanFile = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day16\\exam\\Karyawan.txt";
            BufferedReader dataReader = new BufferedReader(new FileReader(karyawanFile));
            String line = null;
            int lineNumber = 1;
            while ((line = dataReader.readLine()) != null) {
                if (lineNumber > 1) {
                    Staff s = new Staff();
                    String[] splitData = line.split(",");
                    s.setId(Integer.parseInt(splitData[0]));
                    s.setNama(splitData[1]);
                    s.setGajiPokok(Integer.parseInt(splitData[2]));
                    s.setAbsensi(Integer.parseInt(splitData[3]));
                    s.setJumlahCuti(Integer.parseInt(splitData[4]));
                    karyawans.add(s);
                }
                lineNumber++;
            }
            dataReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return karyawans;
    }

    public static Staff inputStaffData(Scanner input, Staff staff) {
        System.out.print("ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Gaji Pokok : ");
        Integer gajiPokok = input.nextInt();
        input.nextLine();
        System.out.print("Jumlah Absensi : ");
        Integer absensi = input.nextInt();
        input.nextLine();
        System.out.print("Jumlah Cuti : ");
        Integer cuti = input.nextInt();
        input.nextLine();
        staff.setId(id);
        staff.setNama(nama);
        staff.setGajiPokok(gajiPokok);
        staff.setAbsensi(absensi);
        staff.setJumlahCuti(cuti);
        return staff;
    }

    public static Staff searchStaffData(Scanner input, List<Staff> karyawans) {

        System.out.print("Input ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        for (Staff karyawan : karyawans) {
            if (karyawan.getId() == id) {

                return karyawan;
            }
        }
        return null;
    }
}
