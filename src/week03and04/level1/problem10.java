package week03and04.level1;
import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Variable to store user input
        double number;

        System.out.println("Enter numbers to add (Enter 0 to stop): ");
        number = sc.nextDouble();

        // While loop continues until user enters 0
        while (number != 0) {
            total += number;   // Add number to total
            number = sc.nextDouble();   // Ask for input again
        }

        // Display the total sum
        System.out.println("Total sum is: " + total);

        sc.close();
    }
}

