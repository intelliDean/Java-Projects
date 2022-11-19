package assignment.weekend_snack.TicTacToe;

import java.util.Arrays;

public class Tick {
    static String[] board;
    static String turn;

    static String determineWinner() {         // method will decide the winning combination
        for (int i = 0; i < 8; i++) {

            String line = switch (i) {
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> null;
            };

            if (line.equals("XXX")) {       //For X winner
                return "X";
            }
            else if (line.equals("OOO")) {      // For O winner
                return "O";

            }

        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(i + 1))) {
                break;
            }
            else if (i == 8) {
                return "draw";
            }
        }
        // To enter the X Or O at the exact place on board.

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");

        return null;
    }

    static void printBoard() {

        System.out.println("|-----------|-----------|-----------|");
        System.out.println("|           |           |           |");

        System.out.println("|     " + board[0] + "     |     " + board[1]
                + "     |     " + board[2] + "     |");
        System.out.println("|           |           |           |");

        System.out.println("|-----------------------------------|");
        System.out.println("|           |           |           |");

        System.out.println("|     " + board[3] + "     |     " + board[4]
                + "     |     " + board[5] + "     |");
        System.out.println("|           |           |           |");

        System.out.println("|-----------------------------------|");
        System.out.println("|           |           |           |");

        System.out.println("|     " + board[6] + "     |    " + board[7]
                + "      |     " + board[8] + "     |");
        System.out.println("|           |           |           |");

        System.out.println("|-----------|-----------|-----------|");

    }


    public static void turn(String winner, int numInput) {
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


}
