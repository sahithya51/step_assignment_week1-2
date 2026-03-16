package week03and04.level3;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year >= 1582");
        }
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
} 

