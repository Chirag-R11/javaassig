package OddEven.assignment;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0, evenCount = 0;

        while (true) {
            System.out.print("Enter a number. and for exit enter -1 : ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;  // break from the loop if the user enters -1
            }

            if (number % 2 == 0) {
                evenCount++;  // Increment even number count
            } else {
                oddCount++;  // Increment odd number count
            }
        }

        // display the total number of odd and even numbers
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        scanner.close();  // Close the scanner
    }
}
