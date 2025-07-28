import java.util.Scanner;

public class Remy{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name;
        int science;
        int history;
        int math;
        int soc;
        int arts;
        
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter marks in Science: ");
        science = scanner.nextInt();

        System.out.print("Enter marks in History: ");
        history = scanner.nextInt();

        System.out.print("Enter marks in Math: ");
        math = scanner.nextInt();

        System.out.print("Enter marks in Soc: ");
        soc = scanner.nextInt();

        System.out.print("Enter marks in Arts: ");
        arts = scanner.nextInt();

        int TotalMarks = science + history + math + soc + arts;
        Double percentage = (TotalMarks / 500.0) * 100;

        System.out.println("\nOutput");
        System.out.println("Enter name: " + name);
        System.out.println("Enter marks in Science: " + science);
        System.out.println("Enter marks in History: " + history);
        System.out.println("Enter marks in Math: " + math);
        System.out.println("Enter marks in Soc: " + soc);
        System.out.println("Enter marks in Arts: " + arts);
        System.out.println("Total Marks: " + TotalMarks);
        System.out.printf("\nTotal percentage: %.2f%%",percentage);
        
        String Remarks;
        
        if (percentage < 70) {
            Remarks = "Fail";
            System.out.println("Congratulations" + name + " you Failed.");
        } else if (percentage >= 70 && percentage <= 75) {
            Remarks = "Poor";
            System.out.println("Congratulations" + name + " you Passed with Poor.");
        } else if (percentage >= 76 && percentage <= 80) {
            Remarks = "Fair";
            System.out.println("Congratulations" + name + " you Passed with Fair.");
        } else if (percentage >= 81 && percentage <= 85) {
            Remarks = "Good";
            System.out.println("Congratulations" + name + " you Passed with Good.");
        } else if (percentage >= 86 && percentage <= 90) {
            Remarks = "Very Good";
            System.out.println("Congrats " + name + " you Passed with Very Good.");
        } else {
            Remarks = "Excellent";
            System.out.println("Congrats " + name + " you Passed with Excellent.");
        }
        System.out.println("Remarks: " + Remarks);

    }
}