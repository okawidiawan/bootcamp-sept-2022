package day17.assignment.example.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class ChatBotServer {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\task1\\config.properties");
            p.load(fis);
            Integer port = Integer.valueOf(p.getProperty("PORT"));
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server is Running on Port : " + port + ". Waiting for Client to Send Message");

            do {
                Socket s = server.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String message = reader.readLine();
                System.out.println("Client : " + message);
                System.out.print("Reply : ");
                String reply = input.nextLine();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                writer.write(reply + "\n");
                writer.flush();
                if (message.equals("EXIT")) {
                    break;
                }
            } while (true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
