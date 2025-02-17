package ie.atu.exceptions;

public class ExceptionIntroduction {
    public static void main(String[] args) {
        String text = null;

        // Check if text is null before accessing its length
        if (text != null) {
            System.out.println("Length of the string: " + text.length());
        } else {
            System.out.println("The string is null, couldn't retrieve length.");
        }
    }
}
