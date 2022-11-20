package day15.assignment.task2;

import java.util.List;

public class MahasiswaDisplayThread extends Thread {
    
    private List<Mahasiswa> dataMahasiswa;

    public MahasiswaDisplayThread(List<Mahasiswa> dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }
    
    public void displayMahasiswa(){
        System.out.println(Mahasiswa.HEADER + "\n");
        for(Mahasiswa item : dataMahasiswa){
            System.out.println(item);
        }
    }
    
    @Override
    public void run(){
        displayMahasiswa();
    }
    
}
