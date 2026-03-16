package week03and04.level2;
import java.util.Scanner;
public class problem8 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int counter = 1;

            System.out.println("Factors of " + number + " are:");

            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }

        sc.close();
    }
}

