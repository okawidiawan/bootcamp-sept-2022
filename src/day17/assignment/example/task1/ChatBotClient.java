package day17.assignment.example.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class ChatBotClient {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\task1\\config.properties");
            p.load(fis);;
            Integer port = Integer.valueOf(p.getProperty("PORT"));
            String ip = p.getProperty("IP");
            do {
                Socket socket = new Socket(ip, port);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                System.out.print("Message : ");
                String message = input.nextLine();
                writer.write(message + "\n");
                writer.flush();

                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String reply = reader.readLine();
                System.out.println("Reply : " + reply);
                if (message.equals("EXIT")) {
                    break;
                }
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
