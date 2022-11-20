package day14.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Oka\\Programming\\G2Academy\\Bootcamp\\Backend\\Day_14\\output-java.txt");
            int b = fis.read();
            System.out.println("First Character : " + (char) b);
            byte[] byteArray = fis.readAllBytes();
            String text = new String(byteArray);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
