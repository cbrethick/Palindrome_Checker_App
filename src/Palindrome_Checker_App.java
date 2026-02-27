
public class Palindrome_Checker_App {

    private String word;

    // Constructor
    public Palindrome_Checker_App(String word) {
        this.word = word;
    }

    // Public method to check palindrome
    public boolean checkPalindrome() {

        // Using two-pointer logic
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {

        Palindrome_Checker_App checker = new Palindrome_Checker_App("madam");

        if (checker.checkPalindrome()) {
            System.out.println(checker.word + " is a Palindrome.");
        } else {
            System.out.println(checker.word + " is NOT a Palindrome.");
        }
    }
}
}