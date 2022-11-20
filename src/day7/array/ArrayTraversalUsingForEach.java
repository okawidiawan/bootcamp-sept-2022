package day7.array;

public class ArrayTraversalUsingForEach {
    
    public static void main(String[] args) {
        int[] ages = {10, 20, 30, 40, 50, 60, 70, 80};
        
        System.out.println("Traversing array with length of " + ages.length);
        for(int age : ages){
            System.out.println("Age is : " + age);
        }
    }
}