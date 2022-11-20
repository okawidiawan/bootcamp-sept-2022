package day24.exam.task1.dao;

import day24.exam.task1.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSelectDao {
    private static final String SELECT_BY_ID = "SELECT * FROM T_STUDENT WHERE ID=?";

    private PreparedStatement selectPs;

    public StudentSelectDao(Connection con) {
        try{
            selectPs = con.prepareStatement(SELECT_BY_ID);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Student getStudentById(Student studentId){
        try{
            selectPs.setInt(1,studentId.getId());
            ResultSet rs = selectPs.executeQuery();
            if (rs.next()){
                Student student = getStudentFromResultSet(rs);
                return student;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public Student getStudentFromResultSet(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAddress(rs.getString("address"));
        student.setStatus(rs.getString("status"));
        student.setPhysics(rs.getInt("physics"));
        student.setCalculus(rs.getInt("calculus"));
        student.setBiology(rs.getInt("biology"));
        return student;
    }

    public List<Student> getStudentsFromResultSet(ResultSet rs) throws SQLException {
        List<Student> students = new ArrayList<>();
        while (rs.next()){
            students.add(getStudentFromResultSet(rs));
        }
        return students;
    }
}
