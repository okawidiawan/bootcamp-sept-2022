package day23.assignment.task1.dao;

import day23.assignment.task1.model.User;
import java.sql.*;

public class UserInsertAndUpdateDao {

    private static final String INSERT = "INSERT INTO t_user(name, age) values(?, ?)";
    private static final String UPDATE = "UPDATE t_user SET name = ?, age = ? where id=?";

    private PreparedStatement insertPs;
    private PreparedStatement updatePs;

    public UserInsertAndUpdateDao(Connection con) {
        try {
            insertPs = con.prepareStatement(INSERT);
            updatePs = con.prepareStatement(UPDATE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveData(User user) {
        try {
            if (user.getId() == null) {
                insertPs.setString(1, user.getName());
                insertPs.setInt(2, user.getAge());
                insertPs.execute();
            } else {
                updatePs.setString(1, user.getName());
                updatePs.setInt(2, user.getAge());
                updatePs.setInt(3, user.getId());
                updatePs.execute();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
