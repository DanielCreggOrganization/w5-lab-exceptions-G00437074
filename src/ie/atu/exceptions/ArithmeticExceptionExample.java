package ie.atu.exceptions;

public class ArithmeticExceptionExample {
        public static void main(String[] args) {
            try {
                int numerator = 10;
                int denominator = 0; // This will cause division by zero
                int result = numerator / denominator; // ArithmeticException occurs here
                
                System.out.println("Result: " + result); // This line won't be executed if an exception occurs
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed!");
            }
    
            System.out.println("Program continues after handling the exception.");
        }
    }
