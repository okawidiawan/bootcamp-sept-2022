package day14.assignment.contoh2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UsernamePasswordLoader {
    
        public static Map<String, String> loadUsernamePasswordMap() {
        Map<String, String> usernamePasswordMap = new HashMap<>();
        try {
            String usernameFileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day14\\assignment\\task2\\username.txt";
            String passwordFileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day14\\assignment\\task2\\password.txt";

            BufferedReader usernameReader = new BufferedReader(new FileReader(usernameFileName));
            BufferedReader passwordReader = new BufferedReader(new FileReader(passwordFileName));
            String username = null;
            String password = null;
            while ((username = usernameReader.readLine()) != null && (passwordReader.readLine()) != null) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usernamePasswordMap;
    }
    
}
