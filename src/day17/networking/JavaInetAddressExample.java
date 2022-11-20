package day17.networking;

import java.net.InetAddress;

public class JavaInetAddressExample {

    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("www.detik.com");

            System.out.println("Host Name : " + ip.getHostName());
            System.out.println("IP Address : " + ip.getHostAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
