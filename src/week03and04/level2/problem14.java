package week03and04.level2;
  import java.util.Scanner;
public class problem14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println("Result: " + result);

        sc.close();
    }

}
