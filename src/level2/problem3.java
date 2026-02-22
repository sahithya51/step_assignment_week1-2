package level2;
import java.util.Scanner;
public class problem3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side (Perimeter = 4 × side)
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close();
    
}
}
