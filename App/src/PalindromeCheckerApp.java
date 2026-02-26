package src;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("--- UC4: Character Array Based Palindrome Check ---");
        System.out.println("Word: " + input);

        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}