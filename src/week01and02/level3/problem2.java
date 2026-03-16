package week01and02.level3;
  import java.util.Scanner;
public class problem2 {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display result
        System.out.println("The " + fahrenheit +
                           " fahrenheit is " +
                           celsiusResult +
                           " celsius");

        input.close();
    }
}

