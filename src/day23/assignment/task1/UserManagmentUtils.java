package day23.assignment.task1;

import day23.assignment.task1.model.User;
import java.util.List;
import java.util.Scanner;

public class UserManagmentUtils {

    public static Integer showMenu(Scanner input) {
        System.out.println("Menu");
        System.out.println("1. Show All Record");
        System.out.println("2. Insert Record");
        System.out.println("3. Update Record");
        System.out.println("4. Delete Record");
        System.out.println("5. Exit");
        System.out.print("Pilih Menu : ");
        Integer pilihMenu = input.nextInt();
        input.nextLine();
        System.out.println("");
        return pilihMenu;
    }

    public static void showUser(List<User> users) {
        System.out.println("id \t name \t age");
        for (User user : users) {
            System.out.println(user.getId() + " \t " + user.getName() + " \t " + user.getAge());
        }
    }

    public static User inputUser(Scanner input) {
        System.out.print("Name : ");
        String name = input.nextLine();
        System.out.print("Age : ");
        Integer age = input.nextInt();
        input.nextLine();
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    public static Integer inputId(Scanner input) {
        System.out.print("ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        return id;
    }

}
