package week03and04.level3;
import java.util.Scanner;
public class problem7 {

public class BMI_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight, height_cm, height_m, bmi;

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height_cm = sc.nextDouble();

        // Convert height to meters
        height_m = height_cm / 100;

        // Calculate BMI
        bmi = weight / (height_m * height_m);

        System.out.println("BMI = " + bmi);

        // Determine BMI status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } 
        else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } 
        else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } 
        else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}

}
