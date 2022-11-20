package day18.assignment.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;

public class UploadFileFTP {

    public void UploadFileFTP() {

        try {
            FTPClient client = new FTPClient();
            client.connect("localhost", 21);
            client.login("oka", "admin");
            client.enterLocalPassiveMode();

            FileInputStream fis = new FileInputStream("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day18\\assignment\\task1\\fileProses_Oka.txt");
            
            boolean done = client.storeFile("/FtpFileTransfer/fileProses_Oka.txt", fis);
            if(done){
                System.out.println("File Sent !");
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
