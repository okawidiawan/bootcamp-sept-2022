package day17.assignment.task1;

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

public class Server {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\config.properties");
            prop.load(fis);
            Integer port = Integer.valueOf(prop.getProperty("PORT"));
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is Running on Port : " + "\nWaiting Client Message");
            do {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String message = reader.readLine();
                System.out.println("From Client : " + message);
                System.out.print("Reply : ");
                String reply = input.nextLine();
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
