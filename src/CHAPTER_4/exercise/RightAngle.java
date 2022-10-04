package CHAPTER_4.exercise;

import java.util.Scanner;

public class RightAngle {
    static Scanner input = new Scanner(System.in);
    /*(Right-angled Triangle) Write an application that prompts the user to enter the length of
the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
program should work for triangles of base lengths between 1 and 10.*/
    public static void triangle(int row) {
        int i = 1;
        while (i <= row) {
            if (row > 1) {
                int column = 0;
                while (column < i) {
                    System.out.print(" * ");
                    column++;
                }
                System.out.println();
                i++;
            } else {
                System.out.println("Not enough base");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the base of the right-angled triangle");
        int base = input.nextInt();
        triangle(base);
    }
}
