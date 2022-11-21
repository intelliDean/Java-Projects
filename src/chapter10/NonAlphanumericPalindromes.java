package chapter10;

import java.util.Scanner;

public class NonAlphanumericPalindromes {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string");
        String s = input.nextLine();
        String j;

        // Display result
        System.out.printf(

                String.format("%nIgnoring non-alphanumeric characters. %nIs '%s' a palindrome? %n%s", s,
                isPalindrome(s) ? "Yes, it is" : "No, it's not%n"));
    }

    /**
     * Return true if a string is a palindrome
     */
    public static boolean isPalindrome(String string) {
        // Create a new string by eliminating non-alphanumeric chars
        String s1 = filter(string);

        // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
        return s2.equals(s1);
    }

    /**
     * Create a new string by eliminating non-alphanumeric chars
     */
    public static String filter(String string) {
        // Create a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(string.charAt(i))) {
                stringBuilder.append(string.charAt(i));
            }
        }
        // Return a new filtered string
        return stringBuilder.toString();
    }

    /**
     * Create a new string by reversing a specified string
     */
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse(); // Invoke reverse in StringBuilder
        return stringBuilder.toString();
    }
}
