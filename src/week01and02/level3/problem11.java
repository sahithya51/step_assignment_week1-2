package week01and02.level3;

 import java.util.Scanner;

public class problem11 {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        // Convert pounds to kilograms (1 pound = 2.2 kg)
        double kilograms = pounds * 2.2;

        // Display result
        System.out.println("The weight of the person in pounds is " 
                           + pounds + 
                           " and in kg is " + kilograms);

        input.close();
    }
}
