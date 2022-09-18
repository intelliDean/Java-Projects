package assignment;

import java.util.Scanner;

public class Guessing {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int correctNumber = 54;
            System.out.println("Let's see if you wil guess right: ");
            int guessedNumber = input.nextInt();

            for (int count = 1; count > 0; count++) { // this program only give the use 3 chance to guess


                if (guessedNumber < correctNumber || guessedNumber > correctNumber) {
                    System.out.println("You didn't guess right: ");

                    System.out.print("\nPlease try again?: ");
                    guessedNumber = input.nextInt();
                } else {
                    System.out.println("\nPerfect! You guessed right: ");
                    break;

                }
}

}

}
