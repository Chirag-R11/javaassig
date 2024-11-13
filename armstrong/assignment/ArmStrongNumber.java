package armstrong.assignment;

import java.util.Scanner;

public class ArmStrongNumber {

	// Method to print Armstrong numbers between start and end
	public static void displayArmstrongNumbers(int start, int end) {
		System.out.println("Armstrong numbers between " + start + " and " + end + ":");
		for (int Number = start; Number <= end; Number++) {
			if (isArmstrongNumber(Number)) {
				System.out.println(Number);
			}
		}
	}

	// Method to check if a given number is an Armstrong number
	public static boolean isArmstrongNumber(int number) {
		int originalNumber = number;
		int sumOfCubes = 0; // Variable to accumulate the sum of cubes of digits
		while (number > 0) {
			int digit = number % 10; // Extract the last digit of the number
			sumOfCubes += calculateCube(digit); // Add the cube of the digit to the sum
			number /= 10; // Remove the last digit
		}
		// Check if the sum of cubes equals the original number
		return sumOfCubes == originalNumber;
	}

	// Method to calculate the cube of a digit
	public static int calculateCube(int digit) {
		return digit * digit * digit; // Return the cube of the digit
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking input from the user
		System.out.println("Enter the starting number: ");
		int start = scanner.nextInt();

		System.out.println("Enter the ending number: ");
		int end = scanner.nextInt();

		// Calling method to display Armstrong numbers
		displayArmstrongNumbers(start, end);

		// Close resource leaks
		scanner.close();
	}
}
