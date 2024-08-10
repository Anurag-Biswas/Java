import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        char grade = calculateGrade(percentage);
        
        System.out.println("Grade: " + grade);
    }
    
    public static char calculateGrade(double percentage) {
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return grade;
    }
}