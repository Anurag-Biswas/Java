import java.util.Scanner;

public class BuzzChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's Buzz: ");
        int number = scanner.nextInt();

        if (isBuzz(number)) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
    }

    // Function to check if a number is Buzz or not
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}