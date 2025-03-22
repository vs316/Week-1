package JavaMethods;

import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salaries and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2]; // [salary, years of service]
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 30000 + random.nextInt(70000); // Random salary between 30,000 and 100,000
            data[i][1] = random.nextInt(11); // Random years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate bonuses and new salaries
    public static double[][] calculateBonuses(int[][] employeeData) {
        double[][] results = new double[employeeData.length][3]; // [old salary, bonus, new salary]
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            results[i][0] = salary;
            results[i][1] = bonus;
            results[i][2] = newSalary;
        }
        return results;
    }

    // Method to calculate and display totals
    public static void displayTotals(double[][] results) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Old Salary", "Bonus", "New Salary", "Years");
        for (double[] result : results) {
            totalOldSalary += result[0];
            totalBonus += result[1];
            totalNewSalary += result[2];
            System.out.printf("%-10.2f %-10.2f %-10.2f\n", result[0], result[1], result[2]);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonuses and new salaries
        double[][] results = calculateBonuses(employeeData);

        // Display results
        displayTotals(results);
    }
}
