import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class Palindrome_Checker_App {

    // Two-Pointer Algorithm
    public static boolean twoPointer(String word) {
        int start = 0, end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    // Stack Algorithm
    public static boolean stackMethod(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        for (char c : word.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque Algorithm
    public static boolean dequeMethod(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();

        // Two-Pointer timing
        long start = System.nanoTime();
        twoPointer(word);
        long end = System.nanoTime();
        System.out.println("Two-Pointer Execution Time: " + (end - start) + " ns");

        // Stack timing
        start = System.nanoTime();
        stackMethod(word);
        end = System.nanoTime();
        System.out.println("Stack Execution Time: " + (end - start) + " ns");

        // Deque timing
        start = System.nanoTime();
        dequeMethod(word);
        end = System.nanoTime();
        System.out.println("Deque Execution Time: " + (end - start) + " ns");
    }
}