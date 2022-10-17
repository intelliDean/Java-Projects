package Practice;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        char[] name = {'D', 'e', 'a', 'n', ' ', 'i', 's', ' ', 'a', ' ', 'm', 'a', 'n'};
        System.out.println(name);
    }
        //Use a while loop when you don't know how many times the loop will run
        //Use a for loop when you know how many times the loop will run

    private static final Scanner input = new Scanner(System.in);
    private static final SecureRandom rand = new SecureRandom();
    public static void designLoop() {
        int put = input.nextInt();
        int i = 1;
        while (i <= put) {
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();

        for (int j = 2; j <= put; j++){
            System.out.println(j);
        }
    }
    public static void sentinelLoopForinput() {
        int put = 1;
        do {
            System.out.println("\nEnter number");
            put = input.nextInt();
        } while (put != -1);
    }
    public static void patternsWithStringMethod(int num) {
            if (num > 0 && num <= 30) {
            for (int i = 0; i < num; i++) {
                System.out.println("*  ".repeat(i));
            }
        }
    }
}
