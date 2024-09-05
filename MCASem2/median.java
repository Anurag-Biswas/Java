import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to hold the numbers
        double[] numbers = new double[n];

        // Prompt the user to enter the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Find the median
        double median = findMedian(numbers);

        // Display the result
        System.out.println("The median is: " + median);
    }

    // Method to find the median of an array of numbers
    public static double findMedian(double[] numbers) {
        // Sort the array
        Arrays.sort(numbers);

        int n = numbers.length;
        if (n % 2 == 1) {
            // If the number of elements is odd, return the middle element
            return numbers[n / 2];
        } else {
            // If the number of elements is even, return the average of the two middle elements
            return (numbers[(n / 2) - 1] + numbers[n / 2]) / 2.0;
        }
    }
}
