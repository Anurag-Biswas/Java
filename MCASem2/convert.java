import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in miles
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        // Convert miles to kilometers
        double kilometers = miles * 1.60934;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
