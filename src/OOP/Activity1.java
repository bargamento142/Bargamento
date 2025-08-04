package OOP;

import java.util.Scanner;

public class Activity1 {
   
  public static void main(String[] args) {  
     Scanner sc = new Scanner(System.in);
     
     String name;
     int subjects;
     float grade; 
     double total = 0;
     double subject = 0;
     
     System.out.print("Enter student name: ");
     name = sc.nextLine();
     
     System.out.print("Enter number of students: ");
     subjects = sc.nextInt();
           
     for (int i = 0; i <= subjects;  i++) {    
      System.out.print("Enter grade for sub" + i + "; ");
      grade = sc.nextFloat();
      total += grade;
      
     }

   double average = total / subject;
   System.out.printf("\nAverage: %.2f\n", average);
 
   if (average >= 75) {
    System.out.println("Remarks: PASSED");
 } else {
  System.out.println("Remarks: FAILED");
   }
   sc.close();
  } 
}