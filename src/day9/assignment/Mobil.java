package day9.assignment;

public class Mobil {
    
    String brand;
    String color;
    boolean status;
    
    Mobil(String merk, String warna){
        this.brand = merk;
        this.color = warna;
    }
    
    public void info(){
        System.out.println("Merek Mobil : " + brand);
        System.out.println("Warna Mobil : " + color);
    }
    
    public void berjalan(){
        status = true;
        System.out.println(brand + " Warna " + color + " Sedang Berjalan : " + status);
    }
    
    public void berhenti(){
        status = false;
        System.out.println(brand + " Warna " + color + " Sedang Berjalan : " + status);
    }
}