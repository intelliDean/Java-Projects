package Practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Use a while loop when you don't know how many times the loop will run
        //Use a for loop when you know how many times the loop will run

        Scanner input = new Scanner(System.in);
//        int put = input.nextInt();
//        int i = 1;
//        while (i <= put) {
//            System.out.print(i+ " ");
//            i++;
//        }
//        System.out.println();
//
//        for (int j = 2; j <= put; j++){
//            System.out.println(j);
//        }
        int put = 1;
        do {
            System.out.println("\nEnter number");
            put = input.nextInt();
        } while (put != -1);
    }
}
