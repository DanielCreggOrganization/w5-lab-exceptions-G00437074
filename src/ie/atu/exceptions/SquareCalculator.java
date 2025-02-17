package ie.atu.exceptions;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Try-with-resources ensures Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            
            int number = scanner.nextInt(); // Read user input
            int square = number * number;  // Calculate square
            
            System.out.println("The square of " + number + " is: " + square);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}