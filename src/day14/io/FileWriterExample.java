package day14.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        try {

            BufferedWriter writer
                    = new BufferedWriter(
                            new FileWriter("D:\\Oka\\Programming\\G2Academy\\Bootcamp\\Backend\\Day_14\\output-java.csv"));

            for (int i = 1; i <= 10; i++) {
                writer.write(i + ",data,column,csv\n");
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
