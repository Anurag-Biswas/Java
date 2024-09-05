import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and perimeter (circumference)
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Display the results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
