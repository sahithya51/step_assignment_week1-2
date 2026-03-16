package week03and04.level1;
import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown
        System.out.print("Enter the countdown number: ");
        int counter = sc.nextInt();

        // While loop to count down to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // Decrement the counter
        }

        System.out.println("Rocket Launched! 🚀");

        sc.close();
    }
}

