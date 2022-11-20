package day24.exam.task1.dao;

import day24.exam.task1.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDao {
    private static final String INSERT = "INSERT INTO T_STUDENT(NAME, ADDRESS, STATUS, PHYSICS, CALCULUS, BIOLOGY) VALUES (?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE T_STUDENT SET NAME=?, ADDRESS=?, STATUS=?, PHYSICS=?, CALCULUS=?, BIOLOGY=? WHERE ID=?";

    private PreparedStatement insertPs;
    private PreparedStatement updatePs;

    public InsertDao(Connection con) {
        try {
            insertPs = con.prepareStatement(INSERT);
            updatePs = con.prepareStatement(UPDATE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  void insertStudent(Student student){
        try{
            insertPs.setString(1,student.getName());
            insertPs.setString(2,student.getAddress());
            insertPs.setString(3,student.getStatus());
            insertPs.setInt(4,student.getPhysics());
            insertPs.setInt(5,student.getCalculus());
            insertPs.setInt(6,student.getBiology());
            insertPs.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student){
        try{
            updatePs.setString(1,student.getName());
            updatePs.setString(2,student.getAddress());
            updatePs.setString(3,student.getStatus());
            updatePs.setInt(4,student.getPhysics());
            updatePs.setInt(5,student.getCalculus());
            updatePs.setInt(6,student.getBiology());
            updatePs.setInt(7,student.getId());
            updatePs.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
