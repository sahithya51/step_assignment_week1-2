package week03and04.level2;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check if years of service is more than 5
        if (years > 5) {
            double bonus = salary * 0.05;   // 5% bonus
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus applicable.");
        }

        sc.close();
    }
}

