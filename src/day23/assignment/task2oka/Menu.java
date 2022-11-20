package day23.assignment.task2oka;

import day23.assignment.task2oka.dao.InsertUpdate;
import day23.assignment.task2oka.dao.SelectDelete;
import day23.assignment.task2oka.model.Staff;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        try {
            Properties prop = new Properties();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day23\\assignment\\task2\\Karyawan.txt"));
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day23\\assignment\\task2\\config.properties");
            prop.load(fis);
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbName = prop.getProperty("NAMADB");
            String user = prop.getProperty("USER");
            String pass = prop.getProperty("PASS");
            Connection con = DriverManager.getConnection(dbName, user, pass);
            Scanner input = new Scanner(System.in);
            SelectDelete selectDelete = new SelectDelete(con);
            InsertUpdate insertUpdate = new InsertUpdate(con);

            List<Staff> karyawan = new ArrayList<>();
            Integer pilihMenu;
            do {
                System.out.println("MENU");
                System.out.println("1. Connect Input ke Database");
                System.out.println("2. Ganti Status Karyawan (Probation, Kontrak, Tetap, Keluar)");
                System.out.println("3. Edit Data Karyawan");
                System.out.println("4. Absensi Karyawan");
                System.out.println("5. Cuti Karyawan");
                System.out.println("6. Hitung Tunjangan Karyawan (Tunjangan hanya berlaku untuk karyawan Tetap)");
                System.out.println("7. Hitung Total Gaji Karyawan (Hanya untuk Status != Keluar)");
                System.out.println("8. Tampilkan Laporan per Status");
                System.out.println("9. Exit");
                System.out.print("Pilih Menu : ");
                pilihMenu = input.nextInt();
                input.nextLine();
                System.out.println();
                switch (pilihMenu) {
                    case 1 -> {
                        String lineText = null;
                        Integer lineNumber = 0;
                        while ((lineText = reader.readLine()) != null) {
                            if (lineNumber > 0) {
                                Staff staff = new Staff();
                                String[] lineSplit = lineText.split(",");
                                staff.setNama(lineSplit[1]);
                                staff.setGajiPokok(Integer.parseInt(lineSplit[2]));
                                staff.setAbsensi(Integer.parseInt(lineSplit[3]));
                                staff.setJumlahCuti(Integer.parseInt(lineSplit[4]));
                                staff.setStatus(lineSplit[5]);
                                karyawan.add(staff);
                                insertUpdate.saveData(staff);
                            }
                            lineNumber++;
                        }
                    }
                    case 2 -> {
                        Integer id = MenuUtils.inputId(input);
                        Staff staff = MenuUtils.inputStatusStaff(input);
                        staff.setId(id);
                        insertUpdate.updateStatus(staff);
                    }
                    case 3 -> {
                        Integer id = MenuUtils.inputId(input);
                        Staff staff = MenuUtils.inputNamaStaff(input);
                        staff.setId(id);
                        insertUpdate.updateNama(staff);
                    }
                    case 4 -> {
                        Integer id = MenuUtils.inputId(input);
                        Staff staff = MenuUtils.inputAbsensiStaff(input);
                        staff.setId(id);
                        insertUpdate.updateAbsensi(staff);
                    }
                    case 5 -> {
                        Integer id = MenuUtils.inputId(input);
                        Staff staff = MenuUtils.inputCutiStaff(input);
                        staff.setId(id);
                        insertUpdate.updateCuti(staff);
                    }
                    case 6 -> {
                        
                    }
                    case 7 -> {

                    }
                    case 8 -> {
                        List<Staff> staffs = selectDelete.getKaryawan();
                        MenuUtils.showKaryawan(staffs);
                        System.out.println("");

                    }
                }

            } while (pilihMenu != 9);
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

}
