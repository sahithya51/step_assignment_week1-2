package week01and02.level2;
 import java.util.Scanner;
public class problem8 {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Double operations
        double result1 = a + b * c;   // * has higher precedence than +
        double result2 = a * b + c;   // * before +
        double result3 = c + a / b;   // / before +
        double result4 = a % b + c;   // % before +

        // Print results
        System.out.println("The results of Double Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);

        input.close();
    }
}

