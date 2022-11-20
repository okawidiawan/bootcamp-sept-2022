package day19.assignment.task1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu;
        List<Staff> staffs = new ArrayList<>();
        List<Manager> managers = new ArrayList<>();
        ObjectMapper mapper = new JsonMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        do {
            System.out.println("MENU");
            System.out.println("1. Input Staff");
            System.out.println("2. Input Manager");
            System.out.println("3. Create JSON Format and Write to File (Staff.txt & manager.txt)");
            System.out.println("4. Read JSON Format from a File, input Filename (Show Screen)");
            System.out.println("5. EXIT");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            switch (pilihMenu) {
                case 1 -> {
                    Staff staff = new Staff();
                    MenuUtils.inputWorker(input, staff);
                    MenuUtils.inputStaff(input, staff);
                    staffs.add(staff);
                }
                case 2 -> {
                    Manager manager = new Manager();
                    MenuUtils.inputWorker(input, manager);
                    MenuUtils.inputManager(input, manager);
                    managers.add(manager);

                }
                case 3 -> {
                    try {

                        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day19\\assignment\\task1\\Staff.json"));
                        String staffJSON = mapper.writeValueAsString(staffs);
                        writer.write(staffJSON + "\n");
                        writer.flush();
                        writer.close();

                        writer = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day19\\assignment\\task1\\Manager.json"));
                        String managerJSON = mapper.writeValueAsString(managers);
                        writer.write(managerJSON + "\n");
                        writer.flush();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                case 4 -> {
                    try {

                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day19\\assignment\\task1\\Staff.json"));

                        String staffJSON = reader.readLine();
                        List<Staff> staffList = mapper.readValue(staffJSON,
                                new TypeReference<ArrayList<Staff>>() {
                        });
                        System.out.println(staffList);
                        reader.close();
                        reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day19\\assignment\\task1\\Manager.json"));
                        String managerJSON = reader.readLine();
                        List<Manager> managerList = mapper.readValue(managerJSON,
                                new TypeReference<ArrayList<Manager>>() {
                        });
                        System.out.println(managerList);
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        } while (pilihMenu != 5);
    }

}
