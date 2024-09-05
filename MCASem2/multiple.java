import java.util.Scanner;

public class multiple{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the second integer (n): ");
        int n = scanner.nextInt();

        // Check if m is a multiple of n
        if (n != 0 && m % n == 0) {
            System.out.println(m + " is a multiple of " + n + ".");
        } else if (n == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println(m + " is not a multiple of " + n + ".");
        }
    }
}
