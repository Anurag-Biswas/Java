import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the HCF using the Euclidean algorithm
        int hcf = findHCF(num1, num2);

        // Display the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    // Method to find the HCF using the Euclidean algorithm
    public static int findHCF(int a, int b) {
        // Make sure a is the greater number
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Euclidean algorithm
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
