package Practice;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Input number");
        int player = input.nextInt();
        while (player != -1) {
            if (player == '1' || player == '2' || player == '0') {
            System.out.print("You");
            determineChoice(player);

            int computer = rand.nextInt(3);
            System.out.print("Computer");
            determineChoice(computer);

            int winner = determineWinner(player, computer);

            if (winner == 1) {
                System.out.println("You are the winner");
            } else if (winner == 2) {
                System.out.println("Computer wins");
            } else {
                System.out.println("It's a draw");
            }
            System.out.println("Input number");
            player = input.nextInt();
            } else {
                System.out.println("Invalid input... enter between 0 - 2");
                continue;
            }
        }

    }
    public static int determineWinner(int player, int computer) {
        if (player == 0 && computer == 2 || player == 2 && computer == 1 || player == 1 && computer == 0) {
            return 1;
        } else if (computer == 1 && player == 1 || computer == 2 && player == 2 || computer == 0 && player == 0) {
            return 0;
        } else {
            return 2;
        }
    }
    public static void determineChoice(int number) {
        if (number == 1) {
            System.out.println(" chooses scissors");
        } else if (number == 2) {
            System.out.println(" chooses rock");
        } else {
            System.out.println(" chooses paper");
        }
    }
}