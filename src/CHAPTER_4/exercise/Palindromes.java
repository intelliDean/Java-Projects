package CHAPTER_4.exercise;

import java.util.Scanner;

public class Palindromes {
    /*(Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
    For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s
a palindrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.*/
    public static void intPalindromes(int number) {
        int r, sum = 0, temp; // short and concise style of declaring and initializing variables
        temp = number; // store number in a temporary variable to be used to compare later
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum  * 10) + r;
            number = number / 10;
        }
        System.out.println(sum);
        if (temp == sum)
            System.out.println("palindrome number");
        else
            System.out.println("not palindrome");
    }
    public static void stringPalindromes(String original) {
        StringBuilder reverse = new StringBuilder(); // Object of String class
         int length = original.length(); // converting the length of a string into integer
         for ( int i = length - 1; i >= 0; i-- )
             reverse.append(original.charAt(i));
         if (original.equals(reverse.toString()))
             System.out.println("\nEntered string/number is a palindrome.");
         else
             System.out.println("\nEntered string/number isn't a palindrome.");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                
                Enter 5 digits number to check
                if it is a palindrome number""");
       String ori = input.nextLine();
        stringPalindromes(ori);

    }

}
