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
        String[] names;

        System.out.println("");




    }
    public static int[] takeShot(String name, SecureRandom rand) {
        int[] scores = new int[3];
        for (int i = 0; i < scores.length; i++) {
            System.out.println(name+ ", take shot "+ (i + 1));
            int score = rand.nextInt(11);
            scores[i] = score;
            System.out.println("You scored "+ score);
        }
        return scores;
    }
    public static String[] playerNames() {
        Scanner input = new Scanner(System.in);
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter player "+(i+1)+"'s name");
            names[i] = input.nextLine();
        }
        return names;
    }
}
