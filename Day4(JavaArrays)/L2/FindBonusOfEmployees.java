package JavaArrays;

import java.util.Scanner;

public class FindBonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Define variables and arrays
        double[][] employeeData = new double[10][2]; // Salary and Years of Service
        double[] bonusAmount = new double[10]; // Bonus for each employee
        double[] newSalary = new double[10]; // New salary for each employee
        double totalBonus = 0; // Total bonus payout
        double totalOldSalary = 0; // Total of all old salaries
        double totalNewSalary = 0; // Total of all new salaries

        // Step 2: Input data for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Input salary with validation
            while (true) {
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                if (salary > 0) {
                    employeeData[i][0] = salary; // Store salary in column 0
                    totalOldSalary += salary; // Add to total old salary
                    break;
                } else {
                    System.out.println("Invalid salary! Please enter a positive value.");
                }
            }

            // Input years of service with validation
            while (true) {
                System.out.print("Enter years of service: ");
                double yearsOfService = sc.nextDouble();
                if (yearsOfService >= 0) {
                    employeeData[i][1] = yearsOfService; // Store years of service in column 1
                    break;
                } else {
                    System.out.println("Invalid years of service! Please enter a non-negative value.");
                }
            }
        }

        // Step 3: Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            // Determine bonus percentage based on years of service
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;

            // Calculate bonus and new salary
            bonusAmount[i] = salary * bonusPercentage;
            newSalary[i] = salary + bonusAmount[i];

            // Update total bonus and total new salary
            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }

        // Step 4: Display results
        System.out.println("\nEmployee Bonuses and Salaries:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + employeeData[i][0] +
                    ", Bonus: " + bonusAmount[i] + ", New Salary: " + newSalary[i]);
        }

        System.out.println("\nSummary:");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close(); // Close the Scanner
    }
}