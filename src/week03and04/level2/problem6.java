package week03and04.level2;
 import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        String youngest;
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));

        if (minAge == ageAmar) {
            youngest = "Amar";
        } else if (minAge == ageAkbar) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Find tallest
        String tallest;
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        if (maxHeight == heightAmar) {
            tallest = "Amar";
        } else if (maxHeight == heightAkbar) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Output results
        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);

        sc.close();
    }
 
}
