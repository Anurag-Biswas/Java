import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);

        // Display the result
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        // Convert the number to a string to easily get the number of digits
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;
        int temp = number;

        // Calculate the sum of each digit raised to the power of numDigits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}

