import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number for which to generate the multiplication table
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        // Prompt the user to enter the limit for the multiplication table
        System.out.print("Enter the limit (up to which the table should be generated): ");
        int limit = scanner.nextInt();

        // Generate and print the multiplication table
        System.out.println("Multiplication table for " + number + " up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
