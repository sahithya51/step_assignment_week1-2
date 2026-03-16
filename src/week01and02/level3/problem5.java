package week01and02.level3;
 import java.util.Scanner;
public class problem5 {
   

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Swapping logic
        double temp = number1;
        number1 = number2;
        number2 = temp;

        // Print swapped values
        System.out.println("The swapped numbers are " + number1 +
                           " and " + number2);

        input.close();
    
}
}
