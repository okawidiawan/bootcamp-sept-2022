package day18.ftp;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

public class DownloadFileOnFTPServer {
    
    public static void main(String[] args) {
        try{
            FTPClient client = new FTPClient();
            client.connect("localhost",21);
            client.login("oka", "admin");
            client.enterLocalPassiveMode();
            
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Oka\\Desktop\\oka\\FileDownloaded.txt");
            boolean done = client.retrieveFile("/transfer/download/FileDownloaded.txt", fos);
            
            if(done){
                System.out.println("File Downloaded");
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
