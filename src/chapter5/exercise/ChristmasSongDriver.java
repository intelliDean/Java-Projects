package chapter5.exercise;

import java.util.Scanner;

public class ChristmasSongDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = 0;
        System.out.print("""
        
        Input day of Christmas
        or press -1 to quit
        """);
        while (day != -1) {
            day = input.nextInt();
            TwelveDaysOdChristmas.daysOfChristmas(day);
        }
    }
}
