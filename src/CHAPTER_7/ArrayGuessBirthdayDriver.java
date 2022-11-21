package CHAPTER_7;

public class ArrayGuessBirthdayDriver {
    public static void main(String[] args) {
        int day = 0; // Day to be determined
        String pos;

        int[][][] dates = {
                {{1, 3, 5, 7},
                        {9, 11, 13, 15},
                        {17, 19, 21, 23},
                        {25, 27, 29, 31}},
                {{2, 3, 6, 7},
                        {10, 11, 14, 15},
                        {18, 19, 22, 23},
                        {26, 27, 30, 31}},
                {{4, 5, 6, 7},
                        {12, 13, 14, 15},
                        {20, 21, 22, 23},
                        {28, 29, 30, 31}},
                {{8, 9, 10, 11},
                        {12, 13, 14, 15},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}},
                {{16, 17, 18, 19},
                        {20, 21, 22, 23},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}}};

        day = ArrayGuessBirthday.guessBirthday(dates);
        if (day == 1 || day == 21 || day == 31) {pos = "st";
        } else if (day == 2 || day == 22) {
            pos = "nd";
        } else {
            pos = "th";
        }
        System.out.printf("%nYour birthday is the %d%s day of the month!%n", day, pos);

    }
}
