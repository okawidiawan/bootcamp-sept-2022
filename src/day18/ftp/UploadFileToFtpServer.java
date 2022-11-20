package day18.ftp;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;

public class UploadFileToFtpServer {

    public static void main(String[] args) {
        try {
            FTPClient client = new FTPClient();
            client.connect("localhost", 21);
            client.login("oka","admin");
            client.enterLocalPassiveMode();
            
            
            
            // open file to upload to FTP Server
            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\Desktop\\oka\\FTPFileTransfer.txt");
            
            // direktori tujuan
            boolean done = client.storeFile("/FtpFileTransfer/FTPFileTransfer.txt", fis);
            if(done){
                System.out.println("File Sent to Server");
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
