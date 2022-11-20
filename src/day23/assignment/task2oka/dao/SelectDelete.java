package day23.assignment.task2oka.dao;

import day23.assignment.task2oka.model.Staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectDelete {

    private static final String SELECT = "SELECT * FROM T_KARYAWAN";
    private static final String DELETE = "DELETE FROM T_KARYAWAN WHERE ID=?";
    private static final String SELECT_STATUS_TETAP = "SELECT * FROM T_KARYAWAN WHERE STATUS='Tetap'";

    private PreparedStatement selectPs;
    private PreparedStatement deletePs;
    private PreparedStatement selectStatusTetapPs;

    public SelectDelete(Connection con) {
        try {
            selectPs = con.prepareStatement(SELECT);
            selectStatusTetapPs = con.prepareStatement(SELECT_STATUS_TETAP);
            deletePs = con.prepareStatement(DELETE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Staff> getKaryawan() {
        try {
            ResultSet rs = selectPs.executeQuery();
            return getKaryawansFromResultSet(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<Staff> getKaryawanTetap() {
        try {
            ResultSet rs = selectStatusTetapPs.executeQuery();
            return getKaryawansFromResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public Staff getKaryawanFromResultSet(ResultSet rs) throws SQLException {
        Staff staff = new Staff();
        staff.setId(rs.getInt("id"));
        staff.setNama(rs.getString("nama"));
        staff.setGajiPokok(rs.getInt("gaji_pokok"));
        staff.setAbsensi(rs.getInt("absensi"));
        staff.setJumlahCuti(rs.getInt("jumlah_cuti"));
        staff.setStatus(rs.getString("status"));
        staff.setGajiTotal(rs.getInt("total_gaji"));
        return staff;
    }

    public List<Staff> getKaryawansFromResultSet(ResultSet rs) throws SQLException {
        List<Staff> staffs = new ArrayList<>();
        while (rs.next()) {
            staffs.add(getKaryawanFromResultSet(rs));
        }
        return staffs;
    }
}
