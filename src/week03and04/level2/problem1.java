package week03and04.level2;
import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        sc.close();
    }
}

