package day19.assignment.task2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        try {
            List<Student> dataStudents = new ArrayList<>();
            String ip = "localhost";
            Integer port = 3000;
            Scanner input = new Scanner(System.in);
            ObjectMapper mapper = new JsonMapper();

            int pilihMenu;
            Socket socket = null;

            do {
                System.out.println("MENU");
                System.out.println("1. Connect to Socket");
                System.out.println("2. Create FileProses");
                System.out.println("3. EXIT");
                System.out.print("Pilih Menu : ");
                pilihMenu = input.nextInt();
                input.nextLine();
                System.out.println("");
                switch (pilihMenu) {
                    case 1 -> {
                        socket = new Socket(ip, port);
                        System.out.println("Retrieving Data From Server");
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String line = reader.readLine();
                        reader.close();
                        dataStudents = mapper.readValue(line, new TypeReference<List<Student>>() {
                        });
                    }
                    case 2 -> {

                        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day19\\assignment\\\\task2\\fileProcess_Oka.txt"));

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

                }
            } while (pilihMenu != 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
