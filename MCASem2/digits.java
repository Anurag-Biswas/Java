import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the number of digits
        int numDigits = countDigits(number);

        // Display the result
        System.out.println("The number of digits in " + number + " is: " + numDigits);
    }

    // Method to count the number of digits
    public static int countDigits(int number) {
        // Handle the special case of 0
        if (number == 0) {
            return 1;
        }

        // Convert negative numbers to positive
        number = Math.abs(number);

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
