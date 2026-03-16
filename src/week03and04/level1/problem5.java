package week03and04.level1;
import java.util.Scanner;
public class problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Condition
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } 
        else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}

