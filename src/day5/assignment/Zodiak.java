package day5.assignment;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Zodiak {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String name = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        int date = input.nextInt();
        input.nextLine();
        System.out.print("Bulan Lahir : ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Tahun Lahir : ");
        int year = input.nextInt();
        input.nextLine();
        Zodiak b = new Zodiak();
        String identity = b.identity(name, date, month, year);
        System.out.println(identity);
        
    }
    
    public String identity(String name, int date, int month, int year){
        String strZodiak = convertZodiak(date, month);
        int age = Calendar.getInstance().get(Calendar.YEAR) - year;
        String identity = "Nama saya " + name + ", zodiak saya " + strZodiak;
        return identity;
    }
    
    public String convertZodiak(int date, int month){
        String strZodiak = "";
        if(date >= 21 && month == 3 || (date <= 20 && month == 4)){
            strZodiak = "Aries";
        }
        else if(date >= 21 && month == 4 || (date <= 20 && month == 5)){
            strZodiak = "Taurus";
        }
        else if(date >= 21 && month == 5 || (date <= 21 && month == 6)){
            strZodiak = "Gemini";
        }
        else if(date >= 22 && month == 6 || (date <= 22 && month == 7)){
            strZodiak = "Cancer";
        }
        else if(date >= 23 && month == 7 || (date <= 23 && month == 8)){
            strZodiak = "Leo";
        }
        else if(date >= 24 && month == 8 || (date <= 23 && month == 9)){
            strZodiak = "Virgo";
        }
        else if(date >= 24 && month == 9 || (date <= 23 && month == 10)){
            strZodiak = "Libra";
        }
        else if(date >= 24 && month == 10 || (date <= 22 && month == 11)){
            strZodiak = "Scorpio";
        }
        else if(date >= 23 && month == 11 || (date <= 21 && month == 12)){
            strZodiak = "Sagitarius";
        }
        else if(date >= 22 && month == 12 || (date <= 20 && month == 1)){
            strZodiak = "Capricorn";
        }
        else if(date >= 21 && month == 1 || (date <= 18 && month == 2)){
            strZodiak = "Aquarius";
        }
        else if(date >= 19 && month == 2 || (date <= 20 && month == 3)){
            strZodiak = "Pisces";
        }
        return strZodiak;
    }
    
}
