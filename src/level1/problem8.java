package level1;
import java.util.Scanner;

public class problem8 {
   public static void main(String[] args) {
        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Ask user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextInt(); // Read input as integer

        // Convert kilometers to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + 
                           " mile for the given " + km + " km");

        // Close Scanner
        input.close();
    }
}

