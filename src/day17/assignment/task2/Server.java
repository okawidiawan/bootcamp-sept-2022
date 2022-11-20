package day17.assignment.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Server {

    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\config.properties");
            prop.load(fis);
            Integer port = Integer.valueOf(prop.getProperty("PORT"));
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is Running !");
            do {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line = null;
                System.out.println("Client is Connect to Server\n");
                while ((line = reader.readLine()) != null) {

                    String[] split = line.split(",");
                    System.out.println("Nama : " + split[0]);
                    System.out.println("Nilai Fisika : " + split[1]);
                    System.out.println("Nilai Biologi : " + split[2]);
                    System.out.println("Nilai Kimia : " + split[3] + "\n");
                }
                System.out.println("");
                reader.close();
                socket.close();
            } while (true);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
