import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Step 1: Define Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Step 2: Implement Stack-based Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Step 3: Implement Deque-based Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Step 4: Context class to use strategy
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    public PalindromeCheckerContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String word) {
        return strategy.checkPalindrome(word);
    }
}

// Step 5: Main method
public class Palindrome_Checker_App{
    public static void main(String[] args) {

        String word = "madam";

        // Using Stack strategy
        PalindromeCheckerContext checker1 = new PalindromeCheckerContext(new StackStrategy());
        System.out.println("Stack Strategy: " + (checker1.check(word) ? "Palindrome" : "Not Palindrome"));

        // Using Deque strategy
        PalindromeCheckerContext checker2 = new PalindromeCheckerContext(new DequeStrategy());
        System.out.println("Deque Strategy: " + (checker2.check(word) ? "Palindrome" : "Not Palindrome"));
    }
}