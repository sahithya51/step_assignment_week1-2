package week03and04.level3;

import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        // Step 2: Loop to access each digit
        while (temp != 0) {

            int digit = temp % 10; // get last digit
            sum = sum + digit;     // add digit to sum
            temp = temp / 10;      // remove last digit
        }

        // Step 3: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }

        sc.close();
    }
}
