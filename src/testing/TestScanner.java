package testing;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int number = input.nextInt();
        System.out.println("You Entered : " + number);
        input.close();
    }
}
