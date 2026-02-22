package level2;

import java.util.Scanner;
public class problem7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        // Integer operations
        int result1 = a + b * c;      // * has higher precedence than +
        int result2 = a * b + c;      // * before +
        int result3 = c + a / b;      // / before +
        int result4 = a % b + c;      // % before +

        // Print results
        System.out.println("The results of Int Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);

        input.close();
    }
}
    
