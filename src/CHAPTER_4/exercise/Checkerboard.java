package CHAPTER_4.exercise;

import java.util.Scanner;

public class Checkerboard {
    /*(Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
    to display the checkerboard pattern that follows. A System.out.println method call with no
    arguments causes the program to output a single newline character. [Hint: Iteration statements are required.]*/
    public static void board(int num) {
        if (num == 8) {
    int i = 1;
    while (i <= num) {
        int j = 1;
        while (j <= num) {
            System.out.print("* "); //This is the column that prints the asterisks for thw checkboard
            j++;
            System.out.print(" ");
        }
            System.out.println(); // this is the newline for the board
            i++;
        if (i % 2 == 0) {
            System.out.print("  "); // this gives the indentation to the checkboard
        }
    }
 }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the checkboard");
        int num = input.nextInt();
        board(num);
    }
}
