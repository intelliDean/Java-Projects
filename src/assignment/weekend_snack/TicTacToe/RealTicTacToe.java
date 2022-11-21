package assignment.weekend_snack.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class RealTicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("""
                |-----------|-----------|-----------|
                            𝑨𝒓𝒆 𝒚𝒐𝒖 𝒃𝒐𝒓𝒆𝒅?
                         𝑾𝒐𝒖𝒍𝒅 𝒚𝒐𝒖 𝒍𝒊𝒌𝒆 𝒕𝒐 𝒑𝒍𝒂𝒚
                          𝑻𝒊𝒄𝑻𝒂𝒄 𝑻𝒐𝒆 𝒘𝒊𝒕𝒉 𝒎𝒆?
                |-----------|-----------|-----------|
                """);

        System.out.println("""
                           Select Options
                |-----------|-----------|-----------|
                     1.  2 Players
                             2.  Play with computer
                                     3.  Quit
                |-----------|-----------|-----------|""");
        int choice = scanner.nextInt();
        String decoy = scanner.nextLine();


        if (choice == 1) {
            System.out.println("Player 1 name");
            String player1 = scanner.nextLine();
            System.out.println("|----------------------------------|");
            System.out.println("Player 2 name");
            String player2 = scanner.nextLine();

            printBoard(board);
            while (true) {
                player1Move(board, player1);
                if (isGameFinished(board,player1)){
                    break;
                }
                space();
                printBoard(board);
                player2Move(board,player2);
                //computerTurn(board);
                if (isGameFinished(board, player2)){
                    break;
                }
                space();
                printBoard(board);
            }
        } else if (choice == 2){
            System.out.println("What is your name?");
            String player1 = scanner.nextLine();
            space();
            printBoard(board);
            while (true) {
                player1Move(board, player1);
                if (isGameFinished(board,player1)){
                    break;
                }
                space();
                printBoard(board);
                //player2Move(board,scanner);
                computerTurn(board);
                if (isGameFinished(board, player1)){
                    break;
                }
                space();
                printBoard(board);
            }
        } else {
            System.out.println("Thank You. Goodbye!");
        }
        scanner.close();
    }


    private static boolean isGameFinished(char[][] board, String name) {
        if (hasContestantWon(board, 'X')) {
            printBoard(board);
            System.out.printf("%s wins!\n\n\n\n", name);
            return true;
        }
        if (hasContestantWon(board, 'O')) {
            space();
            printBoard(board);
            System.out.printf("%s wins\n\n\n\n", name);
            return true;
        }
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == ' ') {
                    return false;
                }
            }
        }
        space();
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }


    private static boolean hasContestantWon(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }


    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        do {
            computerMove = rand.nextInt(9) + 1;
        } while (!isValidMove(board, Integer.toString(computerMove)));
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }


    private static boolean isValidMove (char[][] board, String position) {
        return switch (position) {
            case "1" -> (board[0][0] == ' ');
            case "2" -> (board[0][1] == ' ');
            case "3" -> (board[0][2] == ' ');
            case "4" -> (board[1][0] == ' ');
            case "5" -> (board[1][1] == ' ');
            case "6" -> (board[1][2] == ' ');
            case "7" -> (board[2][0] == ' ');
            case "8" -> (board[2][1] == ' ');
            case "9" -> (board[2][2] == ' ');
            default -> false;
        };
    }

    private static void player1Move(char[][] board, String name) {
        Scanner scanner = new Scanner(System.in);
        String player1Move;
        while (true) {
            System.out.printf("%n%s please, make your move!%n%n%n%n%n%n", name);
            player1Move = scanner.nextLine();
            if (isValidMove(board, player1Move)){
                break;
            } else {
                System.err.println(player1Move + " is not a valid move.");
            }
        }
        space();
        placeMove(board, player1Move, 'X');
    }
    private static void player2Move(char[][] board, String name) {
        Scanner scanner = new Scanner(System.in);
        String player2Move;
        while (true) {
            System.out.printf("%n%s please, make your move!%n%n%n%n%n%n", name);
            player2Move = scanner.nextLine();
            if (isValidMove(board, player2Move)){
                break;
            } else {
                System.err.println(player2Move + " is not a valid move.");
            }
        }
        space();
        placeMove(board, player2Move, 'O');
    }


    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(":(");
        }
    }

    static void printBoard(char[][] board) {

        System.out.println("|-----------|-----------|-----------|");
        System.out.println("|           |           |           |");

        System.out.println("|     " + board[0][0] + "     |     " + board[0][1]
                + "     |     " + board[0][2] + "     |");
        System.out.println("|           |           |           |");

        System.out.println("|-----------------------------------|");
        System.out.println("|           |           |           |");

        System.out.println("|     " + board[1][0] + "     |     " + board[1][1]
                + "     |     " + board[1][2] + "     |");
        System.out.println("|           |           |           |");

        System.out.println("|-----------------------------------|");
        System.out.println("|           |           |           |");

        System.out.println("|     " + board[2][0] + "     |     "  + board[2][1]
                + "     |     " + board[2][2] + "     |");
        System.out.println("|           |           |           |");

        System.out.println("|-----------|-----------|-----------|");

    }
    public static void space() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
