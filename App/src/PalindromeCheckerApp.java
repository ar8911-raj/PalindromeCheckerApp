import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- UC2: HardCode/Manual Logic Palindrome Checker ---");
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;


        while (left < right) {
            if (Character.toLowerCase(input.charAt(left))
                    != Character.toLowerCase(input.charAt(right))) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is not a palindrome.");
        }

        sc.close();
    }
}