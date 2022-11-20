package day23.assignment.task2.dao;

import day23.assignment.task2.model.Staff;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaffSelectDao {

    private static final String SELECT_BY_ID = "SELECT * FROM T_STAFF WHERE ID=?";
    private static final String SELECT_BY_STATUS = "SELECT * FROM T_STAFF WHERE STATUS=?";
    private static final String SELECT_BY_ACTIVE_STATUS = "SELECT * FROM T_STAFF WHERE STATUS != 'Keluar'";
    private static final String SELECT_BY_PERMANENT_STATUS = "SELECT * FROM T_STAFF WHERE STATUS='Tetap'";

    private PreparedStatement selectByIdPs;
    private PreparedStatement selectByStatusPs;
    private PreparedStatement selectByActiveStatusPs;
    private PreparedStatement selectByPermanentPs;
    

    public StaffSelectDao(Connection con) {
        try {
            selectByIdPs = con.prepareStatement(SELECT_BY_ID);
            selectByStatusPs = con.prepareStatement(SELECT_BY_STATUS);
            selectByActiveStatusPs = con.prepareStatement(SELECT_BY_ACTIVE_STATUS);
            selectByPermanentPs = con.prepareStatement(SELECT_BY_PERMANENT_STATUS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Staff getStaffById(Integer id) {
        try {
            selectByIdPs.setInt(1, id);
            ResultSet rs = selectByIdPs.executeQuery();
            if (rs.next()) {
                return getStaffFromResultSet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Staff> getStaffByStatus(String status) {
        try {
            selectByStatusPs.setString(1, status);
            ResultSet rs = selectByStatusPs.executeQuery();
            return getStaffsFromResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<Staff> getStaffWithPermanentStatus() {
        try {
            ResultSet rs = selectByPermanentPs.executeQuery();
            return getStaffsFromResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<Staff> getStaffWithActiveStatus() {
        try {
            ResultSet rs = selectByActiveStatusPs.executeQuery();
            return getStaffsFromResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public Staff getStaffFromResultSet(ResultSet rs) throws SQLException {
        Staff staff = new Staff();
        staff.setId(rs.getInt("id"));
        staff.setName(rs.getString("name"));
        staff.setBaseSalary(rs.getDouble("base_salary"));
        staff.setStatus(rs.getString("status"));
        staff.setPresence(rs.getInt("presence"));
        staff.setAnnualLeave(rs.getInt("annual_leave"));
        staff.setMealAllowance(rs.getDouble("meal_allowance"));
        staff.setTransportAllowance(rs.getDouble("transport_allowance"));
        staff.setTakeHomePay(rs.getDouble("take_home_pay"));
        return staff;
    }

    public List<Staff> getStaffsFromResultSet(ResultSet rs) throws SQLException {
        List<Staff> staffs = new ArrayList<>();
        while (rs.next()) {
            staffs.add(getStaffFromResultSet(rs));
        }
        return staffs;
    }

}
