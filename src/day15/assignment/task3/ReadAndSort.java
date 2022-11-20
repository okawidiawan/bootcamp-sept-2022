package day15.assignment.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadAndSort extends Thread {

    private String sortType = "asc";

    public ReadAndSort(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public void run() {
        try {
            // Read Data
            List<Integer> data = new ArrayList<>();
            String path = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day15\\assignment\\task3\\data.txt";
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = reader.readLine()) != null) {
                data.add(Integer.parseInt(line));
            }

            // Sort by SortType
            Collections.sort(data);

            BufferedWriter writer = null;
            if (sortType.equals("asc")) {
                System.out.println("Thread Baca data.txt, Write to fileDataAsc.txt -> Ascending");
                String dataSortedAscendingFileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day15\\assignment\\task3\\fileDataAsc.txt";
                writer = new BufferedWriter(new FileWriter(dataSortedAscendingFileName));
                for (Integer item : data) {
                    writer.write(item + "\n");
                }
            } else {
                System.out.println("Thread Baca data.txt, Write to fileDataDesc.txt -> Descending");
                String dataSortedDescendingFileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day15\\assignment\\task3\\fileDataDesc.txt";

                writer = new BufferedWriter(new FileWriter(dataSortedDescendingFileName));

                for (int i = data.size() - 1; i >= 0; i--) {
                    Integer item = data.get(i);
                    writer.write(item + "\n");
                }

            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
