package assignment;

import java.util.Scanner;

public class Asterisk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        //System.out.println("Enter number between 1 - 30");
        //int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
           // if (number <= 35)
                total = total + i;
            System.out.println(total);
         }
    }

}