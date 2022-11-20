package day23.assignment.task1;

import day23.assignment.task1.dao.UserInsertAndUpdateDao;
import day23.assignment.task1.dao.UserSelectAndDeleteDao;
import day23.assignment.task1.model.User;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class UserManagment {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day23_assignment",
                    "root",
                    "admin"
            );
            Scanner input = new Scanner(System.in);
            UserSelectAndDeleteDao selectDeleteDao = new UserSelectAndDeleteDao(con);
            UserInsertAndUpdateDao insertUpdateDao = new UserInsertAndUpdateDao(con);

            int pilihMenu;

            do {
                pilihMenu = UserManagmentUtils.showMenu(input);
                switch (pilihMenu) {
                    case 1 -> {
                        List<User> users = selectDeleteDao.getUsers();
                        UserManagmentUtils.showUser(users);
                        System.out.println("");

                    }
                    case 2 -> {
                        User user = UserManagmentUtils.inputUser(input);
                        insertUpdateDao.saveData(user);
                        System.out.println("");

                    }
                    case 3 -> {
                        Integer id = UserManagmentUtils.inputId(input);
                        User user = UserManagmentUtils.inputUser(input);
                        user.setId(id);
                        insertUpdateDao.saveData(user);
                        System.out.println("");

                    }
                    case 4 -> {
                        Integer id = UserManagmentUtils.inputId(input);
                        selectDeleteDao.deleteData(id);
                        System.out.println("");

                    }
                }

            } while (pilihMenu != 5);

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
