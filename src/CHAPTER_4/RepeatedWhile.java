package CHAPTER_4;

import java.util.Scanner;

public class RepeatedWhile {
    public static void main(String[] args) {
         int number1 = (int)(Math.random() * 10);
         int number2 = (int)(Math.random() * 10);

         // Create a Scanner
         Scanner input = new Scanner(System.in);

         System.out.print("What is " + number1 + " + " + number2 + "? \n");
         int answer = input.nextInt();

         while (number1 + number2 != answer) {
             System.out.print("Wrong answer. Try again.\nWhat is "
                     + number1 + " + " + number2 + "? \n");
             answer = input.nextInt();
             }

         System.out.println("You got it!");
         }

}
