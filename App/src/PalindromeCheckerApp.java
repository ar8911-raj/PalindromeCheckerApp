package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class PalindromeComparison {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "civic";
        PalindromeComparison logic = new PalindromeComparison();

        System.out.println("--- UC6: Queue + Stack Based Palindrome Check ---");
        System.out.println("Word: " + word);

        if (logic.check(word)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}