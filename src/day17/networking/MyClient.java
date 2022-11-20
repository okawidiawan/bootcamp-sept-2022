package day17.networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {
    
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Sending message to server...");
//            dout.writeUTF("Hello Server, message to server");
            dout.writeUTF("EXIT");
            dout.close();
            s.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
