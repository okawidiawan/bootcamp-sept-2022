package day17.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class JavaUrlExample {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tokopedia.com:443/ptnmtindo/paket-combo-keychron-k2-v2-rgb-backlight-aluminum-pbt-keycaps-theme-red-switch-unicorn");
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number : " + url.getPort());
            System.out.println("File Name : " + url.getFile());
            InputStream is = url.openStream();
            int c = -1;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
