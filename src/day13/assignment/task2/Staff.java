package day13.assignment.task2;

public class Staff extends Worker {

    private String jabatan;

    public Staff(Integer id, String name, String jabatan) {
        setId(id);
        setNama(name);
        this.jabatan = jabatan;
    }

    @Override
    public void tambahAbsensi() {
        setAbsensi();
    }

    String getJabatan() {
        return jabatan;
    }

}
