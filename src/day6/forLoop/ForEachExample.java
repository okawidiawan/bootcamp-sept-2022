package day6.forLoop;

import java.util.Arrays;

public class ForEachExample {
    
    public static void main(String[] args) {
       
       int numbers[] = {100,200,300,400,500};
       
       // Array traversal with for each
       for(int number : numbers){
           System.out.println(number);
       }
       
       // Array traversal with for
      for(int i = 0; i < numbers.length;i++){
          System.out.println(numbers[i]);
      }
      
      System.out.println("Array traversal for each with functional stream");
        Arrays.asList(numbers).forEach(s -> System.out.println(s));

    }
}
