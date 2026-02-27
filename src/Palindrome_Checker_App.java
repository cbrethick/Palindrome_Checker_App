
public class Palindrome_Checker_App {

    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply two-pointer logic
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        if (isPalindrome(text)) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}