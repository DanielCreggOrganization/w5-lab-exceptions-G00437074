package ie.atu.exceptions;

public class GradeCalculator {
    public static void main(String[] args) {
        try {
            int score = 110; // Change this value to test different cases
            char grade = calculateGrade(score);
            System.out.println("Grade: " + grade);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static char calculateGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score."); // Throws an unchecked exception
        }

        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}