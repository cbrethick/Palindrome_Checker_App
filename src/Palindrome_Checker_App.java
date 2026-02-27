
public class Palindrome_Checker_App {

    public static boolean isPalindrome(String word, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

}