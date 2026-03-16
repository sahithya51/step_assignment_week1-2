package week03and04.level3;
 import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize count
        int count = 0;

        // Step 3: Loop until number becomes 0
        while (number != 0) {

            // Step 4: Remove last digit
            number = number / 10;

            // Step 5: Increase count
            count++;
        }

        // Step 6: Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}

