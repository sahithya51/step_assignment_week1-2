package week03and04.level1;
 import java.util.Scanner;
public class problem15 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number < 0) {
            System.out.println("Please enter a valid natural number (0 or positive integer).");
        } else {

            long factorial = 1;  // Using long to handle bigger values

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }

}
