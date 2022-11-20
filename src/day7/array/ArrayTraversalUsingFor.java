package day7.array;

public class ArrayTraversalUsingFor {
    
    public static void main(String[] args) {
        
        int[] ages = {30, 31, 32, 33, 57, 77};
        
        for(int i = 0; i <=ages.length - 1 ; i++){
            System.out.println("Array index " + i + " value : " + ages[i]);
        }
        
    }
    
}
