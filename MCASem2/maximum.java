import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum number
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }

        // Display the maximum number
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
