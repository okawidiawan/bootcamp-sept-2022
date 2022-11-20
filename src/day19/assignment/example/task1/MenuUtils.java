package day19.assignment.example.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuUtils {

    public static Worker inputWorker(Scanner input, Worker worker) {
        System.out.print("ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        System.out.print("Nama : ");
        String name = input.nextLine();
        System.out.print("Tunjangan Pulsa : ");
        Integer tunjanganPulsa = input.nextInt();
        input.nextLine();
        System.out.print("Gaji Pokok : ");
        Integer gajiPokok = input.nextInt();
        input.nextLine();
        System.out.print("Absensi : ");
        Integer absensi = input.nextInt();
        input.nextLine();

        worker.setId(id);
        worker.setNama(name);
        worker.setTunjanganPulsa(tunjanganPulsa);
        worker.setGajiPokok(gajiPokok);
        worker.setAbsensi(absensi);
        return worker;
    }

    public static Staff inputStaff(Scanner input, Staff staff) {
        System.out.print("Tunjangan Makan : ");
        Integer tunjanganMakan = input.nextInt();
        input.nextLine();
        System.out.print("Jumlah Email : ");
        Integer noEmails = input.nextInt();
        input.nextLine();
        List<String> emails = new ArrayList<>();
        for (int i = 1; i <= noEmails; i++) {
            System.out.println("Email " + i + " : ");
            String email = input.nextLine();
            emails.add(email);
        }
        staff.setTunjanganMakan(tunjanganMakan);
        staff.setEmails(emails);
        return staff;
    }

    public static Manager inputManager(Scanner input, Manager manager) {
        System.out.print("Tunjangan Transport : ");
        Integer tunjanganTransport = input.nextInt();
        input.nextLine();
        System.out.print("Tunjangan Entertainment : ");
        Integer tunjanganEntertainment = input.nextInt();
        input.nextLine();
        System.out.print("Jumlah No. Telp: ");
        Integer noPhones = input.nextInt();
        input.nextLine();
        
        List<String> nomorTelp = new ArrayList<>();
        for (int i = 1; i <= noPhones; i++) {
            System.out.print("No.Telp " + i + " : ");
            String phone = input.nextLine();
            nomorTelp.add(phone);
        }
        manager.setTunjanganTransport(tunjanganTransport);
        manager.setTunjanganEntertainment(tunjanganEntertainment);
        manager.setNomorTelp(nomorTelp);
        return manager;
    }

}
