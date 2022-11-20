package day18.ftp;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class LostFolderAndFilesFtpServer {

    public static void main(String[] args) {
        try {
            FTPClient client = new FTPClient();
            client.connect("localhost", 21);
            client.login("oka", "admin");
            client.enterLocalPassiveMode();

            FTPFile[] directories = client.listDirectories();
            for (FTPFile directory : directories) {
                System.out.println("/" + directory.getName() + "/");
            }

            FTPFile[] files = client.listFiles();
            for (FTPFile file : files) {
                if (file.isFile()) {
                    System.out.println("/" + file.getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
