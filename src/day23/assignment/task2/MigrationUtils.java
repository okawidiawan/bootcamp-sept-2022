package day23.assignment.task2;

import day23.assignment.task2.dao.StaffSaveDao;
import day23.assignment.task2.dao.StaffSelectDao;
import day23.assignment.task2.model.Staff;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigrationUtils {

    public static List<Staff> loadStaffDataFromFile() {
        try {
            String staffDataFileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day23\\assignment\\task2\\Karyawan.txt";
            BufferedReader reader = new BufferedReader(new FileReader(staffDataFileName));
            String csv;
            Integer lineNumber = 0;
            List<Staff> staffs = new ArrayList<>();
            while ((csv = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber == 1) continue;
                String[] csvData = csv.split(",");
                Staff staff = new Staff();
                staff.setId(Integer.valueOf(csvData[0]));
                staff.setName(csvData[1]);
                staff.setBaseSalary(Double.valueOf(csvData[2]));
                staff.setPresence(Integer.valueOf(csvData[3]));
                staff.setAnnualLeave(Integer.valueOf(csvData[4]));
                staff.setStatus(csvData[5]);
                staffs.add(staff);
            }
            return staffs;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public static void saveStaffToDb(List<Staff> staffs, StaffSelectDao selectDao, StaffSaveDao saveDao) {
        for (Staff staff : staffs) {
            Staff staffFromDb = selectDao.getStaffById(staff.getId());
            if(staffFromDb == null){
                saveDao.saveWithId(staff);
            }
        }
    }
}
