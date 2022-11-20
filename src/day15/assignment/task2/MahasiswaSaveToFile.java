package day15.assignment.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MahasiswaSaveToFile extends Thread {
    private List<Mahasiswa> dataMahasiswa;

    public MahasiswaSaveToFile(List<Mahasiswa> dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }
    
    public void writeDataMahasiswa(){
        BufferedWriter writer = null;
        try{
            String fileName = "C:\\Users\\Oka\\OneDrive\\Documents\\NetBeansProjects\\bootcamp-sept-2022\\src\\day15\\assignment\\task2\\mahasiswa.txt";
            writer = new BufferedWriter(new FileWriter(fileName));
            for(Mahasiswa item : dataMahasiswa){
                writer.write(item.toString() + "\n");
            }
            writer.flush();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public void run(){
        writeDataMahasiswa();
    }
    
}
