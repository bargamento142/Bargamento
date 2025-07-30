 import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter hourly rate: ");
        float hourlyRate = sc.nextFloat();

        System.out.print("Enter total hours worked this week: ");
        float hoursWorked = sc.nextFloat();

        float grossWage = hourlyRate * hoursWorked;
        float sssContribution = grossWage * 0.10f;
        float netWage = grossWage - sssContribution;

        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee: " + employeeName);
        System.out.printf("Hourly Rate: ₱%.2f\n", hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", grossWage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n", sssContribution);
        System.out.println("----------------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n", netWage);

        sc.close();
    }
}
