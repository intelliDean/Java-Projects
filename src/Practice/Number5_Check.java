package Practice;

import java.util.Scanner;

public class Number5_Check { // to check how many 5 are there in the number inputted by the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        long num = input.nextLong(); // capture the number from user
        long temp = num; // transfer the number into another variable for later usage

        int count = 0;
        while (num > 0) { // this loop will continue to run as long as num is greater than zero
            long rem = num % 10; // we get the remainder of num. this is the heart of this program
            if (rem == 5) { //if the remainder is equal to 5, the counter counts
                count++;
            }
            num /= 10; // here, we reduce the value of num
        }
        System.out.printf("The number of 5 in %d is %d%n ", temp, count);
    }
}
