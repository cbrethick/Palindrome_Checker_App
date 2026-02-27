import java.util.Deque;
import java.util.ArrayDeque;
public class Palindrome_Checker_App {

    public static void main(String[] args) {

        // Original String
        String word = "madam";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<Character>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));  // Insert at rear
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear  = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}