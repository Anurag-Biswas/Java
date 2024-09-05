import java.util.Scanner;

public class fahrenheittocelsius {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5/9;

        // Display the result
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
