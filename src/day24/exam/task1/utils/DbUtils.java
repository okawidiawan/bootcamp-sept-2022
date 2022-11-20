package day24.exam.task1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    public static Connection connectToDb() {

            try {
                String mySqlJdbcString = "jdbc:mysql://localhost:3306/day24_exam";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(mySqlJdbcString, "root", "admin");
                return con;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return null;
    }
}
