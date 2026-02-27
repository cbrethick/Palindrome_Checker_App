public class Palindrome_Checker_App {
    public static void main(String[] args) {


        String word = "madam";


        String reverseWord = "";


        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }


        if (word.equals(reverseWord)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
