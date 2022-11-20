package day24.exam.task1.dao;

import day24.exam.task1.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserSelectDao {

    private static final String SELECT_USER_BY_ID = "SELECT * FROM T_USER WHERE ID=?";
    private static final String SELECT_USER_BY_USERNAME = "SELECT * FROM T_USER WHERE USERNAME=?";

    private PreparedStatement selectUserById;
    private PreparedStatement selectUserByUsername;

    public UserSelectDao(Connection con) {
        try{
            selectUserById = con.prepareStatement(SELECT_USER_BY_ID);
            selectUserByUsername = con.prepareStatement(SELECT_USER_BY_USERNAME);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public User getUserById(Integer id){
        try{
            selectUserById.setInt(1,id);
            ResultSet rs = selectUserById.executeQuery();
            if(rs.next()){
                return getUserFromResultSet(rs);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getUserByUsername(String username){
        try{
            selectUserByUsername.setString(1, username);
            ResultSet rs = selectUserByUsername.executeQuery();
            return getUsersFromResultSet(rs);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public User getUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        return user;
    }

    public User getUsernameAndPassword(User username){
        try {
            selectUserByUsername.setString(1,username.getUsername());
            ResultSet rs = selectUserByUsername.executeQuery();
            if(rs.next()){
                User user = getUserFromResultSet(rs);
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getUsersFromResultSet(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()){
            users.add(getUserFromResultSet(rs));
        }
        return users;
    }
}
