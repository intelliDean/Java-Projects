package CHAPTER_7;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
           SecureRandom randomNumbers = new SecureRandom();
           int[] frequency = new int[7]; // array of frequency counters with 7 indexes not value, but just 7 spaces created
                    //roll die 60,000,000 times; use die value as frequency index
           for (int roll = 1; roll <= 60_000; roll++) { // Die of 1-6 was rolled 60Million times
                ++frequency[1 + randomNumbers.nextInt(6)];
           }
        System.out.println();
               System.out.printf("%s%10s%n", "Face", "Frequency");
              //output each array element's value
           for (int face = 1; face < frequency.length; face++) {// How many of times each numbers between 1 - 6 faces upward
                 System.out.printf("%4d%10d%n", face, frequency[face]);
           }
    }
}
