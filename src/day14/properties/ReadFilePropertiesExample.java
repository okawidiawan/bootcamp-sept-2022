package day14.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFilePropertiesExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("db.properties");
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println("server : " + prop.getProperty("server"));
            System.out.println("port : " + prop.getProperty("port"));
            System.out.println("username : " + prop.getProperty("username"));
            System.out.println("password : " + prop.getProperty("password"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}