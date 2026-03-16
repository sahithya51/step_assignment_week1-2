package week01and02.level1;

public class problem5 {
    public static void main(String[] args) {
        
        // Total pens and students
        int totalPens = 14;
        int students = 3;
        
        // Calculate pens per student
        int pensPerStudent = totalPens / students;
        
        // Calculate remaining pens
        int remainingPens = totalPens % students;
        
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
    
