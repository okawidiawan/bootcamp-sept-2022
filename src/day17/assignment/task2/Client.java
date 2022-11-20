package day17.assignment.task2;

import day17.assignment.example.task2.CheckRegex;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int pilihMenu;
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\config.properties");
            prop.load(fis);
            Integer port = Integer.valueOf(prop.getProperty("PORT"));
            String ip = prop.getProperty("IP");
            Socket socket = null;

            CheckRegex cr = new CheckRegex();

            do {

                System.out.println("LOGIN - Regex");
                System.out.print("Username : ");
                String username = input.nextLine();

                System.out.print("Password : ");
                String password = input.nextLine();
                System.out.println("");

                if (cr.checkRegexUsername(username) && cr.checkRegexPassword(password)) {
                    System.out.println("Login Success \n");
                    break;
                }else{
                    System.out.println("Login Failed, Try Again \n");
                }
            } while (true);

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
                        System.out.println("Connect to Server !");
                        System.out.println("");

                    }
                    case 2 -> {
                        System.out.println("Sending Data to Server !");
                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\task2\\data.text"));
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                            writer.write(line + "\n");
                        }
                        writer.flush();
                        System.out.println("Data Sent to Server !\n");
                    }
                    case 3 -> {
                        socket.close();
                        System.out.println("Disconnect From Server !\n");
                    }
                }

            } while (pilihMenu != 4);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
