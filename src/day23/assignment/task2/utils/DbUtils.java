package day23.assignment.task2.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DbUtils {

    public static Connection connectToDb() {

        Properties prop = loadProperties();
        if (prop != null) {
            try {
                String mySqlJdbcString = "jdbc:mysql://" + prop.getProperty("IP")
                        + ":" + prop.getProperty("PORT")
                        + "/" + prop.getProperty("NAMADB");
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                Connection con = DriverManager.getConnection(mySqlJdbcString, prop.getProperty("USER"), prop.getProperty("PASS"));
                return con;

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Properties loadProperties() {
        try {
            String propertiesFileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day23\\assignment\\task2\\config.properties";

            Properties prop = new Properties();
            prop.load(new FileInputStream(propertiesFileName));
            return prop;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
