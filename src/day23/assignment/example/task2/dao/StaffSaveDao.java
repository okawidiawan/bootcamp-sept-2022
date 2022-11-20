package day23.assignment.example.task2.dao;

import day23.assignment.example.task2.model.Staff;
import java.sql.*;

public class StaffSaveDao {

    private static final String INSERT_WITH_ID
            = "INSERT INTO T_STAFF(ID, NAME, BASE_SALARY,"
            + " PRESENCE, ANNUAL_LEAVE, STATUS)"
            + " VALUES(?, ?, ?, ?, ?, ?)";

    private static final String UPDATE
            = "UPDATE T_STAFF SET NAME = ?, BASE_SALARY = ?, "
            + "PRESENCE = ?, ANNUAL_LEAVE = ?, STATUS = ?, "
            + "MEAL_ALLOWANCE = ?, TRANSPORT_ALLOWANCE = ?, "
            + "TAKE_HOME_PAY = ? WHERE ID = ?";

    private PreparedStatement insertWithIdPs;
    private PreparedStatement updatePs;

    public StaffSaveDao(Connection con) {
        try {
            insertWithIdPs = con.prepareStatement(INSERT_WITH_ID);
            updatePs = con.prepareStatement(UPDATE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveWithId(Staff staff) {
        try {
            insertWithIdPs.setInt(1, staff.getId());
            insertWithIdPs.setString(2, staff.getName());
            insertWithIdPs.setDouble(3, staff.getBaseSalary());
            insertWithIdPs.setInt(4, staff.getPresence());
            insertWithIdPs.setInt(5, staff.getAnnualLeave());
            insertWithIdPs.setString(6, staff.getStatus());
            insertWithIdPs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void save(Staff staff) {
        try {
            if (staff.getId() != null) {
                updatePs.setString(1, staff.getName());
                updatePs.setDouble(2, staff.getBaseSalary());
                updatePs.setInt(3, staff.getPresence());
                updatePs.setInt(4, staff.getAnnualLeave());
                updatePs.setString(5, staff.getStatus());
                updatePs.setDouble(6, staff.getMealAllowance());
                updatePs.setDouble(7, staff.getTransportAllowance());
                updatePs.setDouble(8, staff.getTakeHomePay());
                updatePs.setInt(9, staff.getId());
                updatePs.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
