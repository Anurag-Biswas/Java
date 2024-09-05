import java.util.Scanner;

public class range{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the range
        System.out.print("Enter the range (n): ");
        int n = scanner.nextInt();

        // Calculate the sum of natural numbers up to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    }
}
