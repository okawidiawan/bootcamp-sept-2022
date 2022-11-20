package day20.exam.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.commons.net.ftp.FTPClient;

public class SendStudentDataToFTPThread extends Thread {

    private FTPClient ftpClient;
    private List<Student> students;

    public SendStudentDataToFTPThread(FTPClient ftpClient, List<Student> students) {
        this.ftpClient = ftpClient;
        this.students = students;
    }

    @Override
    public void run() {
        try{
            ServerUtils.saveStudentToFile(students);
            FileInputStream inputStream = new FileInputStream(ServerUtils.DB_FILE_NAME);
            System.out.println("Sending User.txt to FTP Server");
            ftpClient.storeFile("/student/oka_user.txt", inputStream);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
