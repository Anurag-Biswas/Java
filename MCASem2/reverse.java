
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append digit
            number /= 10;  // Remove the last digit
        }

        // Display the reversed number
        System.out.println("The reverse of " + originalNumber + " is: " + reversedNumber);
    }
}
