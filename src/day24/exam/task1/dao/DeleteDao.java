package day24.exam.task1.dao;

import day24.exam.task1.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDao {
    public static final String DELETE = "DELETE FROM T_STUDENT WHERE ID=?";
    private PreparedStatement deletePs;

    public DeleteDao(Connection con) {
        try{
            deletePs = con.prepareStatement(DELETE);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteStudent(Student student){
        try{
            deletePs.setInt(1,student.getId());
            deletePs.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
