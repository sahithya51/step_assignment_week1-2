package level3;
 import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for salary
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();

        // Take user input for bonus
        System.out.print("Enter bonus (INR): ");
        double bonus = input.nextDouble();

        // Calculate total income
        double income = salary + bonus;

        // Display result
        System.out.println("The salary is INR " + salary +
                           " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + income);

        input.close();
    }
}

