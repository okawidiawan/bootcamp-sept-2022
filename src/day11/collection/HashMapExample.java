package day11.collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> studentMaps = new HashMap<>();

        studentMaps.put(7, "Oka");
        studentMaps.put(12, "Widiawan");
        studentMaps.put(36, "Ozu");
        studentMaps.put(28, "Bezarius");

        Iterator<Integer> keys = studentMaps.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            String studentName = studentMaps.get(key);
            System.out.println("Student with id : " + key + " is : " + studentName);
        }
        System.out.println("");

        for (Integer key : studentMaps.keySet()) {
            String studentName = studentMaps.get(key);
            System.out.println("Student with id : " + key + " is : " + studentName);
        }
        
        System.out.println("");

        studentMaps.forEach((key, studentName) -> {
            System.out.println("Student with id : " + key + " is : " + studentName);
        });

    }

}
