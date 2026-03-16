package week03and04.level3;
 import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics, chemistry, maths, average;
        String grade, remarks;

        // Input marks
        System.out.print("Enter marks for Physics: ");
        physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        maths = sc.nextDouble();

        // Calculate average
        average = (physics + chemistry + maths) / 3;

        // Determine grade and remarks
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } 
        else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } 
        else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } 
        else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } 
        else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } 
        else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output
        System.out.println("\nAverage Percentage: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}

