package assignment;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom lock = new SecureRandom();


        for (int i = 1; i <= 500; i++) {
            int security = 1 + lock.nextInt(7); // I want to eliminate zero - 0
            System.out.print(security+ " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
