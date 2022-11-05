package MyReusableCodes;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word");
        String word = input.nextLine();

        String result = reverseStringOneLine(word);
        System.out.println(result);
    }
    public static String reverseString(String word){
        StringBuilder toReverse = new StringBuilder();
        if (word.length() < 2) {
            return null;
        }
        int i = word.length() - 1;
        while (i != -1) {
            toReverse.append(word.charAt(i--));
        }
        return toReverse.toString();
    }
    public static String reverseStringOneLine(String word) {
        if (word.length() < 2) {
            return null;
        }
        return new StringBuilder(word).reverse().toString();
    }
}
