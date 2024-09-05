import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the LCM using the formula
        int lcm = findLCM(num1, num2);

        // Display the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to find the HCF using the Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Method to find the LCM
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findHCF(a, b);
    }
}
