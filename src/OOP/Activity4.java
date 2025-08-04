package OOP;

import BankApp.BankClass;
import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("How Are you Today? ");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
       
                BankClass bc = new BankClass();
                
                System.out.print("Enter your Account Number: ");
                int accountNumber = sc.nextInt();

                System.out.print("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNumber, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        System.out.println("INVALID ACCOUNT!");
                    }
                
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}
