package day4.assignment;

public class Operators {
    
    public static void main(String[] args) {
        
        // Luas Persegi
        int panjang = 12;
        int lebar = 8;
        int luasPersegi = panjang * lebar;
        
        // Luas Segitiga
        double alas = 7.0f;
        double tinggi = 3.5f;
        double luasSegitiga = alas + tinggi;
        
        boolean result = luasPersegi > luasSegitiga;
        System.out.println(result);
        
        // Decrement dari hasil luas persegi
        luasPersegi--;
        luasPersegi--;
        luasPersegi--;
        System.out.println(luasPersegi);
        
        // Increment dari hasil luas persegi
        luasPersegi++;
        luasPersegi++;
        luasPersegi++;
        luasPersegi++;
        luasPersegi++;
        luasPersegi++;
        System.out.println(luasPersegi);
    }
    
    
    
}
