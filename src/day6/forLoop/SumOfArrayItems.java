package day6.forLoop;

public class SumOfArrayItems {
    
    public int sum(int numbers[]){
        
        int sum = 0;
        
        for(int number : numbers){
            sum += number;
        }
        
        return sum;
    }
}
