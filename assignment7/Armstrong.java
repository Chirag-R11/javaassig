//package name as assignment7
package assignment7;
// importing scanner class from java.util
import java.util.Scanner;

//class name armstrong
public class Armstrong {
    
    // Method to print Armstrong numbers between start and end
    public static void ArmstrongNumber(int start, int end) {
        // Loop all numbers from start to end
        for (int num = start; num <= end; num++) {
            int sum = 0;
            int originalNum = num;
            
            // Loop to calculate the sum of cubes of digits
            while (num > 0) {
                int digit = num % 10;  // Extract the last digit
                sum += digit * digit * digit;  // Cube the digit and add it to the sum
                num /= 10;  // Remove the last digit
            }
            
            // Check if the sum is equal to the original/Armstrong number
            if (sum == originalNum) {
                System.out.println("Armstrong number are : "+originalNum);
            }
            
            // Reset num to original number for the next iteration
            num = originalNum;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input from user
        System.out.println("Enter the starting number: ");
        int start = scanner.nextInt();
        
        System.out.println("Enter the ending number: ");
        int end = scanner.nextInt();
        
        // Calling the method to print Armstrong
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        ArmstrongNumber(start, end);
        
        scanner.close();
    }
}
