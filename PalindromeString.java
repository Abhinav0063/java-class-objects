import java.util.Scanner;

class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is a palindrome
    public boolean isPalindrome() {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Normalize input
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The given text is a palindrome.");
        } else {
            System.out.println("The given text is NOT a palindrome.");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Creating PalindromeChecker object and checking palindrome status
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();

        scanner.close();
    }
}
