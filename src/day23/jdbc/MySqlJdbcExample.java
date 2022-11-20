package day23.jdbc;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MySqlJdbcExample {

    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to Database
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day21",
                    "root",
                    "admin");

            // 3. Create Statement
            Statement st = conn.createStatement();

            // 4. Execute SQL
            ResultSet rs = st.executeQuery("select * from t_user");
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Username : " + rs.getString("user_name"));
                System.out.println("Password : " + rs.getString("password"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Birth Date : " + rs.getDate("birth_date"));
                System.out.println("=============================================");
            }

            conn.setAutoCommit(false);
            // 4b. Execute insert SQL
            PreparedStatement insertPs = conn.prepareStatement(
                    "insert into t_user(user_name, password, name, birth_date) values(?, ?, ?, ?)");
            insertPs.setString(1, "bezarius@gmail.com");
            insertPs.setString(2, "bezariusPassW0rd");
            insertPs.setString(3, "bezarius");
            Date birthDate = new Date(new GregorianCalendar(1999, Calendar.APRIL, 1).getTimeInMillis());
            insertPs.setDate(4, birthDate);
            insertPs.execute();

            // 4c. Update
            PreparedStatement updatePs = conn.prepareStatement("update t_user set user_name=? where id=?");
            updatePs.setString(1, "quill@gmail.com");
            updatePs.setInt(2, 8);
            updatePs.execute();

            // 4d. Delete
            PreparedStatement deletePs = conn.prepareStatement("del from t_user where id=?");
            deletePs.setInt(1, 5);
            deletePs.execute();
            conn.commit();
            conn.setAutoCommit(true);

            // 5. Close Connection
            conn.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                    conn.setAutoCommit(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
