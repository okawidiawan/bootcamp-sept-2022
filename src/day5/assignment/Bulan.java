package day5.assignment;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bulan {
    
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
        Bulan b = new Bulan();
        String identity = b.identity(name, date, month, year);
        System.out.println(identity);
        
    }
    
    public String identity(String name, int date, int month, int year){
        String strMonth = convertMonth(month);
        int age = Calendar.getInstance().get(Calendar.YEAR) - year;
        String identity = "Nama saya " + name + ", lahir " + date + " " +  strMonth + " " + year + " berumur " + age + " tahun";
        return identity;
    }
    
    public String convertMonth(int month){
        String strMonth = "";
        if(month == 1){
            strMonth = "Januari";
        }
        else if(month == 2){
            strMonth = "Februari";
        }
        else if(month == 3){
            strMonth = "Maret";
        }
        else if(month == 4){
            strMonth = "April";
        }
        else if(month == 5){
            strMonth = "Mei";
        }
        else if(month == 6){
            strMonth = "Juni";
        }
        else if(month == 7){
            strMonth = "Juli";
        }
        else if(month == 8){
            strMonth = "Agustus";
        }
        else if(month == 9){
            strMonth = "September";
        }
        else if(month == 10){
            strMonth = "Oktober";
        }
        else if(month == 11){
            strMonth = "November";
        }
        else if(month == 12){
            strMonth = "Desember";
        }
        return strMonth;
    }
    
}
