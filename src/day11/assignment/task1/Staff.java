package day11.assignment.task1;

public class Staff extends Worker {
    private String jabatan;

    public Staff(String id, String nama, String jabatan) {
        super(id, nama);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }
    
 

}
