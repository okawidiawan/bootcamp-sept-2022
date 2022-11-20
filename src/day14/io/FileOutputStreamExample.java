package day14.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws IOException {

        try {
            FileOutputStream fout = new FileOutputStream("D:\\Oka\\Programming\\G2Academy\\Bootcamp\\Backend\\Day_14\\output-java.txt");
            fout.write(65);
            fout.write(66);
            fout.write(67);
            String text = " Welcome to G2Academy";
            byte[] byteArray = text.getBytes();
            fout.write(byteArray);
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
