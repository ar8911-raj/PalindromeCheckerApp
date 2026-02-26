package src;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("--- UC3: Palindrome Check Using String Reverse ---");
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}