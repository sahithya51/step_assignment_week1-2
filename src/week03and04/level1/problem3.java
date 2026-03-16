package week03and04.level1;
import java.util.Scanner;
public class problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Logic
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("First number is the greatest among all: " + number1);
        }
        else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Second number is the greatest among all: " + number2);
        }
        else {
            System.out.println("Third number is the greatest among all: " + number3);
        }

        sc.close();
    }
}


