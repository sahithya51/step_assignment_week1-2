package week03and04.level1;
import java.util.Scanner;
public class problem14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            long factorial = 1;   // Use long for larger values
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}

