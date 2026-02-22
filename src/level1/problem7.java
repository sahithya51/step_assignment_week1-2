package level1;

public class problem7 {
    public static void main(String[] args) {
        
        double radiusKm = 6378;
        double pi = 3.141592653589793;
        
        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        
        // Convert cubic km to cubic miles
        // 1 mile = 1.6 km
        double conversionFactor = 1.6 * 1.6 * 1.6;
        double volumeMiles = volumeKm / conversionFactor;
        
        System.out.println("The volume of earth in cubic kilometers is " 
                           + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}