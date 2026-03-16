package week03and04.level1;
import java.util.Scanner;
public class problem13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is natural
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            int sumFor = 0;

            // Compute sum using for loop
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display both results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal. Something is wrong.");
            }
        }

        sc.close();
    }
}

