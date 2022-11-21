package Practice;

import java.security.SecureRandom;

public class BreakLoop {
    public static void main(String[] args) {
        breakLoop();
    }
    public static void breakLoop() {
        SecureRandom rand = new SecureRandom();
        int sum = 0;
        int number = 0;

        while (number < 20) { //The loop terminate when the counter, number is equals to 20
            number++;
            sum += (number / 3) * rand.nextInt(15);
            if (sum >= 100)
                break; //However, the loop breaks the loop when sum is >= 100, regardless of counter
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
