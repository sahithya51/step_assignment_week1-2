package week01and02.level1;

 import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }

    
}
