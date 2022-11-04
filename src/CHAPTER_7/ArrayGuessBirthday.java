package CHAPTER_7;

import java.util.Objects;
import java.util.Scanner;

public class ArrayGuessBirthday {
    public static int guessBirthday(int[][][] dates) {
        Scanner input = new Scanner(System.in);
        int day = 0;
        for (int i = 0; i < dates.length; i++) {
            System.out.println("\nIs your birthday in Set" + (i + 1) + "?");
            for (int j = 0; j < dates[i].length; j++) {
                for (int k = 0; k < dates[i][j].length; k++)
                    System.out.printf("%4d", dates[i][j][k]);
                System.out.println();
            }

            System.out.printf("%n\tEnter yes or no?%n");
            String answer = input.nextLine();

            if (Objects.equals(answer, "yes")) {
                day += dates[i][0][0];
            }
        }
        return day;
    }
}