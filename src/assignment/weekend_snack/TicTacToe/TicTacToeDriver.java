package assignment.weekend_snack.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static assignment.weekend_snack.TicTacToe.Tick.*;

public class TicTacToeDriver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        board = new String[9];

        turn = "X";

        String winner = null;


        //Populate the index of board with 1 - 9 instead of 0 - 8
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);

        }


        System.out.println("Welcome to 3x3 Tic Tac Toe.");

        printBoard();


        System.out.println("Player 1 will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {     // numInput will take input from user like from 1 to 9.
                    System.err.println("Invalid input; re-enter slot number:");     // Error if it's not in range from 1 to 9.

                    continue;
                }
            }

            catch (InputMismatchException e) {
                System.err.println("Invalid input; re-enter slot number:");

                continue;
            }


            if (board[numInput - 1].equals(String.valueOf(numInput))) {

                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
                printBoard();
                winner = determineWinner();
            }
            else {
                System.err.println("Slot already taken; re-enter slot number:");

            }

        }



        // If no one win or lose from both player x and O.

        // then here is the logic to print "draw".

        if (winner.equalsIgnoreCase("draw")) {

            System.out.println("It's a draw! Thanks for playing.");
        }
        else {      // For winner -to display Congratulations! message.

            System.out.println("Congratulations! " + winner + "'s have won!");

        }
        in.close();
    }
}
