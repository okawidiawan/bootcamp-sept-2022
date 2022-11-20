package day20.exam.exam1;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private static final String HEADER = "id,username,password,name";
    private Long id;
    private String username;
    private String password;
    private String name;
    private List<Long> marks = new ArrayList<>();

    public Student(String csv) {
        String[] studentData = csv.split(",");
        id = Long.parseLong(studentData[0]);
        username = studentData[1];
        password = studentData[2];
        name = studentData[3];
        for (int i = 4; i < studentData.length; i++) {
            try {
                Long mark = Long.parseLong(studentData[i]);
                marks.add(mark);
            } catch (Exception e) {

            }
        }
    }

    public Student() {
    }

    public String generateHeader() {
        String header = HEADER;
        for (int i = 1; i <= marks.size(); i++) {
            header += ",nilai" + i;
        }
        return header;
    }

    public String generateCsv(boolean isShowPassword) {
        String csv = id + "," + username + ",";
        if (isShowPassword) {
            csv += password + "," + name + ",";
        } else {
            csv += name;
        }
        csv += username;
        for (Long mark : marks) {
            csv += "," + mark;
        }
        return csv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getMarks() {
        return marks;
    }

    public void setMarks(List<Long> marks) {
        this.marks = marks;
    }

}
