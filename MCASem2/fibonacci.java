import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Initialize the first two terms
        int first = 0, second = 1;

        // Display the Fibonacci series
        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        // Print the first two terms if there are at least two terms
        if (n > 0) {
            System.out.print(first);
        }
        if (n > 1) {
            System.out.print(", " + second);
        }

        // Generate and print the remaining terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
