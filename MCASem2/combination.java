public class combination{
    public static void main(String[] args) {
        // Define the digits to use for combinations
        char[] digits = {'1', '2', '3'};

        // Generate all combinations of 1, 2, and 3 with lengths from 1 to 3
        System.out.println("Combinations of length 1:");
        for (char digit1 : digits) {
            System.out.println(digit1);
        }

        System.out.println("\nCombinations of length 2:");
        for (char digit1 : digits) {
            for (char digit2 : digits) {
                System.out.println("" + digit1 + digit2);
            }
        }

        System.out.println("\nCombinations of length 3:");
        for (char digit1 : digits) {
            for (char digit2 : digits) {
                for (char digit3 : digits) {
                    System.out.println("" + digit1 + digit2 + digit3);
                }
            }
        }
    }
}
