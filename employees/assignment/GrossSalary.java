package employees.assignment;

import java.util.Scanner;

public class GrossSalary {

	// Method to calculate gross salary based on the basic salary
	public static double calculateGrossSalary(double basicSalary) {
		double hra, da;
		// Conditions for HRA and DA based on basic salary
		if (basicSalary > 15000) { // if it's greater than 15000
			hra = 0.20 * basicSalary; // HRA is 20% of basic salary
			da = 0.60 * basicSalary; // DA is 60% of basic salary
		} else {
			hra = 3000; // HRA is 3000 if the basic salary is 15000 or less
			da = 0.70 * basicSalary; // DA is 70% of basic salary, if it's 15000 or less
		}
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		return basicSalary + hra + da; // Calculate and return the gross salary
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) { // Infinite loop to repeatedly take input from the user
			System.out.print("Enter the basic salary of the employee: ");
			double basicSalary = scanner.nextDouble(); // Input for basic salary
			double grossSalary = calculateGrossSalary(basicSalary); // Calculate gross salary
			System.out.printf("gross salary : %.2f%n", grossSalary); // Print gross salary

			System.out.print("Enter -1 to continue or any other number to exit: ");
			int choice = scanner.nextInt(); // Input for user's choice
			if (choice != -1) { // Check if the user wants to exit
				break; // Exit the loop if choice is not -1
			}
		}

		scanner.close(); // Close the scanner
	}
}
