package ie.atu.exceptions;

public class FileProcessingSimulation {
    public static void main(String[] args) {
        try {
            System.out.println("Opening file...");

            // Simulate an exception (e.g., file not found)
            throw new Exception("Simulated file processing error");

            // System.out.println("Processing file..."); // This line won't execute if an
            // exception occurs

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("File processing complete.");
        }
    }
}
