package day18.assignment.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        try {
            System.out.println("Server is Running");
            ServerSocket serverSocket = new ServerSocket(3000);
            do {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day18\\assignment\\task1\\file.txt"));
                String line = null;
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                while ((line = reader.readLine()) != null) {
                    System.out.println("Sending : " + line);
                    writer.write(line + "\n");
                }
                writer.flush();
                socket.close();
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
