package ie.atu.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        demonstrateExceptions();
    }

    public static void demonstrateExceptions() {
        // Checked Exception: Attempting to open a non-existent file
        try {
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file); // This will throw FileNotFoundException
            System.out.println("File opened successfully.");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: File not found - " + e.getMessage());
        }

        // Unchecked Exception: Accessing an element from an empty array
        try {
            int[] numbers = new int[0]; // Empty array
            System.out.println(numbers[0]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception: Array index out of bounds - " + e.getMessage());
        }
    }
}