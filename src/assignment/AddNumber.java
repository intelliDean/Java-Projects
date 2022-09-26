package assignment;

import java.util.Scanner;
//This program prompts a user to input 2 numbers, add the numbers together and display the result,
// but it won't terminate but ask if the user wants to perform same task again, if yes, it will run again and if no, it'll terminate.

public class AddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        int i = 0;
        int num1 = 1;
        int num2 = 1;
        do {
            System.out.println("Enter number 1: ");
            num1 = input.nextInt();

            System.out.println("Enter number 2: ");
            num2 = input.nextInt();

            System.out.printf("%n%d + %d = %d%n%n", num1, num2, num1 + num2);

//            System.out.println("\nPress 1 to continue ");
//            int answer = input.nextInt();
//            if (answer == 1) {
//                i++;
//            } else break;
        }
        while (num2 != -1);
        }
}