package level3;
import java.util.Scanner;
public class problem6 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for the sides of the triangular park in meters
        System.out.print("Enter side1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3 in meters: ");
        double side3 = input.nextDouble();

        // Calculate perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run = 5 km = 5000 meters
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = totalDistance / perimeter;

        // Display result
        System.out.println("The total number of rounds the athlete will run is "
                + rounds + " to complete 5 km");

        input.close();
    }
}


