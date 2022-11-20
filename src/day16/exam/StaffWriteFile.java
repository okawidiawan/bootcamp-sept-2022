package day16.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StaffWriteFile extends Thread {

    private List<Staff> karyawans;

    public StaffWriteFile(List<Staff> karyawans) {
        this.karyawans = karyawans;
    }

    @Override
    public void run() {
        try {
            String karyawanFile = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day16\\exam\\Karyawan.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(karyawanFile));
            writer.write(Staff.HEADER + "\n");
            for (Staff karyawan : karyawans) {
                writer.write(karyawan.toString() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
