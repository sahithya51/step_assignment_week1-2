package week03and04.level3;
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Step 4: Get the last digit using modulus
            int digit = originalNumber % 10;

            // Step 5: Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Step 6: Remove the last digit
            originalNumber = originalNumber / 10;
        }

        // Step 7: Check if sum equals original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}

