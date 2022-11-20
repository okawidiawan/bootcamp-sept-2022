package day14.exceptionHandling;

public class ExceptionHandlingExample {
    
    public static void main(String[] args) {
        try{
            int data = 25 / 0;
            System.out.println(data);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        try{
            String s =null;
            System.out.println(s.length());
            
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        
        // untuk cek string, agar tidak perlu menggunakan exception
        String s = null;
        if(s != null){
            System.out.println(s.length());
        }
        
        
        
        try{
            int[] arr = new int[5];
            arr[10] = 100;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        
        
        try{
            String x = "abc";
            int y = Integer.parseInt(x);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        
        
        finally{
            System.out.println("Finally block is always executed");
        }
    }
}