package week03and04.level1;
import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown
        System.out.print("Enter the countdown number: ");
        int counter = sc.nextInt();

        // For loop to count down to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched! 🚀");

        sc.close();
    }
}

