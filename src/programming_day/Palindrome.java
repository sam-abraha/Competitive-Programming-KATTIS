package programming_day;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // check if the text contains or is itself a palindrome
        if (containsPalindrome(text)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Anti-palindrome");
        }

    }

    private static boolean isPalindrome(String s) {
        // remove non-alphabetic characters and convert to lowercase
        String cleanS = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // ch if the cleaned string is equal to its reverse
        return cleanS.equals(new StringBuilder(cleanS).reverse().toString());
    }

    private static boolean containsPalindrome(String text) {
        // remove spaces and punctuation
        String cleanText = text.replaceAll("[^a-zA-Z]", "");

        if (isPalindrome(cleanText)) {
            return true;
        }

        // check if any substring of the cleaned text is a palindrome
        for (int i = 0; i < cleanText.length(); i++) {
            for (int j = i + 2; j <= cleanText.length(); j++) {
                if (isPalindrome(cleanText.substring(i, j))) {
                    return true;
                }
            }
        }

        return false;
    }
}
