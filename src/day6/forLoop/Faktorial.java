package day6.forLoop;

public class Faktorial {
    
    public int faktorial(int n){
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        return faktorial;
    }
    
}
