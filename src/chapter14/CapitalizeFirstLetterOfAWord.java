package chapter14;

import java.util.Scanner;

public class CapitalizeFirstLetterOfAWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = input.nextLine();

        capitalize(sentence);
    }
    public static void capitalize(String sentence) {
        String[] tokens = sentence.split(" ");      //method split with regex " " splits the sentence anywhere there is a space

        for (String token : tokens) {
            String cap = firstLetter(token);
            String first = String.valueOf(token.charAt(0));
            assert cap != null;
            System.out.print(token.replaceFirst(first, cap)+" ");
        }
    }

    private static String  firstLetter(String word) {
        for (char i = '0'; i <= 'z'; i++) {
            if (word.charAt(0) == i) {
                return String.valueOf(i).toUpperCase();
            }
        }
        return null;
    }
}