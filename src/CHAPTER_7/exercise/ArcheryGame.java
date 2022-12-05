package CHAPTER_7.exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class ArcheryGame {
    /*(Archery Game) A group of four friends visit a sports club and they decide to practice archery.
    Each player gets 3 chances and in every chance they can score between 0 to 10 points. The
player with the maximum score after adding the scores obtained in all 3 chances wins. Write an application
that simulates this game and prints the scores of all four players in a tabular format and
also prints which player won.
Each line in the table should contain the following:
1) The player number
2) Their first chance score
3) Their second chance score
4) Their third chance score
5) Their score after all three chances
Use multidimensional arrays to store the scores of players in each chance.
Use the secure random-number generation mechanism learnt in the previous chapter to generate
scores between 0 and 10 for each player chance.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        String[] nameArrays;
        int[][] arrays;

        System.out.println("How many players?");
        int numberOfPlayers = input.nextInt();
        System.out.println("How many chances you want to take? e.g 3");
        int numberOfChances = input.nextInt();
        String decoy = input.nextLine();

        nameArrays = new String[numberOfPlayers];
        arrays = new int[numberOfPlayers][numberOfChances];

        String[] names = playerNames(nameArrays, input);

        int[][] scores = shootBow(arrays, names, rand);

        int[] max = calculateScore(scores);

        printResult(scores,names);
        System.out.println("\nCongratulations "+names[max[0]]+"! You scored highest - "+ max[1]);




    }
    public static int[][] shootBow(int[][] scores, String[] name, SecureRandom rand) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%n%s, press enter to shoot bow %d",name[i], (j + 1));
                String shoot = input.nextLine();
                int score = rand.nextInt(11);
                scores[i][j] += score;
                System.out.printf("You scored %d%n", score);
            }

        }
        System.out.println();
        return scores;
    }
    public static String[] playerNames(String[] arrays, Scanner input) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter name for player "+(i+1));
            arrays[i] = input.nextLine();
        }
        return arrays;
    }
    public static int[] calculateScore(int[][] arrays) {
        int max = arrays[0][0];
        int row = 0;
        for (int i = 0; i < arrays.length; i++) {
            int total = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                total += arrays[i][j];
            }
            if (total > max) {
                max = total;
                row = i;
            }
        }
        return new int[]{row, max};
    }
    public static void printResult(int[][] scores, String[] names) {
        System.out.println("Score sheet");
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            System.out.print(names[i]+" - ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print( scores[i][j]+"  ");
                total += scores[i][j];
            }
            System.out.print("= "+ total);
            System.out.println();
        }

    }
}
