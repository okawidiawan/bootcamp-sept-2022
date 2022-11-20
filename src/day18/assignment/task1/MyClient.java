package day18.assignment.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        try {
            ArrayList<Student> dataStudents = new ArrayList<>();
            String ip = "localhost";
            Integer port = 3000;
            Scanner input = new Scanner(System.in);

            int pilihMenu;
            Socket socket = null;

            do {
                System.out.println("MENU");
                System.out.println("1. Connect to Socket");
                System.out.println("2. Create FileProses");
                System.out.println("3. Display, Write, Connect FTP");
                System.out.println("4. Close All Connection");
                System.out.println("99. EXIT");
                System.out.print("Pilih Menu : ");
                pilihMenu = input.nextInt();
                input.nextLine();
                System.out.println("");
                switch (pilihMenu) {
                    case 1 -> {
                        socket = new Socket(ip, port);
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                            String[] dataSplit = line.split(",");

                            Student students = new Student(dataSplit[0], Integer.parseInt(dataSplit[1]), Integer.parseInt(dataSplit[2]), Integer.parseInt(dataSplit[3]));
                            dataStudents.add(students);
                        }
                        reader.close();
                        System.out.println("");
                    }
                    case 2 -> {

                        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day18\\assignment\\task1\\fileProses_Oka.txt"));

                        for (Student std : dataStudents) {
                            writer.write("Nama : " + std.getNama() + "\n");
                            writer.write("Nilai Fisika : " + std.getnFisika() + "\n");
                            writer.write("Nilai Kimia : " + std.getnKimia() + "\n");
                            writer.write("Nilai Biologi : " + std.getnBiologi() + "\n\n");
                        }
                        writer.flush();
                        writer.close();
                        System.out.println("");

                    }
                    case 3 -> {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day18\\assignment\\task1\\fileRataRata.txt"));
                        writer.write("Nama,NilaiRatarata\n");
                        for (Student std : dataStudents) {

                            writer.write(std.getNama() + "," + std.hitungNilaiRataRata() + "\n");

                            System.out.println("Nama : " + std.getNama());
                            System.out.println("Nilai Fisika : " + std.getnFisika());
                            System.out.println("Nilai Kimia : " + std.getnKimia());
                            System.out.println("Nilai Biologi : " + std.getnBiologi() + "\n");

                        }
                        writer.flush();
                        writer.close();
                        UploadFileFTP upload = new UploadFileFTP();
                        upload.UploadFileFTP();

                        System.out.println("");

                    }
                    case 4 -> {
                        socket.close();
                    }
                }
            } while (pilihMenu != 99);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
