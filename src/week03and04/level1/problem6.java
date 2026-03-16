package week03and04.level1;
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
