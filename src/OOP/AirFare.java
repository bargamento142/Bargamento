package OOP;

import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
 
        int ECONOMY_FARE = 250;
        int BUSINESS_FARE = 500;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double distance = scanner.nextDouble();

        System.out.println("Select a class:");
        System.out.println("1: Economy Class");
        System.out.println("2: Business Class");
        System.out.print("Enter class (1 or 2): ");
        int classType = scanner.nextInt();

        double farePerKm;

        if (classType == 1) {
            farePerKm = ECONOMY_FARE;
        } else if (classType == 2) {
            farePerKm = BUSINESS_FARE;
        } else {
            System.out.println("Invalid class selected.");
            return; 
        }

        double totalFare = distance * farePerKm;

        if (distance > 1000) {
            totalFare *= 0.9;
        }
        
        System.out.printf("Total fare: %.2f%n", totalFare);
    }
}
