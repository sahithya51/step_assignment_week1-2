package week01and02.level3;
 import java.util.Scanner;
public class problem7 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display result
        System.out.println("The number of chocolates each child gets is "
                + chocolatesPerChild +
                " and the number of remaining chocolates are "
                + remainingChocolates);

        input.close();
    }
}
