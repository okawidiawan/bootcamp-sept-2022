package day17.networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(6666);
            System.out.println("Server is running on port 6666, " + "Ready to listen message from client");
            do {
                Socket socket = server.accept();
                DataInputStream dis = new DataInputStream(
                        socket.getInputStream());
                String message = dis.readUTF();
                System.out.println("Client Message : " + message);
                if ("EXIT".equals(message)) {
                    break;
                }
                dis.close();
                socket.close();
            } while (true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
