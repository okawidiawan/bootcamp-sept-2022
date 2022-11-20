package day23.assignment.task1.dao;

import day23.assignment.task1.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserSelectAndDeleteDao {

    private static final String SELECT = "SELECT * FROM t_user";
    private static final String DELETE = "DELETE FROM t_user WHERE id=?";

    private PreparedStatement selectPs;
    private PreparedStatement deletePs;

    public UserSelectAndDeleteDao(Connection con) {
        try {
            selectPs = con.prepareStatement(SELECT);
            deletePs = con.prepareStatement(DELETE);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        try {
            ResultSet rs = selectPs.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                users.add(user);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public void deleteData(Integer id) {
        try {
            deletePs.setInt(1, id);
            deletePs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
