package day9.assignment;

public class MobilDemo {
    public static void main(String[] args) {
        Mobil camry = new Mobil("Toyota Camry", "Hitam");
        camry.info();
        camry.berjalan();
        camry.berhenti();
        
        System.out.println("");
        
        Mobil pajero = new Mobil("Mitsubishi Pajero", "Silver");
        pajero.info();
        pajero.berjalan();
        pajero.berhenti();
    }
}