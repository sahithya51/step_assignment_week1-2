package level2;

 import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert sq cm to sq inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaInches = areaCm / (2.54 * 2.54);

        // Display result
        System.out.println("The Area of the triangle in sq in is " 
                + areaInches + 
                " and sq cm is " + areaCm);

        input.close();
    }
}

