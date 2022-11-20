package day24.exam.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int pilihMenu;
            ObjectMapper mapper = new JsonMapper();
            do {
                System.out.println("Menu");
                System.out.println("1. Input Data");
                System.out.println("2. Edit Data");
                System.out.println("3. Delete Data");
                System.out.println("4. Select Data");
                System.out.println("5. Exit");
                System.out.print("Pilih Menu : ");
                pilihMenu = input.nextInt();
                input.nextLine();
                switch (pilihMenu) {
                    case 1 -> {
                        Student student = ClientUtils.getStudentInput(input);
                        String studentJson = mapper.writeValueAsString(student);
                        ClientUtils.post("http://localhost:8080/day24-exam/save", studentJson);

                    }
                    case 2 -> {
                        Integer id = ClientUtils.getIdInput(input);
                        String studentJson = ClientUtils.get("http://localhost:8080/day24-exam/select?id=" + id);
                        Student student = mapper.readValue(studentJson, Student.class);
                        if (student != null) {
                            System.out.println("Editing Student : " + student.getName());
                            Student inputStudent = ClientUtils.getStudentInput(input);
                            inputStudent.setId(id);
                            String studentUpdateJson = mapper.writeValueAsString(inputStudent);
                            ClientUtils.post("http://localhost:8080/day24-exam/save", studentUpdateJson);
                        } else {
                            System.out.println("Student With ID : " + id + " Not Found");
                        }
                    }
                    case 3 -> {
                        Integer id = ClientUtils.getIdInput(input);
                        ClientUtils.post("http://localhost:8080/day24-exam/delete", id.toString());

                    }

                    case 4 -> {
                        String listOfStudents = ClientUtils.get("http://localhost:8080/day24-exam/select");
                        List<Student> students = mapper.readValue(listOfStudents, new TypeReference<List<Student>>() {
                        });
                        for (Student student : students) {
                            System.out.println("ID : " + student.getId());
                            System.out.println("Name : " + student.getName());
                            System.out.println("Address : " + student.getAddress());
                            System.out.println("Status : " + student.getStatus());
                            System.out.println("Physics : " + student.getPhysics());
                            System.out.println("Biology : " + student.getBiology());
                            System.out.println("Calculus : " + student.getCalculus());
                        }
                    }
                }

            } while (pilihMenu != 5);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
