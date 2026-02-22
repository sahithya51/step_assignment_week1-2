package level1;

public class problem6 {
    public static void main(String[] args) {
        
        // Given values
        double fee = 125000;
        double discountPercent = 10;
        
        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculate final discounted fee
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
    
}
