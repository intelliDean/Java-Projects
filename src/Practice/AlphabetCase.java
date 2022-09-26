package Practice;

import java.util.Scanner;

public class AlphabetCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput alphabet only");
        char ch = input.next().trim().charAt(0);// the charAt(0) takes the index 0 of the alphabet/number inputted while trim() cuts of every other letters after the index 0
        if (ch >= 'a' && ch <= 'z') {
            System.out.printf("%n%c is a lowercase%n", ch);
        } else {
            System.out.printf("%n%c is an uppercase%n", ch);
        }
    }
}
