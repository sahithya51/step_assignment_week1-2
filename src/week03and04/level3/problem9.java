package week03and04.level3;
 import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum
        int sum = 0;

        // Step 3: Find divisors of the number
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {  // check if i is a divisor
                sum = sum + i;      // add divisor to sum
            }
        }

        // Step 4: Check if sum of divisors is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        sc.close();
    }
}

