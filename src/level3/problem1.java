package level3;

import java.util.Scanner;

public class problem1 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius +
                           " celsius is " +
                           fahrenheitResult +
                           " fahrenheit");

        input.close();
    
}
}