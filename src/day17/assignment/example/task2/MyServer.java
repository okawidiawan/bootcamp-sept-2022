package day17.assignment.example.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class MyServer {

    public static void main(String[] args) {

        try {
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day17\\assignment\\task2\\config.properties");
            p.load(fis);
            Integer port = Integer.valueOf(p.getProperty("PORT"));
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server is Running on Port : " + port + ". Waiting for Client to Send Message");
            do {
                Socket s = ss.accept();
                System.out.println("Accepting Message From Client");
                BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    String[] dataSplit = line.split(",");
                    System.out.println("Nama : " + dataSplit[0]);
                    System.out.println("Nilai Fisika : " + dataSplit[1]);
                    System.out.println("Nilai Biologi : " + dataSplit[2]);
                    System.out.println("Nilai Kimia : " + dataSplit[3]);
                }
                System.out.println("");
                reader.close();
                s.close();
            } while (true);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
