package CHAPTER_7.exercise;

import java.util.Random;

public class StringArray {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.printf("The month is: %s%n",monthArray(1 + rand.nextInt(12)));
    }

    public static String monthArray(int number) {
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};

        return months[number - 1];
    }
}
