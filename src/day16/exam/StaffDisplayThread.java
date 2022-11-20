package day16.exam;

import java.util.List;

public class StaffDisplayThread extends Thread {

    private List<Staff> karyawans;

    public StaffDisplayThread(List<Staff> karyawan) {
        this.karyawans = karyawan;
    }

    @Override
    public void run() {
        System.out.println(Staff.HEADER);
        for (Staff karyawan : karyawans) {
            System.out.println(karyawan);
        }
    }

}
