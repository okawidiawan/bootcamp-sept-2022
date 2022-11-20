package day3.assignment;


public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan mrX = new Karyawan();
        
        mrX.setNama("XXX");
        mrX.setJabatan("Manager");
        mrX.setGaji(20_000_000);
        mrX.printKaryawan();
        int gaji = mrX.getGaji();
        
    }
    
}
