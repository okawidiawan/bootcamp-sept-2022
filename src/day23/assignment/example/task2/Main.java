package day23.assignment.example.task2;

import day23.assignment.example.task2.dao.StaffSaveDao;
import day23.assignment.example.task2.dao.StaffSelectDao;
import day23.assignment.example.task2.model.Staff;
import day23.assignment.example.task2.utils.DbUtils;
import day23.assignment.example.task2.utils.MenuUtils;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Connection con = DbUtils.connectToDb();
        StaffSelectDao selectDao = new StaffSelectDao(con);
        StaffSaveDao saveDao = new StaffSaveDao(con);
        List<Staff> staffs = MigrationUtils.loadStaffDataFromFile();
        MigrationUtils.saveStaffToDb(staffs, selectDao, saveDao);

        Scanner input = new Scanner(System.in);
        Integer selectedMenu = 0;
        do {
            selectedMenu = MenuUtils.showMenu(input);
            switch (selectedMenu) {
                case 1 -> {

                }
                case 2 -> {
                    Integer id = MenuUtils.getStaffId(input);
                    Staff staff = selectDao.getStaffById(id);
                    if (staff != null) {
                        System.out.println("Karyawan Dengan Nama : " + staff.getName()
                                + " Statusnya : " + staff.getStatus());
                        String status = MenuUtils.getStaffStatus(input);
                        staff.setStatus(status);
                        saveDao.save(staff);
                    } else {
                        System.out.println("Staff Tidak Ditemukan");
                    }

                }
                case 3 -> {
                    Integer id = MenuUtils.getStaffId(input);
                    Staff staff = selectDao.getStaffById(id);
                    if (staff != null) {
                        System.out.println("Karyawan Dengan Nama : " + staff.getName());
                        String name = MenuUtils.getStaffName(input);
                        staff.setName(name);
                        saveDao.save(staff);
                    } else {
                        System.out.println("Staff Dengan ID " + id + " Tidak Ditemukan");
                    }

                }
                case 4 -> {
                    Integer id = MenuUtils.getStaffId(input);
                    Staff staff = selectDao.getStaffById(id);
                    if (staff != null) {
                        staff.setPresence(staff.getPresence() + 1);
                        saveDao.save(staff);
                        System.out.println("Absensi Karyawan : " + staff.getName() + " Berubah Menjadi " + staff.getPresence());
                    }
                }
                case 5 -> {
                    Integer id = MenuUtils.getStaffId(input);
                    Staff staff = selectDao.getStaffById(id);
                    if (staff != null) {
                        staff.setAnnualLeave(staff.getAnnualLeave() + 1);
                        saveDao.save(staff);
                        System.out.println("Cuti Karyawan " + staff.getName() + " Berubah Menjadi " + staff.getAnnualLeave());
                    } else {
                        System.out.println("Staff dengan id : " + id + " Tidak Ditemukan");
                    }

                }
                case 6 -> {
                    String status = MenuUtils.showStaffStatus(input);
                    List<Staff> permanentStaffs = selectDao.getStaffByStatus(status);
                    for (Staff staff : permanentStaffs) {
                        staff.calculateMealAllowance();
                        staff.calculateTransportAllowance();
                        saveDao.save(staff);
                    }
                    System.out.println(permanentStaffs.size() + " Staff Sudah Berhasil Dihitung Tunjangannya");

                }
                case 7 -> {
                    List<Staff> activeStaffs = selectDao.getStaffWithActiveStatus();
                    for (Staff staff : activeStaffs) {
                        staff.calculateTakeHomePay();
                        saveDao.save(staff);
                    }
                    System.out.println(activeStaffs.size() + " Staff Sudah Berhasil Dihitung Total Gajinya");
                }
                case 8 -> {
                    String status = MenuUtils.showStaffStatus(input);
                    List<Staff> staffsByStatus = selectDao.getStaffByStatus(status);
                    for (Staff staff : staffsByStatus) {
                        System.out.println("ID : " + staff.getId());
                        System.out.println("Name : " + staff.getName());
                        System.out.println("Presence : " + staff.getPresence());
                        System.out.println("Annual Leave : " + staff.getAnnualLeave());
                        System.out.println("Absence Without Reason : " + staff.getAbsenceWithNoReason());
                        System.out.println("Take Home Pay : " + staff.getTakeHomePay());
                        System.out.println("Status : " + staff.getStatus());
                    }
                }

            }
        } while (selectedMenu != 9);
    }

}
