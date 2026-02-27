import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class Palindrome_Checker_App {

    public static void main(String[] args) {

        // Original String
        String word = "madam";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<Character>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<Character>();

        // Insert characters into both Queue and Stack
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop results
        for (int i = 0; i < word.length(); i++) {

            char fromQueue = queue.remove(); // Dequeue (FIFO)
            char fromStack = stack.pop();    // Pop (LIFO)

            if (fromQueue != fromStack) {
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