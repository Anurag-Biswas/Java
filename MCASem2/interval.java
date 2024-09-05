import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the start and end of the interval
        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        // Print all multiples of 10 within the given interval
        System.out.println("Multiples of 10 between " + start + " and " + end + ":");

        // Find the first multiple of 10 within the interval
        int firstMultiple = (start % 10 == 0) ? start : (start / 10 + 1) * 10;

        // Print multiples of 10 from the first multiple to the end of the interval
        for (int i = firstMultiple; i <= end; i += 10) {
            System.out.print(i + " ");
        }
    }
}
