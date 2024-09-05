import java.util.Scanner;

public class buzz {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Buzz number
        boolean isBuzzNumber = (number % 7 == 0) || (number % 10 == 7);

        // Display the result
        if (isBuzzNumber) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
    }
}

