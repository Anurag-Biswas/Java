import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the original values
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display the swapped values
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
