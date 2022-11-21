package assignment.weekend_snack;

import java.util.Scanner;

public class SpaceAndAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] book = {
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '}};





//        System.out.println("enter number");
//        int num = input.nextInt();
//        while (num > 0) {
//            String rep = String.valueOf(num);
//            printBoard(book);
//            placeMove(book,rep, '*');
//            System.out.println("enter number");
//            num = input.nextInt();
//            rep = String.valueOf(num);
//        }

        placeMove(book, "7", '*');
        placeMove(book, "8", '*');
        placeMove(book, "9", '*');
        placeMove(book, "12", '*');
        placeMove(book, "13", '*');
        placeMove(book, "14", '*');
        placeMove(book, "17", '*');
        placeMove(book, "18", '*');
        placeMove(book, "19", '*');
        placeMove(book, "22", '*');
        placeMove(book, "23", '*');
        placeMove(book, "24", '*');
        printBoard(book);






    }
    static void printBoard(char[][] book) {



        System.out.println(book[0][0] + " " + book[0][1] + " " + book[0][2] + " " + book[0][3] + " "+ book[0][4]);

        System.out.println(book[1][0] + " " + book[1][1] + " " + book[1][2] + " " + book[1][3] + " "+ book[1][4]);

        System.out.println(book[2][0] + " " + book[2][1] + " " + book[2][2] + " " + book[2][3] + " "+ book[2][4]);

        System.out.println(book[3][0] + " " + book[3][1] + " " + book[3][2] + " " + book[3][3] + " "+ book[3][4]);

        System.out.println( book[4][0] + " " + book[4][1] + " " + book[4][2] + " " + book[4][3] + " "+ book[4][4]);



    }
    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[0][3] = symbol;
            case "5" -> board[0][4] = symbol;
            case "6" -> board[1][0] = symbol;
            case "7" -> board[1][1] = symbol;
            case "8" -> board[1][2] = symbol;
            case "9" -> board[1][3] = symbol;
            case "10" -> board[1][4] = symbol;
            case "11" -> board[2][0] = symbol;
            case "12" -> board[2][1] = symbol;
            case "13" -> board[2][2] = symbol;
            case "14" -> board[2][3] = symbol;
            case "15" -> board[2][4] = symbol;
            case "16" -> board[3][0] = symbol;
            case "17" -> board[3][1] = symbol;
            case "18" -> board[3][2] = symbol;
            case "19" -> board[3][3] = symbol;
            case "20" -> board[3][4] = symbol;
            case "21" -> board[4][0] = symbol;
            case "22" -> board[4][1] = symbol;
            case "23" -> board[4][2] = symbol;
            case "24" -> board[4][3] = symbol;
            case "25" -> board[4][4] = symbol;
            default -> System.out.println(":(");
        }
    }

}
