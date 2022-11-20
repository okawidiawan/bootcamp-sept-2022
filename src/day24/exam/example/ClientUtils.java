package day24.exam.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ClientUtils {
    
    public static Student getStudentInput(Scanner input) {
        Student student = new Student();
        System.out.print("Name : ");
        student.setName(input.nextLine());
        System.out.print("Address : ");
        student.setAddress(input.nextLine());
        System.out.print("Status : ");
        student.setStatus(input.nextLine());
        System.out.print("Physics : ");
        student.setPhysics(input.nextInt());
        input.nextLine();
        System.out.print("Biology : ");
        student.setBiology(input.nextInt());
        input.nextLine();
        System.out.print("Calculus : ");
        student.setCalculus(input.nextInt());
        input.nextLine();
        return student;
    }
    
    public static String post(String strUrl, String body) throws IOException {
        URL url = new URL(strUrl);
        System.out.println(url + " ==> " + body);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(con.getOutputStream()));
        writer.write(body + "\n");
        writer.flush();
        writer.close();
        return readResponse(con.getInputStream());
    }
    
    public static String get(String strUrl) throws IOException {
        URL url = new URL(strUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        return readResponse(con.getInputStream());
        
    }
    
    public static Integer getIdInput(Scanner input) {
        System.out.print("ID : ");
        Integer id = input.nextInt();
        input.nextLine();
        return id;
    }
    
    public static String readResponse(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = null;
        String json = "";
        while ((line = reader.readLine()) != null) {
            json += line;
        }
        reader.close();
        System.out.println("Response : " + json);
        return json;
        
    }
}
