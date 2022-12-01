package CHAPTER_4.exercise;

import java.util.Arrays;

public class Palindromes {
    /*(Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
    For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s
a palindrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.*/
    public static boolean intPalindromes(int number) {
        int r, sum = 0, temp; // short and concise style of declaring and initializing variables
        temp = number; // store number in a temporary variable to be used to compare later
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum  * 10) + r;
            number = number / 10;
        }
        System.out.println(sum);
        return temp == sum;
    }
    public static boolean isPalindromes(String original) {
        StringBuilder builder = new StringBuilder(); // Object of String class
         int length = original.length(); // converting the length of a string into integer
         for ( int i = length - 1; i >= 0; i-- ) {
             builder.append(original.charAt(i));
         }
         return original.equals(builder.toString());
    }
    public static char[] reversedWord(String word) {
        char[] reversedChar = new char[word.length()];
        for (int i = 0, j = word.length() -1; i < word.length(); i++, j--) {
            reversedChar[i] = word.charAt(j);
        }
        return reversedChar;
    }
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("""
//
//                Enter 5 digits number to check
//                if it is a palindrome number""");
//       int ori = input.nextInt();
//       boolean res = intPalindromes(ori);
//        System.out.println(res);
//        stringPalindromes(ori);
        String cha = "madam";
        boolean wink = ch(cha);
        System.out.println(wink);


        System.out.println(reversedWord("madam"));
        System.out.println(charPalindrome("mom"));
    }
    public static boolean ch(String name){
        char[] n = name.toCharArray();
        char[] k = new char[n.length];
        for (int i = 0, j = n.length - 1; i < n.length; i++, j--) {
            k[i] = n[j];

        }
        return Arrays.equals(k, n);

    }
    public static boolean charPalindrome(String word) {
        char[] newWord = word.toCharArray();
        char[] copy = newWord.clone();
        for (int i = 0, j = newWord.length - 1; i < newWord.length / 2; i++, j--) {
            char temp = newWord[i];
            newWord[i] = newWord[j];
            newWord[j] = temp;
        }
        return Arrays.equals(newWord, copy);
    }

}
