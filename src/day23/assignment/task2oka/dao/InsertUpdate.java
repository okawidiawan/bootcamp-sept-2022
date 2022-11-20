package day23.assignment.task2oka.dao;

import day23.assignment.task2oka.model.Staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUpdate {
    private static final String INSERT = "INSERT INTO T_KARYAWAN(NAMA, GAJI_POKOK, ABSENSI, JUMLAH_CUTI, STATUS) VALUES(?,?,?,?,?)";
    private static final String UPDATE = "UPDATE T_KARYAWAN SET NAMA=?, GAJI_POKOK=?, ABSENSI=?, JUMLAH_CUTI=?, STATUS=?, TUNJANGAN_MAKAN=?, TUNJANGAN_TRANSPORT=?, TOTAL_GAJI=?_, WHERE ID=?";

    private PreparedStatement insertPs;
    private PreparedStatement updatePs;
    private PreparedStatement updateStatusPs;
    private PreparedStatement updateNamaPs;
    private PreparedStatement updateAbsensiPs;
    private PreparedStatement updateCutiPs;
    private PreparedStatement updateTunjanganPs;

    public InsertUpdate(Connection con) {
        try {
            insertPs = con.prepareStatement(INSERT);
            updatePs = con.prepareStatement(UPDATE);
            updateStatusPs = con.prepareStatement("UPDATE T_KARYAWAN SET STATUS=? WHERE ID=?");
            updateNamaPs = con.prepareStatement("UPDATE T_KARYAWAN SET NAMA=? WHERE ID=?");
            updateAbsensiPs = con.prepareStatement("UPDATE T_KARYAWAN SET ABSENSI=? WHERE ID=?");
            updateCutiPs = con.prepareStatement("UPDATE T_KARYAWAN SET JUMLAH_CUTI=? WHERE ID=?");
            updateTunjanganPs = con.prepareStatement("UPDATE T_KARYAWAN SET TUNJANGAN_MAKAN=?, TUNJANGAN_TRANSPORT=? WHERE ID=?");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveData(Staff staff) {
        try {

            if (staff.getId() == null) {
                insertPs.setString(1, staff.getNama());
                insertPs.setInt(2, staff.getGajiPokok());
                insertPs.setInt(3, staff.absensi());
                insertPs.setInt(4, staff.getJumlahCuti());
                insertPs.setString(5, staff.getStatus());
                insertPs.execute();

            } else {

                updatePs.setString(1, staff.getNama());
                updatePs.setInt(2, staff.getGajiPokok());
                updatePs.setInt(3, staff.absensi());
                updatePs.setInt(4, staff.getJumlahCuti());
                updatePs.setString(5, staff.getStatus());
                updatePs.execute();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStatus(Staff staff) {
        try {
            updateStatusPs.setString(1, staff.getStatus());
            updateStatusPs.setInt(2, staff.getId());
            updateStatusPs.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateNama(Staff staff) {
        try {
            updateNamaPs.setString(1, staff.getNama());
            updateNamaPs.setInt(2, staff.getId());
            updateNamaPs.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAbsensi(Staff staff) {
        try {
            updateAbsensiPs.setInt(1, staff.getAbsensi());
            updateAbsensiPs.setInt(2, staff.getId());
            updateAbsensiPs.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCuti(Staff staff) {
        try {
            updateCutiPs.setInt(1, staff.getJumlahCuti());
            updateCutiPs.setInt(2, staff.getId());
            updateCutiPs.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateTunjangan(Staff staff) {
        try {
            updateTunjanganPs.setInt(1, staff.hitungTunjanganMakan());
            updateTunjanganPs.setInt(2, staff.hitungTunjanganTransport());
            updateTunjanganPs.setInt(3, staff.getId());
            updateTunjanganPs.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
