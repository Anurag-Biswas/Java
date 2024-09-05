import java.util.Scanner;

public class binarytodecimalanddecimaltobinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion: Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();
        int decimalValue = binaryToDecimal(binaryStr);
        System.out.println("Binary " + binaryStr + " is Decimal " + decimalValue);

        // Conversion: Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binaryValue = decimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " is Binary " + binaryValue);
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binaryStr) {
        int decimal = 0;
        int base = 1; // 2^0

        // Convert binary string to decimal
        int length = binaryStr.length();
        for (int i = length - 1; i >= 0; i--) {
            if (binaryStr.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        return decimal;
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binaryStr = new StringBuilder();

        // Convert decimal to binary
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryStr.insert(0, remainder);
            decimal /= 2;
        }

        return binaryStr.toString();
    }
}
