package day17.assignment.example.task2;

import day14.regex.RegexEmailValidatorExample;
import day14.regex.RegexPasswordValidatorExample;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        try {

            Properties p = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\task2\\config.properties");
            p.load(fis);
            Integer port = Integer.valueOf(p.getProperty("PORT"));
            String ip = p.getProperty("IP");
            Scanner input = new Scanner(System.in);
            RegexEmailValidatorExample userValidator = new RegexEmailValidatorExample();
            RegexPasswordValidatorExample passValidator = new RegexPasswordValidatorExample();
            do {

                System.out.println("Check Regex");
                System.out.print("Username : ");
                String username = input.nextLine();

                System.out.print("Password : ");
                String password = input.nextLine();

                if (userValidator.emailPatternMatch(username) && passValidator.passwordPatternMatch(password)) {
                    System.out.println("Login Success");
                    break;
                } else {
                    System.out.println("Login Failed");
                }

            } while (true);

            int pilihMenu;
            Socket socket = null;
            do {
                System.out.println("MENU");
                System.out.println("1. Connect Socket");
                System.out.println("2. Send Data to Server");
                System.out.println("3. Close Socket");
                System.out.println("4. Exit");
                System.out.print("Pilih Menu : ");
                pilihMenu = input.nextInt();
                input.nextLine();
                switch (pilihMenu) {
                    case 1 -> {
                        socket = new Socket(ip, port);
                    }
                    case 2 -> {
                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\task2\\data.txt"));
                        String line = null;
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        while ((line = reader.readLine()) != null) {
                            System.out.println("Sending : " + line);
                            writer.write(line + "\n");
                        }
                        writer.flush();
                    }
                    case 3 -> {
                        socket.close();
                    }
                }
            } while (pilihMenu != 4);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
