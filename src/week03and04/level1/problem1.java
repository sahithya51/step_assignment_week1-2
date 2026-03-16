package week03and04.level1;
 import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking divisibility
        if (number % 5 == 0) {
            System.out.println("Yes, the number " + number + "  is divisible by 5");
        } else {
            System.out.println("No the number " + number + " divisible by 5");
        }

        sc.close();
    }
}

