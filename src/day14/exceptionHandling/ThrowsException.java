package day14.exceptionHandling;

import java.io.IOException;

public class ThrowsException {

    public String readFile(String fileName) throws IOException {
        if (fileName == null) {
            throw new IOException("File not Found");
        }
        return "Success";
    }

    public static void main(String[] args) {
        ThrowsException te = new ThrowsException();

        try {
            te.readFile(null);
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}