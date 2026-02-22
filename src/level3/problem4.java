package level3;
  import java.util.Scanner;
public class problem4 {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User inputs
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        // Distance inputs (in km)
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in km): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in km): ");
        double viaToFinalCity = input.nextDouble();

        // Time inputs (Hours and Minutes separately)
        System.out.print("Enter hours taken from " + fromCity + " to " + viaCity + ": ");
        int hours1 = input.nextInt();

        System.out.print("Enter minutes taken from " + fromCity + " to " + viaCity + ": ");
        int minutes1 = input.nextInt();

        System.out.print("Enter hours taken from " + viaCity + " to " + toCity + ": ");
        int hours2 = input.nextInt();

        System.out.print("Enter minutes taken from " + viaCity + " to " + toCity + ": ");
        int minutes2 = input.nextInt();

        // Total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Convert everything into minutes
        int totalTime = (hours1 * 60 + minutes1) + (hours2 * 60 + minutes2);

        // Output
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity +
                " to " + toCity +
                " via " + viaCity +
                " is " + totalDistance +
                " km and the Total Time taken is " +
                totalTime + " minutes");

        input.close();
    }
}

