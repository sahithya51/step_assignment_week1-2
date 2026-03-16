package week03and04.level1;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        int smallest;

        // Logic
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } 
        else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } 
        else {
            smallest = number3;
        }

        // Output
        System.out.println("The smallest number is: " + smallest);

        sc.close();
    }
}