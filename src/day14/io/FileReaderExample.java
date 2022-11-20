package day14.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Oka\\Programming\\G2Academy\\Bootcamp\\Backend\\Day_14\\output-java.csv"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(Arrays.toString(data));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
