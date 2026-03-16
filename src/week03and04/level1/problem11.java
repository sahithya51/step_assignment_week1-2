package week03and04.level1;
import java.util.Scanner;
public class problem11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        // Print only once
        System.out.println("Enter numbers (0 or negative number to stop):");

        // Infinite loop
        while (true) {

            double number = sc.nextDouble();  // user enters number (each on new line)

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("Total sum is: " + total);

        sc.close();
    }
}