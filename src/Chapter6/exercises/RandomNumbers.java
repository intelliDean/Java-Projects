package Chapter6.exercises;

import java.security.SecureRandom;

public class RandomNumbers {
    private static final SecureRandom randoms = new SecureRandom();
    public static void randoms() {
                // loop 20 times
         for (int counter = 1; counter <= 20; counter++) {
                 // pick random integer from 1 to 6
             int face = 1 + randoms.nextInt(6);
             System.out.printf("%d  ", face); // display generated value
                 // if counter is divisible by 5, start a new line of output
             if (counter % 5 == 0) {
                 System.out.println();
             }
         }
    }
    public static void rollDice() {
        int freq1 = 0; // count of 1s rolled
        int freq2 = 0; // count of 2s rolled
        int freq3 = 0; // count of 3s rolled
        int freq4 = 0; // count of 4s rolled
        int freq5 = 0; // count of 5s rolled
        int freq6 = 0; // count of 6s rolled

           // tally counts for 60,000 rolls of a die
        for (int roll = 1; roll <= 60_000; roll++) {
            int face = 1 + randoms.nextInt(6); // number from 1 to 6
            // use face value 1-6 to determine which counter to increment
            switch (face) {
                case 1 -> ++freq1; // increment the 1s counter
                case 2 -> ++freq2; // increment the 2s counter
                case 3 -> ++freq3; // increment the 3s counter
                case 4 -> ++freq4; // increment the 4s counter
                case 5 -> ++freq5; // increment the 5s counter
                case 6 -> ++freq6; // increment the 6s counter
            }
        }

         System.out.println("Face\tFrequency"); // output headers
         System.out.printf("1\t\t%,d%n2\t\t%,d%n3\t\t%,d%n4\t\t%,d%n5\t\t%,d%n6\t\t%,d%n",
                            freq1, freq2, freq3, freq4, freq5, freq6);
    }



    public static void main(String[] args) {
        rollDice();
    }
}
