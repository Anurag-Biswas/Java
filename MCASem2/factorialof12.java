public class factorialof12 {
    public static void main(String[] args) {
        // Define the number to calculate the factorial for
        int number = 12;
        
        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
