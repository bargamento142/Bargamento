package BankApp;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO, WELCOME TO THE SYSTEM!");
        System.out.println("How are you today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                BankClass bc = new BankClass();

                int maxAttempts = 3;
                boolean isAuthenticated = false;

                for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                    System.out.print("Enter your Account Number: ");
                    int accountNumber = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNumber, pin)) {
                        
                        int remaining = maxAttempts - attempt;
                        System.out.println("INVALID ACCOUNT or PIN! Attempts left: " + remaining);
                    } else {
                        System.out.println("LOGIN SUCCESS");
                        isAuthenticated = true;
                    
                        break;
                    }
                }

                if (!isAuthenticated) {
                    System.out.println("ACCESS DENIED. Please try again later.");
                }

                break;

            case 2:
                System.out.println("Shopping feature coming soon!");
                break;

            case 3:
                System.out.println("Pay Bills feature coming soon!");
                break;

            default:
                System.out.println("Invalid Selection!");
        }

        sc.close(); 
    }
